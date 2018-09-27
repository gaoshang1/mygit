package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2018/6/8.
 */

public class TreeNodes
{

    /**
     * id : {FFF5B757-EB49-AE48-AA18-1C8D44CAFB98}
     * icon : /commons/images/bumen.png
     * pId : {00000000-0000-0000-0000-000000000000}
     * name : 区委领导
     * isbureau : 0
     * isParent : true
     * nocheck : true
     * dept : true
     */

    private String id;
    private String icon;
    private String pId;
    private String name;
    private int isbureau;
    private String isParent;
    private String nocheck;
    private String dept;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getIcon()
    {
        return icon;
    }

    public void setIcon(String icon)
    {
        this.icon = icon;
    }

    public String getPId()
    {
        return pId;
    }

    public void setPId(String pId)
    {
        this.pId = pId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getIsbureau()
    {
        return isbureau;
    }

    public void setIsbureau(int isbureau)
    {
        this.isbureau = isbureau;
    }

    public String getIsParent()
    {
        return isParent;
    }

    public void setIsParent(String isParent)
    {
        this.isParent = isParent;
    }

    public String getNocheck()
    {
        return nocheck;
    }

    public void setNocheck(String nocheck)
    {
        this.nocheck = nocheck;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }
}
