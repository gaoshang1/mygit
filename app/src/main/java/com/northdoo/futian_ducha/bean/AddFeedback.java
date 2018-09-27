package com.northdoo.futian_ducha.bean;

import java.util.List;

import static android.R.attr.password;

/**
 * Created by Administrator on 2018/8/30.
 */

public class AddFeedback
{

    /**
     * sup : {"NEXT_BACK_DATE":{"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118},"content":[],"UNDERTAKE_BACK_GUID":"{E988A053-6AB2-4725-95B6-623C36EB4659}","id":"{9BEC2188-3166-4A89-9E90-F6383153187B}"}
     * result : success
     * msg : successful
     */

    private SupBean sup;
    private String result;
    private String msg;

    public SupBean getSup()
    {
        return sup;
    }

    public void setSup(SupBean sup)
    {
        this.sup = sup;
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

    public static class SupBean
    {
        /**
         * NEXT_BACK_DATE : {"date":31,"day":2,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532966400000,"timezoneOffset":-480,"year":118}
         * content : []
         * UNDERTAKE_BACK_GUID : {E988A053-6AB2-4725-95B6-623C36EB4659}
         * id : {9BEC2188-3166-4A89-9E90-F6383153187B}
         */
        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private NEXTBACKDATEBean END_DATE;
        private String BACK_TIME;
        private String DELAY_GUID;
        private NEXTBACKDATEBean NEXT_BACK_DATE;
        private String UNDERTAKE_BACK_GUID;
        private String id;
        private List<?> content;

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

        public NEXTBACKDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(NEXTBACKDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
        }

        public String getBACK_TIME()
        {
            return BACK_TIME;
        }

        public void setBACK_TIME(String BACK_TIME)
        {
            this.BACK_TIME = BACK_TIME;
        }

        public String getDELAY_GUID()
        {
            return DELAY_GUID;
        }

        public void setDELAY_GUID(String DELAY_GUID)
        {
            this.DELAY_GUID = DELAY_GUID;
        }

        public NEXTBACKDATEBean getNEXT_BACK_DATE()
        {
            return NEXT_BACK_DATE;
        }

        public void setNEXT_BACK_DATE(NEXTBACKDATEBean NEXT_BACK_DATE)
        {
            this.NEXT_BACK_DATE = NEXT_BACK_DATE;
        }

        public String getUNDERTAKE_BACK_GUID()
        {
            return UNDERTAKE_BACK_GUID;
        }

        public void setUNDERTAKE_BACK_GUID(String UNDERTAKE_BACK_GUID)
        {
            this.UNDERTAKE_BACK_GUID = UNDERTAKE_BACK_GUID;
        }

        public String getId()
        {
            return id;
        }

        public void setId(String id)
        {
            this.id = id;
        }

        public List<?> getContent()
        {
            return content;
        }

        public void setContent(List<?> content)
        {
            this.content = content;
        }

        public static class NEXTBACKDATEBean
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
