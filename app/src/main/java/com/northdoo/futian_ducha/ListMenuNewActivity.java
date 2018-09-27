package com.northdoo.futian_ducha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.northdoo.futian_ducha.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ListMenuNewActivity extends Activity
{
    @BindView(R.id.listView)
    ListView listView;
    private MyAdapter<String> adapter;
    private List<String> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_newlist);
        ButterKnife.bind(this);
        initData();
    }


    private void initData()
    {
        menuItems = (List<String>) getIntent().getSerializableExtra("MenuItems");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent intent = getIntent();
                intent.putExtra("position", i);
                setResult(1, intent);
                finish();
            }
        });
        adapter = new MyAdapter<String>(menuItems, R.layout.listview_menu_item)
        {
            @Override
            public void bindView(ViewHolder holder, String obj, int position)
            {
                holder.setText(R.id.textView01, obj);
            }
        };
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0)
        {
            setResult(-1);
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        setResult(-1);
        finish();
        return true;
    }

}
