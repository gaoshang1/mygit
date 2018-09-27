package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2017/7/27.
 */

public class Succes
{


    /**
     * result : fail
     * msg : 操作失败,异常信息:null
     * body : null
     */

    private String result;
    private String msg;
    private Object body;

    public String getResult()
    {
        return result;
    }

    public void setResult(String result)
    {
        this.result = result;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Object getBody()
    {
        return body;
    }

    public void setBody(Object body)
    {
        this.body = body;
    }
}
