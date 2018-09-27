package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.northdoo.futian_ducha.Application.BaseFragment;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.RefreshView;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/23.
 */

public class TaskOperationFragment extends BaseFragment implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    private int page = 1;
    private String userId;
    List<TaskCopying.ListBean> mData;
    MyAdapter adapter;
    private int type;

    @Override
    protected void initView(View view, Bundle savedInstanceState)
    {

    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null)
        {
            type = bundle.getInt("type");
        }
    }

    public static Fragment newInstance(int type)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        TaskOperationFragment fragment = new TaskOperationFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getLayoutId()
    {
        return R.layout.fragment_data;
    }

    @Override
    protected void initData()
    {
        userId = getActivity().getIntent().getStringExtra("userId");
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
                        Intent intent = new Intent(getActivity(), FeedbackListActivity.class);
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
                        Intent intent = new Intent(getActivity(), DelayedListActivity.class);
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
                Intent intent = new Intent(getActivity(), SpecialDetailsActivity.class);
                intent.putExtra("specificGuid", mData.get(i).getSPECIFIC_GUID());
                intent.putExtra("type", "specificDetal");
                intent.putExtra("state", 4);
                startActivity(intent);
            }
        });
       
    }

    @Override
    public void onResume()
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
                String paramet = "http://172.29.53.36/mobile2/supervision/listUndertake?empGUID=" + userId + "&holdType=4&rows=10&page=" + page + "&feedback=3&searchStartDate=2010-5-2&searchEndDate=2050-9-10&itemNumber=&itemTitle=&backTime=";
                Parameters parameters = new Parameters(paramet, "");
                service.registerCallbacks(new ITaskCallback.Stub()
                {
                    @Override
                    public void onResponse(final String response) throws RemoteException
                    {
                        getActivity().runOnUiThread(new Runnable()
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
                        getActivity().runOnUiThread(new Runnable()
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
