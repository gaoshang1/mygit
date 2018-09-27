package com.northdoo.futian_ducha.bean;

import java.io.Serializable;

/**
 * 联系人数据
 *
 * @author
 */
public class Contact implements Serializable
{

    private static final long serialVersionUID = 1L;

    /**
     * 0：联系人分组     1：联系人   2 我的群组
     */
    public static final int TYPE_GROUP = 1;  //自定义群
    public static final int TYPE_CONTACT = 2;
    public static final int TYPE_GROUP2 = 0;  //固定群
    public static final int STATE_UNSPREADED = 0;
    public static final int STATE_SPREADING = 1;
    public static final int STATE_SPREADED = 2;
    public int groupType;
    public int level = 0; //层级
    int type; //数据类型 （部门列表还是人员列表等等）
    String id;     //部门的id或者是人员id
    String title;
    String name;        //部门的名称或者是人员名称（真是名称）
    String nickName;    //登录名
    String img;         //部门的图像或者是人员图像
    String telephone;   //电话
    String mobile;
    String mailbox;     //邮箱
    String department;   //部门
    String duty;          //公司职位
    String parentId;      //部门的父id	
    String symbol;//群主 为1 否则为0
    String tanent;//租户ID
    String loginId;//登陆用户id
    boolean isDept = false;//是否加载过
    boolean hasLoaded = false;//是否加载过
    boolean isLoading = false;//是否正在加载

    public boolean isDept()
    {
        return isDept;
    }

    public void setDept(boolean dept)
    {
        isDept = dept;
    }

    public int getGroupType()
    {
        return groupType;
    }

    public void setGroupType(int groupType)
    {
        this.groupType = groupType;
    }

    public boolean isLoading()
    {
        return isLoading;
    }

    public void setLoading(boolean isLoading)
    {
        this.isLoading = isLoading;
    }

    public boolean isHasLoaded()
    {
        return hasLoaded;
    }

    public void setHasLoaded(boolean hasLoaded)
    {
        this.hasLoaded = hasLoaded;
    }

    int isSpread;// 是否展开 0展开状态 1正在展开状态 2收起状态
    String fatherId;
    boolean show;
    private int position;// 在listview中所处的位置

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public boolean isShow()
    {
        return show;
    }

    public void setShow(boolean show)
    {
        this.show = show;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public String getFatherId()
    {
        return fatherId;
    }

    public void setFatherId(String fatherId)
    {
        this.fatherId = fatherId;
    }

    public int getIsSpread()
    {
        return isSpread;
    }

    public void setIsSpread(int isSpread)
    {
        this.isSpread = isSpread;
    }

    public String getLoginId()
    {
        return loginId;
    }

    public void setLoginId(String loginId)
    {
        this.loginId = loginId;
    }

    public String getTanent()
    {
        return tanent;
    }

    public void setTanent(String tanent)
    {
        this.tanent = tanent;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    boolean isPerson;

    public boolean isPerson()
    {
        return isPerson;
    }

    public void setPerson(boolean isPerson)
    {
        this.isPerson = isPerson;
    }

    boolean harmast;
    boolean selecteMode;
    boolean selected;

    public boolean isSelected()
    {
        return selected;
    }

    public void setSelected(boolean selected)
    {
        this.selected = selected;
    }

    private String sortLetters;  //显示数据拼音的首字母


    public String getParentId()
    {
        return parentId;
    }

    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getDuty()
    {
        return duty;
    }

    public void setDuty(String duty)
    {
        this.duty = duty;
    }

    public String getSortLetters()
    {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters)
    {
        this.sortLetters = sortLetters;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    public String getImg()
    {
        return img;
    }

    public void setImg(String img)
    {
        this.img = img;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getMailbox()
    {
        return mailbox;
    }

    public void setMailbox(String mailbox)
    {
        this.mailbox = mailbox;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public boolean isHarmast()
    {
        return harmast;
    }

    public void setHarmast(boolean harmast)
    {
        this.harmast = harmast;
    }

    public boolean isSelecteMode()
    {
        return selecteMode;
    }

    public void setSelecteMode(boolean selecteMode)
    {
        this.selecteMode = selecteMode;
    }


}
