package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.bean.PlanUndertake;
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

public class PlanUndertakeActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
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
    List<PlanUndertake.ListBean> mData;
    MyAdapter adapter;
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
        itemNumber = getIntent().getStringExtra("itemNumber");
        itemTitle = getIntent().getStringExtra("itemTitle");
        startDate = getIntent().getStringExtra("startDate");
        endDate = getIntent().getStringExtra("endDate");
        typeGuid = getIntent().getStringExtra("typeGuid");
        holdType = getIntent().getStringExtra("holdType");
        type = getIntent().getIntExtra("type", 1);
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        if (type == 2)
        {
            search.setVisibility(View.GONE);
        }
        title.setText(getIntent().getStringExtra("title"));
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<PlanUndertake.ListBean>(mData, R.layout.item_supervision)
        {
            @Override
            public void bindView(final ViewHolder holder, final PlanUndertake.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getSEND_DATE() == null ? 0 : obj.getSEND_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getEND_DATE() == null ? 0 : obj.getEND_DATE().getTime()));
                holder.setText(R.id.text5, obj.getMAIN());
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
                        Intent intent = new Intent(PlanUndertakeActivity.this, FeedbackListActivity.class);
                        intent.putExtra("guId", obj.getDETPLAN_GUID());
                        intent.putExtra("type", 6);
                        startActivity(intent);
                    }
                });
                holder.setOnClickListener(R.id.txt6, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(PlanUndertakeActivity.this, DelayedListActivity.class);
                        intent.putExtra("guId", obj.getDETPLAN_GUID());
                        intent.putExtra("type", 2);
                        startActivity(intent);
                    }
                });
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
                Intent intent = new Intent(PlanUndertakeActivity.this, PlanDetailsActivity.class);
                intent.putExtra("detPlanGuid", mData.get(i).getDETPLAN_GUID());
                intent.putExtra("state", 2);
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
                intent.putExtra("type", 3);
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

                String paramet = "empGUID=" + userId + "&holdType=" + holdType + "&rows=10&page=" + page + "&feedback=3&searchStartDate=" + startDate + "&searchEndDate=" + endDate + "&itemNumber=" + itemNumber + "&itemTitle=" + itemTitle + "&backTime=" + typeGuid;
                Parameters parameters = new Parameters("displayDetPlanUndertake", paramet);
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
                                mData.addAll(JsonGenerics.transform(response, PlanUndertake.class).getList());
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
