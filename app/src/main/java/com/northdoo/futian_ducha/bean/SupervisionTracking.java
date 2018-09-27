package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/15.
 */

public class SupervisionTracking
{

    /**
     * totalrecords : 14
     * result : success
     * msg : successful
     * rows : 10
     * page : 1
     * list : [{"SUPERVISION_GUID":"{4BB369DD-7C21-4317-9F46-87CF7660EB86}","TYPE_GUID":"{AC1D333E-0000-0000-70E4-CE4B00000021}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试","ITEM_NUMBER":"FTDC2018QT166","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"test","CREATE_DATE":{"date":27,"day":5,"hours":15,"minutes":44,"month":6,"nanos":0,"seconds":30,"time":1532677470000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"其他专项工作","EMPLOYEE_NAME":"督查测试","LIGHT":2,"HASUNREAD":1,"RN":1},{"SUPERVISION_GUID":"{A88D3C1A-B7C6-4867-9213-11C67C64C809}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0A-BE7B0000001D}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试7.26上午","ITEM_NUMBER":"FTDC2018ZX200","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试","CREATE_DATE":{"date":26,"day":4,"hours":10,"minutes":40,"month":6,"nanos":0,"seconds":27,"time":1532572827000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"区领导批示、交办事项","EMPLOYEE_NAME":"督查测试","LIGHT":2,"HASUNREAD":0,"RN":2},{"SUPERVISION_GUID":"{87A28EBE-2B0F-48A0-A7A4-553F7C40481C}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0B-7D700000001B}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"test","ITEM_NUMBER":"FTDC2018SFCW23","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":null,"CREATE_DATE":{"date":13,"day":1,"hours":17,"minutes":10,"month":7,"nanos":0,"seconds":42,"time":1534151442000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"市政府常务会议","EMPLOYEE_NAME":"督查测试","LIGHT":1,"HASUNREAD":0,"RN":3},{"SUPERVISION_GUID":"{DC0ECF66-5215-423E-A0A7-E530F766AE1F}","TYPE_GUID":"{AC1D333E-0000-0000-70E4-CE4B00000021}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试7.27","ITEM_NUMBER":"FTDC2018QT167","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试","CREATE_DATE":{"date":27,"day":5,"hours":16,"minutes":3,"month":6,"nanos":0,"seconds":18,"time":1532678598000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"其他专项工作","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":0,"RN":4},{"SUPERVISION_GUID":"{51C0CCF4-C793-4995-9788-19A598468B0F}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0A-9EDC0000001C}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试测试测试测试","ITEM_NUMBER":"FTDC2018SFBG23","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试","CREATE_DATE":{"date":26,"day":4,"hours":15,"minutes":57,"month":6,"nanos":0,"seconds":37,"time":1532591857000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"市长办公会议","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":0,"RN":5},{"SUPERVISION_GUID":"{792465ED-16DD-4D50-943C-2414BC8C2D78}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-056C0000001F}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试","ITEM_NUMBER":"FTDC2018MS14","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试测试","CREATE_DATE":{"date":26,"day":4,"hours":15,"minutes":54,"month":6,"nanos":0,"seconds":53,"time":1532591693000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"区政府民生实事","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":0,"RN":6},{"SUPERVISION_GUID":"{D81934D8-1C6E-47FD-AD0A-3E08846B38E6}","TYPE_GUID":"{AC1D333E-0000-0000-70E4-CE4B00000021}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"cs cs cs ","ITEM_NUMBER":"FTDC2018QT165","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试","CREATE_DATE":{"date":26,"day":4,"hours":11,"minutes":22,"month":6,"nanos":0,"seconds":20,"time":1532575340000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"其他专项工作","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":0,"RN":7},{"SUPERVISION_GUID":"{A49F343E-DC46-488F-AE86-C68A1E2C92A1}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0B-58CD0000001A}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试7.26下午","ITEM_NUMBER":"FTDC2018SRW305","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试","CREATE_DATE":{"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"市委市政府重要工作","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":1,"RN":8},{"SUPERVISION_GUID":"{3632DFA3-DACE-49F9-BB1C-A686879F7963}","TYPE_GUID":"{09BFCB09-FFFF-FFFF-FD0C-20AE00000020}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试18：00","ITEM_NUMBER":"FTDC2018RW101","FROM_NUMBER":null,"LEADER_NAME":null,"MAIN_CONTEXT":"测试测试测试测试","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":59,"month":6,"nanos":0,"seconds":7,"time":1532487547000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":null,"END_DATE":null,"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"区委区政府重要工作","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":1,"RN":9},{"SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","TYPE_GUID":"{AC1D334D-0000-0000-0A27-53880000003B}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试测试测试25","ITEM_NUMBER":"福常记[2018]10号","FROM_NUMBER":"特色他","LEADER_NAME":"特殊","MAIN_CONTEXT":"测试测试长沙村是","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":"特色他","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"区委常委会议","EMPLOYEE_NAME":"督查测试","LIGHT":0,"HASUNREAD":0,"RN":10}]
     */

    private int totalrecords;
    private String result;
    private String msg;
    private int rows;
    private int page;
    private List<ListBean> list;

    public int getTotalrecords()
    {
        return totalrecords;
    }

    public void setTotalrecords(int totalrecords)
    {
        this.totalrecords = totalrecords;
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

    public int getRows()
    {
        return rows;
    }

    public void setRows(int rows)
    {
        this.rows = rows;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        this.page = page;
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
         * SUPERVISION_GUID : {4BB369DD-7C21-4317-9F46-87CF7660EB86}
         * TYPE_GUID : {AC1D333E-0000-0000-70E4-CE4B00000021}
         * EMPLOYEE_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * ITEM_TITLE : 测试
         * ITEM_NUMBER : FTDC2018QT166
         * FROM_NUMBER : null
         * LEADER_NAME : null
         * MAIN_CONTEXT : test
         * CREATE_DATE : {"date":27,"day":5,"hours":15,"minutes":44,"month":6,"nanos":0,"seconds":30,"time":1532677470000,"timezoneOffset":-480,"year":118}
         * DICTIONARY_GUID : {09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}
         * ITEM_SOURCE : null
         * END_DATE : null
         * SIMPLE_TASK : 1
         * DEL_STATUS : 0
         * SUPERVISION_HOLDER : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * TYPE_NAME : 其他专项工作
         * EMPLOYEE_NAME : 督查测试
         * LIGHT : 2
         * HASUNREAD : 1
         * RN : 1
         */

        private String SUPERVISION_GUID;
        private String TYPE_GUID;
        private String EMPLOYEE_GUID;
        private String ITEM_TITLE;
        private String ITEM_NUMBER;
        private Object FROM_NUMBER;
        private Object LEADER_NAME;
        private String MAIN_CONTEXT;
        private CREATEDATEBean CREATE_DATE;
        private String DICTIONARY_GUID;
        private Object ITEM_SOURCE;
        private CREATEDATEBean END_DATE;
        private int SIMPLE_TASK;
        private int DEL_STATUS;
        private String SUPERVISION_HOLDER;
        private String TYPE_NAME;
        private String EMPLOYEE_NAME;
        private int LIGHT;
        private int HASUNREAD;
        private int RN;

        public String getSUPERVISION_GUID()
        {
            return SUPERVISION_GUID;
        }

        public void setSUPERVISION_GUID(String SUPERVISION_GUID)
        {
            this.SUPERVISION_GUID = SUPERVISION_GUID;
        }

        public String getTYPE_GUID()
        {
            return TYPE_GUID;
        }

        public void setTYPE_GUID(String TYPE_GUID)
        {
            this.TYPE_GUID = TYPE_GUID;
        }

        public String getEMPLOYEE_GUID()
        {
            return EMPLOYEE_GUID;
        }

        public void setEMPLOYEE_GUID(String EMPLOYEE_GUID)
        {
            this.EMPLOYEE_GUID = EMPLOYEE_GUID;
        }

        public String getITEM_TITLE()
        {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE)
        {
            this.ITEM_TITLE = ITEM_TITLE;
        }

        public String getITEM_NUMBER()
        {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER)
        {
            this.ITEM_NUMBER = ITEM_NUMBER;
        }

        public Object getFROM_NUMBER()
        {
            return FROM_NUMBER;
        }

        public void setFROM_NUMBER(Object FROM_NUMBER)
        {
            this.FROM_NUMBER = FROM_NUMBER;
        }

        public Object getLEADER_NAME()
        {
            return LEADER_NAME;
        }

        public void setLEADER_NAME(Object LEADER_NAME)
        {
            this.LEADER_NAME = LEADER_NAME;
        }

        public String getMAIN_CONTEXT()
        {
            return MAIN_CONTEXT;
        }

        public void setMAIN_CONTEXT(String MAIN_CONTEXT)
        {
            this.MAIN_CONTEXT = MAIN_CONTEXT;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getDICTIONARY_GUID()
        {
            return DICTIONARY_GUID;
        }

        public void setDICTIONARY_GUID(String DICTIONARY_GUID)
        {
            this.DICTIONARY_GUID = DICTIONARY_GUID;
        }

        public Object getITEM_SOURCE()
        {
            return ITEM_SOURCE;
        }

        public void setITEM_SOURCE(Object ITEM_SOURCE)
        {
            this.ITEM_SOURCE = ITEM_SOURCE;
        }

        public CREATEDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(CREATEDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
        }

        public int getSIMPLE_TASK()
        {
            return SIMPLE_TASK;
        }

        public void setSIMPLE_TASK(int SIMPLE_TASK)
        {
            this.SIMPLE_TASK = SIMPLE_TASK;
        }

        public int getDEL_STATUS()
        {
            return DEL_STATUS;
        }

        public void setDEL_STATUS(int DEL_STATUS)
        {
            this.DEL_STATUS = DEL_STATUS;
        }

        public String getSUPERVISION_HOLDER()
        {
            return SUPERVISION_HOLDER;
        }

        public void setSUPERVISION_HOLDER(String SUPERVISION_HOLDER)
        {
            this.SUPERVISION_HOLDER = SUPERVISION_HOLDER;
        }

        public String getTYPE_NAME()
        {
            return TYPE_NAME;
        }

        public void setTYPE_NAME(String TYPE_NAME)
        {
            this.TYPE_NAME = TYPE_NAME;
        }

        public String getEMPLOYEE_NAME()
        {
            return EMPLOYEE_NAME;
        }

        public void setEMPLOYEE_NAME(String EMPLOYEE_NAME)
        {
            this.EMPLOYEE_NAME = EMPLOYEE_NAME;
        }

        public int getLIGHT()
        {
            return LIGHT;
        }

        public void setLIGHT(int LIGHT)
        {
            this.LIGHT = LIGHT;
        }

        public int getHASUNREAD()
        {
            return HASUNREAD;
        }

        public void setHASUNREAD(int HASUNREAD)
        {
            this.HASUNREAD = HASUNREAD;
        }

        public int getRN()
        {
            return RN;
        }

        public void setRN(int RN)
        {
            this.RN = RN;
        }

        public static class CREATEDATEBean
        {
            /**
             * date : 27
             * day : 5
             * hours : 15
             * minutes : 44
             * month : 6
             * nanos : 0
             * seconds : 30
             * time : 1532677470000
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
