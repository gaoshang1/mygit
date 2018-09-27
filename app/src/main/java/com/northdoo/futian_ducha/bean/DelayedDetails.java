package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/24.
 */

public class DelayedDetails
{

    /**
     * map : {"DELAY_GUID":"{5C854329-C4E8-4124-AC3C-AE5CF7C2CE64}","DETPLAN_GUID":"{F761C6A9-F1F0-4FD1-B5DB-13548D39A775}","REASON":"test","RESULT":1,"RESULT_REASON":"测试aa","SCHEDULED_DATE":{"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118},"APPMAN":"督查测试","DELAY_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":9,"minutes":23,"month":7,"nanos":0,"seconds":2,"time":1533864182000,"timezoneOffset":-480,"year":118},"RESULT_DATE":{"date":10,"day":5,"hours":11,"minutes":10,"month":7,"nanos":0,"seconds":16,"time":1533870616000,"timezoneOffset":-480,"year":118},"DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","READ":0,"APPMAN_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}"}
     * file : []
     * result : success
     * msg : successful
     */

    private MapBean map;
    private String result;
    private String msg;
    private List<FileBean> file;

    public MapBean getMap()
    {
        return map;
    }

    public void setMap(MapBean map)
    {
        this.map = map;
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

    public List<FileBean> getFile()
    {
        return file;
    }

    public void setFile(List<FileBean> file)
    {
        this.file = file;
    }

    public static class MapBean
    {
        /**
         * DELAY_GUID : {5C854329-C4E8-4124-AC3C-AE5CF7C2CE64}
         * DETPLAN_GUID : {F761C6A9-F1F0-4FD1-B5DB-13548D39A775}
         * REASON : test
         * RESULT : 1
         * RESULT_REASON : 测试aa
         * SCHEDULED_DATE : {"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118}
         * APPMAN : 督查测试
         * DELAY_DATE : {"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118}
         * CREATE_DATE : {"date":10,"day":5,"hours":9,"minutes":23,"month":7,"nanos":0,"seconds":2,"time":1533864182000,"timezoneOffset":-480,"year":118}
         * RESULT_DATE : {"date":10,"day":5,"hours":11,"minutes":10,"month":7,"nanos":0,"seconds":16,"time":1533870616000,"timezoneOffset":-480,"year":118}
         * DEPARTMENT_GUID : {56C750D0-65BD-B34C-834A-F763D825E987}
         * READ : 0
         * APPMAN_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * SPECIFIC_GUID : {0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}
         */

        private String DELAY_GUID;
        private String DETPLAN_GUID;
        private String REASON;
        private int RESULT;
        private String RESULT_REASON;
        private SCHEDULEDDATEBean SCHEDULED_DATE;
        private String APPMAN;
        private DELAYDATEBean DELAY_DATE;
        private CREATEDATEBean CREATE_DATE;
        private RESULTDATEBean RESULT_DATE;
        private String DEPARTMENT_GUID;
        private int READ;
        private String APPMAN_GUID;
        private String SPECIFIC_GUID;

        public String getDELAY_GUID()
        {
            return DELAY_GUID;
        }

        public void setDELAY_GUID(String DELAY_GUID)
        {
            this.DELAY_GUID = DELAY_GUID;
        }

        public String getDETPLAN_GUID()
        {
            return DETPLAN_GUID;
        }

        public void setDETPLAN_GUID(String DETPLAN_GUID)
        {
            this.DETPLAN_GUID = DETPLAN_GUID;
        }

        public String getREASON()
        {
            return REASON;
        }

        public void setREASON(String REASON)
        {
            this.REASON = REASON;
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

        public SCHEDULEDDATEBean getSCHEDULED_DATE()
        {
            return SCHEDULED_DATE;
        }

        public void setSCHEDULED_DATE(SCHEDULEDDATEBean SCHEDULED_DATE)
        {
            this.SCHEDULED_DATE = SCHEDULED_DATE;
        }

        public String getAPPMAN()
        {
            return APPMAN;
        }

        public void setAPPMAN(String APPMAN)
        {
            this.APPMAN = APPMAN;
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

        public RESULTDATEBean getRESULT_DATE()
        {
            return RESULT_DATE;
        }

        public void setRESULT_DATE(RESULTDATEBean RESULT_DATE)
        {
            this.RESULT_DATE = RESULT_DATE;
        }

        public String getDEPARTMENT_GUID()
        {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
        {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public String getAPPMAN_GUID()
        {
            return APPMAN_GUID;
        }

        public void setAPPMAN_GUID(String APPMAN_GUID)
        {
            this.APPMAN_GUID = APPMAN_GUID;
        }

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public static class SCHEDULEDDATEBean
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

        public static class DELAYDATEBean
        {
            /**
             * date : 30
             * day : 0
             * hours : 0
             * minutes : 0
             * month : 8
             * nanos : 0
             * seconds : 0
             * time : 1538236800000
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
             * hours : 9
             * minutes : 23
             * month : 7
             * nanos : 0
             * seconds : 2
             * time : 1533864182000
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
             * date : 10
             * day : 5
             * hours : 11
             * minutes : 10
             * month : 7
             * nanos : 0
             * seconds : 16
             * time : 1533870616000
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
