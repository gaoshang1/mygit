package com.northdoo.futian_ducha;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.TreeNode;
import com.northdoo.futian_ducha.treelist.Node;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by 高尚 on 2018/3/13.
 */

public class DepartmentActivity extends BaseActivity
{
    @BindView(R.id.listview)
    ListView listview;
    private SimpleTreeAdapter adapter;
    private List<Node> mData;
    public List<Node> data;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_department);
    }

    @Override
    protected void initData()
    {
        mData = new ArrayList<>();
        data = new ArrayList<>();
        getData();

    }

    private void getData()
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("getBureau", "");
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
                                if (TextUtils.isEmpty(response))
                                {
                                    return;
                                }
                                List<TreeNode> responses = new Gson().fromJson(response, new TypeToken<List<TreeNode>>()
                                {
                                }.getType());
                                for (TreeNode a : responses)
                                {
                                    mData.add(new Node(a.getId(), a.getPId(), a.getName()));
                                }
                                adapter = new SimpleTreeAdapter(listview, DepartmentActivity.this,
                                        mData, 0, R.mipmap.tree_ex, R.mipmap.tree_ec);
                                listview.setAdapter(adapter);
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


    public static <T> List<T> jsonToList(String json, Class<T[]> clazz)
    {
        Gson gson = new Gson();
        T[] array = gson.fromJson(json, clazz);
        return Arrays.asList(array);
    }

    @OnClick({R.id.left_img, R.id.queding})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.queding:
                final List<Node> allNodes = adapter.getAllNodes();
                for (int i = 0; i < allNodes.size(); i++)
                {
                    if (allNodes.get(i).isChecked())
                    {
                        if (allNodes.get(i).getChildren().size() == 0)
                        {
                            data.add(allNodes.get(i));
                        }
                    }
                }
                if (data.size() == 0)
                {
                    Alert("请选择单位");
                    return;
                }
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", (Serializable) data);
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
                break;
        }
    }
}
