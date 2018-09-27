package com.northdoo.futian_ducha;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.northdoo.futian_ducha.Application.BaseFragment;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.DivisionLabor;
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
 * Created by Administrator on 2017/8/4.
 */

public class DivisionLaborFragment extends BaseFragment implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    private String type = "0";
    private int page = 1;
    private String userId;
    private String url = null;
    private MyAdapter<DivisionLabor.ListBean> adapter;
    private List<DivisionLabor.ListBean> mData;

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
            type = bundle.getString("type");
        }
    }

    public static Fragment newInstance(String type)
    {
        Bundle bundle = new Bundle();
        bundle.putString("type", type);
        DivisionLaborFragment fragment = new DivisionLaborFragment();
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
        adapter = new MyAdapter<DivisionLabor.ListBean>(mData, R.layout.item_track_confirm)
        {
            @Override
            public void bindView(final ViewHolder holder, DivisionLabor.ListBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getSTATUS());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getCONFIRM_DATE() == null ? 0 : obj.getCONFIRM_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getSEND_DATE() == null ? 0 : obj.getSEND_DATE().getTime()));
                holder.setTextc(R.id.text2, obj.getSTATUS().equals("已否认") ? Color.RED : Color.BLACK);
                holder.setVisibility(R.id.text5, View.GONE);
                holder.setText(R.id.text6, obj.getGOAL());
                holder.setVisibility(R.id.ll_6, View.VISIBLE);
                holder.setText(R.id.tv3, "接收日期");
                holder.setText(R.id.tv4, "完成日期");
                holder.setText(R.id.tv5, "本单位分工");
                holder.setText(R.id.tv6, "主要工作");
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
                Intent intent = new Intent(getActivity(), DivisionLaborDetailsActivity.class);
                intent.putExtra("guid", mData.get(i).getGUID());
                intent.putExtra("dutyType", mData.get(i).getDUTYTYPE());
                intent.putExtra("type", type);
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
                Log.e("aaa", "empGUID=" + userId + "&mainStatus=1&dealStatus=" + type + "&dutyType=1,2&order=desc&rows=10&page=" + page);
                Parameters parameters = new Parameters("getConfirmListForUnit", "empGUID=" + userId + "&mainStatus=1&dealStatus=" + type + "&dutyType=1,2&order=desc&rows=10&page=" + page);
                service.registerCallbacks(new ITaskCallback.Stub()
                {
                    @Override
                    public void onResponse(final String response) throws RemoteException
                    {
                        (getActivity()).runOnUiThread(new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                refreshLayout.setRefreshing(false);
                                if (page == 1)
                                {
                                    mData.clear();
                                }
                                mData.addAll(JsonGenerics.transform(response, DivisionLabor.class).getList());
                                adapter.notifyDataSetChanged();

                            }
                        });
                    }

                    @Override
                    public void onError(final String e) throws RemoteException
                    {
                        (getActivity()).runOnUiThread(new Runnable()
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
