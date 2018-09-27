package com.northdoo.futian_ducha.utlis;
import android.content.Context;
import android.graphics.Color;
import android.widget.Button;

/**
 * 
 * @author 刘桂锐<br/>
 * 2015/9/9
 */
public class MyButton extends Button {
  private static final String TAG = "MyButton";
  
  public MyButton(final Context context, final int imageResId, final int textResId) {
    super(context);

    this.setCompoundDrawablesWithIntrinsicBounds(null, getResources().getDrawable(imageResId), null, null);
    this.setBackgroundResource(android.R.color.transparent);
    this.setTextColor(Color.BLACK);
    this.setText(context.getString(textResId));
    this.setTag(textResId);
    this.setPadding(5, 0, 5, 0);
}
}
