package com.northdoo.futian_ducha;

import android.os.RemoteException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.FileBean;
import com.northdoo.futian_ducha.bean.Trackfile;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.List;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/9/11.
 */

public class TrackFile extends BaseActivity
{
    AttachmentFragment mAttachmentFragment;

    @Override
    protected void initView()
    {
        setContentView(R.layout.track_file_activity);
    }

    private void getFile()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("showAttachment", "subGuid=" + getIntent().getStringExtra("guid"));
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
                                Trackfile mData = new Gson().fromJson(response, Trackfile.class);
                                mAttachmentFragment.setData(mData.getFile());
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

    @Override
    protected void initData()
    {
        mAttachmentFragment = (AttachmentFragment) getSupportFragmentManager().findFragmentById(R.id.attachment_fragment);
        getFile();
    }
}
