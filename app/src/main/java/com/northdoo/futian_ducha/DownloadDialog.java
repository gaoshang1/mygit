package com.northdoo.futian_ducha;


import android.app.Dialog;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DownloadDialog extends Dialog
{
    private ProgressBar progressBar;
    private TextView textView;

    public DownloadDialog(Context context)
    {
        super(context, R.style.MyDialogStyle);
        setContentView(R.layout.dialog_download);
        progressBar = (ProgressBar) findViewById(R.id.downloadbar);
        textView = (TextView) findViewById(R.id.progressNumber);
    }


    public void setProgress(int max, int current)
    {
        progressBar.setMax(max);
        progressBar.setProgress(current);
        textView.setText(current + "%");
    }

    @Override
    public void setCancelable(boolean flag)
    {
        // TODO Auto-generated method stub
        super.setCancelable(false);
    }

}