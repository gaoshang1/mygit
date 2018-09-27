package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */

public class AuditPlanDetail
{

    /**
     * MAIN_GUID : {3CC1FCE2-F689-4D02-925A-61D6F16BB6ED}
     * MAIN_WORK : test
     * CONTENT : test
     * CREATE_DATE : {"date":26,"day":4,"hours":11,"minutes":24,"month":6,"nanos":0,"seconds":10,"time":1532575450000,"timezoneOffset":-480,"year":118}
     * STATUS : 2
     * SUPERVISION_TYPE_GUID : {AC1D333E-0000-0000-70E4-CE4B00000021}
     * EMPLOYEE_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
     * TOTAL_UNITNUMBER : 1
     * READ : 1
     * SEND_DATE : {"date":26,"day":4,"hours":14,"minutes":11,"month":6,"nanos":0,"seconds":48,"time":1532585508000,"timezoneOffset":-480,"year":118}
     * DEL_STATUS : 0
     * SUPERVISION_TYPE_NAME : 其他专项工作
     * YEAR : 2018
     * FEEDBACK_TYPE : 按季度
     * WRITEPLAN_DATE : {"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118}
     * CONFIRM_DATE : {"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118}
     * FEEDBACK_NUMBER : 4
     * IS_FROMUPPER : 1
     * ITEM_NUMBER : FTDC2018ZRFG28
     * goalList : [{"GOAL_GUID":"{A09E2CB9-B077-4803-9BE8-DDC0C602F73E}","GOAL":"测试目标要求","CREATE_DATE":{"date":26,"day":4,"hours":11,"minutes":24,"month":6,"nanos":0,"seconds":10,"time":1532575450000,"timezoneOffset":-480,"year":118},"MAIN_GUID":"{3CC1FCE2-F689-4D02-925A-61D6F16BB6ED}","GOAL_INDEX":0,"DEL_STATUS":0,"sub":[{"SUB_GUID":"{DECEEAC1-A369-468D-A44C-D2EF29A02997}","CHARGE_LEADER_GUID":"{AC1D3317-FFFF-FFFF-ECC7-6D2C00000003}","CHARGE_LEADER_NAME":"高圣元","LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","LEADING_UNIT_NAME":"区委区政府办公室","CREATE_DATE":{"date":26,"day":4,"hours":11,"minutes":24,"month":6,"nanos":0,"seconds":10,"time":1532575450000,"timezoneOffset":-480,"year":118},"GOAL_GUID":"{A09E2CB9-B077-4803-9BE8-DDC0C602F73E}","STATUS":1,"READ":1,"MAIN_GUID":"{3CC1FCE2-F689-4D02-925A-61D6F16BB6ED}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":14,"minutes":10,"month":6,"nanos":0,"seconds":9,"time":1532585409000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"WRITEPLAN_STATUS":"已填写","DENY_REASON":null,"PLAN_DENY_REASON":null,"IDLE_CHECK_NUMBER":null,"REJECT_CHECK_NUMBER":null,"REMIND_TIMES2":0,"sub":[],"pds":[]}]}]
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
    private SENDDATEBean SEND_DATE;
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

    public SENDDATEBean getSEND_DATE()
    {
        return SEND_DATE;
    }

    public void setSEND_DATE(SENDDATEBean SEND_DATE)
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
         * date : 26
         * day : 4
         * hours : 11
         * minutes : 24
         * month : 6
         * nanos : 0
         * seconds : 10
         * time : 1532575450000
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

    public static class SENDDATEBean
    {
        /**
         * date : 26
         * day : 4
         * hours : 14
         * minutes : 11
         * month : 6
         * nanos : 0
         * seconds : 48
         * time : 1532585508000
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
         * date : 26
         * day : 4
         * hours : 0
         * minutes : 0
         * month : 6
         * nanos : 0
         * seconds : 0
         * time : 1532534400000
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
         * date : 26
         * day : 4
         * hours : 0
         * minutes : 0
         * month : 6
         * nanos : 0
         * seconds : 0
         * time : 1532534400000
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
