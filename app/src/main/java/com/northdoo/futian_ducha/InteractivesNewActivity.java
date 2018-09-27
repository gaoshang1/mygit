package com.northdoo.futian_ducha;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.northdoo.futian_ducha.Application.BaseActivity;
import com.northdoo.futian_ducha.bean.Contact;
import com.northdoo.futian_ducha.bean.TreeNodes;
import com.northdoo.futian_ducha.utlis.MarginUtils;
import com.northdoo.luohu.ITaskCallback;
import com.northdoo.luohu.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import butterknife.BindView;
import butterknife.OnClick;

import static com.northdoo.futian_ducha.Application.OAApp.service;

/**
 * Created by Administrator on 2017/8/1.
 */

public class InteractivesNewActivity extends BaseActivity
{
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.subtitle)
    TextView subtitle;
    @BindView(R.id.contect_list)
    ListView contectList;
    private ContactTreeAdapter adapter;
    private List<Contact> templist = new ArrayList<>();
    //当前列表数据
    private List<Contact> adapterlist = new ArrayList<>();
    //子数据list
    private List<Contact> childrenlist = new ArrayList<>();
    private List<Contact> selectlist = new CopyOnWriteArrayList<>();
    //点击项
    private Contact clickContact = null;
    //点击位置
    private int clickPosition = 0;
    private boolean isRequesting = false;
    //    private boolean selectMode = false;
    private String txt = "确定";
    //    private DisplayImageOptions options;        // DisplayImageOptions是用于设置图片显示的类  
//    private ImageLoader imageLoader = ImageLoader.getInstance();
    private String userGUID;

    @Override
    protected void initView()
    {
        setContentView(R.layout.activity_interactive);
    }

    @Override
    protected void initData()
    {
//        options = new DisplayImageOptions.Builder()
//                .showStubImage(R.mipmap.icon_head_default)         // 设置图片下载期间显示的图片
//                .showImageForEmptyUri(R.mipmap.icon_head_default)  // 设置图片Uri为空或是错误的时候显示的图片
//                .showImageOnFail(R.mipmap.icon_head_default)       // 设置图片加载或解码过程中发生错误显示的图片
//                .cacheInMemory()                              // 设置下载的图片是否缓存在内存中  
//                .cacheOnDisc()                                // 设置下载的图片是否缓存在SD卡中  
//                .build();
        title.setText("选人");
        userGUID = getIntent().getStringExtra("userId");
        subtitle.setText(txt);
        subtitle.setVisibility(View.VISIBLE);
        adapter = new ContactTreeAdapter(this);
        contectList.setAdapter(adapter);
        AlertDialog();
        getData("{00000000-0000-0000-0000-000000000000}", 0, false);


    }


    @OnClick({R.id.left_img, R.id.subtitle})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.left_img:
                finish();
                break;
            case R.id.subtitle:

                if (selectlist.size() < 1)
                {
                    Alert("请选择人员！");
                    return;
                }
                String deptsId = "";
                String deptsName = "";
                for (Contact a : selectlist)
                {
                    Log.e("getName", a.getNickName());
                    deptsId += a.getId() + (a.isDept() ? ";1" : ";0") + ",";
                    deptsName += a.getNickName() + ",";
                }
                deptsName = deptsName.substring(0, deptsName.length() - 1);
                deptsId = deptsId.substring(0, deptsId.length() - 1);
                Intent intent = new Intent();
                intent.putExtra("deptsName", deptsName);
                intent.putExtra("deptsId", deptsId);
                setResult(RESULT_OK, intent);
                selectlist.clear();
                finish();
                break;
        }
    }

    private void getData(final String parentId, final int currentLevel, final boolean loadChild)
    {
        AlertDialog();
        if (service != null)
        {
            try
            {
                Parameters parameters = new Parameters("getDeptAddressbySuperiorGuid", "id=" + parentId + "&userGUID=" + userGUID);
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
                                templist.clear();
                                List<TreeNodes> responses = new Gson().fromJson(response, new TypeToken<List<TreeNodes>>()
                                {
                                }.getType());
                                for (TreeNodes a : responses)
                                {
                                    Contact data = new Contact();
                                    data.setId(a.getId());
                                    data.setNickName(a.getName());
                                    data.setFatherId(a.getPId());
                                    data.level = currentLevel + 1;
                                    if (a.getDept().equals("true"))
                                    {
                                        data.setType(1);
                                        data.setPerson(true);
                                        data.setDept(true);
                                        data.setShow(false);
                                    } else
                                    {
                                        data.setType(0);
                                        data.setPerson(true);
                                        data.setDept(false);
                                        if (checkIsSelect(data.getId()))
                                        {
                                            data.setSelected(true);
                                        } else
                                        {
                                            data.setSelected(false);
                                        }
                                    }
                                    templist.add(data);
                                }
                                if (!loadChild)
                                {
                                    adapterlist.addAll(templist);
                                } else
                                {
                                    childrenlist.addAll(templist);
                                    ArrayList<Contact> temp = new ArrayList<>();
                                    adapterlist.get(clickPosition).setLoading(false);
                                    adapterlist.get(clickPosition).setHasLoaded(true);
                                    adapterlist.get(clickPosition).setShow(true);

                                    for (int i = 0; i < templist.size(); i++)
                                    {
                                        //将父Id等于点击部门Id的项找出来
                                        if (templist.get(i).getFatherId()
                                                .equals(clickContact.getId()))
                                        {
                                            temp.add(templist.get(i));
                                        }
                                    }
                                    if (temp.size() != 0)
                                    {
                                        //把找出来的子项加到点击项后面
                                        for (int i = 0; i < temp.size(); i++)
                                        {
                                            adapterlist.add(clickPosition + i + 1, temp.get(i));

                                        }
                                        for (int i = clickPosition + 1; i < adapterlist.size(); i++)
                                        {
                                            adapterlist.get(i).setPosition(i);
                                        }
                                    }
                                }
                                adapter.notifyDataSetChanged();
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

    private boolean checkIsSelect(String id)
    {

        int size = selectlist.size();
        Contact c = null;
        for (int i = 0; i < size; i++)
        {
            c = selectlist.get(i);
            if (c.getId().equals(id))
            {
                return true;
            }
        }
        return false;
    }


    class ContactTreeAdapter extends BaseAdapter
    {

        private Context activity;

        private final View.OnClickListener clickListener = new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                int position = (Integer) v.getTag(R.id.tag_first);
                Contact contact = adapterlist.get(position);
                if (!isRequesting)
                {
                    if (contact.getIsSpread() == Contact.STATE_SPREADING)
                    {// 设置处于正在展开状态不可点击

                    } else
                    {
                        if (contact.getType() == Contact.TYPE_GROUP)
                        {// 部门节点点击事件

                            if (contact.isShow())
                            {// 节点展开
                                contact.setShow(false);

                                ArrayList<Contact> temp = new ArrayList<Contact>();
                                // 寻找该节点下所有子节点和子节点的子节点并移除
                                for (int i = position + 1; i < adapterlist.size(); i++)
                                {
                                    if (adapterlist.get(i).getFatherId()
                                            .equals(contact.getId()))
                                    {
                                        temp.add(adapterlist.get(i));

                                        removechild(i, temp, adapterlist);

                                    }
                                }
                                adapterlist.removeAll(temp);
                                // 把移除的节点设置为未展开
                                temp.clear();
                                // 设置显示列表子项位置
                                for (int i = position + 1; i < adapterlist.size(); i++)
                                {
                                    adapterlist.get(i).setPosition(i);
                                }

                                notifyDataSetChanged();
                            } else
                            {// 子菜单不是展开的
                                clickContact = contact;
                                clickPosition = position;

                                if (contact.isHasLoaded())
                                {
                                    ArrayList<Contact> temp = new ArrayList<Contact>();

                                    adapterlist.get(clickPosition).setShow(true);

                                    for (int i = 0; i < childrenlist.size(); i++)
                                    {
                                        //将父Id等于点击部门Id的项找出来
                                        if (childrenlist.get(i).getFatherId()
                                                .equals(clickContact.getId()))
                                        {
                                            temp.add(childrenlist.get(i));
                                        }
                                    }
                                    if (temp.size() != 0)
                                    {
                                        //把找出来的子项加到点击项后面
                                        for (int i = 0; i < temp.size(); i++)
                                        {
                                            temp.get(i).setShow(false);
                                            adapterlist.add(clickPosition + i + 1, temp.get(i));

                                        }
                                        for (int i = clickPosition + 1; i < adapterlist.size(); i++)
                                        {
                                            adapterlist.get(i).setPosition(i);
                                        }
                                    }
//                                    if (mDataChangeListener != null)
//                                    {
//                                        mDataChangeListener.onDataChange();
//                                    }

                                    adapter.notifyDataSetChanged();
                                } else
                                {
                                    if (!contact.isLoading())
                                    {
                                        adapterlist.get(position).setLoading(true);
                                        adapter.notifyDataSetChanged();
                                        getData(contact.getId(), contact.getLevel(), true);
                                    }
                                }
                            }
                        }

                    }
                }

            }

        };

        /**
         * 移除该节点到该路径叶节点的所有节点
         *
         * @param index 移除对应位置
         * @param temp  移除的列表
         * @return 移除后的列表
         */
        public ArrayList<Contact> removechild(int index,
                                              ArrayList<Contact> temp, List<Contact> adapterlist)
        {

            if (adapterlist.get(index).getType() == Contact.TYPE_GROUP)
            {
                for (int j = index + 1; j < adapterlist.size(); j++)
                {
                    if (adapterlist.get(index).getId()
                            .equals(adapterlist.get(j).getFatherId()))
                    {
                        temp.add(adapterlist.get(j));
                        removechild(j, temp, adapterlist);

                    }
                }
            }
            return temp;
        }

        public ContactTreeAdapter(Context activity)
        {
            super();
            this.activity = activity;
        }

        @Override
        public int getCount()
        {
            return adapterlist.size();
        }

        @Override
        public Object getItem(int position)
        {
            return adapterlist.get(position);
        }

        @Override
        public long getItemId(int position)
        {
            return position;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent)
        {
            ViewHolder viewHolder = null;
            Contact data = adapterlist.get(position);
            if (view == null)
            {
                viewHolder = new ViewHolder();
                LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.contact_tree_listitem, null);
                viewHolder.icon = (ImageView) view.findViewById(R.id.icon);//图标
                viewHolder.checkbox = (ImageView) view.findViewById(R.id.checkbox);//图标   
                viewHolder.grouparrow = (ImageView) view.findViewById(R.id.grouparrow);//图标   
                viewHolder.name = (TextView) view.findViewById(R.id.name);//标签名
                viewHolder.personline = view.findViewById(R.id.personline);
                viewHolder.groupline = view.findViewById(R.id.groupline);

                viewHolder.ic_layout = (RelativeLayout) view.findViewById(R.id.ic_layout);
                view.setTag(viewHolder);
            } else
            {
                viewHolder = (ViewHolder) view.getTag();
            }

//            if (TextUtils.isEmpty(data.getImg()))
//            {
            viewHolder.icon.setImageResource(R.mipmap.icon_head_default);
//            } else
//            {
//                String imgUrl = data.getImg();
//            imageLoader.displayImage(Config.IMG_URL + data.getId(), viewHolder.icon, options);
//            }
            if (data.getType() == Contact.TYPE_GROUP)
            {
                viewHolder.icon.setVisibility(View.GONE);
                viewHolder.personline.setVisibility(View.GONE);
                viewHolder.groupline.setVisibility(View.VISIBLE);
                viewHolder.grouparrow.setVisibility(View.VISIBLE);
                MarginUtils.setMargin(activity, viewHolder.ic_layout, 100 * data.getLevel(), 0, 0,
                        0);

            } else
            {
                viewHolder.grouparrow.setVisibility(View.GONE);
                viewHolder.personline.setVisibility(View.VISIBLE);
                viewHolder.groupline.setVisibility(View.GONE);
                viewHolder.icon.setVisibility(View.VISIBLE);
                MarginUtils.setMargin(activity, viewHolder.ic_layout, 100 * data.getLevel(), 0, 0,
                        0);

            }
            if (data.isShow())
            {

                viewHolder.grouparrow.setBackgroundResource(R.mipmap.tree_ex);
            } else
            {
                viewHolder.grouparrow.setBackgroundResource(R.mipmap.tree_ec);
            }
            if (data.isSelected())
            {
                viewHolder.checkbox.setImageResource(R.mipmap.icon_check_sel);

            } else
            {
                viewHolder.checkbox.setImageResource(R.mipmap.icon_check_nor);
            }

            if (data.isPerson())
            {
                viewHolder.checkbox.setVisibility(View.VISIBLE);
            } else
            {
                viewHolder.checkbox.setVisibility(View.GONE);
            }
            viewHolder.checkbox.setTag(R.id.tag_second, position);
            viewHolder.checkbox.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    {

                        int position = (Integer) view.getTag(R.id.tag_second);
                        if (adapterlist.get(position).isSelected())
                        {
                            adapterlist.get(position).setSelected(false);
                            for (Contact c : selectlist)
                            {
                                if (c.getId().equals(adapterlist.get(position).getId()))
                                {
                                    selectlist.remove(c);
                                }
                            }
                        } else
                        {
                            adapterlist.get(position).setSelected(true);
                            for (Contact c : selectlist)
                            {
                                if (c.getId().equals(adapterlist.get(position).getId()))
                                {
                                    return;
                                }
                            }

                            selectlist.add(adapterlist.get(position));
                        }

                        txt = selectlist.size() > 0 ? "确定(" + selectlist.size() + ")" : "确定";
                        subtitle.setText(txt);
                        adapter.notifyDataSetChanged();

                    }
                }
            });
            viewHolder.name.setText(data.getNickName());
            view.setTag(R.id.tag_first, position);
            view.setOnClickListener(clickListener);
            return view;
        }

        class ViewHolder
        {
            ImageView icon;
            ImageView checkbox;
            ImageView grouparrow;
            TextView name;
            View personline;
            View groupline;
            RelativeLayout ic_layout;

        }
    }
}
