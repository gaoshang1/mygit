package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.SupervisionTrackingDetails;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/15.
 */

public class SupervisionTrackingDetailsActivity extends BaseActivity
{
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.text4)
    TextView text4;
    @BindView(R.id.text5)
    TextView text5;
    @BindView(R.id.text6)
    TextView text6;
    @BindView(R.id.text7)
    TextView text7;
    @BindView(R.id.text8)
    TextView text8;
    @BindView(R.id.text9)
    TextView text9;
    @BindView(R.id.list_text1)
    TextView list_text1;

    @BindView(R.id.listview)
    NoScrollListView listview;
    @BindView(R.id.comment)
    NoScrollListView comment;
    private SupervisionTrackingDetails mData;
    List<SupervisionTrackingDetails.SupBean.SpecificListBean.ItemsBean> lData;
    List<SupervisionTrackingDetails.SupBean.LeadersBean> cData;
    MyAdapter adapter;
    MyAdapter cAdapter;
    private String supervisionGuid;
    private String userId;
    AttachmentFragment mAttachmentFragment;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_supervision_tracking_details);
    }

    @Override
    protected void initData()
    {
        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        lData = new ArrayList<>();
        cData = new ArrayList<>();
        supervisionGuid = getIntent().getStringExtra("supervisionGuid");
        userId = getIntent().getStringExtra("userId");
        adapter = new MyAdapter<SupervisionTrackingDetails.SupBean.SpecificListBean.ItemsBean>(lData, R.layout.item_supervision)
        {
            @Override
            public void bindView(final ViewHolder holder, final SupervisionTrackingDetails.SupBean.SpecificListBean.ItemsBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text5, obj.getDUTY_LEADER());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getSEND_DATE() == null ? 0 : obj.getSEND_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getEND_DATE() == null ? 0 : obj.getEND_DATE().getTime()));
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
                        Intent intent = new Intent(SupervisionTrackingDetailsActivity.this, FeedbackListActivity.class);
                        intent.putExtra("userId", userId);
                        intent.putExtra("guId", obj.getSPECIFIC_GUID());
                        intent.putExtra("type", 2);
                        startActivity(intent);
                    }
                });
                holder.setOnClickListener(R.id.txt6, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(SupervisionTrackingDetailsActivity.this, DelayedListActivity.class);
                        intent.putExtra("userId", userId);
                        intent.putExtra("guId", obj.getSPECIFIC_GUID());
                        intent.putExtra("type", 1);
                        startActivity(intent);
                    }
                });
            }
        };
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(SupervisionTrackingDetailsActivity.this, SpecialDetailsActivity.class);
                intent.putExtra("specificGuid", lData.get(i).getSPECIFIC_GUID());
                intent.putExtra("type", "specificDetal");
                intent.putExtra("state", 4);
                startActivity(intent);
            }
        });
        cAdapter = new MyAdapter<SupervisionTrackingDetails.SupBean.LeadersBean>(cData, R.layout.listview_coment_item)
        {
            @Override
            public void bindView(final ViewHolder holder, SupervisionTrackingDetails.SupBean.LeadersBean obj, int position)
            {
                holder.setText(R.id.textView01, obj.getINSTRUCTION());
                holder.setText(R.id.textView02, obj.getLEADER());
                holder.setText(R.id.textView03, DateUtils.timeToString2(obj.getCREATE_DATE().getTime()));
            }
        };
        comment.setAdapter(cAdapter);
        getData();
    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("supervisionDetail", "supervisionGuid=" + supervisionGuid);
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
                                dialog.dismiss();
                                mData = JsonGenerics.transform(response, SupervisionTrackingDetails.class);
                                mAttachmentFragment.setData(mData.getSup().getFile());
                                lData.addAll(mData.getSup().getSpecificList().getItems());
                                adapter.notifyDataSetChanged();
                                cData.addAll(mData.getSup().getLeaders());
                                cAdapter.notifyDataSetChanged();
                                if (cData.size() > 0)
                                {
                                    list_text1.setVisibility(View.GONE);
                                }
                                setView();
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
                                dialog.dismiss();
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

    private void setView()
    {
        SupervisionTrackingDetails.SupBean data = mData.getSup();
        text1.setText(data.getITEM_NUMBER());
        text2.setText(data.getITEM_TITLE());
        text3.setText(data.getTYPE_NAME());
        text4.setText(data.getFROM_NUMBER());
        text5.setText(data.getLEADER_NAME());
        text6.setText(data.getSIMPLE_TASK() == 0 ? "是" : "否");
        text7.setText(data.getITEM_SOURCE());
        text8.setText(DateUtils.timeToString2(data.getEND_DATE() == null ? 0 : data.getEND_DATE().getTime()));
        text9.setText(data.getMAIN_CONTEXT());
    }

    @OnClick({R.id.left_img, R.id.zgw})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.zgw:
                Intent intent = new Intent(this, FeedbackListActivity.class);
                intent.putExtra("guId", supervisionGuid);
                intent.putExtra("type", 1);
                startActivity(intent);
                break;
        }

    }
}
