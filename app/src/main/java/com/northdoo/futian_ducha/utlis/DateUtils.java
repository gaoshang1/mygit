package com.northdoo.futian_ducha.utlis;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils
{


    /**
     * 精确到秒
     *
     * @param
     * @return 2013-12-31 12:00:00
     */
    public static String timeToString(long time)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(time);
        return format.format(date);
    }

    /**
     * 精确到分
     *
     * @param
     * @return 2013-12-31 12:00
     */
    public static String timeToString2(long time)
    {
        if (time == 0)
        {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date date = new Date(time);
        return format.format(date);
    }

    /**
     * 精确到天
     *
     * @param
     * @return 2013-12-31
     */
    public static String timeToString3(long time)
    {
        if (time == 0)
        {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(time);
        return format.format(date);
    }

    /**
     * 返回时间戳毫秒数
     *
     * @param time yyyyMMddHHmmss
     * @return
     * @throws Exception
     */
    public static long getTimeInMillis(String time) throws Exception
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new SimpleDateFormat("yyyyMMddHHmmss").parse(time));
        return calendar.getTimeInMillis();
    }

    /**
     * 获得年
     *
     * @param time
     * @return
     */
    public static String getYear(long time)
    {
        Date date = new Date();
        date.setTime(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(date);
        return dateString.substring(0, 4);
    }

    /**
     * 获得月
     *
     * @param time
     * @return
     */
    public static String getMonth(long time)
    {
        Date date = new Date();
        date.setTime(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(date);
        return dateString.substring(4, 6);
    }

    /**
     * 获得日
     *
     * @param time
     * @return
     */
    public static String getDay(long time)
    {
        Date date = new Date();
        date.setTime(time);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(date);
        return dateString.substring(6, 8);
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
