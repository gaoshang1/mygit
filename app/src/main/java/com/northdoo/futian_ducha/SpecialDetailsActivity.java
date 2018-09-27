package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.SpecialDetails;
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

public class SpecialDetailsActivity extends BaseActivity
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
    @BindView(R.id.text10)
    TextView text10;
    @BindView(R.id.text11)
    TextView text11;
    @BindView(R.id.text12)
    TextView text12;
    @BindView(R.id.text13)
    TextView text13;
    @BindView(R.id.list_text1)
    TextView list_text1;
    @BindView(R.id.list_text2)
    TextView list_text2;
    @BindView(R.id.zgw)
    TextView zgw;
    @BindView(R.id.listview)
    NoScrollListView listview;
    @BindView(R.id.listviews)
    NoScrollListView listviews;
    @BindView(R.id.comment)
    NoScrollListView comment;
    private SpecialDetails mData;
    List<SpecialDetails.SupSpeBean.InstructionListBean> cData;
    MyAdapter cAdapter;
    List<SpecialDetails.SupSpeBean.ContentBean> dData;
    MyAdapter dAdapter;
    List<SpecialDetails.SupSpeBean.SpecificListBean.ItemsBean> lData;
    MyAdapter lAdapter;
    private String type;
    private int state;
    AttachmentFragment mAttachmentFragment;
    private ArrayList<String> menuData;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_special_details);
    }

    @Override
    protected void initData()
    {
        state = getIntent().getIntExtra("state", 2);
        if (state == 3)
        {
            zgw.setText("操作");
        } else if (state == 4)
        {
            zgw.setVisibility(View.GONE);
        }

        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        type = getIntent().getStringExtra("type");

        if (type.equals("specificDetal"))

        {
            listviews.setVisibility(View.GONE);
        }

        cData = new ArrayList<>();
        cAdapter = new MyAdapter<SpecialDetails.SupSpeBean.InstructionListBean>(cData, R.layout.listview_coment_item)

        {
            @Override
            public void bindView(final ViewHolder holder, SpecialDetails.
                    SupSpeBean.InstructionListBean obj, int position)
            {
                holder.setText(R.id.textView01, obj.getINSTRUCTION());
                holder.setText(R.id.textView02, obj.getLEADER());
                holder.setText(R.id.textView03, DateUtils.timeToString2(obj.getCREATE_DATE().getTime()));
            }
        };
        comment.setAdapter(cAdapter);
        dData = new ArrayList<>();
        dAdapter = new MyAdapter<SpecialDetails.SupSpeBean.ContentBean>(dData, R.layout.item_special)
        {
            @Override
            public void bindView(final ViewHolder holder, SpecialDetails.SupSpeBean.ContentBean obj,
                                 int position)
            {
                holder.setText(R.id.text, obj.getCONTENT());
            }
        };
        listview.setAdapter(dAdapter);
        lData = new ArrayList<>();
        lAdapter = new MyAdapter<SpecialDetails.SupSpeBean.SpecificListBean.ItemsBean>(lData, R.layout.item_supervision)
        {
            @Override
            public void bindView(final ViewHolder holder,
                                 final SpecialDetails.SupSpeBean.SpecificListBean.ItemsBean obj, int position)
            {
                holder.setText(R.id.text1, obj.getITEM_NUMBER());
                holder.setText(R.id.text2, obj.getITEM_TITLE());
                holder.setText(R.id.text5, obj.getMAIN());
                holder.setText(R.id.text3, DateUtils.timeToString2(obj.getSEND_DATE() == null ? 0 : obj.getSEND_DATE().getTime()));
                holder.setText(R.id.text4, DateUtils.timeToString2(obj.getNEXT_BACK_DATE() == null ? 0 : obj.getNEXT_BACK_DATE().getTime()));
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
                        Intent intent = new Intent(SpecialDetailsActivity.this, FeedbackListActivity.class);
                        intent.putExtra("guId", obj.getDETPLAN_GUID());
                        intent.putExtra("type", 4);
                        startActivity(intent);
                    }
                });
                holder.setOnClickListener(R.id.txt6, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(SpecialDetailsActivity.this, DelayedListActivity.class);
                        intent.putExtra("guId", obj.getDETPLAN_GUID());
                        intent.putExtra("type", 2);
                        startActivity(intent);
                    }
                });
            }
        };
        listviews.setAdapter(lAdapter);
        listviews.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = new Intent(SpecialDetailsActivity.this, PlanDetailsActivity.class);
                intent.putExtra("detPlanGuid", lData.get(i).getDETPLAN_GUID());
                intent.putExtra("state", 1);
                startActivity(intent);
            }
        });
        menuData = new ArrayList<>();
        menuData.add("反馈");
        menuData.add("延期");
        menuData.add("上报负责人");
        getData();

    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters(type, "specificGuid=" + getIntent().getStringExtra("specificGuid"));
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
                                mData = JsonGenerics.transform(response, SpecialDetails.class);
                                if (!mData.getResult().equals("success"))
                                {
                                    return;
                                }
                                mAttachmentFragment.setData(mData.getSupSpe().getFile());
                                cData.addAll(mData.getSupSpe().getInstructionList());
                                cAdapter.notifyDataSetChanged();
                                if (cData.size() > 0)
                                {
                                    list_text1.setVisibility(View.GONE);
                                }
                                dData.addAll(mData.getSupSpe().getContent());
                                dAdapter.notifyDataSetChanged();
                                if (dData.size() > 0)
                                {
                                    list_text2.setVisibility(View.GONE);
                                }
                                if (type.equals("getDetPlanBySpeGUID") && mData.getSupSpe().getSpecificList() != null)
                                {
                                    lData.addAll(mData.getSupSpe().getSpecificList().getItems());
                                    lAdapter.notifyDataSetChanged();
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
        SpecialDetails.SupSpeBean data = mData.getSupSpe();
        text1.setText(data.getITEM_NUMBER());
        text2.setText(data.getITEM_TITLE());
        text3.setText(DateUtils.timeToString2(data.getCREATE_DATE() == null ? 0 : data.getCREATE_DATE().getTime()));
        text4.setText(DateUtils.timeToString2(data.getEND_DATE() == null ? 0 : data.getEND_DATE().getTime()));
        String BACK_TIME;
        switch (data.getBACK_TIME())
        {
            case 1:
                BACK_TIME = "按年反馈";
                break;
            case 2:
                BACK_TIME = "按季度反馈";
                break;
            case 3:
                BACK_TIME = "按月反馈";
                break;
            case 4:
                BACK_TIME = "按周反馈";
                break;
            case 5:
                BACK_TIME = "按半年反馈";
                break;
            default:
                BACK_TIME = "";
                break;

        }
        text5.setText(BACK_TIME);
        text6.setText(data.getDUTY_LEADER());
        text7.setText(data.getDEPARTMENT_NAME());
        text8.setText(data.getDUTY_MAN());
        text9.setText(data.getDUTY_PHONE());
//        text10.setText(data.getsu));
//        text11.setText(data.getDUTY_PHONE());
//        text12.setText(data.getDUTY_PHONE());
        text13.setText(data.getSPE_PLAN());
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
                if (state == 1)
                {
                    Intent intent = new Intent(this, FeedbackListActivity.class);
                    intent.putExtra("guId", getIntent().getStringExtra("specificGuid"));
                    intent.putExtra("type", 3);
                    startActivity(intent);
                } else if (state == 3)
                {
                    Intent it = new Intent(this, ListMenuNewActivity.class);
                    it.putStringArrayListExtra("MenuItems", menuData);
                    startActivityForResult(it, 102);
                }
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent datas)
    {
        if (resultCode == 1 && requestCode == 102)
        {
            Intent intent;
            int position = datas.getIntExtra("position", 1);
            switch (position)
            {
                case 0:
                    intent = new Intent(this, AddFeedbackActivity.class);
                    intent.putExtra("guId", mData.getSupSpe().getSPECIFIC_GUID());
                    intent.putExtra("isSecond", false);
                    startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(this, AddDelayedActivity.class);
                    intent.putExtra("guId", mData.getSupSpe().getSPECIFIC_GUID());
                    intent.putExtra("isSecond", false);
                    startActivity(intent);
                    break;
                case 2:
                    intent = new Intent(this, ReportLeaderActivity.class);
                    intent.putExtra("guId", mData.getSupSpe().getSPECIFIC_GUID());
                    intent.putExtra("isSecond", false);
                    startActivity(intent);
                    break;
            }

        }

    }
}
