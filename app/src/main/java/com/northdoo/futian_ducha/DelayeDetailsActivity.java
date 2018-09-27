package com.northdoo.futian_ducha;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.DelayeDetails;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/21.
 */

public class DelayeDetailsActivity extends BaseActivity
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
    @BindView(R.id.titles)
    TextView titles;
    private String userId;
    private DelayeDetails mData;
    AttachmentFragment mAttachmentFragment;
    private int type;
    private String guId;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_delayed_details);
    }

    @Override
    protected void initData()
    {
        titles.setVisibility(View.GONE);
        guId = getIntent().getStringExtra("guId");
        type = getIntent().getIntExtra("type", 1);
        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
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
                        paramet = "http://172.29.53.36/mobile2/supervision/delayApplyDetail?delayGuid=" + guId;
                        break;
                    case 2:
                        paramet = "http://172.29.53.36/mobile2/supervision/detPlanDelayApplyDetail?delayGuid=" + guId;
                        break;
                    case 3:
                        paramet = "http://172.29.53.36/mobile2/supervision/delayApplyDetail?delayGuid=" + guId;
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
                                mData = JsonGenerics.transform(response, DelayeDetails.class);
                                mAttachmentFragment.setData(mData.getFile());
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
        DelayeDetails.MapBean ubBean = mData.getMap();
        text1.setText(DateUtils.timeToString2(ubBean.getSCHEDULED_DATE() == null ? 0 : ubBean.getSCHEDULED_DATE().getTime()));
        text2.setText(DateUtils.timeToString2(ubBean.getDELAY_DATE() == null ? 0 : ubBean.getDELAY_DATE().getTime()));
        text3.setText(DateUtils.timeToString2(ubBean.getCREATE_DATE() == null ? 0 : ubBean.getCREATE_DATE().getTime()));
        text4.setText(ubBean.getREASON());

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
                RESULT = "无效";
                break;
        }
        text5.setText(RESULT);
        text6.setText(ubBean.getRESULT_REASON());
        text7.setText(DateUtils.timeToString2(ubBean.getRESULT_DATE() == null ? 0 : ubBean.getRESULT_DATE().getTime()));
        text8.setText(TextUtils.isEmpty(ubBean.getDEPARTMENT_NAME()) ? "" : ubBean.getDEPARTMENT_NAME());
        text9.setText(ubBean.getAPPMAN());


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
