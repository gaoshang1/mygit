package com.northdoo.futian_ducha;

import java.util.List;

/**
 * Created by Administrator on 2018/8/23.
 */

public class TaskCopying
{

    /**
     * totalrecords : 2
     * result : success
     * msg : successful
     * rows : 10
     * page : 1
     * list : [{"COS":"区委区政府办公室,组织部（编办）","SPECIFIC_GUID":"{03F05208-1647-4D03-9DDD-2C3C7D3C133C}","SUPERVISION_GUID":"{4BB369DD-7C21-4317-9F46-87CF7660EB86}","ITEM_NUMBER":"FTDC2018QT166-3","ITEM_TITLE":"测试","END_DATE":{"date":31,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1546185600000,"timezoneOffset":-480,"year":118},"BACK_TIME":2,"SEND_DATE":{"date":10,"day":5,"hours":14,"minutes":32,"month":7,"nanos":0,"seconds":6,"time":1533882726000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":null,"DUTY_PHONE":null,"DUTY_LEADER":null,"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","CREATE_DATE":{"date":10,"day":5,"hours":14,"minutes":37,"month":7,"nanos":0,"seconds":36,"time":1533883056000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":null,"BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"区委区政府办公室","SUP_NOTICE_ID":"福督[2018]7811号","DEPARTMENT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","DUTY_LEADER_GUID":null,"RN":1},{"COS":"组织部（编办）,信访局（应急办）","SPECIFIC_GUID":"{35548056-A67C-45A6-B5E7-417647A589E3}","SUPERVISION_GUID":"{4BB369DD-7C21-4317-9F46-87CF7660EB86}","ITEM_NUMBER":"FTDC2018QT166-2","ITEM_TITLE":"测试","END_DATE":null,"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":14,"minutes":32,"month":7,"nanos":0,"seconds":5,"time":1533882725000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":null,"DUTY_PHONE":null,"DUTY_LEADER":null,"DICTIONARY_GUID":"{09BFCB08-FFFF-FFFF-E085-D8B100000022}","CREATE_DATE":{"date":10,"day":5,"hours":14,"minutes":35,"month":7,"nanos":0,"seconds":49,"time":1533882949000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":"test","BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"区委区政府办公室","SUP_NOTICE_ID":"福督[2018]7810号","DEPARTMENT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","DUTY_LEADER_GUID":null,"RN":2}]
     */

    private int totalrecords;
    private String result;
    private String msg;
    private int rows;
    private int page;
    private List<ListBean> list;

    public int getTotalrecords()
    {
        return totalrecords;
    }

    public void setTotalrecords(int totalrecords)
    {
        this.totalrecords = totalrecords;
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
         * COS : 区委区政府办公室,组织部（编办）
         * SPECIFIC_GUID : {03F05208-1647-4D03-9DDD-2C3C7D3C133C}
         * SUPERVISION_GUID : {4BB369DD-7C21-4317-9F46-87CF7660EB86}
         * ITEM_NUMBER : FTDC2018QT166-3
         * ITEM_TITLE : 测试
         * END_DATE : {"date":31,"day":1,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1546185600000,"timezoneOffset":-480,"year":118}
         * BACK_TIME : 2
         * SEND_DATE : {"date":10,"day":5,"hours":14,"minutes":32,"month":7,"nanos":0,"seconds":6,"time":1533882726000,"timezoneOffset":-480,"year":118}
         * CONTEXT : null
         * DUTY_MAN : null
         * DUTY_PHONE : null
         * DUTY_LEADER : null
         * DICTIONARY_GUID : {09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}
         * CREATE_DATE : {"date":10,"day":5,"hours":14,"minutes":37,"month":7,"nanos":0,"seconds":36,"time":1533883056000,"timezoneOffset":-480,"year":118}
         * READ : 0
         * NEXT_BACK_DATE : {"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118}
         * SIMPLE_TASK : 1
         * SPE_PLAN : null
         * BLAME_TASK : 0
         * PASS_ALONG_TIMES : 0
         * REMIND_TIMES : 0
         * SUPERVISE_TIMES : 0
         * MEETING_TIMES : 0
         * INFORM_ALL_TIMES : 0
         * FEEDBACK_TIMES : 0
         * DELAY_TIMES : 0
         * BLAME_TIMES : 0
         * DEL_STATUS : 0
         * DEPARTMENT_NAME : 区委区政府办公室
         * SUP_NOTICE_ID : 福督[2018]7811号
         * DEPARTMENT_GUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
         * DUTY_LEADER_GUID : null
         * RN : 1
         */

        private String COS;
        private String SPECIFIC_GUID;
        private String SUPERVISION_GUID;
        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private ENDDATEBean END_DATE;
        private int BACK_TIME;
        private SENDDATEBean SEND_DATE;
        private String CONTEXT;
        private String DUTY_MAN;
        private Object DUTY_PHONE;
        private Object DUTY_LEADER;
        private String DICTIONARY_GUID;
        private CREATEDATEBean CREATE_DATE;
        private int READ;
        private NEXTBACKDATEBean NEXT_BACK_DATE;
        private int SIMPLE_TASK;
        private Object SPE_PLAN;
        private int BLAME_TASK;
        private int PASS_ALONG_TIMES;
        private int REMIND_TIMES;
        private int SUPERVISE_TIMES;
        private int MEETING_TIMES;
        private int INFORM_ALL_TIMES;
        private int FEEDBACK_TIMES;
        private int DELAY_TIMES;
        private int BLAME_TIMES;
        private int DEL_STATUS;
        private String DEPARTMENT_NAME;
        private String SUP_NOTICE_ID;
        private String DEPARTMENT_GUID;
        private Object DUTY_LEADER_GUID;
        private int RN;

        public String getCOS()
        {
            return COS;
        }

        public void setCOS(String COS)
        {
            this.COS = COS;
        }

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public String getSUPERVISION_GUID()
        {
            return SUPERVISION_GUID;
        }

        public void setSUPERVISION_GUID(String SUPERVISION_GUID)
        {
            this.SUPERVISION_GUID = SUPERVISION_GUID;
        }

        public String getITEM_NUMBER()
        {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER)
        {
            this.ITEM_NUMBER = ITEM_NUMBER;
        }

        public String getITEM_TITLE()
        {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE)
        {
            this.ITEM_TITLE = ITEM_TITLE;
        }

        public ENDDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(ENDDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
        }

        public int getBACK_TIME()
        {
            return BACK_TIME;
        }

        public void setBACK_TIME(int BACK_TIME)
        {
            this.BACK_TIME = BACK_TIME;
        }

        public SENDDATEBean getSEND_DATE()
        {
            return SEND_DATE;
        }

        public void setSEND_DATE(SENDDATEBean SEND_DATE)
        {
            this.SEND_DATE = SEND_DATE;
        }

        public String getCONTEXT()
        {
            return CONTEXT;
        }

        public void setCONTEXT(String CONTEXT)
        {
            this.CONTEXT = CONTEXT;
        }

        public String getDUTY_MAN()
        {
            return DUTY_MAN;
        }

        public void setDUTY_MAN(String DUTY_MAN)
        {
            this.DUTY_MAN = DUTY_MAN;
        }

        public Object getDUTY_PHONE()
        {
            return DUTY_PHONE;
        }

        public void setDUTY_PHONE(Object DUTY_PHONE)
        {
            this.DUTY_PHONE = DUTY_PHONE;
        }

        public Object getDUTY_LEADER()
        {
            return DUTY_LEADER;
        }

        public void setDUTY_LEADER(Object DUTY_LEADER)
        {
            this.DUTY_LEADER = DUTY_LEADER;
        }

        public String getDICTIONARY_GUID()
        {
            return DICTIONARY_GUID;
        }

        public void setDICTIONARY_GUID(String DICTIONARY_GUID)
        {
            this.DICTIONARY_GUID = DICTIONARY_GUID;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public NEXTBACKDATEBean getNEXT_BACK_DATE()
        {
            return NEXT_BACK_DATE;
        }

        public void setNEXT_BACK_DATE(NEXTBACKDATEBean NEXT_BACK_DATE)
        {
            this.NEXT_BACK_DATE = NEXT_BACK_DATE;
        }

        public int getSIMPLE_TASK()
        {
            return SIMPLE_TASK;
        }

        public void setSIMPLE_TASK(int SIMPLE_TASK)
        {
            this.SIMPLE_TASK = SIMPLE_TASK;
        }

        public Object getSPE_PLAN()
        {
            return SPE_PLAN;
        }

        public void setSPE_PLAN(Object SPE_PLAN)
        {
            this.SPE_PLAN = SPE_PLAN;
        }

        public int getBLAME_TASK()
        {
            return BLAME_TASK;
        }

        public void setBLAME_TASK(int BLAME_TASK)
        {
            this.BLAME_TASK = BLAME_TASK;
        }

        public int getPASS_ALONG_TIMES()
        {
            return PASS_ALONG_TIMES;
        }

        public void setPASS_ALONG_TIMES(int PASS_ALONG_TIMES)
        {
            this.PASS_ALONG_TIMES = PASS_ALONG_TIMES;
        }

        public int getREMIND_TIMES()
        {
            return REMIND_TIMES;
        }

        public void setREMIND_TIMES(int REMIND_TIMES)
        {
            this.REMIND_TIMES = REMIND_TIMES;
        }

        public int getSUPERVISE_TIMES()
        {
            return SUPERVISE_TIMES;
        }

        public void setSUPERVISE_TIMES(int SUPERVISE_TIMES)
        {
            this.SUPERVISE_TIMES = SUPERVISE_TIMES;
        }

        public int getMEETING_TIMES()
        {
            return MEETING_TIMES;
        }

        public void setMEETING_TIMES(int MEETING_TIMES)
        {
            this.MEETING_TIMES = MEETING_TIMES;
        }

        public int getINFORM_ALL_TIMES()
        {
            return INFORM_ALL_TIMES;
        }

        public void setINFORM_ALL_TIMES(int INFORM_ALL_TIMES)
        {
            this.INFORM_ALL_TIMES = INFORM_ALL_TIMES;
        }

        public int getFEEDBACK_TIMES()
        {
            return FEEDBACK_TIMES;
        }

        public void setFEEDBACK_TIMES(int FEEDBACK_TIMES)
        {
            this.FEEDBACK_TIMES = FEEDBACK_TIMES;
        }

        public int getDELAY_TIMES()
        {
            return DELAY_TIMES;
        }

        public void setDELAY_TIMES(int DELAY_TIMES)
        {
            this.DELAY_TIMES = DELAY_TIMES;
        }

        public int getBLAME_TIMES()
        {
            return BLAME_TIMES;
        }

        public void setBLAME_TIMES(int BLAME_TIMES)
        {
            this.BLAME_TIMES = BLAME_TIMES;
        }

        public int getDEL_STATUS()
        {
            return DEL_STATUS;
        }

        public void setDEL_STATUS(int DEL_STATUS)
        {
            this.DEL_STATUS = DEL_STATUS;
        }

        public String getDEPARTMENT_NAME()
        {
            return DEPARTMENT_NAME;
        }

        public void setDEPARTMENT_NAME(String DEPARTMENT_NAME)
        {
            this.DEPARTMENT_NAME = DEPARTMENT_NAME;
        }

        public String getSUP_NOTICE_ID()
        {
            return SUP_NOTICE_ID;
        }

        public void setSUP_NOTICE_ID(String SUP_NOTICE_ID)
        {
            this.SUP_NOTICE_ID = SUP_NOTICE_ID;
        }

        public String getDEPARTMENT_GUID()
        {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
        {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public Object getDUTY_LEADER_GUID()
        {
            return DUTY_LEADER_GUID;
        }

        public void setDUTY_LEADER_GUID(Object DUTY_LEADER_GUID)
        {
            this.DUTY_LEADER_GUID = DUTY_LEADER_GUID;
        }

        public int getRN()
        {
            return RN;
        }

        public void setRN(int RN)
        {
            this.RN = RN;
        }

        public static class ENDDATEBean
        {
            /**
             * date : 31
             * day : 1
             * hours : 0
             * minutes : 0
             * month : 11
             * nanos : 0
             * seconds : 0
             * time : 1546185600000
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
             * date : 10
             * day : 5
             * hours : 14
             * minutes : 32
             * month : 7
             * nanos : 0
             * seconds : 6
             * time : 1533882726000
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

        public static class CREATEDATEBean
        {
            /**
             * date : 10
             * day : 5
             * hours : 14
             * minutes : 37
             * month : 7
             * nanos : 0
             * seconds : 36
             * time : 1533883056000
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

        public static class NEXTBACKDATEBean
        {
            /**
             * date : 25
             * day : 2
             * hours : 0
             * minutes : 0
             * month : 8
             * nanos : 0
             * seconds : 0
             * time : 1537804800000
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
