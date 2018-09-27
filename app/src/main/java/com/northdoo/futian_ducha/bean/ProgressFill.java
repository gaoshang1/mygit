package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/16.
 */

public class ProgressFill
{

    /**
     * unReadCount : 4
     * result : success
     * msg : successful
     * rows : 10
     * page : 1
     * list : [{"LIGHT":2,"REMINDCOUNT":0,"MAIN_WORK":"测试","CONTENT":"测试","YEAR":2018,"GOAL":"测试目标要求","WRITEPLAN_DATE":{"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","SEND_DATE":{"date":6,"day":1,"hours":11,"minutes":52,"month":7,"nanos":0,"seconds":52,"time":1533527572000,"timezoneOffset":-480,"year":118},"WRITEPLAN_STATUS":0,"READ":1,"ITEM_NUMBER":"FTDC2018ZRFG41","MAIN_GUID":"{8B57C831-846C-4942-9B56-54E525565BAA}","DENY_REASON":null,"LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":1,"STATUS":"待填写"},{"LIGHT":2,"REMINDCOUNT":0,"MAIN_WORK":"测试","CONTENT":"测试","YEAR":2018,"GOAL":"测试目标要求","WRITEPLAN_DATE":{"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{C7E3B704-8514-4906-AFF9-8572D703830B}","SEND_DATE":{"date":6,"day":1,"hours":11,"minutes":51,"month":7,"nanos":0,"seconds":59,"time":1533527519000,"timezoneOffset":-480,"year":118},"WRITEPLAN_STATUS":0,"READ":1,"ITEM_NUMBER":"FTDC2018ZRFG43","MAIN_GUID":"{3551922B-8CD1-4C36-AF37-64C9D975FEF9}","DENY_REASON":null,"LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":2,"STATUS":"待填写"},{"LIGHT":2,"REMINDCOUNT":0,"MAIN_WORK":"测试进度填写","CONTENT":"测试测试测试","YEAR":2018,"GOAL":"测试目标要求","WRITEPLAN_DATE":{"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{F41E9607-A595-43E4-B006-1266F6C167AE}","SEND_DATE":{"date":31,"day":2,"hours":16,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1533024000000,"timezoneOffset":-480,"year":118},"WRITEPLAN_STATUS":0,"READ":1,"ITEM_NUMBER":"FTDC2018ZRFG40","MAIN_GUID":"{14923247-C5D0-4F70-A8A4-13BCA81F2831}","DENY_REASON":null,"LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":3,"STATUS":"待填写"},{"LIGHT":0,"REMINDCOUNT":0,"MAIN_WORK":"test","CONTENT":"test","YEAR":2018,"GOAL":"测试目标要求","WRITEPLAN_DATE":{"date":22,"day":3,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1534867200000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{A6A43D7E-8D16-4197-A476-158351B88FC8}","SEND_DATE":{"date":7,"day":2,"hours":14,"minutes":50,"month":7,"nanos":0,"seconds":16,"time":1533624616000,"timezoneOffset":-480,"year":118},"WRITEPLAN_STATUS":0,"READ":1,"ITEM_NUMBER":"FTDC2018ZRFG48","MAIN_GUID":"{6B8096CB-194C-4E23-98A2-8FE047E9A56B}","DENY_REASON":null,"LEADING_UNIT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":4,"STATUS":"待填写"}]
     */

    private int unReadCount;
    private String result;
    private String msg;
    private int rows;
    private int page;
    private List<ListBean> list;

    public int getUnReadCount()
    {
        return unReadCount;
    }

    public void setUnReadCount(int unReadCount)
    {
        this.unReadCount = unReadCount;
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

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
    }

    public List<ListBean> getList()
    {
        return list;
    }

    public void setList(List<ListBean> list)
    {
        this.list = list;
    }

    public static class ListBean
    {
        /**
         * LIGHT : 2
         * REMINDCOUNT : 0
         * MAIN_WORK : 测试
         * CONTENT : 测试
         * YEAR : 2018
         * GOAL : 测试目标要求
         * WRITEPLAN_DATE : {"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118}
         * SUB_GUID : {B0851418-3F28-435B-830D-DA1CC08D212B}
         * SEND_DATE : {"date":6,"day":1,"hours":11,"minutes":52,"month":7,"nanos":0,"seconds":52,"time":1533527572000,"timezoneOffset":-480,"year":118}
         * WRITEPLAN_STATUS : 0
         * READ : 1
         * ITEM_NUMBER : FTDC2018ZRFG41
         * MAIN_GUID : {8B57C831-846C-4942-9B56-54E525565BAA}
         * DENY_REASON : null
         * LEADING_UNIT_GUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
         * RN : 1
         * STATUS : 待填写
         */

        private int LIGHT;
        private int REMINDCOUNT;
        private String MAIN_WORK;
        private String CONTENT;
        private int YEAR;
        private String GOAL;
        private WRITEPLANDATEBean WRITEPLAN_DATE;
        private String SUB_GUID;
        private SENDDATEBean SEND_DATE;
        private int WRITEPLAN_STATUS;
        private int READ;
        private String ITEM_NUMBER;
        private String MAIN_GUID;
        private Object DENY_REASON;
        private String LEADING_UNIT_GUID;
        private int RN;
        private String STATUS;

        public int getLIGHT()
        {
            return LIGHT;
        }

        public void setLIGHT(int LIGHT)
        {
            this.LIGHT = LIGHT;
        }

        public int getREMINDCOUNT()
        {
            return REMINDCOUNT;
        }

        public void setREMINDCOUNT(int REMINDCOUNT)
        {
            this.REMINDCOUNT = REMINDCOUNT;
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

        public int getYEAR()
        {
            return YEAR;
        }

        public void setYEAR(int YEAR)
        {
            this.YEAR = YEAR;
        }

        public String getGOAL()
        {
            return GOAL;
        }

        public void setGOAL(String GOAL)
        {
            this.GOAL = GOAL;
        }

        public WRITEPLANDATEBean getWRITEPLAN_DATE()
        {
            return WRITEPLAN_DATE;
        }

        public void setWRITEPLAN_DATE(WRITEPLANDATEBean WRITEPLAN_DATE)
        {
            this.WRITEPLAN_DATE = WRITEPLAN_DATE;
        }

        public String getSUB_GUID()
        {
            return SUB_GUID;
        }

        public void setSUB_GUID(String SUB_GUID)
        {
            this.SUB_GUID = SUB_GUID;
        }

        public SENDDATEBean getSEND_DATE()
        {
            return SEND_DATE;
        }

        public void setSEND_DATE(SENDDATEBean SEND_DATE)
        {
            this.SEND_DATE = SEND_DATE;
        }

        public int getWRITEPLAN_STATUS()
        {
            return WRITEPLAN_STATUS;
        }

        public void setWRITEPLAN_STATUS(int WRITEPLAN_STATUS)
        {
            this.WRITEPLAN_STATUS = WRITEPLAN_STATUS;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public String getITEM_NUMBER()
        {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER)
        {
            this.ITEM_NUMBER = ITEM_NUMBER;
        }

        public String getMAIN_GUID()
        {
            return MAIN_GUID;
        }

        public void setMAIN_GUID(String MAIN_GUID)
        {
            this.MAIN_GUID = MAIN_GUID;
        }

        public Object getDENY_REASON()
        {
            return DENY_REASON;
        }

        public void setDENY_REASON(Object DENY_REASON)
        {
            this.DENY_REASON = DENY_REASON;
        }

        public String getLEADING_UNIT_GUID()
        {
            return LEADING_UNIT_GUID;
        }

        public void setLEADING_UNIT_GUID(String LEADING_UNIT_GUID)
        {
            this.LEADING_UNIT_GUID = LEADING_UNIT_GUID;
        }

        public int getRN()
        {
            return RN;
        }

        public void setRN(int RN)
        {
            this.RN = RN;
        }

        public String getSTATUS()
        {
            return STATUS;
        }

        public void setSTATUS(String STATUS)
        {
            this.STATUS = STATUS;
        }

        public static class WRITEPLANDATEBean
        {
            /**
             * date : 3
             * day : 5
             * hours : 0
             * minutes : 0
             * month : 7
             * nanos : 0
             * seconds : 0
             * time : 1533225600000
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
             * date : 6
             * day : 1
             * hours : 11
             * minutes : 52
             * month : 7
             * nanos : 0
             * seconds : 52
             * time : 1533527572000
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
}
