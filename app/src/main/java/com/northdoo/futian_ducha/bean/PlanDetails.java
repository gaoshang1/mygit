package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/23.
 */

public class PlanDetails
{


    /**
     * detPlan : {"MAIN":"督查测试","COS":"办文科测试","COPY":"督查测试","DETPLAN_GUID":"{C5D5CB0D-1A38-4FE7-AEAC-C9ECD456187A}","SPECIFIC_GUID":"{35548056-A67C-45A6-B5E7-417647A589E3}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT166-2-0003","ITEM_TITLE":"测试","END_DATE":null,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"BACK_TIME":2,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":15,"minutes":26,"month":7,"nanos":0,"seconds":50,"time":1533886010000,"timezoneOffset":-480,"year":118},"CONTEXT":"test","READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"PASS_ALONG_TIMES":0,"file":[{"createDate":{"date":10,"day":5,"hours":14,"minutes":35,"month":7,"seconds":38,"time":1533882938000,"timezoneOffset":-480,"year":118},"creatorGUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","creatorName":"督查测试","departmentGUID":"","departmentName":"","fileGUID":"{C9DA6134-4E93-40D5-8F2F-E94BFB063AD1}","fileName":"123456.png","filenameext":".png","filesize":"625456","isdel":false}]}
     * result : success
     * msg : successful
     */

    private DetPlanBean detPlan;
    private String result;
    private String msg;

    public DetPlanBean getDetPlan()
    {
        return detPlan;
    }

    public void setDetPlan(DetPlanBean detPlan)
    {
        this.detPlan = detPlan;
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

    public static class DetPlanBean
    {
        /**
         * MAIN : 督查测试
         * COS : 办文科测试
         * COPY : 督查测试
         * DETPLAN_GUID : {C5D5CB0D-1A38-4FE7-AEAC-C9ECD456187A}
         * SPECIFIC_GUID : {35548056-A67C-45A6-B5E7-417647A589E3}
         * DICTIONARY_GUID : {BFA80164-FFFF-FFFF-DD67-A38E00000023}
         * ITEM_NUMBER : FTDC2018QT166-2-0003
         * ITEM_TITLE : 测试
         * END_DATE : null
         * NEXT_BACK_DATE : {"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118}
         * BACK_TIME : 2
         * SEND_DATE : {"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118}
         * CREATE_DATE : {"date":10,"day":5,"hours":15,"minutes":26,"month":7,"nanos":0,"seconds":50,"time":1533886010000,"timezoneOffset":-480,"year":118}
         * CONTEXT : test
         * READ : 0
         * EXIST : 1
         * DELETE_DATE : null
         * REMOVER : null
         * REMIND_TIMES : 0
         * MEETING_TIMES : 0
         * INFORM_ALL_TIMES : 0
         * FEEDBACK_TIMES : 0
         * DELAY_TIMES : 0
         * PASS_ALONG_TIMES : 0
         * file : [{"createDate":{"date":10,"day":5,"hours":14,"minutes":35,"month":7,"seconds":38,"time":1533882938000,"timezoneOffset":-480,"year":118},"creatorGUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","creatorName":"督查测试","departmentGUID":"","departmentName":"","fileGUID":"{C9DA6134-4E93-40D5-8F2F-E94BFB063AD1}","fileName":"123456.png","filenameext":".png","filesize":"625456","isdel":false}]
         */

        private String MAIN;
        private String COS;
        private String COPY;
        private String DETPLAN_GUID;
        private String SPECIFIC_GUID;
        private String DICTIONARY_GUID;
        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private SENDDATEBean END_DATE;
        private NEXTBACKDATEBean NEXT_BACK_DATE;
        private int BACK_TIME;
        private SENDDATEBean SEND_DATE;
        private CREATEDATEBean CREATE_DATE;
        private String CONTEXT;
        private int READ;
        private int EXIST;
        private Object DELETE_DATE;
        private Object REMOVER;
        private int REMIND_TIMES;
        private int MEETING_TIMES;
        private int INFORM_ALL_TIMES;
        private int FEEDBACK_TIMES;
        private int DELAY_TIMES;
        private int PASS_ALONG_TIMES;
        private List<FileBean> file;

        public String getMAIN()
        {
            return MAIN;
        }

        public void setMAIN(String MAIN)
        {
            this.MAIN = MAIN;
        }

        public String getCOS()
        {
            return COS;
        }

        public void setCOS(String COS)
        {
            this.COS = COS;
        }

        public String getCOPY()
        {
            return COPY;
        }

        public void setCOPY(String COPY)
        {
            this.COPY = COPY;
        }

        public String getDETPLAN_GUID()
        {
            return DETPLAN_GUID;
        }

        public void setDETPLAN_GUID(String DETPLAN_GUID)
        {
            this.DETPLAN_GUID = DETPLAN_GUID;
        }

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public String getDICTIONARY_GUID()
        {
            return DICTIONARY_GUID;
        }

        public void setDICTIONARY_GUID(String DICTIONARY_GUID)
        {
            this.DICTIONARY_GUID = DICTIONARY_GUID;
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

        public SENDDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(SENDDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
        }

        public NEXTBACKDATEBean getNEXT_BACK_DATE()
        {
            return NEXT_BACK_DATE;
        }

        public void setNEXT_BACK_DATE(NEXTBACKDATEBean NEXT_BACK_DATE)
        {
            this.NEXT_BACK_DATE = NEXT_BACK_DATE;
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

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getCONTEXT()
        {
            return CONTEXT;
        }

        public void setCONTEXT(String CONTEXT)
        {
            this.CONTEXT = CONTEXT;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public int getEXIST()
        {
            return EXIST;
        }

        public void setEXIST(int EXIST)
        {
            this.EXIST = EXIST;
        }

        public Object getDELETE_DATE()
        {
            return DELETE_DATE;
        }

        public void setDELETE_DATE(Object DELETE_DATE)
        {
            this.DELETE_DATE = DELETE_DATE;
        }

        public Object getREMOVER()
        {
            return REMOVER;
        }

        public void setREMOVER(Object REMOVER)
        {
            this.REMOVER = REMOVER;
        }

        public int getREMIND_TIMES()
        {
            return REMIND_TIMES;
        }

        public void setREMIND_TIMES(int REMIND_TIMES)
        {
            this.REMIND_TIMES = REMIND_TIMES;
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

        public int getPASS_ALONG_TIMES()
        {
            return PASS_ALONG_TIMES;
        }

        public void setPASS_ALONG_TIMES(int PASS_ALONG_TIMES)
        {
            this.PASS_ALONG_TIMES = PASS_ALONG_TIMES;
        }

        public List<FileBean> getFile()
        {
            return file;
        }

        public void setFile(List<FileBean> file)
        {
            this.file = file;
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

        public static class SENDDATEBean
        {
            /**
             * date : 10
             * day : 5
             * hours : 0
             * minutes : 0
             * month : 7
             * nanos : 0
             * seconds : 0
             * time : 1533830400000
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
             * hours : 15
             * minutes : 26
             * month : 7
             * nanos : 0
             * seconds : 50
             * time : 1533886010000
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
