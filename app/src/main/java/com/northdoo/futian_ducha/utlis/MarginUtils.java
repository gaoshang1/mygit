package com.northdoo.futian_ducha.utlis;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/7/13.
 */

public class MarginUtils
{
    /**
     * 在代码中给view设置margin值
     */
    public static void setMargin(Context context, View view, int left, int right, int top, int bottom)
    {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)
        {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view
                    .getLayoutParams();
            // 将设置的margin值转化为dp；
            left = px2dip(context, left);
            right = px2dip(context, right);
            top = px2dip(context, top);
            bottom = dip2px(context, bottom);
            p.setMargins(left, right, top, bottom);
            view.requestLayout();
        }
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
