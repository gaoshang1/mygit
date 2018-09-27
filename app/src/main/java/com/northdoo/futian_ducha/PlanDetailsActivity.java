package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.view.View;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.PlanDetails;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/23.
 */

public class PlanDetailsActivity extends BaseActivity
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
    @BindView(R.id.title_view)
    TextView titleView;
    @BindView(R.id.titles)
    TextView titles;
    AttachmentFragment mAttachmentFragment;
    PlanDetails mData;
    private ArrayList<String> menuData;
    private int state;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_plan_details);
    }

    @Override
    protected void initData()
    {
        state = getIntent().getIntExtra("state", 1);
        if (state == 2)
        {
            titles.setVisibility(View.VISIBLE);
        } else
        {
            titles.setVisibility(View.GONE);
        }
        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        menuData = new ArrayList<>();
        menuData.add("反馈");
        menuData.add("延期");
        getData();
    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("detPlanDetals", "detPlanGuid=" + getIntent().getStringExtra("detPlanGuid"));
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
                                mData = JsonGenerics.transform(response, PlanDetails.class);
                                if (!mData.getResult().equals("success"))
                                {
                                    return;
                                }
                                mAttachmentFragment.setData(mData.getDetPlan().getFile());
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
        PlanDetails.DetPlanBean data = mData.getDetPlan();
        text1.setText(data.getITEM_NUMBER());
        text2.setText(data.getITEM_TITLE());
        text3.setText(DateUtils.timeToString2(data.getSEND_DATE() == null ? 0 : data.getSEND_DATE().getTime()));
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
        text6.setText(data.getMAIN());
        text7.setText(data.getCOS());
        text8.setText(data.getCOPY());
        text9.setText(data.getCONTEXT());
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
                Intent it = new Intent(this, ListMenuNewActivity.class);
                it.putStringArrayListExtra("MenuItems", menuData);
                startActivityForResult(it, 102);
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
                    intent.putExtra("guId", mData.getDetPlan().getDETPLAN_GUID());
                    intent.putExtra("isSecond", true);
                    startActivity(intent);
                    break;
                case 1:
                    intent = new Intent(this, AddDelayedActivity.class);
                    intent.putExtra("guId", mData.getDetPlan().getDETPLAN_GUID());
                    intent.putExtra("isSecond", true);
                    startActivity(intent);

                    break;

            }

        }

    }
}
