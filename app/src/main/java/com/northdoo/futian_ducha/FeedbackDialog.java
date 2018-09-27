package com.northdoo.futian_ducha;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class FeedbackDialog extends Dialog {


    private EditText contentInputView;
    private RadioGroup rg;
    private Context context;
    private Msg msgs;
    private int type = 0;

    interface Msg {
        void getMsg(String msg, int type);
    }

    public FeedbackDialog(Context context, Msg msg) {
        super(context);
        this.context = context;
        this.setCanceledOnTouchOutside(true);
        msgs = msg;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_feedback);
        rg = (RadioGroup) findViewById(R.id.rg);

        contentInputView = (EditText) findViewById(R.id.contentInputView);
        findViewById(R.id.cancle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        findViewById(R.id.sure).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = contentInputView.getText().toString();
                if (TextUtils.isEmpty(txt)) {
                    Toast.makeText(context, "拒绝理由不能为空！", Toast.LENGTH_SHORT).show();
                    return;
                }
                msgs.getMsg(txt, type);
                dismiss();
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rb1:
                        type = 1;
                        break;
                    case R.id.rb2:
                        type = 0;
                        break;
                    case R.id.rb3:
                        type = 2;
                        break;
                }
            }
        });
    }
}
