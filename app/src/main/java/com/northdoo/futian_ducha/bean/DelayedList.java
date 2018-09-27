package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/30.
 */

public class DelayedList
{

    /**
     * list : [{"DELAY_GUID":"{19E6F7D4-C2A7-4B2B-BCFA-AB90C920ECB3}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","REASON":"test","DELAY_DATE":{"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":26,"day":4,"hours":17,"minutes":0,"month":6,"nanos":0,"seconds":37,"time":1532595637000,"timezoneOffset":-480,"year":118},"SCHEDULED_END_DATE":null,"RESULT":1,"RESULT_REASON":"测试aa","RESULT_DATE":{"date":9,"day":4,"hours":14,"minutes":40,"month":7,"nanos":0,"seconds":8,"time":1533796808000,"timezoneOffset":-480,"year":118},"APPMAN":"督查测试","READ":1,"DEPARTMENT_GUID":"{F4E02ABC-9029-C548-B079-DD8E9BE362C4}","SCHEDULED_BACK_DATE":{"date":28,"day":6,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532707200000,"timezoneOffset":-480,"year":118},"SUPERVISION_GUID":"{6244F153-3411-4D13-A189-3E623669521E}","APPMAN_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","DEPARTMENT_NAME":"区委区政府办公室"}]
     * spe : {"ITEM_TITLE":"test2"}
     * result : success
     * msg : successful
     */

    private SpeBean spe;
    private String result;
    private String msg;
    private List<ListBean> list;

    public SpeBean getSpe()
    {
        return spe;
    }

    public void setSpe(SpeBean spe)
    {
        this.spe = spe;
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

    public List<ListBean> getList()
    {
        return list;
    }

    public void setList(List<ListBean> list)
    {
        this.list = list;
    }

    public static class SpeBean
    {
        /**
         * ITEM_TITLE : test2
         */

        private String ITEM_TITLE;

        public String getITEM_TITLE()
        {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE)
        {
            this.ITEM_TITLE = ITEM_TITLE;
        }
    }

    public static class ListBean
    {
        /**
         * DELAY_GUID : {19E6F7D4-C2A7-4B2B-BCFA-AB90C920ECB3}
         * SPECIFIC_GUID : {0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}
         * REASON : test
         * DELAY_DATE : {"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118}
         * CREATE_DATE : {"date":26,"day":4,"hours":17,"minutes":0,"month":6,"nanos":0,"seconds":37,"time":1532595637000,"timezoneOffset":-480,"year":118}
         * SCHEDULED_END_DATE : null
         * RESULT : 1
         * RESULT_REASON : 测试aa
         * RESULT_DATE : {"date":9,"day":4,"hours":14,"minutes":40,"month":7,"nanos":0,"seconds":8,"time":1533796808000,"timezoneOffset":-480,"year":118}
         * APPMAN : 督查测试
         * READ : 1
         * DEPARTMENT_GUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
         * SCHEDULED_BACK_DATE : {"date":28,"day":6,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532707200000,"timezoneOffset":-480,"year":118}
         * SUPERVISION_GUID : {6244F153-3411-4D13-A189-3E623669521E}
         * APPMAN_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * DEPARTMENT_NAME : 区委区政府办公室
         */
        private String ITEM_TITLE;
        private String DELAY_GUID;
        private String SPECIFIC_GUID;
        private String REASON;
        private DELAYDATEBean DELAY_DATE;
        private CREATEDATEBean CREATE_DATE;
        private Object SCHEDULED_END_DATE;
        private int RESULT;
        private String RESULT_REASON;
        private RESULTDATEBean RESULT_DATE;
        private String APPMAN;
        private int READ;
        private String DEPARTMENT_GUID;
        private SCHEDULEDBACKDATEBean SCHEDULED_BACK_DATE;
        private String SUPERVISION_GUID;
        private String APPMAN_GUID;
        private String DEPARTMENT_NAME;

        public String getITEM_TITLE()
        {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE)
        {
            this.ITEM_TITLE = ITEM_TITLE;
        }

        public String getDELAY_GUID()
        {
            return DELAY_GUID;
        }

        public void setDELAY_GUID(String DELAY_GUID)
        {
            this.DELAY_GUID = DELAY_GUID;
        }

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public String getREASON()
        {
            return REASON;
        }

        public void setREASON(String REASON)
        {
            this.REASON = REASON;
        }

        public DELAYDATEBean getDELAY_DATE()
        {
            return DELAY_DATE;
        }

        public void setDELAY_DATE(DELAYDATEBean DELAY_DATE)
        {
            this.DELAY_DATE = DELAY_DATE;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public Object getSCHEDULED_END_DATE()
        {
            return SCHEDULED_END_DATE;
        }

        public void setSCHEDULED_END_DATE(Object SCHEDULED_END_DATE)
        {
            this.SCHEDULED_END_DATE = SCHEDULED_END_DATE;
        }

        public int getRESULT()
        {
            return RESULT;
        }

        public void setRESULT(int RESULT)
        {
            this.RESULT = RESULT;
        }

        public String getRESULT_REASON()
        {
            return RESULT_REASON;
        }

        public void setRESULT_REASON(String RESULT_REASON)
        {
            this.RESULT_REASON = RESULT_REASON;
        }

        public RESULTDATEBean getRESULT_DATE()
        {
            return RESULT_DATE;
        }

        public void setRESULT_DATE(RESULTDATEBean RESULT_DATE)
        {
            this.RESULT_DATE = RESULT_DATE;
        }

        public String getAPPMAN()
        {
            return APPMAN;
        }

        public void setAPPMAN(String APPMAN)
        {
            this.APPMAN = APPMAN;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public String getDEPARTMENT_GUID()
        {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
        {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public SCHEDULEDBACKDATEBean getSCHEDULED_BACK_DATE()
        {
            return SCHEDULED_BACK_DATE;
        }

        public void setSCHEDULED_BACK_DATE(SCHEDULEDBACKDATEBean SCHEDULED_BACK_DATE)
        {
            this.SCHEDULED_BACK_DATE = SCHEDULED_BACK_DATE;
        }

        public String getSUPERVISION_GUID()
        {
            return SUPERVISION_GUID;
        }

        public void setSUPERVISION_GUID(String SUPERVISION_GUID)
        {
            this.SUPERVISION_GUID = SUPERVISION_GUID;
        }

        public String getAPPMAN_GUID()
        {
            return APPMAN_GUID;
        }

        public void setAPPMAN_GUID(String APPMAN_GUID)
        {
            this.APPMAN_GUID = APPMAN_GUID;
        }

        public String getDEPARTMENT_NAME()
        {
            return DEPARTMENT_NAME;
        }

        public void setDEPARTMENT_NAME(String DEPARTMENT_NAME)
        {
            this.DEPARTMENT_NAME = DEPARTMENT_NAME;
        }

        public static class DELAYDATEBean
        {
            /**
             * date : 1
             * day : 6
             * hours : 0
             * minutes : 0
             * month : 8
             * nanos : 0
             * seconds : 0
             * time : 1535731200000
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
             * date : 26
             * day : 4
             * hours : 17
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 37
             * time : 1532595637000
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

        public static class RESULTDATEBean
        {
            /**
             * date : 9
             * day : 4
             * hours : 14
             * minutes : 40
             * month : 7
             * nanos : 0
             * seconds : 8
             * time : 1533796808000
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

        public static class SCHEDULEDBACKDATEBean
        {
            /**
             * date : 28
             * day : 6
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532707200000
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
