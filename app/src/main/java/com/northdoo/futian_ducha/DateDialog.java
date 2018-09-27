package com.northdoo.futian_ducha;


import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.northdoo.futian_ducha.utlis.NumberPickerView;

import java.util.Calendar;

public class DateDialog extends Dialog implements NumberPickerView.OnValueChangeListener
{
    private Context context;
    private NumberPickerView mPickerViewn;
    private NumberPickerView mPickerViewy;
    private NumberPickerView mPickerViewr;
    //private NumberPickerView mPickerViews;
    //private NumberPickerView mPickerViewf;
    private TextView title, quxiao, queding;
    private TextView textview;
    private Calendar c;
    private Handler mHandler = new Handler()
    {
        @Override
        public void handleMessage(Message msg)
        {
            title.setText((String) msg.obj);
        }
    };

    public DateDialog(Context context, View view)
    {
        super(context);
        this.context = context;
        textview = (TextView) view;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_date);
        mPickerViewn = (NumberPickerView) this.findViewById(R.id.date1);
        mPickerViewy = (NumberPickerView) this.findViewById(R.id.date2);
        mPickerViewr = (NumberPickerView) this.findViewById(R.id.date3);
        quxiao = (TextView) this.findViewById(R.id.quxiao);
        queding = (TextView) this.findViewById(R.id.queding);
        //mPickerViews = (NumberPickerView) this.findViewById(R.id.date4);
        //mPickerViewf = (NumberPickerView) this.findViewById(R.id.date5);
        title = (TextView) this.findViewById(R.id.title);
        mPickerViewn.setOnValueChangedListener(this);
        mPickerViewy.setOnValueChangedListener(this);
        mPickerViewr.setOnValueChangedListener(this);
        //mPickerViews.setOnValueChangedListener(this);
        //mPickerViewf.setOnValueChangedListener(this);
        c = Calendar.getInstance();//
        setData(mPickerViewn, 2016, 2019, c.get(Calendar.YEAR));
        setData(mPickerViewy, 1, 12, c.get(Calendar.MONTH) + 1);
        setData(mPickerViewr, 1, 31, c.get(Calendar.DAY_OF_MONTH));
        //setData(mPickerViews, 0, 23, 3);
        //setData(mPickerViewf, 0, 59, 30);
        quxiao.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dismiss();
            }
        });
        queding.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textview.setText(mPickerViewn.getValue() + "-" + (mPickerViewy.getValue() < 10 ? "0" + mPickerViewy.getValue() : "" + mPickerViewy.getValue()) + "-" + (mPickerViewr.getValue() < 10 ? "0" + mPickerViewr.getValue() : "" + mPickerViewr.getValue()));
                dismiss();
            }
        });
    }
    
    private void setData(NumberPickerView picker, int minValue, int maxValue, int value)
    {
        picker.setMinValue(minValue);
        picker.setMaxValue(maxValue);
        picker.setValue(value);
    }

    @Override
    public void onValueChange(NumberPickerView picker, int oldVal, int newVal)
    {
        Message message = Message.obtain();
        switch (picker.getId())
        {

            case R.id.date1:
                message.obj = newVal + "年" + mPickerViewy.getValue() + "月" + mPickerViewr.getValue() + "日";
                break;
            case R.id.date2:
                message.obj = mPickerViewn.getValue() + "年" + newVal + "月" + mPickerViewr.getValue() + "日";
                break;
            case R.id.date3:
                message.obj = mPickerViewn.getValue() + "年" + mPickerViewy.getValue() + "月" + newVal + "日";
                break;
        }
        mHandler.sendMessage(message);
//            mButtonInfo2.setText(getString(R.string.current_thread_name) + Thread.currentThread().getName()
//                    + "\n" + getString(R.string.current_picked_value) + String.valueOf(newVal));
//          
    }
}
