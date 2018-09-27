package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/20.
 */

public class Templates
{

    /**
     * templateList : [{"GUID":"{62E6FE8B-2BAC-4DC9-B6E1-F0FD6C9E68D6}","MSG_CONTENT":"123456","CREATE_DATE":{"date":6,"day":1,"hours":16,"minutes":24,"month":7,"nanos":0,"seconds":29,"time":1533543869000,"timezoneOffset":-480,"year":118},"CREATOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","LASTMODIFIER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ISDELETE":0},{"GUID":"{441BB60F-F4B6-45AA-A5AD-BAD7AAF69E8A}","MSG_CONTENT":"测试测试测试","CREATE_DATE":{"date":23,"day":1,"hours":16,"minutes":10,"month":6,"nanos":0,"seconds":19,"time":1532333419000,"timezoneOffset":-480,"year":118},"CREATOR_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","LASTMODIFIER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ISDELETE":0}]
     * result : success
     * msg : successful
     */

    private String result;
    private String msg;
    private List<TemplateListBean> templateList;

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

    public List<TemplateListBean> getTemplateList()
    {
        return templateList;
    }

    public void setTemplateList(List<TemplateListBean> templateList)
    {
        this.templateList = templateList;
    }

    public static class TemplateListBean
    {
        /**
         * GUID : {62E6FE8B-2BAC-4DC9-B6E1-F0FD6C9E68D6}
         * MSG_CONTENT : 123456
         * CREATE_DATE : {"date":6,"day":1,"hours":16,"minutes":24,"month":7,"nanos":0,"seconds":29,"time":1533543869000,"timezoneOffset":-480,"year":118}
         * CREATOR_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * LASTMODIFIER_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * ISDELETE : 0
         */

        private String GUID;
        private String MSG_CONTENT;
        private CREATEDATEBean CREATE_DATE;
        private String CREATOR_GUID;
        private String LASTMODIFIER_GUID;
        private int ISDELETE;

        public String getGUID()
        {
            return GUID;
        }

        public void setGUID(String GUID)
        {
            this.GUID = GUID;
        }

        public String getMSG_CONTENT()
        {
            return MSG_CONTENT;
        }

        public void setMSG_CONTENT(String MSG_CONTENT)
        {
            this.MSG_CONTENT = MSG_CONTENT;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getCREATOR_GUID()
        {
            return CREATOR_GUID;
        }

        public void setCREATOR_GUID(String CREATOR_GUID)
        {
            this.CREATOR_GUID = CREATOR_GUID;
        }

        public String getLASTMODIFIER_GUID()
        {
            return LASTMODIFIER_GUID;
        }

        public void setLASTMODIFIER_GUID(String LASTMODIFIER_GUID)
        {
            this.LASTMODIFIER_GUID = LASTMODIFIER_GUID;
        }

        public int getISDELETE()
        {
            return ISDELETE;
        }

        public void setISDELETE(int ISDELETE)
        {
            this.ISDELETE = ISDELETE;
        }

        public static class CREATEDATEBean
        {
            /**
             * date : 6
             * day : 1
             * hours : 16
             * minutes : 24
             * month : 7
             * nanos : 0
             * seconds : 29
             * time : 1533543869000
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
