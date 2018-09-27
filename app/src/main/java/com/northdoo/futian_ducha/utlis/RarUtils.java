package com.northdoo.futian_ducha.utlis;

import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import de.innosystec.unrar.Archive;
import de.innosystec.unrar.exception.RarException;
import de.innosystec.unrar.rarfile.FileHeader;


public class RarUtils
{
    private static final String TAG = RarUtils.class.getSimpleName();

    /**
     * 解压RAR
     *
     * @param srcPath
     * @param unrarPath
     * @throws RarException
     * @throws IOException
     * @throws Exception
     */
    public static void unrar(String srcPath, String unrarPath) throws RarException, IOException, Exception
    {
        File srcFile = new File(srcPath);
        if (null == unrarPath || "".equals(unrarPath))
        {
            unrarPath = srcFile.getParentFile().getPath();
        }
        // 保证文件夹路径最后是"/"或者"\"  
        char lastChar = unrarPath.charAt(unrarPath.length() - 1);
        if (lastChar != '/' && lastChar != '\\')
        {
            unrarPath += File.separator;
        }
        unrar(srcFile, unrarPath);
    }

    private static void unrar(File srcFile, String unrarPath) throws RarException, IOException, Exception
    {
        FileOutputStream fileOut = null;
        Archive rarfile = null;

        try
        {
            rarfile = new Archive(srcFile);
            FileHeader fh = rarfile.nextFileHeader();
            while (fh != null)
            {

                String entrypath = "";
                if (fh.isUnicode())
                {//解決中文乱码 
                    entrypath = fh.getFileNameW().trim();
                } else
                {
                    entrypath = fh.getFileNameString().trim();
                }
                entrypath = entrypath.replaceAll("\\\\", "/");

                File file = new File(unrarPath + entrypath);
                Log.d(TAG, "unrar entry file :" + file.getPath());

                if (fh.isDirectory())
                {
                    file.mkdirs();
                } else
                {
                    File parent = file.getParentFile();
                    if (parent != null && !parent.exists())
                    {
                        parent.mkdirs();
                    }
                    fileOut = new FileOutputStream(file);
                    rarfile.extractFile(fh, fileOut);
                    fileOut.close();
                }
                fh = rarfile.nextFileHeader();
            }
            rarfile.close();

        } catch (Exception e)
        {
            throw e;
        } finally
        {
            if (fileOut != null)
            {
                try
                {
                    fileOut.close();
                    fileOut = null;
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            if (rarfile != null)
            {
                try
                {
                    rarfile.close();
                    rarfile = null;
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
