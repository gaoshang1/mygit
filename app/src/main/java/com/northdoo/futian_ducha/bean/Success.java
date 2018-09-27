package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2018/6/8.
 */

public class Success
{

    /**
     * title : 1111111
     * savemsg : 发送标题为“1111111”的公文（GUID为{AC1D3524-FFFF-FFFF-DE2F-3C5600000331}),去文单位是信息化综合部等 2 家部门。
     * isSuccess : success
     * msg : 发送成功
     */

    private String title;
    private String savemsg;
    private String isSuccess;
    private String msg;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getSavemsg()
    {
        return savemsg;
    }

    public void setSavemsg(String savemsg)
    {
        this.savemsg = savemsg;
    }

    public String getIsSuccess()
    {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess)
    {
        this.isSuccess = isSuccess;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
