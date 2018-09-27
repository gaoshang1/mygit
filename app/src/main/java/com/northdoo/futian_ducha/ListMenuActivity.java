package com.northdoo.futian_ducha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ListMenuActivity extends Activity
{
    @BindView(R.id.alert_list)
    ListView listView;

    @BindView(R.id.title)
    TextView title;

    private MyAdapter<String> adapter;
    private List<String> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_item);
        ButterKnife.bind(this);
        initData();
    }


    private void initData()
    {
        title.setText("操作");
        menuItems.addAll(getIntent().getStringArrayListExtra("data"));
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
        adapter = new MyAdapter<String>(menuItems, R.layout.item_text)
        {
            @Override
            public void bindView(MyAdapter.ViewHolder holder, String obj, int position)
            {
                holder.setText(R.id.txt, obj);
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
