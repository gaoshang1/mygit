package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/9/5.
 */

public class AllSupType
{

    /**
     * result : success
     * msg : successful
     * list : [{"TYPE_GUID":"{AC1D333E-0000-0000-70E4-CE4B00000021}","TYPE_NAME":"其他专项工作","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":18,"day":4,"hours":11,"minutes":23,"month":9,"nanos":0,"seconds":36,"time":1350530616000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":{"date":24,"day":2,"hours":17,"minutes":27,"month":3,"nanos":0,"seconds":21,"time":1524562041000,"timezoneOffset":-480,"year":118},"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":8,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0B-58CD0000001A}","TYPE_NAME":"市委市政府重要工作","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":1,"hours":17,"minutes":28,"month":6,"nanos":0,"seconds":53,"time":1531733333000,"timezoneOffset":-480,"year":118},"MODIFY_DATE":{"date":13,"day":4,"hours":17,"minutes":1,"month":8,"nanos":0,"seconds":50,"time":1347526910000,"timezoneOffset":-480,"year":112},"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":9,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0B-7D700000001B}","TYPE_NAME":"市政府常务会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":6,"hours":16,"minutes":0,"month":5,"nanos":0,"seconds":49,"time":1339833649000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":10,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0A-9EDC0000001C}","TYPE_NAME":"市长办公会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":6,"hours":16,"minutes":1,"month":5,"nanos":0,"seconds":12,"time":1339833672000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":11,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0A-BE7B0000001D}","TYPE_NAME":"区领导批示、交办事项","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":14,"day":4,"hours":19,"minutes":33,"month":5,"nanos":0,"seconds":22,"time":1339673602000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":12,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-056C0000001F}","TYPE_NAME":"区政府民生实事","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":10,"day":6,"hours":22,"minutes":38,"month":2,"nanos":0,"seconds":37,"time":1331390317000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":13,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-20AE00000020}","TYPE_NAME":"区委区政府重要工作","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":1,"hours":17,"minutes":28,"month":6,"nanos":0,"seconds":53,"time":1531733333000,"timezoneOffset":-480,"year":118},"MODIFY_DATE":{"date":31,"day":5,"hours":16,"minutes":37,"month":7,"nanos":0,"seconds":2,"time":1346402222000,"timezoneOffset":-480,"year":112},"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":14,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-417400000021}","TYPE_NAME":"区政府常务会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":6,"hours":15,"minutes":57,"month":5,"nanos":0,"seconds":54,"time":1339833474000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":15,"ISDELETE":0},{"TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-5FD700000022}","TYPE_NAME":"区长办公会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":6,"hours":15,"minutes":57,"month":5,"nanos":0,"seconds":44,"time":1339833464000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":16,"ISDELETE":0},{"TYPE_GUID":"{BFA80A01-FFFF-FFFF-E9C4-D86300000024}","TYPE_NAME":"市领导批示、交办事项","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":16,"day":6,"hours":15,"minutes":56,"month":5,"nanos":0,"seconds":49,"time":1339833409000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":17,"ISDELETE":0},{"TYPE_GUID":"{AC1D334D-0000-0000-7565-F90B000000B3}","TYPE_NAME":"市政府办公会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":20,"day":3,"hours":20,"minutes":5,"month":10,"nanos":0,"seconds":51,"time":1384949151000,"timezoneOffset":-480,"year":113},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":18,"ISDELETE":0},{"TYPE_GUID":"{AC1D334D-0000-0000-0A27-53880000003B}","TYPE_NAME":"区委常委会议","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":21,"day":3,"hours":9,"minutes":42,"month":0,"nanos":0,"seconds":4,"time":1421804524000,"timezoneOffset":-480,"year":115},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":20,"ISDELETE":0},{"TYPE_GUID":"{AC1D333E-0000-0000-70EE-44D600000026}","TYPE_NAME":"市政府民生实事","CREATE_EMPLOYEE_GUID":"{08A8D6CF-76DD-B343-A5D5-5B2B6082425E}","CREATE_DATE":{"date":18,"day":4,"hours":11,"minutes":32,"month":9,"nanos":0,"seconds":51,"time":1350531171000,"timezoneOffset":-480,"year":112},"MODIFY_DATE":null,"STATUS":0,"DEPARTMENT_GUID":"{00000000-0000-0000-0000-000000000000}","TABINDEX":21,"ISDELETE":0}]
     */

    private String result;
    private String msg;
    private List<ListBean> list;

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

    public static class ListBean
    {
        /**
         * TYPE_GUID : {AC1D333E-0000-0000-70E4-CE4B00000021}
         * TYPE_NAME : 其他专项工作
         * CREATE_EMPLOYEE_GUID : {08A8D6CF-76DD-B343-A5D5-5B2B6082425E}
         * CREATE_DATE : {"date":18,"day":4,"hours":11,"minutes":23,"month":9,"nanos":0,"seconds":36,"time":1350530616000,"timezoneOffset":-480,"year":112}
         * MODIFY_DATE : {"date":24,"day":2,"hours":17,"minutes":27,"month":3,"nanos":0,"seconds":21,"time":1524562041000,"timezoneOffset":-480,"year":118}
         * STATUS : 0
         * DEPARTMENT_GUID : {00000000-0000-0000-0000-000000000000}
         * TABINDEX : 8
         * ISDELETE : 0
         */
        public ListBean(String TYPE_GUID, String TYPE_NAME)
        {
            this.TYPE_GUID = TYPE_GUID;
            this.TYPE_NAME = TYPE_NAME;
        }

        private String TYPE_GUID;
        private String TYPE_NAME;
        private String CREATE_EMPLOYEE_GUID;
        private CREATEDATEBean CREATE_DATE;
        private MODIFYDATEBean MODIFY_DATE;
        private int STATUS;
        private String DEPARTMENT_GUID;
        private int TABINDEX;
        private int ISDELETE;

        public String getTYPE_GUID()
        {
            return TYPE_GUID;
        }

        public void setTYPE_GUID(String TYPE_GUID)
        {
            this.TYPE_GUID = TYPE_GUID;
        }

        public String getTYPE_NAME()
        {
            return TYPE_NAME;
        }

        public void setTYPE_NAME(String TYPE_NAME)
        {
            this.TYPE_NAME = TYPE_NAME;
        }

        public String getCREATE_EMPLOYEE_GUID()
        {
            return CREATE_EMPLOYEE_GUID;
        }

        public void setCREATE_EMPLOYEE_GUID(String CREATE_EMPLOYEE_GUID)
        {
            this.CREATE_EMPLOYEE_GUID = CREATE_EMPLOYEE_GUID;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public MODIFYDATEBean getMODIFY_DATE()
        {
            return MODIFY_DATE;
        }

        public void setMODIFY_DATE(MODIFYDATEBean MODIFY_DATE)
        {
            this.MODIFY_DATE = MODIFY_DATE;
        }

        public int getSTATUS()
        {
            return STATUS;
        }

        public void setSTATUS(int STATUS)
        {
            this.STATUS = STATUS;
        }

        public String getDEPARTMENT_GUID()
        {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
        {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public int getTABINDEX()
        {
            return TABINDEX;
        }

        public void setTABINDEX(int TABINDEX)
        {
            this.TABINDEX = TABINDEX;
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
             * date : 18
             * day : 4
             * hours : 11
             * minutes : 23
             * month : 9
             * nanos : 0
             * seconds : 36
             * time : 1350530616000
             * timezoneOffset : -480
             * year : 112
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

        public static class MODIFYDATEBean
        {
            /**
             * date : 24
             * day : 2
             * hours : 17
             * minutes : 27
             * month : 3
             * nanos : 0
             * seconds : 21
             * time : 1524562041000
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
