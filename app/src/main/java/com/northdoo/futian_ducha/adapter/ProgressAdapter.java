package com.northdoo.futian_ducha.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import com.northdoo.futian_ducha.R;
import com.northdoo.futian_ducha.bean.ProgressFillDetails;

import java.util.List;

/**
 * Created by thinkpad on 2016/10/25.
 */

public class ProgressAdapter extends BaseAdapter
{
    private List<ProgressFillDetails.MapBean.PdsBean> list;
    private Context context;
    private EditText text;
    private int type;

    public ProgressAdapter(Context context, List<ProgressFillDetails.MapBean.PdsBean> list, int type)
    {
        this.context = context;
        this.list = list;
        this.type = type;
    }


    @Override
    public int getCount()
    {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup arg2)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.item_rogress, null);
        text = (EditText) view.findViewById(R.id.text);
        text.addTextChangedListener(new ProgressAdapter.AttTextWatcher(position));
        text.setText(list.get(position).getPLANDETAIL());
        if (type == 1)
        {
            text.setFocusable(false);
            text.setFocusableInTouchMode(false);
        }
        return view;
    }

    private class AttTextWatcher implements TextWatcher
    {

        int position;

        public AttTextWatcher(int position)
        {
            this.position = position;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after)
        {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count)
        {
        }

        @Override
        public void afterTextChanged(Editable s)
        {
            list.get(position).setPLANDETAIL(s.toString().trim());
        }

    }
}
