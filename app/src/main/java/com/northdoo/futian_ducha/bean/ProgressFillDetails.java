package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/21.
 */

public class ProgressFillDetails
{

    /**
     * result : success
     * msg : successful
     * map : {"MAIN_WORK":"测试","CONTENT":"测试","GOAL":"测试目标要求","IS_FROMUPPER":0,"SUPERVISION_TYPE_NAME":"其他专项工作","FEEDBACK_TYPE":1,"WRITEPLAN_DATE":{"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118},"CONFIRM_DATE":{"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118},"FEEDBACK_NUMBER":4,"STATUS":1,"READ":1,"DENY_REASON":null,"PLAN_DENY_REASON":null,"CHARGE_LEADER_NAME":"高圣元","LEADING_UNIT_NAME":"区委区政府办公室","WRITEPLAN_STATUS":0,"COUNITNAMES":null,"pds":[{"PLANDETAIL_GUID":"{09927247-E043-443C-9FF5-5ECA51C7BEC6}","PLANDETAIL":"第一季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":1,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{58BAA8A6-6A3A-4260-A923-F9B265CDB3A1}","PLANDETAIL":"第二季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":2,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{B09E61D2-5CE5-4965-887D-81AE0D08318F}","PLANDETAIL":"第三季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":3,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{96678B89-1E18-4D9E-872E-BDF06EE1DF54}","PLANDETAIL":"第四季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":4,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null}],"subGuid":"{B0851418-3F28-435B-830D-DA1CC08D212B}","file":[]}
     */

    private String result;
    private String msg;
    private MapBean map;

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
         * MAIN_WORK : 测试
         * CONTENT : 测试
         * GOAL : 测试目标要求
         * IS_FROMUPPER : 0
         * SUPERVISION_TYPE_NAME : 其他专项工作
         * FEEDBACK_TYPE : 1
         * WRITEPLAN_DATE : {"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118}
         * CONFIRM_DATE : {"date":3,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533225600000,"timezoneOffset":-480,"year":118}
         * FEEDBACK_NUMBER : 4
         * STATUS : 1
         * READ : 1
         * DENY_REASON : null
         * PLAN_DENY_REASON : null
         * CHARGE_LEADER_NAME : 高圣元
         * LEADING_UNIT_NAME : 区委区政府办公室
         * WRITEPLAN_STATUS : 0
         * COUNITNAMES : null
         * pds : [{"PLANDETAIL_GUID":"{09927247-E043-443C-9FF5-5ECA51C7BEC6}","PLANDETAIL":"第一季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":1,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{58BAA8A6-6A3A-4260-A923-F9B265CDB3A1}","PLANDETAIL":"第二季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":2,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{B09E61D2-5CE5-4965-887D-81AE0D08318F}","PLANDETAIL":"第三季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":3,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null},{"PLANDETAIL_GUID":"{96678B89-1E18-4D9E-872E-BDF06EE1DF54}","PLANDETAIL":"第四季度：","SUB_GUID":"{B0851418-3F28-435B-830D-DA1CC08D212B}","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118},"INDEX0":4,"ISDELETE":0,"AUTHOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","AUTHOR_NAME":"督查测试","AUTHOR_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","AUTHOR_PHONE":null}]
         * subGuid : {B0851418-3F28-435B-830D-DA1CC08D212B}
         * file : []
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
        private int STATUS;
        private int READ;
        private Object DENY_REASON;
        private Object PLAN_DENY_REASON;
        private String CHARGE_LEADER_NAME;
        private String LEADING_UNIT_NAME;
        private int WRITEPLAN_STATUS;
        private String COUNITNAMES;
        private String subGuid;
        private List<PdsBean> pds;
        private List<String> planDetails;
        private List<FileBean>  file;

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

        public int getSTATUS()
        {
            return STATUS;
        }

        public void setSTATUS(int STATUS)
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

        public String getSubGuid()
        {
            return subGuid;
        }

        public void setSubGuid(String subGuid)
        {
            this.subGuid = subGuid;
        }

        public List<PdsBean> getPds()
        {
            return pds;
        }

        public List<String> getPlanDetails()
        {
            return planDetails;
        }

        public void setPlanDetails(List<String> planDetails)
        {
            this.planDetails = planDetails;
        }

        public void setPds(List<PdsBean> pds)
        {
            this.pds = pds;
        }

        public List<FileBean>  getFile()
        {
            return file;
        }

        public void setFile(List<FileBean>  file)
        {
            this.file = file;
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

        public static class PdsBean
        {
            /**
             * PLANDETAIL_GUID : {09927247-E043-443C-9FF5-5ECA51C7BEC6}
             * PLANDETAIL : 第一季度：
             * SUB_GUID : {B0851418-3F28-435B-830D-DA1CC08D212B}
             * CREATE_DATE : {"date":6,"day":1,"hours":16,"minutes":14,"month":7,"nanos":0,"seconds":17,"time":1533543257000,"timezoneOffset":-480,"year":118}
             * INDEX0 : 1
             * ISDELETE : 0
             * AUTHOR_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
             * AUTHOR_NAME : 督查测试
             * AUTHOR_DEPARTMENT_GUID : {56C750D0-65BD-B34C-834A-F763D825E987}
             * AUTHOR_PHONE : null
             */
            public PdsBean(String PLANDETAIL, String PLANDETAIL_GUID)
            {
                this.PLANDETAIL_GUID = PLANDETAIL_GUID;
                this.PLANDETAIL = PLANDETAIL;
            }

            private String PLANDETAIL_GUID;
            private String PLANDETAIL;
            private String SUB_GUID;
            private CREATEDATEBean CREATE_DATE;
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

            public CREATEDATEBean getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
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

            public static class CREATEDATEBean
            {
                /**
                 * date : 6
                 * day : 1
                 * hours : 16
                 * minutes : 14
                 * month : 7
                 * nanos : 0
                 * seconds : 17
                 * time : 1533543257000
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
