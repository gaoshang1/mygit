package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.CollectDo;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.RefreshView;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2017/8/23.
 */

public class SearchListActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.icon_do)
    ImageView icon;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    @BindView(R.id.left_img)
    ImageView leftImg;
    private int type = 1;
    private int page = 1;
    private String param = null;
    private MyAdapter<CollectDo.ListBean> adapter;
    private List<CollectDo.ListBean> mData;
    private CollectDoFragment.getTabBadge tabBadge;
    private String name;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_search_list);
    }

    @Override
    protected void initData()
    {
        param = getIntent().getStringExtra("param");
        name = getIntent().getStringExtra("name");
        type = getIntent().getIntExtra("type", 1);
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<CollectDo.ListBean>(mData, R.layout.item_data)
        {
            @Override
            public void bindView(final ViewHolder holder, CollectDo.ListBean obj, int position)
            {
                if (type == 2)
                {
                    holder.setVisibility(R.id.icon, View.GONE);
                }
                holder.setImageResource(R.id.icon, obj.getDOC_STATUS() == 0 ? R.mipmap.icon_1 : R.mipmap.icon_2);
                holder.setText(R.id.content, obj.getDOCTITLE());
                holder.setText(R.id.name, obj.getRECEIVER_DISPLAYNAME());
                holder.setText(R.id.time, DateUtils.timeToString2(obj.getSEND_TIME().getTime()));
            }
        };
        listview.setAdapter(adapter);
        refreshLayout.setRefreshing(true);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(SearchListActivity.this, CollectDetailsActivity.class);
                intent.putExtra("instanceGUID", mData.get(i).getINSTANCE_GUID());
                intent.putExtra("type", type);
                intent.putExtra("receiverGUID", mData.get(i).getRECEIVER_GUID());
                startActivity(intent);
            }
        });
        getData();
        adapter.notifyDataSetChanged();
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {

                param += "&page=" + page;
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
                                mData.addAll(JsonGenerics.transform(response, CollectDo.class).getList());
                                adapter.notifyDataSetChanged();
                                if (mData.size() > 0)
                                {
                                    icon.setVisibility(View.GONE);
                                } else
                                {
                                    icon.setVisibility(View.VISIBLE);
                                }

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
                }, "get", new Parameters(name, param));
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


    @OnClick(R.id.left_img)
    public void onViewClicked()
    {
        finish();
    }
}
