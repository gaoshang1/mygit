package com.northdoo.futian_ducha;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.os.RemoteException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseFragment;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.FileBean;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2017/6/1.
 */

public class AttachmentFragment extends BaseFragment
{

    private File destDir;
    @BindView(R.id.title_view)
    TextView titleView;
    @BindView(R.id.listView)
    NoScrollListView listView;
    private List<FileBean> mData;
    private MyAdapter adapter;
    private DownloadDialog downloadDialog;


    public void setData(List<FileBean> mData)
    {
        this.mData.clear();
        this.mData.addAll(mData);
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState)
    {
    }

    @Override
    protected int getLayoutId()
    {
        return R.layout.layout_attachment;
    }

    @Override
    protected void initData()
    {
        destDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/futian");
        if (!destDir.exists())
        {
            destDir.mkdirs();
        }
        mData = new ArrayList<>();
        adapter = new MyAdapter<FileBean>(mData, R.layout.item_attach_files)
        {
            @Override
            public void bindView(ViewHolder holder, FileBean obj, int position)
            {

                holder.setImageResource(R.id.icon, TohexUtils.getFileIconId(obj.getFilenameext()));
                holder.setText(R.id.title, obj.getFileName());
                holder.setText(R.id.name, obj.getCreatorName());
                holder.setText(R.id.time, DateUtils.timeToString2(obj.getCreateDate().getTime()));

            }
        };
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l)
            {
                File file = new File(destDir.getPath() + "/" + mData.get(i).getFileName());
                if (file.exists())
                {

                    try
                    {
                        service.registerCallbacks(null, "openFile", new Parameters(file.getPath(), "false"));
                    } catch (RemoteException e)
                    {
                        e.printStackTrace();
                    }
                } else
                {
                    getDownloadProgressDialog();
                    new Thread(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            if (service != null)
                            {
                                try
                                {
                                    String url = "http://172.29.53.36/mobile2/supFile/download?fileGuid=" + mData.get(i).getFileGUID();
                                    Parameters parameters = new Parameters();
                                    parameters.setUrl(url);
                                    parameters.setName(mData.get(i).getFileName());
                                    parameters.setTitle("0");
                                    service.registerCallbacks(new ITaskCallback.Stub()
                                    {
                                        @Override
                                        public void onProgress(final float progress, final long total) throws RemoteException
                                        {
                                            getActivity().runOnUiThread(new Runnable()
                                            {
                                                @Override
                                                public void run()
                                                {
                                                    if (downloadDialog != null)
                                                    {
                                                        downloadDialog.setProgress(100, (int) (progress * 100));
                                                    }
                                                }
                                            });
                                        }

                                        @Override
                                        public void onResponse(final String response) throws RemoteException
                                        {

                                            getActivity().runOnUiThread(new Runnable()
                                            {
                                                @Override
                                                public void run()
                                                {
                                                    downloadDialog.dismiss();
                                                    try
                                                    {
                                                        service.registerCallbacks(null, "openFile", new Parameters(response, "false"));
                                                    } catch (RemoteException e)
                                                    {
                                                        e.printStackTrace();
                                                    }

                                                }
                                            });
                                        }

                                        @Override
                                        public void onError(final String e) throws RemoteException
                                        {
                                            getActivity().runOnUiThread(new Runnable()
                                            {
                                                @Override
                                                public void run()
                                                {
                                                    downloadDialog.dismiss();
                                                    Alert(e);
                                                }
                                            });
                                        }
                                    }, "download", parameters);
                                } catch (RemoteException e)
                                {
                                    downloadDialog.dismiss();
                                    e.printStackTrace();
                                }
                            } else
                            {
                                downloadDialog.dismiss();
                                Alert("service断开连接！");
                            }
                        }
                    }).start();
                }

            }
        });
    }

    private void getDownloadProgressDialog()
    {
        downloadDialog = new DownloadDialog(getActivity());
        downloadDialog.setCanceledOnTouchOutside(false);
        downloadDialog.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
            @Override
            public void onCancel(DialogInterface dialogInterface)
            {
            }
        });
        downloadDialog.show();
    }


}
