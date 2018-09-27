package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameter;
import com.northdoo.futian_ducha.Application.BaseFragment;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.CollectDo;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.RefreshView;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.northdoo.futian_ducha.Application.OAApp.service;


/**
 * Created by Administrator on 2017/8/4.
 */

public class CollectDoFragment extends BaseFragment implements RefreshView.OnLoadListener, RefreshView.OnRefreshListener
{
    @BindView(R.id.icon_do)
    ImageView icon;
    @BindView(R.id.listview)
    ListView listview;
    @BindView(R.id.refresh_layout)
    RefreshView refreshLayout;
    private int type = 1;
    private String pageSize = "10";
    private int page = 1;
    private String userId;
    private String url = null;
    private MyAdapter<CollectDo.ListBean> adapter;
    private List<CollectDo.ListBean> mData;
    private getTabBadge tabBadge;
    private List<Parameter> parameters = new ArrayList<>();

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
        CollectDoFragment fragment = new CollectDoFragment();
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
//        tabBadge = (getTabBadge) getActivity();
        userId = getActivity().getIntent().getStringExtra("userId");
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
                switch (obj.getLIGHT())
                {
                    case 0:
                        holder.setVisibility(R.id.type, View.GONE);
                        break;
                    case 1:
                        holder.setVisibility(R.id.type, View.VISIBLE);
                        holder.setImageResource(R.id.type, R.mipmap.huang);
                        break;
                    case 2:
                        holder.setVisibility(R.id.type, View.VISIBLE);
                        holder.setImageResource(R.id.type, R.mipmap.houng);
                        break;
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
                Intent intent = new Intent(getActivity(), CollectDetailsActivity.class);
                intent.putExtra("instanceGUID", mData.get(i).getINSTANCE_GUID());
                intent.putExtra("type", type);
                intent.putExtra("userId", userId);
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
                Parameters parameters = null;
                if (type == 1)
                {
                    //url = "http://172.29.53.36/mobile2/OfficialDocRSController/getReceiveList?empGUID=" + userId + "&rows=10&page=" + page;
                    parameters = new Parameters("getReceiveList", "empGUID=" + userId + "&rows=10&page=" + page);
                } else if (type == 2)
                {
                    //url = "http://172.29.53.36/mobile2/OfficialDocRSController/getSendList?   empGUID=" + userId + "&rows=10&page=" + page;
                    parameters = new Parameters("getSendList", "empGUID=" + userId + "&rows=10&page=" + page);
                }
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
                                mData.addAll(JsonGenerics.transform(response, CollectDo.class).getList());
                                adapter.notifyDataSetChanged();
                                if (mData.size() > 0)
                                {
                                    icon.setVisibility(View.GONE);
                                } else
                                {
                                    icon.setVisibility(View.VISIBLE);
                                }
//                                tabBadge.upTabBadge(type, 2);

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


    public interface getTabBadge
    {
        void upTabBadge(int j, int i);
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
