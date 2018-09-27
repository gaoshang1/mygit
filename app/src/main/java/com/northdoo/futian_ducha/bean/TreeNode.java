package com.northdoo.futian_ducha.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 高尚 on 2018/3/13.
 */

public class TreeNode implements Serializable
{

    /**
     * id : {BFA800D5-FFFF-FFFF-A3DC-A9A800000003}
     * pId : {00000000-0000-0000-0000-000000000000}
     * name : 党委、人大、政协工作部门
     * open : null
     * isParent : null
     * iconOpen : null
     * iconClose : null
     * icon : /commons/scripts/zTree/css/zTreeStyle/img/diy/department.png
     * chkDisabled : null
     * children : null
     */

    private String id;
    private String pId;
    private String name;

    private List<TreeNode> department = new ArrayList<>();


    public List<TreeNode> getDepartment()
    {
        return department;
    }

    public void setDepartment(List<TreeNode> department)
    {
        this.department = department;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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


    public boolean equals(Object obj)
    {
        if (obj instanceof TreeNode)
        {
            TreeNode u = (TreeNode) obj;
            return this.id.equals(u.id)
                    && this.name.equals(name);
        }
        return super.equals(obj);
    }

}
