package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20.
 */

public class MenuBean
{

    private List<ListBean> list;

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
         * WORKFLOW_GUID : {09BFCB06-FFFF-FFFF-F7DF-40190000007B}
         * WORKFLOW_NAME : 福田区党政机关文件处理表
         * WORKFLOW_CLASSIFY : 1
         * WORKFLOW_AUTHOR : {08A8D6CF-76DD-B343-A5D5-5B2B6082425E}
         * WORKFLOW_CREATED : {"date":11,"day":4,"hours":2,"minutes":45,"month":2,"nanos":0,"seconds":27,"time":1078944327000,"timezoneOffset":-480,"year":104}
         * WORKFLOW_MODIFIED : {"date":17,"day":1,"hours":17,"minutes":44,"month":3,"nanos":0,"seconds":25,"time":1492422265000,"timezoneOffset":-480,"year":117}
         * WORKFLOW_EXPIRED : 5
         * EXPIRED_TYPE : 3
         * TASK_GUID : {09BFCB06-FFFF-FFFF-F7DF-40440000007C}
         * WORKFLOW_ISDEBUG : 0
         * WORKFLOW_ISHIDDEN : 0
         * DEFAULTFORM_GUID : {09BFCB06-FFFF-FFFF-F7DF-423AFFFFFF86}
         * DEFAULTSEARCHFORM_GUID : {09BFCB06-FFFF-FFFF-F7DF-4206FFFFFF85}
         * DEFAULTSIMPLESEARCHFORM_GUID : {09BFCB06-FFFF-FFFF-F7DF-4206FFFFFF85}
         * FORM_ISTRACKING : 0
         * TITLE_TABLENAME : OFFICE_OA_BUSINESS
         * TITLE_COLUMNNAME : TITLE
         * WORKFLOW_FREEFLOWTYPE : 0
         * TABINDEX : 1
         * RISECALENDARGUID : {AC1D3317-0000-0000-30C5-5F7000000BE0}
         * FLAG : 9
         * IF_SP : 0
         * IF_STREET : 0
         * BUREAUGUID : {F4E02ABC-9029-C548-B079-DD8E9BE362C4}
         * WORKFLOW_TYPE : 2
         * SHARETYPE : 2
         * ISSUPPORTMOBILE : 1
         * MOBILETYPE : 2
         * WENHAO_COLUMN : BANWENZIHAO
         */

        private String WORKFLOW_GUID;
        private String WORKFLOW_NAME;
        private String WORKFLOW_CLASSIFY;
        private String WORKFLOW_AUTHOR;
        private WORKFLOWCREATEDBean WORKFLOW_CREATED;
        private WORKFLOWMODIFIEDBean WORKFLOW_MODIFIED;
        private int WORKFLOW_EXPIRED;
        private int EXPIRED_TYPE;
        private String TASK_GUID;
        private int WORKFLOW_ISDEBUG;
        private int WORKFLOW_ISHIDDEN;
        private String DEFAULTFORM_GUID;
        private String DEFAULTSEARCHFORM_GUID;
        private String DEFAULTSIMPLESEARCHFORM_GUID;
        private int FORM_ISTRACKING;
        private String TITLE_TABLENAME;
        private String TITLE_COLUMNNAME;
        private int WORKFLOW_FREEFLOWTYPE;
        private int TABINDEX;
        private String RISECALENDARGUID;
        private String FLAG;
        private int IF_SP;
        private int IF_STREET;
        private String BUREAUGUID;
        private int WORKFLOW_TYPE;
        private int SHARETYPE;
        private int ISSUPPORTMOBILE;
        private int MOBILETYPE;
        private String WENHAO_COLUMN;

        public String getWORKFLOW_GUID()
        {
            return WORKFLOW_GUID;
        }

        public void setWORKFLOW_GUID(String WORKFLOW_GUID)
        {
            this.WORKFLOW_GUID = WORKFLOW_GUID;
        }

        public String getWORKFLOW_NAME()
        {
            return WORKFLOW_NAME;
        }

        public void setWORKFLOW_NAME(String WORKFLOW_NAME)
        {
            this.WORKFLOW_NAME = WORKFLOW_NAME;
        }

        public String getWORKFLOW_CLASSIFY()
        {
            return WORKFLOW_CLASSIFY;
        }

        public void setWORKFLOW_CLASSIFY(String WORKFLOW_CLASSIFY)
        {
            this.WORKFLOW_CLASSIFY = WORKFLOW_CLASSIFY;
        }

        public String getWORKFLOW_AUTHOR()
        {
            return WORKFLOW_AUTHOR;
        }

        public void setWORKFLOW_AUTHOR(String WORKFLOW_AUTHOR)
        {
            this.WORKFLOW_AUTHOR = WORKFLOW_AUTHOR;
        }

        public WORKFLOWCREATEDBean getWORKFLOW_CREATED()
        {
            return WORKFLOW_CREATED;
        }

        public void setWORKFLOW_CREATED(WORKFLOWCREATEDBean WORKFLOW_CREATED)
        {
            this.WORKFLOW_CREATED = WORKFLOW_CREATED;
        }

        public WORKFLOWMODIFIEDBean getWORKFLOW_MODIFIED()
        {
            return WORKFLOW_MODIFIED;
        }

        public void setWORKFLOW_MODIFIED(WORKFLOWMODIFIEDBean WORKFLOW_MODIFIED)
        {
            this.WORKFLOW_MODIFIED = WORKFLOW_MODIFIED;
        }

        public int getWORKFLOW_EXPIRED()
        {
            return WORKFLOW_EXPIRED;
        }

        public void setWORKFLOW_EXPIRED(int WORKFLOW_EXPIRED)
        {
            this.WORKFLOW_EXPIRED = WORKFLOW_EXPIRED;
        }

        public int getEXPIRED_TYPE()
        {
            return EXPIRED_TYPE;
        }

        public void setEXPIRED_TYPE(int EXPIRED_TYPE)
        {
            this.EXPIRED_TYPE = EXPIRED_TYPE;
        }

        public String getTASK_GUID()
        {
            return TASK_GUID;
        }

        public void setTASK_GUID(String TASK_GUID)
        {
            this.TASK_GUID = TASK_GUID;
        }

        public int getWORKFLOW_ISDEBUG()
        {
            return WORKFLOW_ISDEBUG;
        }

        public void setWORKFLOW_ISDEBUG(int WORKFLOW_ISDEBUG)
        {
            this.WORKFLOW_ISDEBUG = WORKFLOW_ISDEBUG;
        }

        public int getWORKFLOW_ISHIDDEN()
        {
            return WORKFLOW_ISHIDDEN;
        }

        public void setWORKFLOW_ISHIDDEN(int WORKFLOW_ISHIDDEN)
        {
            this.WORKFLOW_ISHIDDEN = WORKFLOW_ISHIDDEN;
        }

        public String getDEFAULTFORM_GUID()
        {
            return DEFAULTFORM_GUID;
        }

        public void setDEFAULTFORM_GUID(String DEFAULTFORM_GUID)
        {
            this.DEFAULTFORM_GUID = DEFAULTFORM_GUID;
        }

        public String getDEFAULTSEARCHFORM_GUID()
        {
            return DEFAULTSEARCHFORM_GUID;
        }

        public void setDEFAULTSEARCHFORM_GUID(String DEFAULTSEARCHFORM_GUID)
        {
            this.DEFAULTSEARCHFORM_GUID = DEFAULTSEARCHFORM_GUID;
        }

        public String getDEFAULTSIMPLESEARCHFORM_GUID()
        {
            return DEFAULTSIMPLESEARCHFORM_GUID;
        }

        public void setDEFAULTSIMPLESEARCHFORM_GUID(String DEFAULTSIMPLESEARCHFORM_GUID)
        {
            this.DEFAULTSIMPLESEARCHFORM_GUID = DEFAULTSIMPLESEARCHFORM_GUID;
        }

        public int getFORM_ISTRACKING()
        {
            return FORM_ISTRACKING;
        }

        public void setFORM_ISTRACKING(int FORM_ISTRACKING)
        {
            this.FORM_ISTRACKING = FORM_ISTRACKING;
        }

        public String getTITLE_TABLENAME()
        {
            return TITLE_TABLENAME;
        }

        public void setTITLE_TABLENAME(String TITLE_TABLENAME)
        {
            this.TITLE_TABLENAME = TITLE_TABLENAME;
        }

        public String getTITLE_COLUMNNAME()
        {
            return TITLE_COLUMNNAME;
        }

        public void setTITLE_COLUMNNAME(String TITLE_COLUMNNAME)
        {
            this.TITLE_COLUMNNAME = TITLE_COLUMNNAME;
        }

        public int getWORKFLOW_FREEFLOWTYPE()
        {
            return WORKFLOW_FREEFLOWTYPE;
        }

        public void setWORKFLOW_FREEFLOWTYPE(int WORKFLOW_FREEFLOWTYPE)
        {
            this.WORKFLOW_FREEFLOWTYPE = WORKFLOW_FREEFLOWTYPE;
        }

        public int getTABINDEX()
        {
            return TABINDEX;
        }

        public void setTABINDEX(int TABINDEX)
        {
            this.TABINDEX = TABINDEX;
        }

        public String getRISECALENDARGUID()
        {
            return RISECALENDARGUID;
        }

        public void setRISECALENDARGUID(String RISECALENDARGUID)
        {
            this.RISECALENDARGUID = RISECALENDARGUID;
        }

        public String getFLAG()
        {
            return FLAG;
        }

        public void setFLAG(String FLAG)
        {
            this.FLAG = FLAG;
        }

        public int getIF_SP()
        {
            return IF_SP;
        }

        public void setIF_SP(int IF_SP)
        {
            this.IF_SP = IF_SP;
        }

        public int getIF_STREET()
        {
            return IF_STREET;
        }

        public void setIF_STREET(int IF_STREET)
        {
            this.IF_STREET = IF_STREET;
        }

        public String getBUREAUGUID()
        {
            return BUREAUGUID;
        }

        public void setBUREAUGUID(String BUREAUGUID)
        {
            this.BUREAUGUID = BUREAUGUID;
        }

        public int getWORKFLOW_TYPE()
        {
            return WORKFLOW_TYPE;
        }

        public void setWORKFLOW_TYPE(int WORKFLOW_TYPE)
        {
            this.WORKFLOW_TYPE = WORKFLOW_TYPE;
        }

        public int getSHARETYPE()
        {
            return SHARETYPE;
        }

        public void setSHARETYPE(int SHARETYPE)
        {
            this.SHARETYPE = SHARETYPE;
        }

        public int getISSUPPORTMOBILE()
        {
            return ISSUPPORTMOBILE;
        }

        public void setISSUPPORTMOBILE(int ISSUPPORTMOBILE)
        {
            this.ISSUPPORTMOBILE = ISSUPPORTMOBILE;
        }

        public int getMOBILETYPE()
        {
            return MOBILETYPE;
        }

        public void setMOBILETYPE(int MOBILETYPE)
        {
            this.MOBILETYPE = MOBILETYPE;
        }

        public String getWENHAO_COLUMN()
        {
            return WENHAO_COLUMN;
        }

        public void setWENHAO_COLUMN(String WENHAO_COLUMN)
        {
            this.WENHAO_COLUMN = WENHAO_COLUMN;
        }

        public static class WORKFLOWCREATEDBean
        {
            /**
             * date : 11
             * day : 4
             * hours : 2
             * minutes : 45
             * month : 2
             * nanos : 0
             * seconds : 27
             * time : 1078944327000
             * timezoneOffset : -480
             * year : 104
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

        public static class WORKFLOWMODIFIEDBean
        {
            /**
             * date : 17
             * day : 1
             * hours : 17
             * minutes : 44
             * month : 3
             * nanos : 0
             * seconds : 25
             * time : 1492422265000
             * timezoneOffset : -480
             * year : 117
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
