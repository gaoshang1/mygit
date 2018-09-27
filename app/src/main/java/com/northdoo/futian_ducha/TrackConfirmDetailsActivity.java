package com.northdoo.futian_ducha;

import android.os.RemoteException;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.TrackConfirmAdapter;
import com.northdoo.futian_ducha.bean.GoalListBean;
import com.northdoo.futian_ducha.bean.MainDetail;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.bean.Templates;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.TohexUtils;
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

public class TrackConfirmDetailsActivity extends BaseActivity implements onClicks, ChoiceDialog.remind
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

    @BindView(R.id.listview)
    RecyclerView listview;
    MainDetail mData;
    TrackConfirmAdapter adapter;
    List<GoalListBean> data;
    public List<Templates.TemplateListBean> sdata;
    private String guid;
    private int type;
    private String userId;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_track_confirm_details);
    }

    @Override
    protected void initData()
    {
        userId = getIntent().getStringExtra("userId");
        data = new ArrayList<>();
        sdata = new ArrayList<>();
        listview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TrackConfirmAdapter(this, data);
        listview.setAdapter(adapter);
        getData();
        getTemplates();
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
                sendMainToDucha();
                break;
        }
    }


    private void sendMainToDucha()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("sendMain", "userGuid=" + userId + "&mainGuid=" + mData.getMAIN_GUID() + "&index=" + getIntent().getIntExtra("index", 0) + "&status=2");
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
                                Succes data = JsonGenerics.transform(response, Succes.class);
                                Alert(data.getMsg());
                                if (data.getResult().equals("success"))
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
        text1.setText(mData.getSUPERVISION_TYPE_NAME());
        text2.setText(mData.getFEEDBACK_TYPE());
        try
        {
            text3.setText(DateUtils.timeToString2(mData.getCONFIRM_DATE().getTime()));
        } catch (NullPointerException e)
        {
            e.getMessage();
        }

        text4.setText(DateUtils.timeToString2(mData.getWRITEPLAN_DATE().getTime()));
        text5.setText(mData.getMAIN_WORK());
        text6.setText(mData.getCONTENT());
    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("gotoMainDetail", "mainGuid=" + getIntent().getStringExtra("mainGuid"));
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
                                mData = JsonGenerics.transform(response, MainDetail.class);
                                setView();
                                data.addAll(mData.getGoalList());
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

    private void getTemplates()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("getTemplates", "");
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
                                sdata.addAll(JsonGenerics.transform(response, Templates.class).getTemplateList());
                            }
                        });
                    }

                    @Override
                    public void onError(final String e) throws RemoteException
                    {
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


    private void getRemind(String msg)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = "userGUID=" + userId + "&guid=" + guid + "&dutyType=" + type + "&mainStatus=1&msg=" + TohexUtils.strToHex(msg);
                Parameters parameters = new Parameters("remind1", paramet);
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
                                Alert(JsonGenerics.transform(response, Templates.class).getMsg());
                                ;
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

    @Override
    public void OnClickListener(String guid, int type, String a)
    {
        this.type = type;
        this.guid = guid;
        ChoiceDialog choiceDialog = new ChoiceDialog(this, sdata, 1);
        choiceDialog.show();

    }

    @Override
    public void setRemind(String msg)
    {
        getRemind(msg);
    }
}
