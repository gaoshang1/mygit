package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2017/7/27.
 */

public class FileSucces
{

    /**
     * msg : 添加成功
     * success : true
     */
    private String fileGUID;
    private String msg;
    private boolean success;

    public String getFileGUID()
    {
        return fileGUID;
    }

    public void setFileGUID(String fileGUID)
    {
        this.fileGUID = fileGUID;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public boolean isSuccess()
    {
        return success;
    }

    public void setSuccess(boolean success)
    {
        this.success = success;
    }
}
