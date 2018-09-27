package com.northdoo.futian_ducha;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.View;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.luohu.ITaskBinder;

import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

public class MainActivity extends BaseActivity
{


    private String userId;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setClassName("com.northdoo.luohu", "com.northdoo.luohu.AIDLService");
        getApplicationContext().bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);

    }

    @Override
    protected void initData()
    {
        userId = "{AC1D3364-0000-0000-2D64-B27200000002}";
        SpUtils.setParam(this, SpUtils.USER_ID, userId);
    }

    private ServiceConnection mServiceConnection = new ServiceConnection()
    {
        @Override
        public void onServiceDisconnected(ComponentName arg0)
        {
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder binder)
        {
            // 获取远程Service的onBinder方法返回的对象代理
            service = ITaskBinder.Stub.asInterface(binder);
        }

    };


    @OnClick({R.id.left_img, R.id.search, R.id.but2, R.id.but10, R.id.but6, R.id.but3, R.id.but4, R.id.but7, R.id.but8, R.id.but9, R.id.but5, R.id.but1})
    public void onViewClicked(View view)
    {
        Intent intenta;
        switch (view.getId())
        {

            case R.id.left_img:
                finish();
                break;
            case R.id.search:
                intenta = new Intent(this, SearchActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                startActivity(intenta);
                break;
            case R.id.but1:
                intenta = new Intent(this, TrackConfirmActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                intenta.putExtra("status", "1");
                startActivity(intenta);
                break;
            case R.id.but2:
                intenta = new Intent(this, TrackConfirmActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                intenta.putExtra("status", "2,3");
                startActivity(intenta);
                break;
            case R.id.but3:
                intenta = new Intent(this, DivisionLaborActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                startActivity(intenta);
                break;
            case R.id.but4:
                intenta = new Intent(this, ProgressFillActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                startActivity(intenta);
                break;
            case R.id.but5:
                intenta = new Intent(this, SupervisionTrackingActivity.class);
                intenta.putExtra("type", 1);
                intenta.putExtra("itemNumber", "");
                intenta.putExtra("itemTitle", "");
                intenta.putExtra("startDate", "2018-3-6");
                intenta.putExtra("endDate", "2028-9-1");
                intenta.putExtra("typeGuid", "");
                startActivity(intenta);
                break;
            case R.id.but6:
                intenta = new Intent(this, SpecialTrackingActivity.class);
                intenta.putExtra("type", 1);
                intenta.putExtra("itemNumber", "");
                intenta.putExtra("itemTitle", "");
                intenta.putExtra("startDate", "2000-3-6");
                intenta.putExtra("endDate", "2028-9-1");
                intenta.putExtra("typeGuid", "");
                startActivity(intenta);
                break;
            case R.id.but7:
                intenta = new Intent(this, PlanUndertakeActivity.class);
                intenta.putExtra("type", 1);
                intenta.putExtra("itemNumber", "");
                intenta.putExtra("itemTitle", "");
                intenta.putExtra("title", "计划承办");
                intenta.putExtra("startDate", "2000-3-6");
                intenta.putExtra("endDate", "2028-9-1");
                intenta.putExtra("typeGuid", "");
                intenta.putExtra("holdType", "3");
                startActivity(intenta);
                break;
            case R.id.but8:
                intenta = new Intent(this, TaskCommitmentActivity.class);
                intenta.putExtra("type", 1);
                intenta.putExtra("itemNumber", "");
                intenta.putExtra("itemTitle", "");
                intenta.putExtra("title", "任务承办");
                intenta.putExtra("startDate", "2000-3-6");
                intenta.putExtra("endDate", "2028-9-1");
                intenta.putExtra("holdType", "3");
                intenta.putExtra("typeGuid", "");
                startActivity(intenta);
                break;
            case R.id.but9:
                intenta = new Intent(this, CopyActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                startActivity(intenta);
                break;
            case R.id.but10:
                intenta = new Intent(this, JointlyActivity.class);
                intenta.putExtra("userId", SpUtils.getParam(this, SpUtils.USER_ID, "{AC1D3318-FFFF-FFFF-C398-86D20000001D}") + "");
                startActivity(intenta);
                break;
        }
    }

}
