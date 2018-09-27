package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.DelayedList;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.RefreshView;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/22.
 */

public class DelayedListActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    List<DelayedList.ListBean> mData;
    MyAdapter adapter;
    @BindView(R.id.title)
    TextView title;
    private String userId;
    private String guId;
    private int type;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_feedback_list);
    }

    @Override
    protected void initData()
    {
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        guId = getIntent().getStringExtra("guId");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        type = getIntent().getIntExtra("type", 1);
        title.setText("延时列表");
        mData = new ArrayList<>();
        adapter = new MyAdapter<DelayedList.ListBean>(mData, R.layout.item_delayrd)
        {
            @Override
            public void bindView(final ViewHolder holder, DelayedList.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_TITLE());
                holder.setText(R.id.text2, DateUtils.timeToString2(obj.getDELAY_DATE() == null ? 0 : obj.getDELAY_DATE().getTime()));
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getCREATE_DATE() == null ? 0 : obj.getCREATE_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getRESULT_DATE() == null ? 0 : obj.getRESULT_DATE().getTime()));
                holder.setText(R.id.text5, obj.getAPPMAN());
                switch (obj.getRESULT())
                {
                    case 0:
                        holder.setText(R.id.text6, "驳回");
                        break;
                    case 1:
                        holder.setText(R.id.text6, "通过");
                        break;
                    case 2:
                        holder.setText(R.id.text6, "无效");
                        break;
                    default:
                        holder.setText(R.id.text6, "");
                        break;
                }
                holder.setText(R.id.text7, DateUtils.timeToString2(obj.getSCHEDULED_BACK_DATE() == null ? 0 : obj.getSCHEDULED_BACK_DATE().getTime()));

            }
        };
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(DelayedListActivity.this, DelayeDetailsActivity.class);
                intent.putExtra("guId", mData.get(i).getDELAY_GUID());
                intent.putExtra("type", type);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onResume()
    {
        super.onResume();
        refreshLayout.setRefreshing(true);
        getData();
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                String paramet = null;
                switch (type)
                {
                    case 1:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoCheckDelayApply?specificGuid=" + guId;
                        break;
                    case 2:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoCheckDetPlanDelayApply?detPlanGuid=" + guId;
                        break;
                    case 3:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoCheckDelayApplys?specificGuid=" + guId;
                        break;
                }

                Parameters parameters = new Parameters(paramet, "");
                service.registerCallbacks(new ITaskCallback.Stub()
                {
                    @Override
                    public void onResponse(final String response) throws RemoteException
                    {
                        runOnUiThread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                refreshLayout.setRefreshing(false);
                                mData.clear();
                                mData.addAll(JsonGenerics.transform(response, DelayedList.class).getList());
                                adapter.notifyDataSetChanged();

                            }
                        });
                    }

                    @Override
                    public void onError(final String e) throws RemoteException
                    {
                        runOnUiThread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                refreshLayout.setRefreshing(false);
                                Alert(e);
                            }
                        });
                    }

                    @Override
                    public void onProgress(float progress, long total) throws RemoteException
                    {
                    }
                }, "gets", parameters);
            } catch (RemoteException e)
            {
                e.printStackTrace();
            }
        } else
        {
            Alert("service断开连接！");
        }
    }

    @OnClick({R.id.left_img, R.id.titles})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.titles:
                break;
        }
    }

    @Override
    public void onRefresh()
    {
//        page = 1;
        getData();
    }

    @Override
    public void onLoad()
    {
//        refreshLayout.setRefreshing(true);
//        //这段很重要使用时请勿忽略必须要加否则上拉无效果
//        refreshLayout.setLoading(false);
//        page++;
//        getData();

    }
}
