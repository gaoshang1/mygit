package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/23.
 */

public class PlanUndertake
{

    /**
     * totalrecords : 6
     * result : success
     * msg : successful
     * rows : 10
     * page : 1
     * list : [{"DETPLAN_GUID":"{8620E33A-6169-4C62-986B-A32C38E85365}","SPECIFIC_GUID":"{35548056-A67C-45A6-B5E7-417647A589E3}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT166-2-0002","ITEM_TITLE":"测试","END_DATE":null,"NEXT_BACK_DATE":{"date":16,"day":4,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1534348800000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":15,"minutes":25,"month":7,"nanos":0,"seconds":54,"time":1533885954000,"timezoneOffset":-480,"year":118},"CONTEXT":"test","READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":1,"DELAY_TIMES":0,"PASS_ALONG_TIMES":0,"LIGHT":0,"PASS_ALONG_TIMESS":0,"INFORM_ALL_TIMESS":0,"DELAY_TIMESS":0,"FEEDBACK_TIMESS":1,"MEETING_TIMESS":0,"REMIND_TIMESS":0,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":"办文科测试","COPY":"督查测试","PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":1},{"DETPLAN_GUID":"{4E84F3C6-7351-40DA-8909-5F543B41175E}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0002","ITEM_TITLE":"test2","END_DATE":{"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118},"NEXT_BACK_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":9,"minutes":9,"month":7,"nanos":0,"seconds":31,"time":1533863371000,"timezoneOffset":-480,"year":118},"CONTEXT":"test","READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0,"LIGHT":0,"PASS_ALONG_TIMESS":0,"INFORM_ALL_TIMESS":0,"DELAY_TIMESS":1,"FEEDBACK_TIMESS":0,"MEETING_TIMESS":0,"REMIND_TIMESS":0,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":"办文科测试,两办测试用户","COPY":"办文科测试,两办测试用户","PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":2},{"DETPLAN_GUID":"{F761C6A9-F1F0-4FD1-B5DB-13548D39A775}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0003","ITEM_TITLE":"test2","END_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"NEXT_BACK_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":9,"minutes":10,"month":7,"nanos":0,"seconds":48,"time":1533863448000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":1,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0,"LIGHT":0,"PASS_ALONG_TIMESS":0,"INFORM_ALL_TIMESS":0,"DELAY_TIMESS":1,"FEEDBACK_TIMESS":1,"MEETING_TIMESS":0,"REMIND_TIMESS":0,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":"办文科测试,两办测试用户","COPY":"办文科测试,两办测试用户","PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":3},{"DETPLAN_GUID":"{C5D5CB0D-1A38-4FE7-AEAC-C9ECD456187A}","SPECIFIC_GUID":"{35548056-A67C-45A6-B5E7-417647A589E3}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT166-2-0003","ITEM_TITLE":"测试","END_DATE":null,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"BACK_TIME":2,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":15,"minutes":26,"month":7,"nanos":0,"seconds":50,"time":1533886010000,"timezoneOffset":-480,"year":118},"CONTEXT":"test","READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"PASS_ALONG_TIMES":0,"LIGHT":0,"PASS_ALONG_TIMESS":0,"INFORM_ALL_TIMESS":0,"DELAY_TIMESS":0,"FEEDBACK_TIMESS":0,"MEETING_TIMESS":0,"REMIND_TIMESS":0,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":"办文科测试","COPY":"督查测试","PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":4},{"DETPLAN_GUID":"{6A813D3A-C752-4005-86A0-AE70B8AC673C}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0001","ITEM_TITLE":"test2","END_DATE":null,"NEXT_BACK_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":1,"day":3,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533052800000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":1,"day":3,"hours":14,"minutes":8,"month":7,"nanos":0,"seconds":36,"time":1533103716000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":1,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0,"LIGHT":0,"PASS_ALONG_TIMESS":0,"INFORM_ALL_TIMESS":0,"DELAY_TIMESS":1,"FEEDBACK_TIMESS":1,"MEETING_TIMESS":0,"REMIND_TIMESS":0,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":null,"COPY":null,"PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":5},{"DETPLAN_GUID":"{C3DB7A3A-6BE8-4FC3-96EC-26304A875907}","SPECIFIC_GUID":"{10F195DE-FFB5-42F2-8E2F-812A56037334}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT165-1-0001","ITEM_TITLE":"cs cs cs ","END_DATE":null,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":11,"nanos":0,"seconds":0,"time":1545667200000,"timezoneOffset":-480,"year":118},"BACK_TIME":1,"SEND_DATE":{"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":26,"day":4,"hours":14,"minutes":19,"month":6,"nanos":0,"seconds":38,"time":1532585978000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":1,"MEETING_TIMES":1,"INFORM_ALL_TIMES":1,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"PASS_ALONG_TIMES":1,"LIGHT":0,"PASS_ALONG_TIMESS":1,"INFORM_ALL_TIMESS":1,"DELAY_TIMESS":0,"FEEDBACK_TIMESS":0,"MEETING_TIMESS":1,"REMIND_TIMESS":1,"DICTIONARYNAME":"计划已交办","MAIN":"督查测试","COS":null,"COPY":null,"PASS_ALONG_READ":1,"MEETING_READ":1,"INFORM_ALL_READ":1,"REMIND_READ":1,"RN":6}]
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
         * DETPLAN_GUID : {8620E33A-6169-4C62-986B-A32C38E85365}
         * SPECIFIC_GUID : {35548056-A67C-45A6-B5E7-417647A589E3}
         * DICTIONARY_GUID : {BFA80164-FFFF-FFFF-DD67-A38E00000023}
         * ITEM_NUMBER : FTDC2018QT166-2-0002
         * ITEM_TITLE : 测试
         * END_DATE : null
         * NEXT_BACK_DATE : {"date":16,"day":4,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1534348800000,"timezoneOffset":-480,"year":118}
         * BACK_TIME : 0
         * SEND_DATE : {"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118}
         * CREATE_DATE : {"date":10,"day":5,"hours":15,"minutes":25,"month":7,"nanos":0,"seconds":54,"time":1533885954000,"timezoneOffset":-480,"year":118}
         * CONTEXT : test
         * READ : 0
         * EXIST : 1
         * DELETE_DATE : null
         * REMOVER : null
         * REMIND_TIMES : 0
         * MEETING_TIMES : 0
         * INFORM_ALL_TIMES : 0
         * FEEDBACK_TIMES : 1
         * DELAY_TIMES : 0
         * PASS_ALONG_TIMES : 0
         * LIGHT : 0
         * PASS_ALONG_TIMESS : 0
         * INFORM_ALL_TIMESS : 0
         * DELAY_TIMESS : 0
         * FEEDBACK_TIMESS : 1
         * MEETING_TIMESS : 0
         * REMIND_TIMESS : 0
         * DICTIONARYNAME : 计划已交办
         * MAIN : 督查测试
         * COS : 办文科测试
         * COPY : 督查测试
         * PASS_ALONG_READ : 1
         * MEETING_READ : 1
         * INFORM_ALL_READ : 1
         * REMIND_READ : 1
         * RN : 1
         */

        private String DETPLAN_GUID;
        private String SPECIFIC_GUID;
        private String DICTIONARY_GUID;
        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private SENDDATEBean END_DATE;
        private NEXTBACKDATEBean NEXT_BACK_DATE;
        private int BACK_TIME;
        private SENDDATEBean SEND_DATE;
        private CREATEDATEBean CREATE_DATE;
        private String CONTEXT;
        private int READ;
        private int EXIST;
        private Object DELETE_DATE;
        private Object REMOVER;
        private int REMIND_TIMES;
        private int MEETING_TIMES;
        private int INFORM_ALL_TIMES;
        private int FEEDBACK_TIMES;
        private int DELAY_TIMES;
        private int PASS_ALONG_TIMES;
        private int LIGHT;
        private int PASS_ALONG_TIMESS;
        private int INFORM_ALL_TIMESS;
        private int DELAY_TIMESS;
        private int FEEDBACK_TIMESS;
        private int MEETING_TIMESS;
        private int REMIND_TIMESS;
        private String DICTIONARYNAME;
        private String MAIN;
        private String COS;
        private String COPY;
        private int PASS_ALONG_READ;
        private int MEETING_READ;
        private int INFORM_ALL_READ;
        private int REMIND_READ;
        private int RN;

        public String getDETPLAN_GUID()
        {
            return DETPLAN_GUID;
        }

        public void setDETPLAN_GUID(String DETPLAN_GUID)
        {
            this.DETPLAN_GUID = DETPLAN_GUID;
        }

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public String getDICTIONARY_GUID()
        {
            return DICTIONARY_GUID;
        }

        public void setDICTIONARY_GUID(String DICTIONARY_GUID)
        {
            this.DICTIONARY_GUID = DICTIONARY_GUID;
        }

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

        public SENDDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(SENDDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
        }

        public NEXTBACKDATEBean getNEXT_BACK_DATE()
        {
            return NEXT_BACK_DATE;
        }

        public void setNEXT_BACK_DATE(NEXTBACKDATEBean NEXT_BACK_DATE)
        {
            this.NEXT_BACK_DATE = NEXT_BACK_DATE;
        }

        public int getBACK_TIME()
        {
            return BACK_TIME;
        }

        public void setBACK_TIME(int BACK_TIME)
        {
            this.BACK_TIME = BACK_TIME;
        }

        public SENDDATEBean getSEND_DATE()
        {
            return SEND_DATE;
        }

        public void setSEND_DATE(SENDDATEBean SEND_DATE)
        {
            this.SEND_DATE = SEND_DATE;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getCONTEXT()
        {
            return CONTEXT;
        }

        public void setCONTEXT(String CONTEXT)
        {
            this.CONTEXT = CONTEXT;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public int getEXIST()
        {
            return EXIST;
        }

        public void setEXIST(int EXIST)
        {
            this.EXIST = EXIST;
        }

        public Object getDELETE_DATE()
        {
            return DELETE_DATE;
        }

        public void setDELETE_DATE(Object DELETE_DATE)
        {
            this.DELETE_DATE = DELETE_DATE;
        }

        public Object getREMOVER()
        {
            return REMOVER;
        }

        public void setREMOVER(Object REMOVER)
        {
            this.REMOVER = REMOVER;
        }

        public int getREMIND_TIMES()
        {
            return REMIND_TIMES;
        }

        public void setREMIND_TIMES(int REMIND_TIMES)
        {
            this.REMIND_TIMES = REMIND_TIMES;
        }

        public int getMEETING_TIMES()
        {
            return MEETING_TIMES;
        }

        public void setMEETING_TIMES(int MEETING_TIMES)
        {
            this.MEETING_TIMES = MEETING_TIMES;
        }

        public int getINFORM_ALL_TIMES()
        {
            return INFORM_ALL_TIMES;
        }

        public void setINFORM_ALL_TIMES(int INFORM_ALL_TIMES)
        {
            this.INFORM_ALL_TIMES = INFORM_ALL_TIMES;
        }

        public int getFEEDBACK_TIMES()
        {
            return FEEDBACK_TIMES;
        }

        public void setFEEDBACK_TIMES(int FEEDBACK_TIMES)
        {
            this.FEEDBACK_TIMES = FEEDBACK_TIMES;
        }

        public int getDELAY_TIMES()
        {
            return DELAY_TIMES;
        }

        public void setDELAY_TIMES(int DELAY_TIMES)
        {
            this.DELAY_TIMES = DELAY_TIMES;
        }

        public int getPASS_ALONG_TIMES()
        {
            return PASS_ALONG_TIMES;
        }

        public void setPASS_ALONG_TIMES(int PASS_ALONG_TIMES)
        {
            this.PASS_ALONG_TIMES = PASS_ALONG_TIMES;
        }

        public int getLIGHT()
        {
            return LIGHT;
        }

        public void setLIGHT(int LIGHT)
        {
            this.LIGHT = LIGHT;
        }

        public int getPASS_ALONG_TIMESS()
        {
            return PASS_ALONG_TIMESS;
        }

        public void setPASS_ALONG_TIMESS(int PASS_ALONG_TIMESS)
        {
            this.PASS_ALONG_TIMESS = PASS_ALONG_TIMESS;
        }

        public int getINFORM_ALL_TIMESS()
        {
            return INFORM_ALL_TIMESS;
        }

        public void setINFORM_ALL_TIMESS(int INFORM_ALL_TIMESS)
        {
            this.INFORM_ALL_TIMESS = INFORM_ALL_TIMESS;
        }

        public int getDELAY_TIMESS()
        {
            return DELAY_TIMESS;
        }

        public void setDELAY_TIMESS(int DELAY_TIMESS)
        {
            this.DELAY_TIMESS = DELAY_TIMESS;
        }

        public int getFEEDBACK_TIMESS()
        {
            return FEEDBACK_TIMESS;
        }

        public void setFEEDBACK_TIMESS(int FEEDBACK_TIMESS)
        {
            this.FEEDBACK_TIMESS = FEEDBACK_TIMESS;
        }

        public int getMEETING_TIMESS()
        {
            return MEETING_TIMESS;
        }

        public void setMEETING_TIMESS(int MEETING_TIMESS)
        {
            this.MEETING_TIMESS = MEETING_TIMESS;
        }

        public int getREMIND_TIMESS()
        {
            return REMIND_TIMESS;
        }

        public void setREMIND_TIMESS(int REMIND_TIMESS)
        {
            this.REMIND_TIMESS = REMIND_TIMESS;
        }

        public String getDICTIONARYNAME()
        {
            return DICTIONARYNAME;
        }

        public void setDICTIONARYNAME(String DICTIONARYNAME)
        {
            this.DICTIONARYNAME = DICTIONARYNAME;
        }

        public String getMAIN()
        {
            return MAIN;
        }

        public void setMAIN(String MAIN)
        {
            this.MAIN = MAIN;
        }

        public String getCOS()
        {
            return COS;
        }

        public void setCOS(String COS)
        {
            this.COS = COS;
        }

        public String getCOPY()
        {
            return COPY;
        }

        public void setCOPY(String COPY)
        {
            this.COPY = COPY;
        }

        public int getPASS_ALONG_READ()
        {
            return PASS_ALONG_READ;
        }

        public void setPASS_ALONG_READ(int PASS_ALONG_READ)
        {
            this.PASS_ALONG_READ = PASS_ALONG_READ;
        }

        public int getMEETING_READ()
        {
            return MEETING_READ;
        }

        public void setMEETING_READ(int MEETING_READ)
        {
            this.MEETING_READ = MEETING_READ;
        }

        public int getINFORM_ALL_READ()
        {
            return INFORM_ALL_READ;
        }

        public void setINFORM_ALL_READ(int INFORM_ALL_READ)
        {
            this.INFORM_ALL_READ = INFORM_ALL_READ;
        }

        public int getREMIND_READ()
        {
            return REMIND_READ;
        }

        public void setREMIND_READ(int REMIND_READ)
        {
            this.REMIND_READ = REMIND_READ;
        }

        public int getRN()
        {
            return RN;
        }

        public void setRN(int RN)
        {
            this.RN = RN;
        }

        public static class NEXTBACKDATEBean
        {
            /**
             * date : 16
             * day : 4
             * hours : 0
             * minutes : 0
             * month : 7
             * nanos : 0
             * seconds : 0
             * time : 1534348800000
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

        public static class SENDDATEBean
        {
            /**
             * date : 10
             * day : 5
             * hours : 0
             * minutes : 0
             * month : 7
             * nanos : 0
             * seconds : 0
             * time : 1533830400000
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
             * hours : 15
             * minutes : 25
             * month : 7
             * nanos : 0
             * seconds : 54
             * time : 1533885954000
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
