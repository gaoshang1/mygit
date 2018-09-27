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
import com.northdoo.futian_ducha.bean.Templates;

import java.util.List;


public class ChoiceDialog extends Dialog
{


    private ListView listView;
    private List<Templates.TemplateListBean> data;
    private Context context;
    private MyAdapter<Templates.TemplateListBean> adapter;
    private remind remind;
    private int type;
    private String msg;
    private TextView title;

    interface remind
    {
        void setRemind(String msg);
    }

    public ChoiceDialog(Context context, List<Templates.TemplateListBean> data, int type)
    {
        super(context);
        this.context = context;
        this.type = type;
        this.data = data;
        this.setCanceledOnTouchOutside(true);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_item);
        listView = (ListView) findViewById(R.id.alert_list);
        title = (TextView) findViewById(R.id.title);
        if (type == 1)
        {
            remind = (TrackConfirmDetailsActivity) context;
        } else if (type == 2)
        {
            remind = (TrackFillInDetailActivity) context;
        }
        adapter = new MyAdapter<Templates.TemplateListBean>(data, R.layout.item_text)
        {
            @Override
            public void bindView(final ViewHolder holder, final Templates.TemplateListBean obj, final int position)
            {
                holder.setText(R.id.txt, obj.getMSG_CONTENT());
            }
        };
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                remind.setRemind(data.get(i).getMSG_CONTENT());
                dismiss();
            }
        });
    }
}
