package com.northdoo.futian_ducha;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.CollectDoDetails;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.futian_ducha.wps.utils.Define;
import com.northdoo.futian_ducha.wps.utils.SettingPreference;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameter;
import com.northdoo.luohu.Parameters;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2017/8/22.
 */

public class CollectDetailsActivity extends BaseActivity
{
    //    public static final String copyRight = "SxD/phFsuhBWZSmMVtSjKZmm/c/3zSMrkV2Bbj5tznSkEVZmTwJv0wwMmH/" +
//            "+p6wLHowmjwZJ2rgd98JTG9m9WkrGznzdPvC9RiiwWlnIvs1HfFe16JZOU/stEu94l6oF8mKQjshgVZrhoHxnP1" +
//            "p7PdTBKXxvcqw3q2p8YsYjzuTYMjxl2yza073SWYU+ZY0OSUBP3Adjs8NaxYZHdhwEWlQ9PW1waQ44Wyx97rcHxf" +
//            "CWGeAboykeK9Xgs0dN86zEseqxJFres0pilHwpPTHMT9pv+jONaV8Q3B+ivjObv1g/vrwJ/9YNh83jIdi+G80zQSiQliw1" +
//            "zixmgRjcaqVAyGzeDYUeCGH3mqNaobVYFou7QBlSyWrT5Uj5ijHG" +
//            "vOExgkQLXJLGBuoP95zYF78d6Dc7qpKiQmpkMVMtYsbbuIRQKj6haOWSogZQQupsMlS9nwGBxbb+c/6f8a64N4TtJA==";
    private File destDir;
    private final String[] OPEN_MODE = {Define.READ_ONLY, Define.NORMAL,
            Define.READ_MODE, Define.SAVE_ONLY};
    private SettingPreference settingPreference;
    private DownloadDialog downloadDialog;
    private CollectDoDetails mData;
    private String instanceGUID;
    private String receiverGUID;
    private int type;
    private List<Parameter> parameters = new ArrayList<>();
    private List<CollectDoDetails.AttachFilesBean> attachFiles;
    private MyAdapter<CollectDoDetails.AttachFilesBean> adapter;
    private String url;
    @BindView(R.id.left_img)
    ImageView leftImg;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.zgw)
    ImageView zgw;
    @BindView(R.id.wh)
    TextView wh;
    @BindView(R.id.wl)
    TextView wl;
    @BindView(R.id.md)
    TextView md;
    @BindView(R.id.dj)
    TextView dj;
    @BindView(R.id.fwbt)
    TextView fwbt;
    @BindView(R.id.qldyj)
    TextView qldyj;
    @BindView(R.id.ztc)
    TextView ztc;
    @BindView(R.id.hzlx)
    TextView hzlx;
    @BindView(R.id.cb)
    TextView cb;
    @BindView(R.id.sffk)
    TextView sffk;
    @BindView(R.id.blsx)
    TextView blsx;
    @BindView(R.id.thyj)
    TextView thyj;
    @BindView(R.id.zwfj)
    TextView zwfj;
    @BindView(R.id.gone_ll)
    LinearLayout goneLl;
    @BindView(R.id.icon)
    ImageView icon;
    @BindView(R.id.isgone)
    LinearLayout isgone;
    @BindView(R.id.listview)
    NoScrollListView listview;
    private String userName = "admin";//用户名
    //金格科技iApp试用许可A02    过期时间=2018-03-22
    private String copyRight = "SxD/phFsuhBWZSmMVtSjKZmm/c/3zSMrkV2Bbj5tznSkEVZmTwJv0wwMmH/+p6wLiUHbjadYueX9v51H9GgnjUhmNW1xPkB++KQqSv/VKLDsR8V6RvNmv0xyTLOrQoGzAT81iKFYb1SZ/Zera1cjGwQSq79AcI/N/6DgBIfpnlwiEiP2am/4w4+38lfUELaNFry8HbpbpTqV4sqXN1WpeJ7CHHwcDBnMVj8djMthFaapMFm/i6swvGEQ2JoygFU3W8onCO1AgMAD2SkxfJXM/qRv2+pI7mX9rU3GYag18CO1VzVwUlmsSQF90/OYTdIhuI7ZTJqU764j1aPQnpiJKObuFlaXloWGH2jmFcun0+e6lZhbc0wZsYY7F8fGE4DHZs4YOxNd7fnxKM4Dd4Klf1+OBmeDcECRDSxKMJbBZX1pfsTtAHCPsM91dSWDvyu3tGIYfNWOY83ltjqKjeToDSIzRqZYYUbAtzuYjy8C+3II548HoPA1gYV4xJ6KHYBnkAjzT2GCajPAQXQhGl1jQm3+KjjXk4eWYscdbEPDzss=";

    @Override
    protected void initView()
    {
        setContentView(R.layout.ctivitya_collect_details);
    }

    @Override
    protected void initData()
    {

        destDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/futian");
        if (!destDir.exists())
        {
            destDir.mkdirs();
        }
        instanceGUID = getIntent().getStringExtra("instanceGUID");
        receiverGUID = getIntent().getStringExtra("receiverGUID");
        type = getIntent().getIntExtra("type", 1);
        title.setText(type == 1 ? "已收公文详情" : "已发公文详情");
        if (type == 1)
        {
            zgw.setVisibility(View.VISIBLE);
        }
        attachFiles = new ArrayList<>();
        adapter = new MyAdapter<CollectDoDetails.AttachFilesBean>(attachFiles, R.layout.item_attach_files)
        {
            @Override
            public void bindView(ViewHolder holder, CollectDoDetails.AttachFilesBean obj, int position)
            {

                holder.setImageResource(R.id.icon, getFileIconId(obj.getFILENAMEEXT()));
                holder.setText(R.id.title, obj.getTITLE());
                holder.setText(R.id.name, obj.getCREATORNAME());
                holder.setText(R.id.time, DateUtils.timeToString2(obj.getCREATEDATE().getTime()));

            }
        };
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l)
            {
                File file = new File(destDir.getPath() + "/" + attachFiles.get(i).getTITLE() + "." + attachFiles.get(i).getFILENAMEEXT());
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
                                    url = "http://172.29.53.36/mobile2/commonCtr/downloadFile?filePath=" + attachFiles.get(i).getFilePath() + "&fileName=" + strToHex(attachFiles.get(i).getTITLE() + "." + attachFiles.get(i).getFILENAMEEXT());
                                    Parameters parameters = new Parameters();
                                    parameters.setUrl(url);
                                    parameters.setName(attachFiles.get(i).getTITLE() + "." + attachFiles.get(i).getFILENAMEEXT());
                                    parameters.setTitle("0");
                                    service.registerCallbacks(new ITaskCallback.Stub()
                                    {
                                        @Override
                                        public void onProgress(final float progress, final long total) throws RemoteException
                                        {
                                            runOnUiThread(new Runnable()
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

                                            runOnUiThread(new Runnable()
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
                                            runOnUiThread(new Runnable()
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
        getData();

    }

    public static int getFileIconId(String fileName)
    {
        if (TextUtils.isEmpty(fileName))
        {
            return R.mipmap.wzwj;
        }
        String name = fileName.toLowerCase();
        if (name.endsWith("doc") || name.endsWith("docx") || name.endsWith("wps"))
        {
            return R.mipmap.word;
        } else if (name.endsWith("xls") || name.endsWith("xlsx"))
        {
            return R.mipmap.excel;
        } else if (name.endsWith("ppt") || name.endsWith("pptx"))
        {
            return R.mipmap.ppt;
        } else if (name.endsWith("pdf"))
        {
            return R.mipmap.pdf;
        } else if (name.endsWith("txt"))
        {
            return R.mipmap.txt;
        } else if (name.endsWith("png") || name.endsWith("jpg") || name.endsWith("jpeg"))
        {
            return R.mipmap.png;
        } else if (name.endsWith("ceb"))
        {
            return R.mipmap.ceb;
        } else if (name.endsWith("zip") || name.endsWith("rar"))
        {
            return R.mipmap.rar;
        } else if (name.endsWith("html"))
        {
            return R.mipmap.html;
        } else
        {
//            if (name.indexOf(".") >= 0)
//            {
//                return R.mipmap.unknow_96;
//            } else
//            {
            return R.mipmap.wzwj;
//            }
        }
    }

    private void getDownloadProgressDialog()
    {
        downloadDialog = new DownloadDialog(this);
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

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = null;
                if (type == 1)
                {
//                    url = "http://172.29.53.36/mobile2/OfficialDocRSController/getReceiveDetail?receiverGUID=" + receiverGUID + "&instanceGUID=" + instanceGUID;
                    parameters = new Parameters("getReceiveDetail", "receiverGUID=" + receiverGUID + "&instanceGUID=" + instanceGUID);
                } else if (type == 2)
                {
//                    url = "http://172.29.53.36/mobile2/OfficialDocRSController/getSendDetail?instanceGUID=" + instanceGUID;
                    parameters = new Parameters("getSendDetail", "instanceGUID=" + instanceGUID);
                }
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
                                mData = JsonGenerics.transform(response, CollectDoDetails.class);
                                attachFiles.addAll(mData.getAttachFiles());
                                if (attachFiles.size() > 0)
                                {
                                    zwfj.setVisibility(View.GONE);
                                }
                                adapter.notifyDataSetChanged();
                                fwbt.setText(mData.getDOCTITLE());
                                wl.setText(mData.getCOMDOC_CLASSIFY());
                                md.setText(mData.getSECRETGRADE());
                                dj.setText(mData.getURGENTGRADE());
                                ztc.setText(mData.getTOPIC());
                                qldyj.setText(mData.getLEADERDIRECTION());
                                wh.setText(mData.getFILE_NO());
                                hzlx.setText(mData.getReceiptType());
                                cb.setText(mData.getUrging());
                                sffk.setText(mData.getIsbackResult());
                                blsx.setText(mData.getIsUntread());
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

    @OnClick({R.id.left_img, R.id.isgone, R.id.zgw})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.zgw:

                Intent it = new Intent(this, ListMenuActivity.class);
                it.putExtra("userId", getIntent().getStringExtra("userId"));
                it.putExtra("instanceGUID", instanceGUID);
                startActivity(it);
                break;
            case R.id.left_img:
                finish();
                break;
            case R.id.isgone:
                if (goneLl.getVisibility() == View.VISIBLE)
                {
                    icon.setImageResource(R.mipmap.icon_lower);
                    goneLl.setVisibility(View.GONE);
                } else if (goneLl.getVisibility() == View.GONE)
                {
                    goneLl.setVisibility(View.VISIBLE);
                    icon.setImageResource(R.mipmap.icon_upper);
                }
                break;
        }
    }


    public static String strToHex(String source)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++)
        {
            sb.append(Integer.toHexString(source.codePointAt(i)) + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
 