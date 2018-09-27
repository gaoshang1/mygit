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
import com.northdoo.futian_ducha.bean.ListForDc;
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

public class TrackConfirmActivity extends BaseActivity implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
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
    List<ListForDc.ListBean> mData;
    MyAdapter adapter;
    private String status = "1";

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_list);
    }

    @Override
    protected void initData()
    {
        search.setVisibility(View.GONE);
        userId = getIntent().getStringExtra("userId");
        status = getIntent().getStringExtra("status");
        title.setText("1".equals(status) ? "跟踪确认" : "跟踪填写");
        mData = new ArrayList<>();
        refreshLayout.setOnRefreshListener(this);
        refreshLayout.setOnLoadListener(this);
        adapter = new MyAdapter<ListForDc.ListBean>(mData, R.layout.item_track_confirm)
        {
            @Override
            public void bindView(final ViewHolder holder, ListForDc.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());

                holder.setText(R.id.text2, "1".equals(status) ? obj.getNOTCONFIRMNUMBER() : obj.getNotpassnumber());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getSEND_DATE() == null ? 0 : obj.getSEND_DATE().getTime()));
                holder.setText(R.id.text4, obj.getSUPERVISION_TYPE_NAME());
                holder.setText(R.id.text5, obj.getMAIN_WORK());
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
                Intent intent;
                if ("1".equals(status))
                {
                    intent = new Intent(TrackConfirmActivity.this, TrackConfirmDetailsActivity.class);
                    intent.putExtra("mainGuid", mData.get(i).getMAIN_GUID());
                    intent.putExtra("userId", getIntent().getStringExtra("userId"));
                    intent.putExtra("index", i + 1);
                    startActivity(intent);
                } else
                {
                    intent = new Intent(TrackConfirmActivity.this, TrackFillInDetailActivity.class);
                    intent.putExtra("mainGuid", mData.get(i).getMAIN_GUID());
                    intent.putExtra("userId", getIntent().getStringExtra("userId"));
                    intent.putExtra("index", i + 1);
                    intent.putExtra("STATUS", mData.get(i).getSTATUS());
                    startActivity(intent);
                }

            }
        });

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
                break;
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        page = 1;
        getData();
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("getListForDc", "empGUID=" + userId + "&status=" + status + "&rows=10&page=" + page);
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
                                mData.addAll(JsonGenerics.transform(response, ListForDc.class).getList());
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
