package com.northdoo.futian_ducha.utlis;

import android.text.TextUtils;

import com.northdoo.futian_ducha.R;

/**
 * Created by Administrator on 2018/8/20.
 */

public class TohexUtils
{
    public static String strToHex(String source)
    {
        if (TextUtils.isEmpty(source))
        {
            return source;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++)
        {
            sb.append(Integer.toHexString(source.codePointAt(i)) + ",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static int getFileIconId(String fileName)
    {
        if (TextUtils.isEmpty(fileName))
        {
            return R.mipmap.wzwj;
        }
        String name = fileName.toLowerCase();
        if (name.endsWith("doc") || name.endsWith("docx") || name.endsWith("wps"))
        {
            return R.mipmap.word;
        } else if (name.endsWith("xls") || name.endsWith("xlsx"))
        {
            return R.mipmap.excel;
        } else if (name.endsWith("ppt") || name.endsWith("pptx"))
        {
            return R.mipmap.ppt;
        } else if (name.endsWith("pdf"))
        {
            return R.mipmap.pdf;
        } else if (name.endsWith("txt"))
        {
            return R.mipmap.txt;
        } else if (name.endsWith("png") || name.endsWith("jpg") || name.endsWith("jpeg"))
        {
            return R.mipmap.png;
        } else if (name.endsWith("ceb"))
        {
            return R.mipmap.ceb;
        } else if (name.endsWith("zip") || name.endsWith("rar"))
        {
            return R.mipmap.rar;
        } else if (name.endsWith("html"))
        {
            return R.mipmap.html;
        } else
        {
//            if (name.indexOf(".") >= 0)
//            {
//                return R.mipmap.unknow_96;
//            } else
//            {
            return R.mipmap.wzwj;
//            }
        }
    }
}
