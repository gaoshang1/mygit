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
 * Created by Administrator on 2018/8/3.
 */

public class TaskCopyingActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.search)
    ImageView search;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    private int page = 1;
    private String userId;
    List<TaskCopying.ListBean> mData;
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
        search.setVisibility(View.GONE);
        title.setText("任务抄送");
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<TaskCopying.ListBean>(mData, R.layout.item_track_confirm)
        {
            @Override
            public void bindView(final ViewHolder holder, TaskCopying.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getEND_DATE() == null ? 0 : obj.getEND_DATE().getTime()));
                holder.setText(R.id.text4, obj.getDEPARTMENT_NAME());
                holder.setText(R.id.text5, obj.getCOS());
                holder.setText(R.id.tv2, "事项名称");
                holder.setText(R.id.tv3, "完成日期");
                holder.setText(R.id.tv4, "主办单位");
                holder.setText(R.id.tv5, "协办单位");

            }
        };
        listview.setAdapter(adapter);
        refreshLayout.setRefreshing(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(TaskCopyingActivity.this, SpecialDetailsActivity.class);
                intent.putExtra("specificGuid", mData.get(i).getSPECIFIC_GUID());
                intent.putExtra("type", "specificDetal");
                intent.putExtra("state", 4);
                startActivity(intent);
            }
        });
        getData();
        adapter.notifyDataSetChanged();
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
                intent.putExtra("type", 1);
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
                String paramet = "empGUID=" + userId + "&rows=10&page=" + page + "&searchDate1=" + startDate + "&searchDate2=" + endDate + "&itemNumber=" + itemNumber + "&itemTitle=" + itemTitle;
                Parameters parameters = new Parameters("listSendCopy", paramet);
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
