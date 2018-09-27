package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;
import static com.northdoo.futian_ducha.utlis.JsonGenerics.transform;

/**
 * Created by Administrator on 2018/8/31.
 */

public class ReportLeaderActivity extends BaseActivity
{
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    EditText text2;
    @BindView(R.id.text3)
    EditText text3;
    private String txt1, txt2, txt3;
    String guId;
    String userId;
    private String dutyLeaderGuid;
    private String dutyLeader;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_report_leader);
    }

    @Override
    protected void initData()
    {
        guId = getIntent().getStringExtra("guId");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();

    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = "http://172.29.53.36/mobile2/supervision/saveDutyMan?specificGuid=" + guId + "&dutyLeader=" + TohexUtils.strToHex(dutyLeader) + "&dutyMan=" + TohexUtils.strToHex(txt2) + "&dutyPhone=" + txt3 + "&dutyLeaderGuid=" + dutyLeaderGuid;
                Parameters parameters = new Parameters(paramet, "");
                service.registerCallbacks(
                        new ITaskCallback.Stub()
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
                                        Succes succes = transform(response, Succes.class);
                                        Alert(succes.getMsg());
                                        if (!succes.getResult().equals("fail"))
                                        {
                                            finish();
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
                                        Alert(e);
                                    }
                                });
                            }

                            @Override
                            public void onProgress(float progress, long total) throws RemoteException
                            {
                            }
                        }

                        , "gets", parameters);
            } catch (RemoteException e)
            {
                e.printStackTrace();
            }
        } else
        {
            Alert("service断开连接！");
        }
    }

    @OnClick({R.id.left_img, R.id.titles, R.id.add})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.titles:
                txt1 = text1.getText().toString();
                txt2 = text2.getText().toString();
                txt3 = text3.getText().toString();
                if (TextUtils.isEmpty(txt1))
                {
                    Alert("请选择分管领导");
                    return;
                }
                if (TextUtils.isEmpty(txt2))
                {
                    Alert("请输入联系人");
                    return;
                }
                if (TextUtils.isEmpty(txt3))
                {
                    Alert("请输入联系方式");
                    return;
                }
                getData();
                break;
            case R.id.add:
                Intent intent = new Intent();
                intent.setAction("android.tutor.action.InteractiveActivity");
                startActivityForResult(intent, 2);
                break;

        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode == RESULT_OK && requestCode == 2)
        {
            dutyLeaderGuid = data.getStringExtra("userId");
            dutyLeader = data.getStringExtra("name");
            text1.setText(dutyLeader);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
