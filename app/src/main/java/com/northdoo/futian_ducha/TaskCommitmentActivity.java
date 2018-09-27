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
 * Created by Administrator on 2018/8/23.
 */

public class TaskCommitmentActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    private int page = 1;
    private String userId;
    List<TaskCopying.ListBean> mData;
    MyAdapter adapter;
    @BindView(R.id.search)
    ImageView search;
    private String itemNumber;
    private String itemTitle;
    private String startDate;
    private String endDate;
    private String typeGuid;
    private int type;
    private String holdType;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_list);
    }

    @Override
    protected void initData()
    {
        type = getIntent().getIntExtra("type", 1);
        itemNumber = getIntent().getStringExtra("itemNumber");
        itemTitle = getIntent().getStringExtra("itemTitle");
        startDate = getIntent().getStringExtra("startDate");
        endDate = getIntent().getStringExtra("endDate");
        typeGuid = getIntent().getStringExtra("typeGuid");
        holdType = getIntent().getStringExtra("holdType");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        if (type == 2)
        {
            search.setVisibility(View.GONE);
        }
        title.setText(getIntent().getStringExtra("title"));
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<TaskCopying.ListBean>(mData, R.layout.item_supervision)
        {
            @Override
            public void bindView(final ViewHolder holder, final TaskCopying.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text5, DateUtils.timeToString2(obj.getNEXT_BACK_DATE() == null ? 0 : obj.getNEXT_BACK_DATE().getTime()));
                holder.setText(R.id.text3, obj.getCONTEXT());
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getEND_DATE() == null ? 0 : obj.getEND_DATE().getTime()));
                holder.setText(R.id.tv3, "计划任务");
                holder.setText(R.id.tv4, "完成日期");
                holder.setText(R.id.tv5, "反馈时间");
                holder.setText(R.id.tv2, "专项名称");
                holder.setText(R.id.txt1, "传阅:" + obj.getPASS_ALONG_TIMES());
                holder.setText(R.id.txt2, "催办:" + obj.getREMIND_TIMES());
                holder.setText(R.id.txt3, "会议:" + obj.getMEETING_TIMES());
                holder.setText(R.id.txt4, "通报:" + obj.getINFORM_ALL_TIMES());
                holder.setText(R.id.txt5, "反馈:" + obj.getFEEDBACK_TIMES());
                holder.setText(R.id.txt6, "延时:" + obj.getDELAY_TIMES());
                holder.setOnClickListener(R.id.txt5, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(TaskCommitmentActivity.this, FeedbackListActivity.class);
                        intent.putExtra("guId", obj.getSPECIFIC_GUID());
                        intent.putExtra("type", 5);
                        startActivity(intent);
                    }
                });
                holder.setOnClickListener(R.id.txt6, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(TaskCommitmentActivity.this, DelayedListActivity.class);
                        intent.putExtra("guId", obj.getSPECIFIC_GUID());
                        intent.putExtra("type", 3);
                        startActivity(intent);
                    }
                });

            }
        };
        listview.setAdapter(adapter);
        refreshLayout.setRefreshing(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(TaskCommitmentActivity.this, SpecialDetailsActivity.class);
                intent.putExtra("specificGuid", mData.get(i).getSPECIFIC_GUID());
                intent.putExtra("type", "specificDetal");
                intent.putExtra("state", 3);
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
                intent.putExtra("type", 4);
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
                String paramet = "http://172.29.53.36/mobile2/supervision/listUndertake?empGUID=" + userId + "&holdType=" + holdType + "&rows=10&page=" + page + "&feedback=3&searchStartDate=" + startDate + "&searchEndDate=" + endDate + "&itemNumber=" + itemNumber + "&itemTitle=" + itemTitle + "&backTime=" + typeGuid;
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
                                if (page == 1)
                                {
                                    mData.clear();
                                }
                                mData.addAll(JsonGenerics.transform(response, TaskCopying.class).getList());
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
