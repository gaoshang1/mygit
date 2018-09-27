package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2017/10/30.
 */

public class NewAttachFile
{
    public NewAttachFile(String fileName, String filepath, String fileType, String fileGUID)
    {
        this.fileName = fileName;
        this.filepath = filepath;
        this.fileType = fileType;
        this.fileGUID = fileGUID;
    }

    private String fileGUID;
    private String fileName;
    private String filepath;
    private String fileType;

    public String getFileGUID()
    {
        return fileGUID;
    }

    public void setFileGUID(String fileGUID)
    {
        this.fileGUID = fileGUID;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFilepath()
    {
        return filepath;
    }

    public void setFilepath(String filepath)
    {
        this.filepath = filepath;
    }

    public String getFileType()
    {
        return fileType;
    }

    public void setFileType(String fileType)
    {
        this.fileType = fileType;
    }
}
