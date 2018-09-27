package com.northdoo.futian_ducha;

import android.os.RemoteException;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.UrgeList;
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
 * Created by Administrator on 2018/8/3.
 */

public class UrgeListActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
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
    List<UrgeList.ListBean> mData;
    MyAdapter adapter;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_list);
    }

    @Override
    protected void initData()
    {
        title.setText("催办列表");
        search.setVisibility(View.GONE);
        userId = getIntent().getStringExtra("userId");
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<UrgeList.ListBean>(mData, R.layout.item_urge_list)
        {
            @Override
            public void bindView(final ViewHolder holder, UrgeList.ListBean obj, int position)
            {
                holder.setText(R.id.text5, DateUtils.timeToString2(obj.getCREATE_DATE().getTime()));
                holder.setText(R.id.text3, obj.getSENDER_NAME());
                holder.setText(R.id.text4, obj.getMESSAGE_CONTENT());
                holder.setText(R.id.text6, obj.getRECIEVE_DEPARTMENT_NAME());
            }
        };
        listview.setAdapter(adapter);
        refreshLayout.setRefreshing(true);
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

        }
    }


    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("toRemindList", "subOrCoGuid=" + getIntent().getStringExtra("subOrCoGuid") + "&step=" + getIntent().getIntExtra("step", 1));
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
                                mData.addAll(JsonGenerics.transform(response, UrgeList.class).getList());
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
        getData();
    }

    @Override
    public void onLoad()
    {


    }

}
