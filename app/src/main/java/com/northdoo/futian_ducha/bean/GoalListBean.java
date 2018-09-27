package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/6.
 */

public class GoalListBean
{
    /**
     * GOAL_GUID : {07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}
     * GOAL : 测试目标要求
     * CREATE_DATE : {"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118}
     * MAIN_GUID : {DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}
     * GOAL_INDEX : 0
     * DEL_STATUS : 0
     * sub : [{"SUB_GUID":"{85AFC417-B83D-4B5E-BA11-B5666DC15ACD}","CHARGE_LEADER_GUID":"{AC1D3509-FFFF-FFFF-D3EA-895300000046}","CHARGE_LEADER_NAME":"邝肖华","LEADING_UNIT_GUID":"{10FFBD7B-FBBF-BE4E-8702-1A09723A5B5E}","LEADING_UNIT_NAME":"发展和改革局","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118},"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","STATUS":1,"READ":1,"MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":46,"time":1532592346000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"WRITEPLAN_STATUS":"已填写","DENY_REASON":null,"PLAN_DENY_REASON":null,"IDLE_CHECK_NUMBER":null,"REJECT_CHECK_NUMBER":null,"REMIND_TIMES2":1,"sub":[{"CO_GUID":"{FC5AF5E8-77EE-41DA-9C1F-4B37B93EC8E6}","STATUS":1,"CO_UNIT_NAME":"财政局","CO_UNIT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{85AFC417-B83D-4B5E-BA11-B5666DC15ACD}","READ":1,"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":6,"month":6,"nanos":0,"seconds":12,"time":1532592372000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"DENY_REASON":null}],"pds":[{"CO_GUID":"{FC5AF5E8-77EE-41DA-9C1F-4B37B93EC8E6}","STATUS":1,"CO_UNIT_NAME":"财政局","CO_UNIT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{85AFC417-B83D-4B5E-BA11-B5666DC15ACD}","READ":1,"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":6,"month":6,"nanos":0,"seconds":12,"time":1532592372000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"DENY_REASON":null}]},{"SUB_GUID":"{651C2B98-F153-45E0-AB1F-8416269BE46A}","CHARGE_LEADER_GUID":"{AC1D3317-FFFF-FFFF-ECC7-6D2C00000003}","CHARGE_LEADER_NAME":"高圣元","LEADING_UNIT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","LEADING_UNIT_NAME":"信访局（应急办）","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":7,"month":6,"nanos":0,"seconds":50,"time":1532592470000,"timezoneOffset":-480,"year":118},"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","STATUS":1,"READ":0,"MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":7,"month":6,"nanos":0,"seconds":57,"time":1532592477000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"WRITEPLAN_STATUS":"填写中","DENY_REASON":null,"PLAN_DENY_REASON":null,"IDLE_CHECK_NUMBER":null,"REJECT_CHECK_NUMBER":null,"REMIND_TIMES2":1,"sub":[],"pds":[]}]
     */

    private String GOAL_GUID;
    private String GOAL;
    private CREATEDATEBeanX CREATE_DATE;
    private String MAIN_GUID;
    private int GOAL_INDEX;
    private int DEL_STATUS;
    private List<SubBeanX> sub;

    public String getGOAL_GUID()
    {
        return GOAL_GUID;
    }

    public void setGOAL_GUID(String GOAL_GUID)
    {
        this.GOAL_GUID = GOAL_GUID;
    }

    public String getGOAL()
    {
        return GOAL;
    }

    public void setGOAL(String GOAL)
    {
        this.GOAL = GOAL;
    }

    public CREATEDATEBeanX getCREATE_DATE()
    {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(CREATEDATEBeanX CREATE_DATE)
    {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getMAIN_GUID()
    {
        return MAIN_GUID;
    }

    public void setMAIN_GUID(String MAIN_GUID)
    {
        this.MAIN_GUID = MAIN_GUID;
    }

    public int getGOAL_INDEX()
    {
        return GOAL_INDEX;
    }

    public void setGOAL_INDEX(int GOAL_INDEX)
    {
        this.GOAL_INDEX = GOAL_INDEX;
    }

    public int getDEL_STATUS()
    {
        return DEL_STATUS;
    }

    public void setDEL_STATUS(int DEL_STATUS)
    {
        this.DEL_STATUS = DEL_STATUS;
    }

    public List<SubBeanX> getSub()
    {
        return sub;
    }

    public void setSub(List<SubBeanX> sub)
    {
        this.sub = sub;
    }

    public static class CREATEDATEBeanX
    {
        /**
         * date : 26
         * day : 4
         * hours : 16
         * minutes : 5
         * month : 6
         * nanos : 0
         * seconds : 36
         * time : 1532592336000
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

    public static class SubBeanX
    {
        /**
         * SUB_GUID : {85AFC417-B83D-4B5E-BA11-B5666DC15ACD}
         * CHARGE_LEADER_GUID : {AC1D3509-FFFF-FFFF-D3EA-895300000046}
         * CHARGE_LEADER_NAME : 邝肖华
         * LEADING_UNIT_GUID : {10FFBD7B-FBBF-BE4E-8702-1A09723A5B5E}
         * LEADING_UNIT_NAME : 发展和改革局
         * CREATE_DATE : {"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118}
         * GOAL_GUID : {07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}
         * STATUS : 1
         * READ : 1
         * MAIN_GUID : {DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}
         * DEL_STATUS : 0
         * CONFIRM_DATE : {"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":46,"time":1532592346000,"timezoneOffset":-480,"year":118}
         * REMIND_TIMES : 0
         * DC_READ : 1
         * WRITEPLAN_STATUS : 已填写
         * DENY_REASON : null
         * PLAN_DENY_REASON : null
         * IDLE_CHECK_NUMBER : null
         * REJECT_CHECK_NUMBER : null
         * REMIND_TIMES2 : 1
         * sub : [{"CO_GUID":"{FC5AF5E8-77EE-41DA-9C1F-4B37B93EC8E6}","STATUS":1,"CO_UNIT_NAME":"财政局","CO_UNIT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{85AFC417-B83D-4B5E-BA11-B5666DC15ACD}","READ":1,"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":6,"month":6,"nanos":0,"seconds":12,"time":1532592372000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"DENY_REASON":null}]
         * pds : [{"CO_GUID":"{FC5AF5E8-77EE-41DA-9C1F-4B37B93EC8E6}","STATUS":1,"CO_UNIT_NAME":"财政局","CO_UNIT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","CREATE_DATE":{"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118},"SUB_GUID":"{85AFC417-B83D-4B5E-BA11-B5666DC15ACD}","READ":1,"GOAL_GUID":"{07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}","MAIN_GUID":"{DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}","DEL_STATUS":0,"CONFIRM_DATE":{"date":26,"day":4,"hours":16,"minutes":6,"month":6,"nanos":0,"seconds":12,"time":1532592372000,"timezoneOffset":-480,"year":118},"REMIND_TIMES":0,"DC_READ":1,"DENY_REASON":null}]
         */

        private String SUB_GUID;
        private String CHARGE_LEADER_GUID;
        private String CHARGE_LEADER_NAME;
        private String LEADING_UNIT_GUID;
        private String LEADING_UNIT_NAME;
        private CREATEDATEBeanXX CREATE_DATE;
        private String GOAL_GUID;
        private String STATUS;
        private int READ;
        private String MAIN_GUID;
        private int DEL_STATUS;
        private CONFIRMDATEBeanX CONFIRM_DATE;
        private int REMIND_TIMES;
        private int DC_READ;
        private String WRITEPLAN_STATUS;
        private Object DENY_REASON;
        private Object PLAN_DENY_REASON;
        private Object IDLE_CHECK_NUMBER;
        private Object REJECT_CHECK_NUMBER;
        private int REMIND_TIMES2;
        private List<SubBean> sub;
        private List<PdsBean> pds;

        public String getSUB_GUID()
        {
            return SUB_GUID;
        }

        public void setSUB_GUID(String SUB_GUID)
        {
            this.SUB_GUID = SUB_GUID;
        }

        public String getCHARGE_LEADER_GUID()
        {
            return CHARGE_LEADER_GUID;
        }

        public void setCHARGE_LEADER_GUID(String CHARGE_LEADER_GUID)
        {
            this.CHARGE_LEADER_GUID = CHARGE_LEADER_GUID;
        }

        public String getCHARGE_LEADER_NAME()
        {
            return CHARGE_LEADER_NAME;
        }

        public void setCHARGE_LEADER_NAME(String CHARGE_LEADER_NAME)
        {
            this.CHARGE_LEADER_NAME = CHARGE_LEADER_NAME;
        }

        public String getLEADING_UNIT_GUID()
        {
            return LEADING_UNIT_GUID;
        }

        public void setLEADING_UNIT_GUID(String LEADING_UNIT_GUID)
        {
            this.LEADING_UNIT_GUID = LEADING_UNIT_GUID;
        }

        public String getLEADING_UNIT_NAME()
        {
            return LEADING_UNIT_NAME;
        }

        public void setLEADING_UNIT_NAME(String LEADING_UNIT_NAME)
        {
            this.LEADING_UNIT_NAME = LEADING_UNIT_NAME;
        }

        public CREATEDATEBeanXX getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBeanXX CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getGOAL_GUID()
        {
            return GOAL_GUID;
        }

        public void setGOAL_GUID(String GOAL_GUID)
        {
            this.GOAL_GUID = GOAL_GUID;
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

        public String getMAIN_GUID()
        {
            return MAIN_GUID;
        }

        public void setMAIN_GUID(String MAIN_GUID)
        {
            this.MAIN_GUID = MAIN_GUID;
        }

        public int getDEL_STATUS()
        {
            return DEL_STATUS;
        }

        public void setDEL_STATUS(int DEL_STATUS)
        {
            this.DEL_STATUS = DEL_STATUS;
        }

        public CONFIRMDATEBeanX getCONFIRM_DATE()
        {
            return CONFIRM_DATE;
        }

        public void setCONFIRM_DATE(CONFIRMDATEBeanX CONFIRM_DATE)
        {
            this.CONFIRM_DATE = CONFIRM_DATE;
        }

        public int getREMIND_TIMES()
        {
            return REMIND_TIMES;
        }

        public void setREMIND_TIMES(int REMIND_TIMES)
        {
            this.REMIND_TIMES = REMIND_TIMES;
        }

        public int getDC_READ()
        {
            return DC_READ;
        }

        public void setDC_READ(int DC_READ)
        {
            this.DC_READ = DC_READ;
        }

        public String getWRITEPLAN_STATUS()
        {
            return WRITEPLAN_STATUS;
        }

        public void setWRITEPLAN_STATUS(String WRITEPLAN_STATUS)
        {
            this.WRITEPLAN_STATUS = WRITEPLAN_STATUS;
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

        public Object getIDLE_CHECK_NUMBER()
        {
            return IDLE_CHECK_NUMBER;
        }

        public void setIDLE_CHECK_NUMBER(Object IDLE_CHECK_NUMBER)
        {
            this.IDLE_CHECK_NUMBER = IDLE_CHECK_NUMBER;
        }

        public Object getREJECT_CHECK_NUMBER()
        {
            return REJECT_CHECK_NUMBER;
        }

        public void setREJECT_CHECK_NUMBER(Object REJECT_CHECK_NUMBER)
        {
            this.REJECT_CHECK_NUMBER = REJECT_CHECK_NUMBER;
        }

        public int getREMIND_TIMES2()
        {
            return REMIND_TIMES2;
        }

        public void setREMIND_TIMES2(int REMIND_TIMES2)
        {
            this.REMIND_TIMES2 = REMIND_TIMES2;
        }

        public List<SubBean> getSub()
        {
            return sub;
        }

        public void setSub(List<SubBean> sub)
        {
            this.sub = sub;
        }

        public List<PdsBean> getPds()
        {
            return pds;
        }

        public void setPds(List<PdsBean> pds)
        {
            this.pds = pds;
        }

        public static class CREATEDATEBeanXX
        {
            /**
             * date : 26
             * day : 4
             * hours : 16
             * minutes : 5
             * month : 6
             * nanos : 0
             * seconds : 36
             * time : 1532592336000
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

        public static class CONFIRMDATEBeanX
        {
            /**
             * date : 26
             * day : 4
             * hours : 16
             * minutes : 5
             * month : 6
             * nanos : 0
             * seconds : 46
             * time : 1532592346000
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

        public static class SubBean
        {
            /**
             * CO_GUID : {FC5AF5E8-77EE-41DA-9C1F-4B37B93EC8E6}
             * STATUS : 1
             * CO_UNIT_NAME : 财政局
             * CO_UNIT_GUID : {6901F467-5E33-1C41-B0AC-49DA332438C2}
             * CREATE_DATE : {"date":26,"day":4,"hours":16,"minutes":5,"month":6,"nanos":0,"seconds":36,"time":1532592336000,"timezoneOffset":-480,"year":118}
             * SUB_GUID : {85AFC417-B83D-4B5E-BA11-B5666DC15ACD}
             * READ : 1
             * GOAL_GUID : {07FEE5A7-76AB-4563-BCE0-06910DB4FB2F}
             * MAIN_GUID : {DB77EBE0-48C7-420B-A0AD-8E5CF30C438E}
             * DEL_STATUS : 0
             * CONFIRM_DATE : {"date":26,"day":4,"hours":16,"minutes":6,"month":6,"nanos":0,"seconds":12,"time":1532592372000,"timezoneOffset":-480,"year":118}
             * REMIND_TIMES : 0
             * DC_READ : 1
             * DENY_REASON : null
             */

            private String CO_GUID;
            private int STATUS;
            private String CO_UNIT_NAME;
            private String CO_UNIT_GUID;
            private CREATEDATEBeanXXX CREATE_DATE;
            private String SUB_GUID;
            private int READ;
            private String GOAL_GUID;
            private String MAIN_GUID;
            private int DEL_STATUS;
            private CONFIRMDATEBeanXX CONFIRM_DATE;
            private int REMIND_TIMES;
            private int DC_READ;
            private Object DENY_REASON;

            public String getCO_GUID()
            {
                return CO_GUID;
            }

            public void setCO_GUID(String CO_GUID)
            {
                this.CO_GUID = CO_GUID;
            }

            public int getSTATUS()
            {
                return STATUS;
            }

            public void setSTATUS(int STATUS)
            {
                this.STATUS = STATUS;
            }

            public String getCO_UNIT_NAME()
            {
                return CO_UNIT_NAME;
            }

            public void setCO_UNIT_NAME(String CO_UNIT_NAME)
            {
                this.CO_UNIT_NAME = CO_UNIT_NAME;
            }

            public String getCO_UNIT_GUID()
            {
                return CO_UNIT_GUID;
            }

            public void setCO_UNIT_GUID(String CO_UNIT_GUID)
            {
                this.CO_UNIT_GUID = CO_UNIT_GUID;
            }

            public CREATEDATEBeanXXX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBeanXXX CREATE_DATE)
            {
                this.CREATE_DATE = CREATE_DATE;
            }

            public String getSUB_GUID()
            {
                return SUB_GUID;
            }

            public void setSUB_GUID(String SUB_GUID)
            {
                this.SUB_GUID = SUB_GUID;
            }

            public int getREAD()
            {
                return READ;
            }

            public void setREAD(int READ)
            {
                this.READ = READ;
            }

            public String getGOAL_GUID()
            {
                return GOAL_GUID;
            }

            public void setGOAL_GUID(String GOAL_GUID)
            {
                this.GOAL_GUID = GOAL_GUID;
            }

            public String getMAIN_GUID()
            {
                return MAIN_GUID;
            }

            public void setMAIN_GUID(String MAIN_GUID)
            {
                this.MAIN_GUID = MAIN_GUID;
            }

            public int getDEL_STATUS()
            {
                return DEL_STATUS;
            }

            public void setDEL_STATUS(int DEL_STATUS)
            {
                this.DEL_STATUS = DEL_STATUS;
            }

            public CONFIRMDATEBeanXX getCONFIRM_DATE()
            {
                return CONFIRM_DATE;
            }

            public void setCONFIRM_DATE(CONFIRMDATEBeanXX CONFIRM_DATE)
            {
                this.CONFIRM_DATE = CONFIRM_DATE;
            }

            public int getREMIND_TIMES()
            {
                return REMIND_TIMES;
            }

            public void setREMIND_TIMES(int REMIND_TIMES)
            {
                this.REMIND_TIMES = REMIND_TIMES;
            }

            public int getDC_READ()
            {
                return DC_READ;
            }

            public void setDC_READ(int DC_READ)
            {
                this.DC_READ = DC_READ;
            }

            public Object getDENY_REASON()
            {
                return DENY_REASON;
            }

            public void setDENY_REASON(Object DENY_REASON)
            {
                this.DENY_REASON = DENY_REASON;
            }

            public static class CREATEDATEBeanXXX
            {
                /**
                 * date : 26
                 * day : 4
                 * hours : 16
                 * minutes : 5
                 * month : 6
                 * nanos : 0
                 * seconds : 36
                 * time : 1532592336000
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

            public static class CONFIRMDATEBeanXX
            {
                /**
                 * date : 26
                 * day : 4
                 * hours : 16
                 * minutes : 6
                 * month : 6
                 * nanos : 0
                 * seconds : 12
                 * time : 1532592372000
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

        public static class PdsBean
        {
            /**
             * PLANDETAIL_GUID : {FD546ED3-4DE6-46CD-BCF3-25B28C8E185A}
             * PLANDETAIL : 第一季度：
             * SUB_GUID : {C7E3B704-8514-4906-AFF9-8572D703830B}
             * CREATE_DATE : {"date":3,"day":5,"hours":11,"minutes":35,"month":7,"nanos":0,"seconds":8,"time":1533267308000,"timezoneOffset":-480,"year":118}
             * INDEX0 : 1
             * ISDELETE : 0
             * AUTHOR_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
             * AUTHOR_NAME : 督查测试
             * AUTHOR_DEPARTMENT_GUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
             * AUTHOR_PHONE : null
             */

            private String PLANDETAIL_GUID;
            private String PLANDETAIL;
            private String SUB_GUID;
            private GoalListBean.SubBeanX.PdsBean.CREATEDATEBeanXXX CREATE_DATE;
            private int INDEX0;
            private int ISDELETE;
            private String AUTHOR_GUID;
            private String AUTHOR_NAME;
            private String AUTHOR_DEPARTMENT_GUID;
            private Object AUTHOR_PHONE;

            public String getPLANDETAIL_GUID()
            {
                return PLANDETAIL_GUID;
            }

            public void setPLANDETAIL_GUID(String PLANDETAIL_GUID)
            {
                this.PLANDETAIL_GUID = PLANDETAIL_GUID;
            }

            public String getPLANDETAIL()
            {
                return PLANDETAIL;
            }

            public void setPLANDETAIL(String PLANDETAIL)
            {
                this.PLANDETAIL = PLANDETAIL;
            }

            public String getSUB_GUID()
            {
                return SUB_GUID;
            }

            public void setSUB_GUID(String SUB_GUID)
            {
                this.SUB_GUID = SUB_GUID;
            }

            public GoalListBean.SubBeanX.PdsBean.CREATEDATEBeanXXX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(GoalListBean.SubBeanX.PdsBean.CREATEDATEBeanXXX CREATE_DATE)
            {
                this.CREATE_DATE = CREATE_DATE;
            }

            public int getINDEX0()
            {
                return INDEX0;
            }

            public void setINDEX0(int INDEX0)
            {
                this.INDEX0 = INDEX0;
            }

            public int getISDELETE()
            {
                return ISDELETE;
            }

            public void setISDELETE(int ISDELETE)
            {
                this.ISDELETE = ISDELETE;
            }

            public String getAUTHOR_GUID()
            {
                return AUTHOR_GUID;
            }

            public void setAUTHOR_GUID(String AUTHOR_GUID)
            {
                this.AUTHOR_GUID = AUTHOR_GUID;
            }

            public String getAUTHOR_NAME()
            {
                return AUTHOR_NAME;
            }

            public void setAUTHOR_NAME(String AUTHOR_NAME)
            {
                this.AUTHOR_NAME = AUTHOR_NAME;
            }

            public String getAUTHOR_DEPARTMENT_GUID()
            {
                return AUTHOR_DEPARTMENT_GUID;
            }

            public void setAUTHOR_DEPARTMENT_GUID(String AUTHOR_DEPARTMENT_GUID)
            {
                this.AUTHOR_DEPARTMENT_GUID = AUTHOR_DEPARTMENT_GUID;
            }

            public Object getAUTHOR_PHONE()
            {
                return AUTHOR_PHONE;
            }

            public void setAUTHOR_PHONE(Object AUTHOR_PHONE)
            {
                this.AUTHOR_PHONE = AUTHOR_PHONE;
            }

            public static class CREATEDATEBeanXXX
            {
                /**
                 * date : 3
                 * day : 5
                 * hours : 11
                 * minutes : 35
                 * month : 7
                 * nanos : 0
                 * seconds : 8
                 * time : 1533267308000
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
}