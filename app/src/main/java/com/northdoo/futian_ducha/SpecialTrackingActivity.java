package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.SpecialTracking;
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
 * Created by Administrator on 2018/8/3.
 */

public class SpecialTrackingActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    @BindView(R.id.search)
    ImageView search;
    private int page = 1;
    private String userId;
    List<SpecialTracking.ListBean> mData;
    MyAdapter adapter;
    private String itemNumber;
    private String itemTitle;
    private String startDate;
    private String endDate;
    private String typeGuid;
    private int type;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_list);
    }

    @Override
    protected void initData()
    {
        itemNumber = getIntent().getStringExtra("itemNumber");
        itemTitle = getIntent().getStringExtra("itemTitle");
        startDate = getIntent().getStringExtra("startDate");
        endDate = getIntent().getStringExtra("endDate");
        typeGuid = getIntent().getStringExtra("typeGuid");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        type = getIntent().getIntExtra("type", 1);
        if (type == 2)
        {
            search.setVisibility(View.GONE);
        }
        title.setText("专项跟踪");
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<SpecialTracking.ListBean>(mData, R.layout.item_track_confirm)
        {
            @Override
            public void bindView(final ViewHolder holder, SpecialTracking.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getCREATE_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getSEND_DATE().getTime()));
                holder.setText(R.id.text5, DateUtils.timeToString2(obj.getNEXT_BACK_DATE().getTime()));
                holder.setText(R.id.tv2, "事项名称");
                holder.setText(R.id.tv3, "登记时间");
                holder.setText(R.id.tv4, "完成时间");
                holder.setText(R.id.tv5, "反馈时间");
                switch (obj.getLIGHT())
                {
                    case 0:
                        holder.setImageResource(R.id.img, R.mipmap.green);
                        break;
                    case 1:
                        holder.setImageResource(R.id.img, R.mipmap.yellow);
                        break;
                    case 2:
                        holder.setImageResource(R.id.img, R.mipmap.red);
                        break;

                }
            }
        };
        listview.setAdapter(adapter);
        refreshLayout.setRefreshing(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(SpecialTrackingActivity.this, SpecialDetailsActivity.class);
                intent.putExtra("specificGuid", mData.get(i).getSPECIFIC_GUID());
                intent.putExtra("type", "getDetPlanBySpeGUID");
                intent.putExtra("state", 1);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        page = 1;
        getData();
    }
    @OnClick({R.id.left_img, R.id.search})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.search:
                Intent intent = new Intent(this, SearchActivity.class);
                intent.putExtra("type", 2);
                startActivity(intent);
                break;
        }
    }


    private void getData()
    {
        if (service != null)
        {
            try
            {
                String parame = "rows=10&page=" + page + "&empGUID=" + userId + "&itemNumber=" + itemNumber + "&itemTitle=" + itemTitle + "&startDate=" + startDate + "&endDate=" + endDate;
                Parameters parameters = new Parameters("querySpeFollow", parame);
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
                                if (page == 1)
                                {
                                    mData.clear();
                                }
                                mData.addAll(JsonGenerics.transform(response, SpecialTracking.class).getList());
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
                }, "get", parameters);
            } catch (RemoteException e)
            {
                e.printStackTrace();
            }
        } else
        {
            Alert("service断开连接！");
        }
    }

    @Override
    public void onRefresh()
    {
        page = 1;
        getData();
    }

    @Override
    public void onLoad()
    {
        refreshLayout.setRefreshing(true);
        //这段很重要使用时请勿忽略必须要加否则上拉无效果 
        refreshLayout.setLoading(false);
        page++;
        getData();

    }
}
