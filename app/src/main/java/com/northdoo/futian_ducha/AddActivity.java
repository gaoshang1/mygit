package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.FormsBean;
import com.northdoo.futian_ducha.bean.NewAttachFile;
import com.northdoo.futian_ducha.bean.Succes;
import com.northdoo.futian_ducha.bean.Success;
import com.northdoo.futian_ducha.treelist.Node;
import com.northdoo.futian_ducha.utlis.FileUtils;
import com.northdoo.futian_ducha.utlis.JsonGenerics;
import com.northdoo.futian_ducha.utlis.NoScrollListView;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2018/6/6.
 */

public class AddActivity extends BaseActivity
{
    public static final int FILE_SELECT_FUJIAN_CODE = 0x2233;//选择附件文件
    public static final int DEPARTMENT = 0x2244;
    public static final int INTERACTIVES = 0x2255;
    MyAdapter<NewAttachFile> fileAdapter;
    private String userId;
    private List<NewAttachFile> aData;
    private List<Node> mData;
    @BindView(R.id.edittext1)
    EditText edittext1;
    @BindView(R.id.edittext2)
    EditText edittext2;
    @BindView(R.id.edittext3)
    EditText edittext3;
    @BindView(R.id.edittext4)
    EditText edittext4;
    @BindView(R.id.edittext5)
    EditText edittext5;
    @BindView(R.id.edittext6)
    EditText edittext6;
    @BindView(R.id.edittext7)
    EditText edittext7;
    @BindView(R.id.edittext8)
    EditText edittext8;
    @BindView(R.id.checkcbox1)
    CheckBox checkcbox1;
    @BindView(R.id.checkcbox2)
    CheckBox checkcbox2;

    @BindView(R.id.linear2)
    LinearLayout linear2;

    @BindView(R.id.linear3)
    LinearLayout linear3;
    @BindView(R.id.checkcbox3)
    CheckBox checkcbox3;
    @BindView(R.id.edittext10)
    EditText edittext10;

    @BindView(R.id.num_fujian)
    TextView numFujian;
    @BindView(R.id.icon_fj)
    LinearLayout iconFj;
    @BindView(R.id.listview)
    NoScrollListView listview;
    FormsBean formsBean;
    private String check1 = "0";
    private String check2 = "no";
    private String check3 = "0";
    private String check4 = "false";
    private String departmentId;
    private String departmentName;
    private String deptsId = "{09BE3329-0000-0000-3E8D-C87200000001};0";
    private String deptsName = "test_bwk";

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_add);
        getData();
    }

    @Override
    protected void initData()
    {
        userId = getIntent().getStringExtra("userId");
        edittext10.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis())));
        aData = new ArrayList<>();
        mData = new ArrayList<>();
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
        listview.setAdapter(fileAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l)
            {

                try
                {
                    service.registerCallbacks(null, "openFile", new Parameters(aData.get(i).getFilepath(), "false"));
                } catch (RemoteException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    @OnCheckedChanged({R.id.checkcbox1, R.id.checkcbox2, R.id.checkcbox3, R.id.checkcbox4})
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        switch (compoundButton.getId())
        {
            case R.id.checkcbox4:
                check4 = b ? "true" : "false";
                break;
            case R.id.checkcbox1:
                check1 = b ? "1" : "0";
                break;
            case R.id.checkcbox2:
                check2 = b ? "yes" : "no";
                linear2.setVisibility(b ? View.VISIBLE : View.GONE);
                break;
            case R.id.checkcbox3:
                check3 = b ? "1" : "0";
                linear3.setVisibility(b ? View.VISIBLE : View.GONE);
                break;
        }
    }

    @OnClick({R.id.send, R.id.left_img, R.id.edittext3, R.id.edittext4, R.id.edittext5, R.id.edittext8, R.id.edittext10, R.id.icon_fj})
    public void onViewClicked(View view)
    {
        Intent intent;
        switch (view.getId())
        {
            case R.id.send:
                if (TextUtils.isEmpty(edittext1.getText().toString().trim()))
                {
                    Alert("标题不能为空");
                    return;
                }
                intent = new Intent(this, InteractivesNewActivity.class);
                intent.putExtra("userId", userId);
                startActivityForResult(intent, INTERACTIVES);

                break;
            case R.id.left_img:
                finish();
                break;
            case R.id.edittext3:
                new ChoiceOneDialog(this, "文类", formsBean.getForm().get(3).getOption(), view).show();
                break;
            case R.id.edittext4:
                new ChoiceOneDialog(this, "密度", formsBean.getForm().get(4).getOption(), view).show();
                break;
            case R.id.edittext5:
                new ChoiceOneDialog(this, "等级", formsBean.getForm().get(5).getOption(), view).show();
                break;
            case R.id.edittext8:
                intent = new Intent(this, DepartmentActivity.class);
                startActivityForResult(intent, DEPARTMENT);
                break;
            case R.id.edittext10:
                new DateDialog(this, view).show();
                break;
            case R.id.icon_fj:
                intent = new Intent(Intent.ACTION_GET_CONTENT);
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

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("getDraftDetail", "");
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
                                Log.e("response", response);
                                formsBean = JsonGenerics.transform(response, FormsBean.class);
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
            }
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
                        String requestUrl = "http://172.29.53.36/servlet/FujianUpload?appname=risetransfer&userGUID=" + userId + "&instanceGUID=" + formsBean.getForm().get(0).getValue();
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

                                                      Succes succes = JsonGenerics.transform(response, Succes.class);
                                                  
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
                        String parame = "userGUID=" + userId + "&fileGUID=" + fileGUID;
                        Log.e("parame", parame);
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
                        }, "get", new Parameters("DataCenterController", parame));
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (resultCode == RESULT_OK)
        {
            switch (requestCode)
            {
                case FILE_SELECT_FUJIAN_CODE:
                    String filePath = FileUtils.getRealPathFromURI(getApplicationContext(), data.getData());
                    AlertDialog("正在上传。。");
                    saveFujianFile(filePath);
                    break;
                case DEPARTMENT:
                    departmentId = "";
                    departmentName = "";
                    for (Node a : (List<Node>) data.getSerializableExtra("data"))
                    {
                        departmentId += a.getId() + ",";
                        departmentName += a.getName() + ",";
                    }

                    departmentName = departmentName.substring(0, departmentName.length() - 1);
                    departmentId = departmentId.substring(0, departmentId.length() - 1);
                    edittext8.setText(departmentName);
                    break;
                case INTERACTIVES:
                    deptsName = "";
                    deptsId = "";
                    deptsName = data.getStringExtra("deptsName");
                    deptsId = data.getStringExtra("deptsId");
                    preservation();
                    break;
            }

        }

    }

    private String getUrl()
    {


        String url = "userGUID=" + userId +
                "&instanceGUID=" + formsBean.getForm().get(0).getValue() +
                "&COMDOC_CLASSIFY=" + strToHex(edittext3.getText().toString().trim()) +
                "&FILE_NO=" + strToHex(edittext2.getText().toString().trim()) +
                "&SECRETGRADE=" + strToHex(edittext4.getText().toString().trim()) +
                "&URGENTGRADE=" + strToHex(edittext5.getText().toString().trim()) +
                "&DOCTITLE=" + strToHex(edittext1.getText().toString().trim()) +
                "&LEADERDIRECTION=" + strToHex(edittext6.getText().toString().trim()) +
                "&TOPIC=" + strToHex(edittext7.getText().toString().trim()) +
                "&NEEDRECEIPT=" + check1 +
                "&ISBACKRESULT=" + check2 +
                "&ISDISPATCH=" +
                "&TASK_EXPIREDATE=" +
                "&TASK_EXPIREDDAY=" +
                "&ISLIMIT=" + check3 +
                "&TIMELIMIT=" + edittext10.getText().toString().trim() +
                "&HOST_DEPARTMENT=" + departmentId +
                "&HOST_DEPARTMENTNAME=" + strToHex(departmentName) +
                "&toDepts=" + deptsId +
                "&toDepts_name=" + strToHex(deptsName) +
                "&select=" + check4;

        Log.e("url", url);
        return url;
    }

    private void preservation()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
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
                                Success success = JsonGenerics.transform(response, Success.class);
                                Alert(success.getMsg());
                                if (success.getIsSuccess().equals("success"))
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
                            }
                        });
                    }

                    @Override
                    public void onProgress(float progress, long total) throws RemoteException
                    {

                    }
                }, "get", new Parameters("sendDraft", getUrl()));
            } catch (Exception e)
            {
                dialog.dismiss();
                e.printStackTrace();
            }
        } else
        {
            Alert("service断开连接");
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

}
