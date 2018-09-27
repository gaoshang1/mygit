package com.northdoo.futian_ducha;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.adapter.ProgressAdapter;
import com.northdoo.futian_ducha.bean.FileBean;
import com.northdoo.futian_ducha.bean.FileSucces;
import com.northdoo.futian_ducha.bean.NewAttachFile;
import com.northdoo.futian_ducha.bean.ProgressFillDetails;
import com.northdoo.futian_ducha.bean.Templates;
import com.northdoo.futian_ducha.utlis.DateUtils;
import com.northdoo.futian_ducha.utlis.FileUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.futian_ducha.utlis.SpUtils;
import com.northdoo.futian_ducha.utlis.TohexUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.AddActivity.FILE_SELECT_FUJIAN_CODE;
import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/8/21.
 */

public class ProgressFillDetailsActivity extends BaseActivity
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
    @BindView(R.id.titles)
    TextView titles;
    @BindView(R.id.listview)
    NoScrollListView listview;
    @BindView(R.id.att_ll)
    LinearLayout att_ll;

    private ProgressFillDetails.MapBean mData;
    private String guid;
    private ProgressAdapter adapter;
    private List<ProgressFillDetails.MapBean.PdsBean> data;
    private ArrayList<String> menuData;
    private String type;
    @BindView(R.id.num_fujian)
    TextView numFujian;
    @BindView(R.id.file_ll)
    LinearLayout linearLayout;
    @BindView(R.id.listviews)
    NoScrollListView listviewFujian;
    MyAdapter<NewAttachFile> fileAdapter;
    private List<NewAttachFile> aData;
    private File destDir;
    String userId;
    private DownloadDialog downloadDialog;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_progress_fill_details);
    }

    @Override
    protected void initData()
    {
        destDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.futian");
        if (!destDir.exists())
        {
            destDir.mkdirs();
        }
        data = new ArrayList<>();
        aData = new ArrayList<>();
        menuData = new ArrayList<>();
        menuData.add("提交");
        menuData.add("暂存");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        guid = getIntent().getStringExtra("guid");
        type = getIntent().getStringExtra("type");
        if (type.equals("2"))
        {
            linearLayout.setVisibility(View.GONE);
            titles.setVisibility(View.GONE);
        } else
        {
            att_ll.setVisibility(View.GONE);
        }
        setFujian();
        getData();

    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("gotoPlanDetailForUnit", "subGuid=" + guid + "&isUpdate=true");
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
                                mData = JsonGenerics.transform(response, ProgressFillDetails.class).getMap();
                                data.clear();
                                data.addAll(mData.getPds());
                                aData.clear();
                                for (FileBean a : mData.getFile())
                                {
                                    aData.add(new NewAttachFile(a.getFileName(), "", a.getFilenameext(), a.getFileGUID()));
                                }
                                if (data.size() == 0 && !type.equals("2"))
                                {
                                    for (String a : mData.getPlanDetails())
                                    {
                                        data.add(new ProgressFillDetails.MapBean.PdsBean(a, ""));
                                    }
                                }
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

    private void setFujian()
    {
        fileAdapter = new MyAdapter<NewAttachFile>(aData, R.layout.item_information_add)
        {
            @Override
            public void bindView(ViewHolder holder, final NewAttachFile obj, final int position)
            {

                holder.setText(R.id.filename, obj.getFileName());
                holder.setImageResource(R.id.filetype, FileUtils.getFileIconId(obj.getFileType()));
                holder.setOnClickListener(R.id.delete, new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        deleteFujian(obj.getFileGUID(), position);
                    }
                });
            }
        };
        listviewFujian.setAdapter(fileAdapter);
        listviewFujian.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l)
            {
                if (TextUtils.isEmpty(aData.get(i).getFilepath()))
                {
                    File file = new File(destDir.getPath() + "/" + aData.get(i).getFileName());
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
                        sss(i);
                    }
                } else
                {
                    try
                    {
                        service.registerCallbacks(null, "openFile", new Parameters(aData.get(i).getFilepath(), "false"));
                    } catch (RemoteException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        });
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

    private void sss(final int i)
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
                        String url = "http://172.29.53.36/mobile2/supFile/download?fileGuid=" + aData.get(i).getFileGUID();
                        Parameters parameters = new Parameters();
                        parameters.setUrl(url);
                        parameters.setName(aData.get(i).getFileName());
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

    private void addOrUpdatePlanDetail(String planDetail, String planDetailGuid, boolean type)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                String paramet = "subGuid=" + guid + "&userGuid=" + getIntent().getStringExtra("userId") + "&sent=" + type + "&planDetail=" + planDetail + "&planDetailGuid=" + planDetailGuid;
                Parameters parameters = new Parameters("addOrUpdatePlanDetail", paramet);
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
                                getData();
                                dialog.dismiss();
                                Alert(JsonGenerics.transform(response, Templates.class).getMsg());
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
        fileAdapter.notifyDataSetChanged();
        adapter = new ProgressAdapter(this, data, type.equals("2") ? 1 : mData.getIS_FROMUPPER());
        listview.setAdapter(adapter);
        text1.setText(mData.getSUPERVISION_TYPE_NAME());
        text2.setText(DateUtils.timeToString2(mData.getCONFIRM_DATE().getTime()));
        text3.setText(DateUtils.timeToString2(mData.getWRITEPLAN_DATE().getTime()));
        text4.setText(mData.getMAIN_WORK());
        text5.setText(mData.getCONTENT());
        text6.setText(mData.getGOAL());
        text7.setText(mData.getCHARGE_LEADER_NAME());
        text8.setText(mData.getCOUNITNAMES());
        text9.setText(mData.getLEADING_UNIT_NAME());
    }


    @OnClick({R.id.left_img, R.id.icon_fj, R.id.titles})
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
            case R.id.icon_fj:
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("*/*");
                intent.addCategory(Intent.CATEGORY_OPENABLE);
                try
                {
                    startActivityForResult(Intent.createChooser(intent, "请选择文件!"), FILE_SELECT_FUJIAN_CODE);
                } catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(this, "请安装文件管理器", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent datas)
    {
        if (resultCode == 1 && requestCode == 102)
        {
            String planDetail = "";
            String planDetailGuid = "";
            boolean position = datas.getIntExtra("position", 1) == 0;
            for (int i = 0; i < data.size(); i++)
            {
                if (TextUtils.isEmpty(data.get(i).getPLANDETAIL()))
                {
                    Alert("计划进度不能为空");
                    return;
                }
                planDetail += "]" + TohexUtils.strToHex(data.get(i).getPLANDETAIL());
                planDetailGuid += "," + data.get(i).getPLANDETAIL_GUID();
            }
            planDetail = planDetail.substring(1, planDetail.length());
            planDetailGuid = planDetailGuid.substring(1, planDetailGuid.length());
            addOrUpdatePlanDetail(planDetail, planDetailGuid, position);
        } else if (resultCode == RESULT_OK && requestCode == FILE_SELECT_FUJIAN_CODE)
        {
            String filePath = FileUtils.getRealPathFromURI(getApplicationContext(), datas.getData());
            AlertDialog("正在上传。。");
            saveFujianFile(filePath);
        }

    }


    /**
     * 保存附件
     */
    public void saveFujianFile(final String url)
    {

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                if (service != null)
                {
                    try
                    {
                        String requestUrl = "http://172.29.53.36/servlet/SupFujianUpload?userGUID=" + userId + "&instanceGUID=" + mData.getSubGuid();
                        service.registerCallbacks(new ITaskCallback.Stub()
                        {
                            @Override
                            public void onProgress(float progress, long total) throws RemoteException
                            {
                            }

                            @Override
                            public void onResponse(final String response) throws RemoteException
                            {

                                runOnUiThread(new Runnable()
                                              {
                                                  @Override
                                                  public void run()
                                                  {
                                                      FileSucces succes = JsonGenerics.transform(response, FileSucces.class);
                                                      if (succes.isSuccess())
                                                      {
                                                          String filetype = url.substring(url.lastIndexOf(".") + 1, url.length());
                                                          String filename = url.substring(url.lastIndexOf("/") + 1, url.length());
                                                          aData.add(new NewAttachFile(filename, url, filetype, succes.getFileGUID()));
                                                          numFujian.setText("附件(" + aData.size() + ")");
                                                          fileAdapter.notifyDataSetChanged();
                                                      }
                                                      Alert(succes.getMsg());
                                                      dialog.dismiss();
                                                  }
                                              }
                                );
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
                                        dialog.dismiss();
                                    }
                                });
                            }
                        }, "postfile", new Parameters(requestUrl, url));
                    } catch (RemoteException e)
                    {
                        e.printStackTrace();
                    }
                } else
                {
                    Alert("service断开连接！");
                }
            }
        }).start();
    }

    /**
     * 删除附件
     */
    private void deleteFujian(final String fileGUID, final int position)
    {
        AlertDialog();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                if (service != null)
                {
                    try
                    {
                        String parame = "http://172.29.53.36/mobile2/supFile/delRiseFile?userGUID=" + userId + "&fileGUID=" + fileGUID;
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
                                        try
                                        {
                                            JSONObject jsonObject = new JSONObject(response);
                                            JSONObject map = jsonObject.getJSONObject("map");
                                            boolean isSuccess = map.getBoolean("success");
                                            if (isSuccess)
                                            {
                                                aData.remove(position);
                                                if (aData.size() > 0)
                                                {
                                                    numFujian.setText("附件(" + aData.size() + ")");
                                                } else
                                                {
                                                    numFujian.setText("附件");
                                                }
                                                fileAdapter.notifyDataSetChanged();
                                                Alert("删除成功");
                                            } else
                                            {
                                                Alert("删除失败");
                                            }
                                        } catch (JSONException e)
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
                                        dialog.dismiss();
                                        Alert(e);
                                    }
                                });
                            }

                            @Override
                            public void onProgress(float progress, long total) throws RemoteException
                            {

                            }
                        }, "gets", new Parameters(parame, ""));
                    } catch (RemoteException e)
                    {
                        e.printStackTrace();
                    }
                } else
                {
                    Alert("service断开连接！");
                }
            }
        }).start();
    }

}
