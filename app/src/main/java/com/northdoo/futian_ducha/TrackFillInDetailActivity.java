package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.TrackFillInAdapter;
import com.northdoo.futian_ducha.bean.AuditPlanDetail;
import com.northdoo.futian_ducha.bean.GoalListBean;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.bean.Templates;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;
import static com.northdoo.futian_ducha.utlis.JsonGenerics.transform;

/**
 * Created by Administrator on 2018/8/3.
 */

public class TrackFillInDetailActivity extends BaseActivity implements onClicks, ChoiceDialog.remind, StringDialog.Menu, EditDialog.Msg
{
    @BindView(R.id.left_img)
    ImageView leftImg;

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
    AuditPlanDetail mData;
    TrackFillInAdapter adapter;
    List<GoalListBean> data;
    private String guid;
    private int type;
    private String userId;
    public List<Templates.TemplateListBean> sdata;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_track_confirm_details);
    }

    @Override
    protected void initData()
    {
        data = new ArrayList<>();
        sdata = new ArrayList<>();
        listview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TrackFillInAdapter(this, data);
        listview.setAdapter(adapter);
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
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
                Intent intent = new Intent();
                intent.setAction("android.tutor.action.InteractiveNewActivity");
                intent.putExtra("id", "{56C750D0-65BD-B34C-834A-F763D825E987}");
                startActivityForResult(intent, 103);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 1 && requestCode == 103)
        {
            sendMainToDucha(data.getStringExtra("userId"));
        }
    }

    private void sendMainToDucha(String receiverGuid)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("http://172.29.53.36/mobile2/responsibility/sendMainToDucha?mainGuid=" + getIntent().getStringExtra("mainGuid") + "&status=4&receiverGuid=" + receiverGuid + "&userGuid=" + userId, "");
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
        text1.setText(mData.getSUPERVISION_TYPE_NAME());
        text2.setText(mData.getFEEDBACK_TYPE());
        text3.setText(DateUtils.timeToString2(mData.getCONFIRM_DATE().getTime()));
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
                Parameters parameters = new Parameters("gotoAuditPlanDetail", "mainGuid=" + getIntent().getStringExtra("mainGuid"));
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
                                mData = transform(response, AuditPlanDetail.class);
                                setView();
                                data.clear();
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
                                sdata.addAll(transform(response, Templates.class).getTemplateList());
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
                String paramet = "userGUID=" + userId + "&guid=" + guid + "&dutyType=" + type + "&mainStatus=" + getIntent().getIntExtra("STATUS", 2) + "&msg=" + TohexUtils.strToHex(msg);
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
                                Alert(transform(response, Templates.class).getMsg());
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

    private void auditPlanDetail(String msg, int type)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = "subGuid=" + guid + "&writePlanStatus=" + type + "&planDenyReason=" + TohexUtils.strToHex(msg);
                Parameters parameters = new Parameters("auditPlanDetails", paramet);
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
                                Alert(data.getMsg());
                                if (data.getResult().equals("success"))
                                {
                                    getData();
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


    @Override
    public void OnClickListener(String guid, int type, String a)
    {
        this.type = type;
        this.guid = guid;
        ArrayList<String> data = new ArrayList<>();
        switch (a)
        {
            case "0":
                data.add("催办");
                break;
            case "1":
                data.add("催办");
                data.add("附件");
                break;
            case "2":
                data.add("通过");
                data.add("无效");
                data.add("驳回");
                data.add("催办");
                data.add("附件");

                break;

            case "4":
                data.add("催办");
                data.add("附件");
                break;
            default:
                data.add("附件");

        }

        new StringDialog(this, data, this).show();

    }

    @Override
    public void setRemind(String msg)
    {
        getRemind(msg);
    }

    @Override
    public void getMsg(String msg, int type)
    {
        auditPlanDetail(msg, type);
    }

    @Override
    public void setMenu(int msg)
    {
        switch (msg)
        {
            case 0:
                auditPlanDetail("", 3);
                break;
            case 1:
                new EditDialog(this, 1, this).show();
                break;
            case 2:
                new EditDialog(this, 4, this).show();
                break;
            case 3:
                new ChoiceDialog(this, sdata, 2).show();
                break;
            case 4:
                Intent intent = new Intent(this, TrackFile.class);
                intent.putExtra("guid", guid);
                startActivity(intent);
                break;
        }
    }


}
