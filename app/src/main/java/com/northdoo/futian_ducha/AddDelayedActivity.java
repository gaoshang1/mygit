package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.Environment;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.AddFeedback;
import com.northdoo.futian_ducha.bean.FileSucces;
import com.northdoo.futian_ducha.bean.NewAttachFile;
import com.northdoo.futian_ducha.bean.Succes;
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

import static com.northdoo.futian_ducha.Application.OAApp.service;
import static com.northdoo.futian_ducha.utlis.JsonGenerics.transform;

/**
 * Created by Administrator on 2018/8/31.
 */

public class AddDelayedActivity extends BaseActivity
{
    public static final int FILE_SELECT_FUJIAN_CODE = 0x2233;//选择附件文件
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.text1)
    android.widget.TextView text1;
    @BindView(R.id.text2)
    TextView text2;
    @BindView(R.id.text3)
    TextView text3;
    @BindView(R.id.text4)
    TextView text4;
    @BindView(R.id.text5)
    TextView text5;
    @BindView(R.id.text6)
    EditText text6;
    AddFeedback mData;
    String guId;
    String userId;
    boolean isSecond;
    String txt1, txt2, txt3, txt4, txt5, txt6;
    @BindView(R.id.num_fujian)
    TextView numFujian;
    @BindView(R.id.listview)
    NoScrollListView listviewFujian;
    MyAdapter<NewAttachFile> fileAdapter;
    private List<NewAttachFile> aData;
    private File destDir;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_add_delayed);
    }

    @Override
    protected void initData()
    {
        destDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.futian");
        if (!destDir.exists())
        {
            destDir.mkdirs();

        }
        guId = getIntent().getStringExtra("guId");
        userId = SpUtils.getParam(this, SpUtils.USER_ID, "").toString();
        isSecond = getIntent().getBooleanExtra("isSecond", true);
        aData = new ArrayList<>();
        setFujian();
        AlertDialog();
        getData();
    }

    private void getData()
    {
        if (service != null)
        {
            try
            {
                String paramet = "http://172.29.53.36/mobile2/supervision/gotoAddDelayApply?id=" + guId + "&isSecond=" + isSecond;
                Parameters parameters = new Parameters(paramet, "");
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
                                mData = transform(response, AddFeedback.class);
                                if (mData.getResult().equals("fail"))
                                {
                                    Alert(mData.getMsg());
                                    finish();
                                } else
                                {
                                    text3.setText(DateUtils.timeToString3(mData.getSup().getNEXT_BACK_DATE().getTime()));
                                    text4.setText(DateUtils.timeToString3(mData.getSup().getEND_DATE().getTime()));
                                    text1.setText(mData.getSup().getITEM_NUMBER());
                                    text2.setText(mData.getSup().getITEM_TITLE());
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

    @OnClick({R.id.left_img, R.id.icon_fj, R.id.titles, R.id.text5})
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
                txt4 = text4.getText().toString();
                txt5 = text5.getText().toString();
                txt6 = text6.getText().toString();
                if (TextUtils.isEmpty(txt5))
                {
                    Alert("延时期限不能为空");
                    return;
                }
                if (TextUtils.isEmpty(txt6))
                {
                    Alert("延时理由不能为空");
                    return;
                }
                saveBack();
                break;

            case R.id.text5:
                new DateDialog(this, view).show();
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

    private void saveBack()
    {
        if (service != null)
        {
            try
            {
                String paramet = "";
                if (isSecond)
                {
                    paramet = "http://172.29.53.36/mobile2/supervision/saveSecondDelayApply?userGuid=" + userId + "&delayGuid=" + mData.getSup().getDELAY_GUID() + "&detPlanGuid=" + guId + "&delayDate=" + txt5 + "&scheduledBackDate=" +
                            txt3 + "&reason=" + TohexUtils.strToHex(txt6);

                } else
                {
                    paramet = "http://172.29.53.36/mobile2/supervision/saveDelayApply?userGuid=" + userId + "&delayGuid=" + mData.getSup().getDELAY_GUID() + "&specificGuid=" + guId + "&delayDate=" + txt5 + "&scheduledBackDate=" +
                            txt3 + "&reason=" + TohexUtils.strToHex(txt6);
                }
                Parameters parameters = new Parameters(paramet, "");
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

                                if (data.getResult().equals("success"))
                                {
                                    Alert("申请成功");
                                    finish();
                                } else
                                {
                                    Alert(data.getMsg());
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode == RESULT_OK && requestCode == FILE_SELECT_FUJIAN_CODE)
        {
            String filePath = FileUtils.getRealPathFromURI(getApplicationContext(), data.getData());
            AlertDialog("正在上传。。");
            saveFujianFile(filePath);
        }
    }

    /**
     * 保存附件
     */
    public void saveFujianFile(final String url)
    {
        Log.e("htt", url);
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                if (service != null)
                {
                    try
                    {
                        String requestUrl = "http://172.29.53.36/servlet/SupFujianUpload?userGUID=" + userId + "&instanceGUID=" + mData.getSup().getDELAY_GUID();
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
