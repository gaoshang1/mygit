package com.northdoo.futian_ducha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.adapter.MyAdapter;

import java.util.List;


public class StringDialog extends Dialog
{


    private ListView listView;
    private List<String> data;
    private Context context;
    private MyAdapter<String> adapter;
    private Menu menu;
    private TextView title;

    interface Menu
    {
        void setMenu(int msg);
    }

    public StringDialog(Context context, List<String> data, Menu menu)
    {
        super(context);
        this.context = context;
        this.data = data;
        this.setCanceledOnTouchOutside(true);
        this.menu = menu;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_item);
        listView = (ListView) findViewById(R.id.alert_list);
        title = (TextView) findViewById(R.id.title);
        title.setText("操作");
        adapter = new MyAdapter<String>(data, R.layout.item_text)
        {
            @Override
            public void bindView(final ViewHolder holder, final String obj, final int position)
            {
                holder.setText(R.id.txt, obj);
            }
        };
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                menu.setMenu(i);
                dismiss();
            }
        });
    }
}
