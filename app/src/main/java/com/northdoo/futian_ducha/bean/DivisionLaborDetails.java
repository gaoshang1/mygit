package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2018/8/21.
 */

public class DivisionLaborDetails
{

    /**
     * map : {"MAIN_WORK":"测试测试测试","CONTENT":"测试测试测试是","GOAL":"测试目标要求","IS_FROMUPPER":0,"SUPERVISION_TYPE_NAME":"市政府常务会议","FEEDBACK_TYPE":2,"WRITEPLAN_DATE":{"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118},"CONFIRM_DATE":{"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118},"FEEDBACK_NUMBER":1,"STATUS":"已确认","READ":1,"DENY_REASON":null,"PLAN_DENY_REASON":null,"CHARGE_LEADER_NAME":"黄伟","LEADING_UNIT_NAME":"区委区政府办公室","WRITEPLAN_STATUS":0,"COUNITNAMES":"组织部（编办）","dutyType":"牵头单位","guid":"{77A93A0C-746F-420E-9AEB-213D1482B96A}"}
     */

    private MapBean map;

    public MapBean getMap()
    {
        return map;
    }

    public void setMap(MapBean map)
    {
        this.map = map;
    }

    public static class MapBean
    {
        /**
         * MAIN_WORK : 测试测试测试
         * CONTENT : 测试测试测试是
         * GOAL : 测试目标要求
         * IS_FROMUPPER : 0
         * SUPERVISION_TYPE_NAME : 市政府常务会议
         * FEEDBACK_TYPE : 2
         * WRITEPLAN_DATE : {"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118}
         * CONFIRM_DATE : {"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118}
         * FEEDBACK_NUMBER : 1
         * STATUS : 已确认
         * READ : 1
         * DENY_REASON : null
         * PLAN_DENY_REASON : null
         * CHARGE_LEADER_NAME : 黄伟
         * LEADING_UNIT_NAME : 区委区政府办公室
         * WRITEPLAN_STATUS : 0
         * COUNITNAMES : 组织部（编办）
         * dutyType : 牵头单位
         * guid : {77A93A0C-746F-420E-9AEB-213D1482B96A}
         */

        private String MAIN_WORK;
        private String CONTENT;
        private String GOAL;
        private int IS_FROMUPPER;
        private String SUPERVISION_TYPE_NAME;
        private int FEEDBACK_TYPE;
        private WRITEPLANDATEBean WRITEPLAN_DATE;
        private CONFIRMDATEBean CONFIRM_DATE;
        private int FEEDBACK_NUMBER;
        private String STATUS;
        private int READ;
        private Object DENY_REASON;
        private Object PLAN_DENY_REASON;
        private String CHARGE_LEADER_NAME;
        private String LEADING_UNIT_NAME;
        private int WRITEPLAN_STATUS;
        private String COUNITNAMES;
        private String dutyType;
        private String guid;

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

        public String getGOAL()
        {
            return GOAL;
        }

        public void setGOAL(String GOAL)
        {
            this.GOAL = GOAL;
        }

        public int getIS_FROMUPPER()
        {
            return IS_FROMUPPER;
        }

        public void setIS_FROMUPPER(int IS_FROMUPPER)
        {
            this.IS_FROMUPPER = IS_FROMUPPER;
        }

        public String getSUPERVISION_TYPE_NAME()
        {
            return SUPERVISION_TYPE_NAME;
        }

        public void setSUPERVISION_TYPE_NAME(String SUPERVISION_TYPE_NAME)
        {
            this.SUPERVISION_TYPE_NAME = SUPERVISION_TYPE_NAME;
        }

        public int getFEEDBACK_TYPE()
        {
            return FEEDBACK_TYPE;
        }

        public void setFEEDBACK_TYPE(int FEEDBACK_TYPE)
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

        public String getSTATUS()
        {
            return STATUS;
        }

        public void setSTATUS(String STATUS)
        {
            this.STATUS = STATUS;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public Object getDENY_REASON()
        {
            return DENY_REASON;
        }

        public void setDENY_REASON(Object DENY_REASON)
        {
            this.DENY_REASON = DENY_REASON;
        }

        public Object getPLAN_DENY_REASON()
        {
            return PLAN_DENY_REASON;
        }

        public void setPLAN_DENY_REASON(Object PLAN_DENY_REASON)
        {
            this.PLAN_DENY_REASON = PLAN_DENY_REASON;
        }

        public String getCHARGE_LEADER_NAME()
        {
            return CHARGE_LEADER_NAME;
        }

        public void setCHARGE_LEADER_NAME(String CHARGE_LEADER_NAME)
        {
            this.CHARGE_LEADER_NAME = CHARGE_LEADER_NAME;
        }

        public String getLEADING_UNIT_NAME()
        {
            return LEADING_UNIT_NAME;
        }

        public void setLEADING_UNIT_NAME(String LEADING_UNIT_NAME)
        {
            this.LEADING_UNIT_NAME = LEADING_UNIT_NAME;
        }

        public int getWRITEPLAN_STATUS()
        {
            return WRITEPLAN_STATUS;
        }

        public void setWRITEPLAN_STATUS(int WRITEPLAN_STATUS)
        {
            this.WRITEPLAN_STATUS = WRITEPLAN_STATUS;
        }

        public String getCOUNITNAMES()
        {
            return COUNITNAMES;
        }

        public void setCOUNITNAMES(String COUNITNAMES)
        {
            this.COUNITNAMES = COUNITNAMES;
        }

        public String getDutyType()
        {
            return dutyType;
        }

        public void setDutyType(String dutyType)
        {
            this.dutyType = dutyType;
        }

        public String getGuid()
        {
            return guid;
        }

        public void setGuid(String guid)
        {
            this.guid = guid;
        }

        public static class WRITEPLANDATEBean
        {
            /**
             * date : 31
             * day : 2
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532966400000
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
             * date : 31
             * day : 2
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532966400000
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
