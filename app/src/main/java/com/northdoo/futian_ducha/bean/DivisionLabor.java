package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/16.
 */

public class DivisionLabor
{
    /**
     * unReadCount : 2
     * result : success
     * msg : successful
     * rows : 10
     * page : 1
     * list : [{"LIGHT":2,"REMINDCOUNT":0,"MAIN_WORK":"测试","CONTENT":"测试","YEAR":2018,"GOAL":"测试目标要求","CONFIRM_DATE":{"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118},"STATUS":"待确认","GUID":"{C6D68E3F-0AAB-4A3B-A40D-BD694D8F6262}","DUTYTYPE":1,"ITEM_NUMBER":"FTDC2018ZRFG42","READ":1,"SEND_DATE":{"date":6,"day":1,"hours":14,"minutes":32,"month":7,"nanos":0,"seconds":12,"time":1533537132000,"timezoneOffset":-480,"year":118},"UNITGUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":1},{"LIGHT":0,"REMINDCOUNT":0,"MAIN_WORK":"3332","CONTENT":"323333333333","YEAR":2019,"GOAL":"测试目标要求","CONFIRM_DATE":{"date":30,"day":2,"hours":0,"minutes":0,"month":9,"nanos":0,"seconds":0,"time":1540828800000,"timezoneOffset":-480,"year":118},"STATUS":"待确认","GUID":"{0D081CD3-3648-4DBB-B0BC-A39F32539AB2}","DUTYTYPE":1,"ITEM_NUMBER":"FTDC2018ZRFG37","READ":1,"SEND_DATE":{"date":2,"day":4,"hours":17,"minutes":48,"month":7,"nanos":0,"seconds":33,"time":1533203313000,"timezoneOffset":-480,"year":118},"UNITGUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","RN":2}]
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
         * CONFIRM_DATE : {"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118}
         * STATUS : 待确认
         * GUID : {C6D68E3F-0AAB-4A3B-A40D-BD694D8F6262}
         * DUTYTYPE : 1
         * ITEM_NUMBER : FTDC2018ZRFG42
         * READ : 1
         * SEND_DATE : {"date":6,"day":1,"hours":14,"minutes":32,"month":7,"nanos":0,"seconds":12,"time":1533537132000,"timezoneOffset":-480,"year":118}
         * UNITGUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
         * RN : 1
         */

        private int LIGHT;
        private int REMINDCOUNT;
        private String MAIN_WORK;
        private String CONTENT;
        private int YEAR;
        private String GOAL;
        private CONFIRMDATEBean CONFIRM_DATE;
        private String STATUS;
        private String GUID;
        private int DUTYTYPE;
        private String ITEM_NUMBER;
        private int READ;
        private SENDDATEBean SEND_DATE;
        private String UNITGUID;
        private int RN;

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

        public CONFIRMDATEBean getCONFIRM_DATE()
        {
            return CONFIRM_DATE;
        }

        public void setCONFIRM_DATE(CONFIRMDATEBean CONFIRM_DATE)
        {
            this.CONFIRM_DATE = CONFIRM_DATE;
        }

        public String getSTATUS()
        {
            return STATUS;
        }

        public void setSTATUS(String STATUS)
        {
            this.STATUS = STATUS;
        }

        public String getGUID()
        {
            return GUID;
        }

        public void setGUID(String GUID)
        {
            this.GUID = GUID;
        }

        public int getDUTYTYPE()
        {
            return DUTYTYPE;
        }

        public void setDUTYTYPE(int DUTYTYPE)
        {
            this.DUTYTYPE = DUTYTYPE;
        }

        public String getITEM_NUMBER()
        {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER)
        {
            this.ITEM_NUMBER = ITEM_NUMBER;
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

        public String getUNITGUID()
        {
            return UNITGUID;
        }

        public void setUNITGUID(String UNITGUID)
        {
            this.UNITGUID = UNITGUID;
        }

        public int getRN()
        {
            return RN;
        }

        public void setRN(int RN)
        {
            this.RN = RN;
        }

        public static class CONFIRMDATEBean
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
             * hours : 14
             * minutes : 32
             * month : 7
             * nanos : 0
             * seconds : 12
             * time : 1533537132000
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
