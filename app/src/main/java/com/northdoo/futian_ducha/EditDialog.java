package com.northdoo.futian_ducha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class EditDialog extends Dialog
{


    private EditText contentInputView;
    private TextView cancle, sure;
    private Context context;
    private Msg msgs;
    private int type;

    interface Msg
    {
        void getMsg(String msg, int type);
    }

    public EditDialog(Context context, int type, Msg msg)
    {
        super(context);
        this.context = context;
        this.type = type;
        this.setCanceledOnTouchOutside(true);
        msgs = msg;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_input);
        contentInputView = (EditText) findViewById(R.id.contentInputView);
        findViewById(R.id.cancle).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dismiss();
            }
        });
        findViewById(R.id.sure).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String txt = contentInputView.getText().toString();
                if (TextUtils.isEmpty(txt))
                {
                    Toast.makeText(context, "拒绝理由不能为空！", Toast.LENGTH_SHORT).show();
                    return;
                }
                msgs.getMsg(txt, type);
                dismiss();
            }
        });
    }
}
