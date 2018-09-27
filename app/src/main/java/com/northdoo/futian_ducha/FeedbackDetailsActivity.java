package com.northdoo.futian_ducha;

import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.FeedbackDetails;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/21.
 */

public class FeedbackDetailsActivity extends BaseActivity
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
    @BindView(R.id.textd)
    TextView textd;
    @BindView(R.id.listview)
    NoScrollListView listview;
    @BindView(R.id.list_text2)
    TextView listText2;
    @BindView(R.id.list_text3)
    TextView listText3;
    @BindView(R.id.list_text4)
    TextView listText4;
    @BindView(R.id.list_text5)
    TextView listText5;
    @BindView(R.id.title_view)
    TextView titleView;
    @BindView(R.id.titles)
    TextView titles;
    @BindView(R.id.layout)
    LinearLayout layout;
    @BindView(R.id.listView)
    NoScrollListView listView;
    private String undertakeBackGuid;
    private String userId;
    private FeedbackDetails mData;
    List<FeedbackDetails.ContentsBean> dData;
    MyAdapter dAdapter;
    AttachmentFragment mAttachmentFragment;
    private int type;
    private String guId;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_feedback_details);
    }

    @Override
    protected void initData()
    {
        guId = getIntent().getStringExtra("guId");
        type = getIntent().getIntExtra("type", 1);
        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        dData = new ArrayList<>();
        dAdapter = new MyAdapter<FeedbackDetails.ContentsBean>(dData, R.layout.item_special)
        {
            @Override
            public void bindView(final ViewHolder holder, FeedbackDetails.ContentsBean obj, int position)
            {
                holder.setText(R.id.text, obj.getCONTENT());
            }
        };
        listview.setAdapter(dAdapter);
        getData();
    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = null;
                switch (type)
                {
                    case 1:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoUndertakeBackDetail?undertakeBackGuid=" + guId + "&userGuid=" + userId;
                        break;
                    case 2:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoUndertakeBackDetail?undertakeBackGuid=" + guId + "&userGuid=" + userId;
                        break;
                    case 3:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoDetPlanUndertakeBackDetail?undertakeBackGuid=" + guId;
                        break;
                    case 4:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoDetPlanUndertakeBackDetail?undertakeBackGuid=" + guId;
                        break;
                    case 5:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoUndertakeBackDetail?undertakeBackGuid=" + guId + "&userGuid=" + userId;
                        break;
                    case 6:
                        paramet = "http://172.29.53.36/mobile2/supervision/gotoDetPlanUndertakeBackDetail?undertakeBackGuid=" + guId;
                        break;
                }

                Parameters parameters = new Parameters(paramet, "");
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
                                mData = JsonGenerics.transform(response, FeedbackDetails.class);

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

    private void saveReplyBack(int types, String msg)
    {
        if (service != null)
        {
            try
            {
                String url = "";
                if (type == 1)
                {
                    url = "http://172.29.53.36/mobile2/supervision/saveReplyBack?undertakeBackGuid=" + guId + "&userGuid=" + userId + "&result=" + types + "&resultReason=" + TohexUtils.strToHex(msg);
                } else if (type == 3)
                {
                    url = "http://172.29.53.36/mobile2/supervision/saveDetplanReplyBack?undertakeBackGuid=" + guId + "&userGuid=" + userId + "&result=" + types + "&resultReason=" + TohexUtils.strToHex(msg);
                }
                Log.e("url", url);
                Parameters parameters = new Parameters(url, "");
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
                                getData();
                                Alert(JsonGenerics.transform(response, Succes.class).getMsg());

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


    private void setView()
    {
        FeedbackDetails.UbBean ubBean = mData.getUb();
        mAttachmentFragment.setData(mData.getFile());
        text3.setText(DateUtils.timeToString2(ubBean.getEND_DATE() == null ? 0 : ubBean.getEND_DATE().getTime()));
        text4.setText(DateUtils.timeToString2(ubBean.getASK_DATE() == null ? 0 : ubBean.getASK_DATE().getTime()));
        text5.setText(DateUtils.timeToString2(ubBean.getCREATE_DATE() == null ? 0 : ubBean.getCREATE_DATE().getTime()));
        text6.setText(ubBean.getDEPARTMENT_NAME());
        text7.setText(ubBean.getAPPMAN());
        String RESULT = "";
        switch (ubBean.getRESULT())
        {
            case 0:
                RESULT = "驳回";
                break;
            case 1:
                RESULT = "通过";
                break;
            case 2:
                RESULT = "无效反馈";
                break;
        }
        text8.setText(RESULT);
        text9.setText(ubBean.getRESULT_REASON());
        text10.setText(ubBean.getDEPARTMENT_NAME());
        text11.setText(ubBean.getCOMPLETE() == 1 ? "已完成" : "未完成");

//        listText1.setText(mData.getContents().get());
        listText2.setText(ubBean.getPROGRESS());
        listText3.setText(ubBean.getPROBLEM());
        listText4.setText(ubBean.getPRO_DEPT());
        listText5.setText(ubBean.getPLAN());
        if (type == 1 || type == 3)
        {
            titles.setVisibility(View.VISIBLE);
        }

        if (type == 3 || type == 4 || type == 6)
        {

            layout.setVisibility(View.GONE);
            textd.setVisibility(View.VISIBLE);
            textd.setText(ubBean.getCONTEXT());
            text1.setText(ubBean.getITEM_TITLE());
            text2.setText(ubBean.getITEM_NUMBER());
        } else if (type == 2 || type == 1 || type == 5)
        {
            dData.clear();
            dData.addAll(mData.getContents());
            dAdapter.notifyDataSetChanged();
            layout.setVisibility(View.VISIBLE);
            textd.setVisibility(View.GONE);
            text1.setText(mData.getSpe().getITEM_TITLE());
            text2.setText(mData.getSpe().getITEM_NUMBER());
            text12.setText(mData.getCos());
            text13.setText(mData.getSpe().getSPE_PLAN());

        }

    }


    @OnClick({R.id.left_img, R.id.titles})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.titles:
                new FeedbackDialog(this, new FeedbackDialog.Msg()
                {
                    @Override
                    public void getMsg(String msg, int type)
                    {
                        saveReplyBack(type, msg);
                    }
                }).show();
                break;
        }
    }
}
