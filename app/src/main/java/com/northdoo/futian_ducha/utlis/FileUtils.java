package com.northdoo.futian_ducha.utlis;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;

import com.northdoo.futian_ducha.R;

import java.io.File;

/**
 * Created by xiaolei on 2016/10/28.
 */

public class FileUtils
{
    /**
     * 自动根据系统版本获取真实文件路径
     *
     * @param context
     * @param uri
     * @return
     */
    public static String getRealPathFromURI(Context context, Uri uri)
    {
        if ("file".equalsIgnoreCase(uri.getScheme()))
        {
            return uri.getPath();
        }
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT)
        {//4.4以后  
            return FileUtils.getPath(context, uri);
        } else
        {//4.4一下系统调用方法  
            String res = null;
            String[] proj = {MediaStore.Images.Media.DATA};
            Cursor cursor = context.getContentResolver().query(uri, proj, null, null, null);
            if (null != cursor && cursor.moveToFirst())
            {
                int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
                res = cursor.getString(column_index);
                cursor.close();
            }
            return res;
        }
    }

    /**
     * 专为Android4.4设计的从Uri获取文件绝对路径，以前的方法已不好使
     */
    @TargetApi(Build.VERSION_CODES.KITKAT)
    private static String getPath(final Context context, final Uri uri)
    {

        final boolean isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;

        // DocumentProvider  
        if (isKitKat && DocumentsContract.isDocumentUri(context, uri))
        {
            // ExternalStorageProvider  
            if (isExternalStorageDocument(uri))
            {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];

                if ("primary".equalsIgnoreCase(type))
                {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            }
            // DownloadsProvider  
            else if (isDownloadsDocument(uri))
            {

                final String id = DocumentsContract.getDocumentId(uri);
                final Uri contentUri = ContentUris.withAppendedId(
                        Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));

                return getDataColumn(context, contentUri, null, null);
            }
            // MediaProvider  
            else if (isMediaDocument(uri))
            {
                final String docId = DocumentsContract.getDocumentId(uri);
                final String[] split = docId.split(":");
                final String type = split[0];

                Uri contentUri = null;
                if ("image".equals(type))
                {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(type))
                {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(type))
                {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }

                final String selection = "_id=?";
                final String[] selectionArgs = new String[]{split[1]};

                return getDataColumn(context, contentUri, selection, selectionArgs);
            }
        }
        // MediaStore (and general)  
        else if ("content".equalsIgnoreCase(uri.getScheme()))
        {
            return getDataColumn(context, uri, null, null);
        }
        // File  
        else if ("file".equalsIgnoreCase(uri.getScheme()))
        {
            return uri.getPath();
        }
        return null;
    }

    /**
     * Get the value of the data column for this Uri. This is useful for
     * MediaStore Uris, and other file-based ContentProviders.
     *
     * @param context       The context.
     * @param uri           The Uri to query.
     * @param selection     (Optional) Filter used in the query.
     * @param selectionArgs (Optional) Selection arguments used in the query.
     * @return The value of the _data column, which is typically a file path.
     */
    private static String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs)
    {
        Cursor cursor = null;
        final String column = "_data";
        final String[] projection = {column};
        try
        {
            cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs, null);
            if (cursor != null && cursor.moveToFirst())
            {
                final int column_index = cursor.getColumnIndexOrThrow(column);
                return cursor.getString(column_index);
            }
        } finally
        {
            if (cursor != null)
                cursor.close();
        }
        return null;
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is ExternalStorageProvider.
     */
    private static boolean isExternalStorageDocument(Uri uri)
    {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is DownloadsProvider.
     */
    private static boolean isDownloadsDocument(Uri uri)
    {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /**
     * @param uri The Uri to check.
     * @return Whether the Uri authority is MediaProvider.
     */
    private static boolean isMediaDocument(Uri uri)
    {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }


    /**
     * 根据文件类型后缀名获取相应的图片资源ID
     *
     * @param type
     * @return
     */
//    public static int getImagIdByFileType(String type)
//    {
//        int result = R.mipmap.ic_file_unknow;
//        if (type == null)
//            return result;
//        type = type.toLowerCase(Locale.getDefault());
//        if (type.endsWith("doc") || type.endsWith("docx"))
//        {
//            result = R.mipmap.ic_file_word;
//        }
//        if (type.endsWith("excel") || type.endsWith("xls") || type.endsWith("xlsx") || type.endsWith("csv"))
//        {
//            result = R.mipmap.ic_file_excel;
//        }
//        if (type.endsWith("html") || type.endsWith("htm"))
//        {
//            result = R.mipmap.ic_file_html;
//        }
//        if (type.endsWith("pdf") || type.endsWith("pdfx"))
//        {
//            result = R.mipmap.ic_file_pdf;
//        }
//        if (type.endsWith("png") || type.endsWith("jpg") || type.endsWith("gif") || type.endsWith("bmp"))
//        {
//            result = R.mipmap.ic_file_png;
//        }
//        if (type.endsWith("ppt") || type.endsWith("pptx"))
//        {
//            result = R.mipmap.ic_file_ppt;
//        }
//        if (type.endsWith("txt"))
//        {
//            result = R.mipmap.ic_file_txt;
//        }
//        if (type.endsWith("zip") || type.endsWith("rar") || type.endsWith("7z"))
//        {
//            result = R.mipmap.ic_file_zip;
//        }
//        return result;
//    }
   

    /**
     * 判断是否是除了pdf外wps能打开的文件
     *
     * @param file
     * @return
     */
    public static boolean IsWpsExceptPdf(File file)
    {
        String end = file
                .getName()
                .substring(file.getName().lastIndexOf(".") + 1,
                        file.getName().length()).toLowerCase();
        if (end.equals("doc") || end.equals("docx") || end.equals("wps")
                || end.equals("dot") || end.equals("wpt") || end.equals("xls")
                || end.equals("xlsx") || end.equals("et") || end.equals("ppt")
                || end.equals("pptx") || end.equals("dps") || end.equals("txt")
                )
            return true;

        return false;
    }


    /**
     * 判断是否是pdf文件
     *
     * @param file
     * @return
     */
    public static boolean IsPdfFile(File file)
    {
        String end = file
                .getName()
                .substring(file.getName().lastIndexOf(".") + 1,
                        file.getName().length()).toLowerCase();
        if (end.equals("pdf") || end.equals("PDF"))
            return true;
        return false;
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
    public static String getMIMEType(File f)
    {
        String end = f
                .getName()
                .substring(f.getName().lastIndexOf(".") + 1,
                        f.getName().length()).toLowerCase();
        String type = "";
        if (end.equals("mp3") || end.equals("aac") || end.equals("aac")
                || end.equals("amr") || end.equals("mpeg") || end.equals("mp4"))
        {
            type = "audio";
        } else if (end.equals("jpg") || end.equals("gif") || end.equals("png")
                || end.equals("jpeg") || end.equals("tif"))
        {
            type = "image";
        } else if (end.equals("doc") || end.equals("docx") || end.equals("pdf")
                || end.equals("txt"))
        {
            type = "application/msword";
            return type;
        } else
        {
            type = "*";
        }
        type += "/*";
        return type;
    }


}
