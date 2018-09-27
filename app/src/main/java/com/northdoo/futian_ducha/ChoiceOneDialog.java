package com.northdoo.futian_ducha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.northdoo.futian_ducha.adapter.MyAdapter;
import com.northdoo.futian_ducha.bean.FormsBean;

import java.util.List;


public class ChoiceOneDialog extends Dialog
{


    private ListView listView;
    private String title;
    private TextView titleView;
    private List<FormsBean.FormBean.OptionBean> data;
    private Context context;
    private MyAdapter<FormsBean.FormBean.OptionBean> adapter;
    private EditText values;

    public ChoiceOneDialog(Context context, String title, List<FormsBean.FormBean.OptionBean> data, View values)
    {
        super(context);
        this.context = context;
        this.title = title;
        this.data = data;
        this.setCanceledOnTouchOutside(true);
        this.values = (EditText) values;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_item);
        listView = (ListView) findViewById(R.id.alert_list);
        titleView = (TextView) findViewById(R.id.title);
        titleView.setText(title);
        adapter = new MyAdapter<FormsBean.FormBean.OptionBean>(data, R.layout.item_text)
        {
            @Override
            public void bindView(final ViewHolder holder, final FormsBean.FormBean.OptionBean obj, final int position)
            {
                holder.setText(R.id.txt, obj.getValue());
            }
        };
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                values.setText(data.get(i).getValue());
                dismiss();
            }
        });
    }


}
