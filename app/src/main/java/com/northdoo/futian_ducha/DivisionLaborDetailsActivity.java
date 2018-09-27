package com.northdoo.futian_ducha;

import android.os.RemoteException;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.DivisionLaborDetails;
import com.northdoo.futian_ducha.bean.Templates;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;
import static com.northdoo.futian_ducha.utlis.JsonGenerics.transform;

/**
 * Created by Administrator on 2018/8/21.
 */

public class DivisionLaborDetailsActivity extends BaseActivity
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
    @BindView(R.id.ll)
    LinearLayout ll;
    private DivisionLaborDetails.MapBean mData;
    private String guid;
    private int dutyType;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_division_labor_details);
    }

    @Override
    protected void initData()
    {
        if (!getIntent().getStringExtra("type").equals("0"))
        {
            ll.setVisibility(View.GONE);
        }
        dutyType = getIntent().getIntExtra("dutyType", 1);
        guid = getIntent().getStringExtra("guid");
        getData();
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("gotoConfirmDetailForUnit", "guid=" + guid + "&dutyType=" + dutyType);
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
                                mData = transform(response, DivisionLaborDetails.class).getMap();
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

    private void confirmDuty(String msg, int type)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = "guid=" + guid + "&dutyType=" + dutyType + "&status=" + type + "&reason=" + TohexUtils.strToHex(msg);
                Parameters parameters = new Parameters("confirmDuty", paramet);
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
                                Templates data = JsonGenerics.transform(response, Templates.class);
                                if (data.getResult().equals("success"))
                                {
                                    Alert("成功");
                                    finish();
                                } else
                                {
                                    Alert("失败");
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
                                dialog.dismiss();
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
                Alert(e.getMessage());
            }
        } else
        {
            Alert("service断开连接！");
        }
    }

    private void setView()
    {
        text1.setText(mData.getSUPERVISION_TYPE_NAME());
        text2.setText(DateUtils.timeToString2(mData.getCONFIRM_DATE().getTime()));
        text3.setText(DateUtils.timeToString2(mData.getWRITEPLAN_DATE().getTime()));
        text4.setText(mData.getMAIN_WORK());
        text5.setText(mData.getCONTENT());
        text6.setText(mData.getGOAL());
        text7.setText(mData.getDutyType());
        text8.setText(mData.getSTATUS());
    }


    @OnClick({R.id.left_img, R.id.qr, R.id.fr})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.qr:
                confirmDuty("", 1);
                break;
            case R.id.fr:
                new EditDialog(this, 1, new EditDialog.Msg()
                {
                    @Override
                    public void getMsg(String msg, int type)
                    {
                        confirmDuty(msg, 2);
                    }
                }).show();
                break;
        }
    }
}
