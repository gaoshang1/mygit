package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.AllSupType;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;


/**
 * Created by Administrator on 2017/8/23.
 */

public class SearchActivity extends BaseActivity
{

    @BindView(R.id.txt1)
    TextView txt1;
    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.txt2)
    TextView txt2;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.txt3)
    TextView txt3;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.text4)
    TextView text4;
    @BindView(R.id.txt4)
    TextView txt4;
    @BindView(R.id.text5)
    TextView text5;
    @BindView(R.id.ll2)
    LinearLayout ll2;
    @BindView(R.id.div3)
    LinearLayout div3;
    @BindView(R.id.div4)
    LinearLayout div4;
    @BindView(R.id.div2)
    LinearLayout div2;
    @BindView(R.id.ll3)
    LinearLayout ll3;
    @BindView(R.id.ll4)
    LinearLayout ll4;
    private SimpleDateFormat formatter;
    private Date curDate;
    private int type;
    private String userId;
    private String typeGuid = "";
    private List<AllSupType.ListBean> mData;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_search);
    }

    @Override
    protected void initData()
    {
        mData = new ArrayList<>();
        mData.add(new AllSupType.ListBean("", "全部"));
        mData.add(new AllSupType.ListBean("0", "单次反馈"));
        mData.add(new AllSupType.ListBean("2", "年度事项"));
        mData.add(new AllSupType.ListBean("1,3,4,5", "其他"));
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        type = getIntent().getIntExtra("type", 1);
        formatter = new SimpleDateFormat("yyyy-MM-dd");
        curDate = new Date(System.currentTimeMillis());//获取当前时间 
        String time = formatter.format(curDate);
        switch (type)
        {
            case 1:
                getData();
                break;
            case 2:
                txt2.setText("专项名称");
                div4.setVisibility(View.GONE);
                ll4.setVisibility(View.GONE);
                break;
            case 3:
                txt2.setText("专项名称");
                txt4.setText("反馈类型");
                break;
            case 4:
                txt2.setText("专项名称");
                txt4.setText("反馈类型");
                div3.setVisibility(View.GONE);
                ll3.setVisibility(View.GONE);
                break;
            case 5:
                txt2.setText("专项名称");
                div4.setVisibility(View.GONE);
                ll4.setVisibility(View.GONE);
                break;
            case 6:
                txt2.setText("专项名称");
                txt4.setText("反馈类型");
                break;
            case 7:
                txt2.setText("专项名称");
                txt4.setText("反馈类型");
                div3.setVisibility(View.GONE);
                ll3.setVisibility(View.GONE);
                break;
            case 8:
                txt2.setText("专项名称");
                txt4.setText("反馈类型");
                break;
        }
    }

    public static String strToHex(String source)
    {
        if (TextUtils.isEmpty(source))
        {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++)
        {
            sb.append(Integer.toHexString(source.codePointAt(i)) + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }


    @OnClick({R.id.left_img, R.id.determine, R.id.text3, R.id.text4, R.id.text5})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.determine:
                String itemNumber = text1.getText().toString() + "";
                String itemTitle = strToHex(text2.getText().toString());
                String startDate = text3.getText().toString() + "";
                String endDate = text4.getText().toString() + "";
                Intent intent = null;
                switch (type)
                {
                    case 1:
                        intent = new Intent(this, SupervisionTrackingActivity.class);
                        break;
                    case 2:
                        intent = new Intent(this, SpecialTrackingActivity.class);
                        break;
                    case 3:
                        intent = new Intent(this, PlanUndertakeActivity.class);
                        intent.putExtra("title", "计划承办");
                        intent.putExtra("holdType", "3");
                        break;
                    case 4:
                        intent = new Intent(this, TaskCommitmentActivity.class);
                        intent.putExtra("title", "任务承办");
                        intent.putExtra("holdType", "3");
                        break;
                    case 5:
                        intent = new Intent(this, TaskCopyingActivity.class);
                        break;
                    case 6:
                        intent = new Intent(this, PlanUndertakeActivity.class);
                        intent.putExtra("title", "本人抄送");
                        intent.putExtra("holdType", "5");
                        break;
                    case 7:
                        intent = new Intent(this, TaskCommitmentActivity.class);
                        intent.putExtra("title", "任务协办");
                        intent.putExtra("holdType", "4");
                        break;
                    case 8:
                        intent = new Intent(this, PlanUndertakeActivity.class);
                        intent.putExtra("title", "本人协办");
                        intent.putExtra("holdType", "4");
                        break;
                }
                intent.putExtra("type", 2);
                intent.putExtra("itemNumber", itemNumber);
                intent.putExtra("itemTitle", itemTitle);
                intent.putExtra("startDate", startDate);
                intent.putExtra("endDate", endDate);
                intent.putExtra("typeGuid", typeGuid);
                startActivity(intent);
                break;
            case R.id.text3:
                new DateDialog(this, view).show();
                break;
            case R.id.text4:
                new DateDialog(this, view).show();
                break;
            case R.id.text5:
                List<String> data = new ArrayList<>();
                for (AllSupType.ListBean a : mData)
                {
                    data.add(a.getTYPE_NAME());
                }

                new StringDialog(this, data, new StringDialog.Menu()
                {
                    @Override
                    public void setMenu(int msg)
                    {
                        text5.setText(mData.get(msg).getTYPE_NAME());
                        typeGuid = mData.get(msg).getTYPE_GUID();
                    }
                }).show();
                break;
        }
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("http://172.29.53.36/mobile2/supervision/getAllSupType", "");
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
                                mData.clear();
                                mData.add(new AllSupType.ListBean("", "全部"));
                                mData.addAll(JsonGenerics.transform(response, AllSupType.class).getList());

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


}
