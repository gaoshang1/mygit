package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/3.
 */

public class MainDetail
{


    /**
     * MAIN_GUID : {62722CB2-61F0-4D4B-9E70-82D8160E6A55}
     * MAIN_WORK : 跟踪确认
     * CONTENT : 测试测试测试测试测试
     * CREATE_DATE : {"date":6,"day":1,"hours":11,"minutes":28,"month":7,"nanos":0,"seconds":50,"time":1533526130000,"timezoneOffset":-480,"year":118}
     * STATUS : 1
     * SUPERVISION_TYPE_GUID : {09BFCB09-FFFF-FFFF-FD0C-20AE00000020}
     * EMPLOYEE_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
     * TOTAL_UNITNUMBER : 2
     * READ : 1
     * SEND_DATE : null
     * DEL_STATUS : 0
     * SUPERVISION_TYPE_NAME : 区委区政府重要工作
     * YEAR : 2018
     * FEEDBACK_TYPE : 自定义
     * WRITEPLAN_DATE : {"date":6,"day":1,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533484800000,"timezoneOffset":-480,"year":118}
     * CONFIRM_DATE : {"date":6,"day":1,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533484800000,"timezoneOffset":-480,"year":118}
     * FEEDBACK_NUMBER : 1
     * IS_FROMUPPER : 0
     * ITEM_NUMBER : FTDC2018ZRFG44
     * goalList : [{"GOAL_GUID":"{7E802EC0-FA30-4A3A-8A52-4C39B5C4BCE5}","GOAL":"测试目标要求","CREATE_DATE":{"date":6,"day":1,"hours":11,"minutes":28,"month":7,"nanos":0,"seconds":50,"time":1533526130000,"timezoneOffset":-480,"year":118},"MAIN_GUID":"{62722CB2-61F0-4D4B-9E70-82D8160E6A55}","GOAL_INDEX":0,"DEL_STATUS":0,"sub":[{"SUB_GUID":"{D296A067-BE9B-476A-BF5F-F83AC316BE23}","CHARGE_LEADER_GUID":"{AC1D350C-FFFF-FFFF-9020-CED1FFFFFF9F}","CHARGE_LEADER_NAME":"黄伟","LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","LEADING_UNIT_NAME":"区委区政府办公室","CREATE_DATE":{"date":6,"day":1,"hours":11,"minutes":28,"month":7,"nanos":0,"seconds":50,"time":1533526130000,"timezoneOffset":-480,"year":118},"GOAL_GUID":"{7E802EC0-FA30-4A3A-8A52-4C39B5C4BCE5}","STATUS":"未处理","READ":1,"MAIN_GUID":"{62722CB2-61F0-4D4B-9E70-82D8160E6A55}","DEL_STATUS":0,"CONFIRM_DATE":null,"REMIND_TIMES":0,"DC_READ":1,"WRITEPLAN_STATUS":0,"DENY_REASON":null,"PLAN_DENY_REASON":null,"IDLE_CHECK_NUMBER":null,"REJECT_CHECK_NUMBER":null,"REMIND_TIMES2":0,"sub":[{"CO_GUID":"{F32BA62F-ADC0-4E79-A6F1-4CC8D0CAABED}","STATUS":0,"CO_UNIT_NAME":"财政局","CO_UNIT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","CREATE_DATE":{"date":6,"day":1,"hours":11,"minutes":28,"month":7,"nanos":0,"seconds":50,"time":1533526130000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{D296A067-BE9B-476A-BF5F-F83AC316BE23}","READ":0,"GOAL_GUID":"{7E802EC0-FA30-4A3A-8A52-4C39B5C4BCE5}","MAIN_GUID":"{62722CB2-61F0-4D4B-9E70-82D8160E6A55}","DEL_STATUS":0,"CONFIRM_DATE":null,"REMIND_TIMES":0,"DC_READ":1,"DENY_REASON":null}]}]}]
     * result : success
     * msg : successful
     */

    private String MAIN_GUID;
    private String MAIN_WORK;
    private String CONTENT;
    private CREATEDATEBean CREATE_DATE;
    private int STATUS;
    private String SUPERVISION_TYPE_GUID;
    private String EMPLOYEE_GUID;
    private int TOTAL_UNITNUMBER;
    private int READ;
    private Object SEND_DATE;
    private int DEL_STATUS;
    private String SUPERVISION_TYPE_NAME;
    private int YEAR;
    private String FEEDBACK_TYPE;
    private WRITEPLANDATEBean WRITEPLAN_DATE;
    private CONFIRMDATEBean CONFIRM_DATE;
    private int FEEDBACK_NUMBER;
    private int IS_FROMUPPER;
    private String ITEM_NUMBER;
    private String result;
    private String msg;
    private List<GoalListBean> goalList;

    public String getMAIN_GUID()
    {
        return MAIN_GUID;
    }

    public void setMAIN_GUID(String MAIN_GUID)
    {
        this.MAIN_GUID = MAIN_GUID;
    }

    public String getMAIN_WORK()
    {
        return MAIN_WORK;
    }

    public void setMAIN_WORK(String MAIN_WORK)
    {
        this.MAIN_WORK = MAIN_WORK;
    }

    public String getCONTENT()
    {
        return CONTENT;
    }

    public void setCONTENT(String CONTENT)
    {
        this.CONTENT = CONTENT;
    }

    public CREATEDATEBean getCREATE_DATE()
    {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
    {
        this.CREATE_DATE = CREATE_DATE;
    }

    public int getSTATUS()
    {
        return STATUS;
    }

    public void setSTATUS(int STATUS)
    {
        this.STATUS = STATUS;
    }

    public String getSUPERVISION_TYPE_GUID()
    {
        return SUPERVISION_TYPE_GUID;
    }

    public void setSUPERVISION_TYPE_GUID(String SUPERVISION_TYPE_GUID)
    {
        this.SUPERVISION_TYPE_GUID = SUPERVISION_TYPE_GUID;
    }

    public String getEMPLOYEE_GUID()
    {
        return EMPLOYEE_GUID;
    }

    public void setEMPLOYEE_GUID(String EMPLOYEE_GUID)
    {
        this.EMPLOYEE_GUID = EMPLOYEE_GUID;
    }

    public int getTOTAL_UNITNUMBER()
    {
        return TOTAL_UNITNUMBER;
    }

    public void setTOTAL_UNITNUMBER(int TOTAL_UNITNUMBER)
    {
        this.TOTAL_UNITNUMBER = TOTAL_UNITNUMBER;
    }

    public int getREAD()
    {
        return READ;
    }

    public void setREAD(int READ)
    {
        this.READ = READ;
    }

    public Object getSEND_DATE()
    {
        return SEND_DATE;
    }

    public void setSEND_DATE(Object SEND_DATE)
    {
        this.SEND_DATE = SEND_DATE;
    }

    public int getDEL_STATUS()
    {
        return DEL_STATUS;
    }

    public void setDEL_STATUS(int DEL_STATUS)
    {
        this.DEL_STATUS = DEL_STATUS;
    }

    public String getSUPERVISION_TYPE_NAME()
    {
        return SUPERVISION_TYPE_NAME;
    }

    public void setSUPERVISION_TYPE_NAME(String SUPERVISION_TYPE_NAME)
    {
        this.SUPERVISION_TYPE_NAME = SUPERVISION_TYPE_NAME;
    }

    public int getYEAR()
    {
        return YEAR;
    }

    public void setYEAR(int YEAR)
    {
        this.YEAR = YEAR;
    }

    public String getFEEDBACK_TYPE()
    {
        return FEEDBACK_TYPE;
    }

    public void setFEEDBACK_TYPE(String FEEDBACK_TYPE)
    {
        this.FEEDBACK_TYPE = FEEDBACK_TYPE;
    }

    public WRITEPLANDATEBean getWRITEPLAN_DATE()
    {
        return WRITEPLAN_DATE;
    }

    public void setWRITEPLAN_DATE(WRITEPLANDATEBean WRITEPLAN_DATE)
    {
        this.WRITEPLAN_DATE = WRITEPLAN_DATE;
    }

    public CONFIRMDATEBean getCONFIRM_DATE()
    {
        return CONFIRM_DATE;
    }

    public void setCONFIRM_DATE(CONFIRMDATEBean CONFIRM_DATE)
    {
        this.CONFIRM_DATE = CONFIRM_DATE;
    }

    public int getFEEDBACK_NUMBER()
    {
        return FEEDBACK_NUMBER;
    }

    public void setFEEDBACK_NUMBER(int FEEDBACK_NUMBER)
    {
        this.FEEDBACK_NUMBER = FEEDBACK_NUMBER;
    }

    public int getIS_FROMUPPER()
    {
        return IS_FROMUPPER;
    }

    public void setIS_FROMUPPER(int IS_FROMUPPER)
    {
        this.IS_FROMUPPER = IS_FROMUPPER;
    }

    public String getITEM_NUMBER()
    {
        return ITEM_NUMBER;
    }

    public void setITEM_NUMBER(String ITEM_NUMBER)
    {
        this.ITEM_NUMBER = ITEM_NUMBER;
    }

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

    public List<GoalListBean> getGoalList()
    {
        return goalList;
    }

    public void setGoalList(List<GoalListBean> goalList)
    {
        this.goalList = goalList;
    }

    public static class CREATEDATEBean
    {
        /**
         * date : 6
         * day : 1
         * hours : 11
         * minutes : 28
         * month : 7
         * nanos : 0
         * seconds : 50
         * time : 1533526130000
         * timezoneOffset : -480
         * year : 118
         */

        private int date;
        private int day;
        private int hours;
        private int minutes;
        private int month;
        private int nanos;
        private int seconds;
        private long time;
        private int timezoneOffset;
        private int year;

        public int getDate()
        {
            return date;
        }

        public void setDate(int date)
        {
            this.date = date;
        }

        public int getDay()
        {
            return day;
        }

        public void setDay(int day)
        {
            this.day = day;
        }

        public int getHours()
        {
            return hours;
        }

        public void setHours(int hours)
        {
            this.hours = hours;
        }

        public int getMinutes()
        {
            return minutes;
        }

        public void setMinutes(int minutes)
        {
            this.minutes = minutes;
        }

        public int getMonth()
        {
            return month;
        }

        public void setMonth(int month)
        {
            this.month = month;
        }

        public int getNanos()
        {
            return nanos;
        }

        public void setNanos(int nanos)
        {
            this.nanos = nanos;
        }

        public int getSeconds()
        {
            return seconds;
        }

        public void setSeconds(int seconds)
        {
            this.seconds = seconds;
        }

        public long getTime()
        {
            return time;
        }

        public void setTime(long time)
        {
            this.time = time;
        }

        public int getTimezoneOffset()
        {
            return timezoneOffset;
        }

        public void setTimezoneOffset(int timezoneOffset)
        {
            this.timezoneOffset = timezoneOffset;
        }

        public int getYear()
        {
            return year;
        }

        public void setYear(int year)
        {
            this.year = year;
        }
    }

    public static class WRITEPLANDATEBean
    {
        /**
         * date : 6
         * day : 1
         * hours : 0
         * minutes : 0
         * month : 7
         * nanos : 0
         * seconds : 0
         * time : 1533484800000
         * timezoneOffset : -480
         * year : 118
         */

        private int date;
        private int day;
        private int hours;
        private int minutes;
        private int month;
        private int nanos;
        private int seconds;
        private long time;
        private int timezoneOffset;
        private int year;

        public int getDate()
        {
            return date;
        }

        public void setDate(int date)
        {
            this.date = date;
        }

        public int getDay()
        {
            return day;
        }

        public void setDay(int day)
        {
            this.day = day;
        }

        public int getHours()
        {
            return hours;
        }

        public void setHours(int hours)
        {
            this.hours = hours;
        }

        public int getMinutes()
        {
            return minutes;
        }

        public void setMinutes(int minutes)
        {
            this.minutes = minutes;
        }

        public int getMonth()
        {
            return month;
        }

        public void setMonth(int month)
        {
            this.month = month;
        }

        public int getNanos()
        {
            return nanos;
        }

        public void setNanos(int nanos)
        {
            this.nanos = nanos;
        }

        public int getSeconds()
        {
            return seconds;
        }

        public void setSeconds(int seconds)
        {
            this.seconds = seconds;
        }

        public long getTime()
        {
            return time;
        }

        public void setTime(long time)
        {
            this.time = time;
        }

        public int getTimezoneOffset()
        {
            return timezoneOffset;
        }

        public void setTimezoneOffset(int timezoneOffset)
        {
            this.timezoneOffset = timezoneOffset;
        }

        public int getYear()
        {
            return year;
        }

        public void setYear(int year)
        {
            this.year = year;
        }
    }

    public static class CONFIRMDATEBean
    {
        /**
         * date : 6
         * day : 1
         * hours : 0
         * minutes : 0
         * month : 7
         * nanos : 0
         * seconds : 0
         * time : 1533484800000
         * timezoneOffset : -480
         * year : 118
         */

        private int date;
        private int day;
        private int hours;
        private int minutes;
        private int month;
        private int nanos;
        private int seconds;
        private long time;
        private int timezoneOffset;
        private int year;

        public int getDate()
        {
            return date;
        }

        public void setDate(int date)
        {
            this.date = date;
        }

        public int getDay()
        {
            return day;
        }

        public void setDay(int day)
        {
            this.day = day;
        }

        public int getHours()
        {
            return hours;
        }

        public void setHours(int hours)
        {
            this.hours = hours;
        }

        public int getMinutes()
        {
            return minutes;
        }

        public void setMinutes(int minutes)
        {
            this.minutes = minutes;
        }

        public int getMonth()
        {
            return month;
        }

        public void setMonth(int month)
        {
            this.month = month;
        }

        public int getNanos()
        {
            return nanos;
        }

        public void setNanos(int nanos)
        {
            this.nanos = nanos;
        }

        public int getSeconds()
        {
            return seconds;
        }

        public void setSeconds(int seconds)
        {
            this.seconds = seconds;
        }

        public long getTime()
        {
            return time;
        }

        public void setTime(long time)
        {
            this.time = time;
        }

        public int getTimezoneOffset()
        {
            return timezoneOffset;
        }

        public void setTimezoneOffset(int timezoneOffset)
        {
            this.timezoneOffset = timezoneOffset;
        }

        public int getYear()
        {
            return year;
        }

        public void setYear(int year)
        {
            this.year = year;
        }
    }


}
