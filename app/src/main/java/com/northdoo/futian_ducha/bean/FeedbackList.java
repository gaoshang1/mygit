package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/22.
 */

public class FeedbackList {

    /**
     * list : [{"UNDERTAKE_BACK_GUID":"{407B3389-E8D4-4379-AB1B-2296C8EA711E}","SPECIFIC_GUID":"{26C8BE52-1732-4274-951B-26746768A648}","MESSAGE":1,"CONTEXT":null,"CREATE_DATE":{"date":30,"day":1,"hours":17,"minutes":55,"month":6,"nanos":0,"seconds":33,"time":1532944533000,"timezoneOffset":-480,"year":118},"DELETE_DATE":null,"EXIST":1,"END_DATE":null,"PROGRESS":"cs cs cs ","PROBLEM":"测试","PRO_DEPT":"测试","PLAN":"测试","RESULT":null,"RESULT_REASON":null,"RESULT_DATE":null,"ASK_DATE":{"date":28,"day":6,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532707200000,"timezoneOffset":-480,"year":118},"READ":1,"REFUSE_NUMBER":null,"DEPARTMENT_NAME":"财政局","APPMAN":"财政局测试","APPMAN_GUID":"{AC1D3315-FFFF-FFFF-98E8-0DBE00000008}","SUPERVISION_GUID":"{A49F343E-DC46-488F-AE86-C68A1E2C92A1}","DEPARTMENT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","COMPLETE":0,"ITEM_TITLE":"测试7.26下午","ITEM_NUMBER":"FTDC2018SRW305-1"}]
     * result : success
     * msg : successful
     */

    private String result;
    private String msg;
    private List<ListBean> list;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * UNDERTAKE_BACK_GUID : {407B3389-E8D4-4379-AB1B-2296C8EA711E}
         * SPECIFIC_GUID : {26C8BE52-1732-4274-951B-26746768A648}
         * MESSAGE : 1
         * CONTEXT : null
         * CREATE_DATE : {"date":30,"day":1,"hours":17,"minutes":55,"month":6,"nanos":0,"seconds":33,"time":1532944533000,"timezoneOffset":-480,"year":118}
         * DELETE_DATE : null
         * EXIST : 1
         * END_DATE : null
         * PROGRESS : cs cs cs
         * PROBLEM : 测试
         * PRO_DEPT : 测试
         * PLAN : 测试
         * RESULT : null
         * RESULT_REASON : null
         * RESULT_DATE : null
         * ASK_DATE : {"date":28,"day":6,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532707200000,"timezoneOffset":-480,"year":118}
         * READ : 1
         * REFUSE_NUMBER : null
         * DEPARTMENT_NAME : 财政局
         * APPMAN : 财政局测试
         * APPMAN_GUID : {AC1D3315-FFFF-FFFF-98E8-0DBE00000008}
         * SUPERVISION_GUID : {A49F343E-DC46-488F-AE86-C68A1E2C92A1}
         * DEPARTMENT_GUID : {6901F467-5E33-1C41-B0AC-49DA332438C2}
         * COMPLETE : 0
         * ITEM_TITLE : 测试7.26下午
         * ITEM_NUMBER : FTDC2018SRW305-1
         */

        private String UNDERTAKE_BACK_GUID;
        private String SPECIFIC_GUID;
        private int MESSAGE;
        private Object CONTEXT;
        private CREATEDATEBean CREATE_DATE;
        private Object DELETE_DATE;
        private int EXIST;
        private Object END_DATE;
        private String PROGRESS;
        private String PROBLEM;
        private String PRO_DEPT;
        private String PLAN;
        private int RESULT;
        private Object RESULT_REASON;
        private ASKDATEBean RESULT_DATE;
        private ASKDATEBean ASK_DATE;
        private int READ;
        private Object REFUSE_NUMBER;
        private String DEPARTMENT_NAME;
        private String APPMAN;
        private String APPMAN_GUID;
        private String SUPERVISION_GUID;
        private String DEPARTMENT_GUID;
        private int COMPLETE;
        private String ITEM_TITLE;
        private String ITEM_NUMBER;

        public String getUNDERTAKE_BACK_GUID() {
            return UNDERTAKE_BACK_GUID;
        }

        public void setUNDERTAKE_BACK_GUID(String UNDERTAKE_BACK_GUID) {
            this.UNDERTAKE_BACK_GUID = UNDERTAKE_BACK_GUID;
        }

        public String getSPECIFIC_GUID() {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID) {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public int getMESSAGE() {
            return MESSAGE;
        }

        public void setMESSAGE(int MESSAGE) {
            this.MESSAGE = MESSAGE;
        }

        public Object getCONTEXT() {
            return CONTEXT;
        }

        public void setCONTEXT(Object CONTEXT) {
            this.CONTEXT = CONTEXT;
        }

        public CREATEDATEBean getCREATE_DATE() {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE) {
            this.CREATE_DATE = CREATE_DATE;
        }

        public Object getDELETE_DATE() {
            return DELETE_DATE;
        }

        public void setDELETE_DATE(Object DELETE_DATE) {
            this.DELETE_DATE = DELETE_DATE;
        }

        public int getEXIST() {
            return EXIST;
        }

        public void setEXIST(int EXIST) {
            this.EXIST = EXIST;
        }

        public Object getEND_DATE() {
            return END_DATE;
        }

        public void setEND_DATE(Object END_DATE) {
            this.END_DATE = END_DATE;
        }

        public String getPROGRESS() {
            return PROGRESS;
        }

        public void setPROGRESS(String PROGRESS) {
            this.PROGRESS = PROGRESS;
        }

        public String getPROBLEM() {
            return PROBLEM;
        }

        public void setPROBLEM(String PROBLEM) {
            this.PROBLEM = PROBLEM;
        }

        public String getPRO_DEPT() {
            return PRO_DEPT;
        }

        public void setPRO_DEPT(String PRO_DEPT) {
            this.PRO_DEPT = PRO_DEPT;
        }

        public String getPLAN() {
            return PLAN;
        }

        public void setPLAN(String PLAN) {
            this.PLAN = PLAN;
        }

        public int getRESULT() {
            return RESULT;
        }

        public void setRESULT(int RESULT) {
            this.RESULT = RESULT;
        }

        public Object getRESULT_REASON() {
            return RESULT_REASON;
        }

        public void setRESULT_REASON(Object RESULT_REASON) {
            this.RESULT_REASON = RESULT_REASON;
        }

        public ASKDATEBean getRESULT_DATE() {
            return RESULT_DATE;
        }

        public void setRESULT_DATE(ASKDATEBean RESULT_DATE) {
            this.RESULT_DATE = RESULT_DATE;
        }

        public ASKDATEBean getASK_DATE() {
            return ASK_DATE;
        }

        public void setASK_DATE(ASKDATEBean ASK_DATE) {
            this.ASK_DATE = ASK_DATE;
        }

        public int getREAD() {
            return READ;
        }

        public void setREAD(int READ) {
            this.READ = READ;
        }

        public Object getREFUSE_NUMBER() {
            return REFUSE_NUMBER;
        }

        public void setREFUSE_NUMBER(Object REFUSE_NUMBER) {
            this.REFUSE_NUMBER = REFUSE_NUMBER;
        }

        public String getDEPARTMENT_NAME() {
            return DEPARTMENT_NAME;
        }

        public void setDEPARTMENT_NAME(String DEPARTMENT_NAME) {
            this.DEPARTMENT_NAME = DEPARTMENT_NAME;
        }

        public String getAPPMAN() {
            return APPMAN;
        }

        public void setAPPMAN(String APPMAN) {
            this.APPMAN = APPMAN;
        }

        public String getAPPMAN_GUID() {
            return APPMAN_GUID;
        }

        public void setAPPMAN_GUID(String APPMAN_GUID) {
            this.APPMAN_GUID = APPMAN_GUID;
        }

        public String getSUPERVISION_GUID() {
            return SUPERVISION_GUID;
        }

        public void setSUPERVISION_GUID(String SUPERVISION_GUID) {
            this.SUPERVISION_GUID = SUPERVISION_GUID;
        }

        public String getDEPARTMENT_GUID() {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID) {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public int getCOMPLETE() {
            return COMPLETE;
        }

        public void setCOMPLETE(int COMPLETE) {
            this.COMPLETE = COMPLETE;
        }

        public String getITEM_TITLE() {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE) {
            this.ITEM_TITLE = ITEM_TITLE;
        }

        public String getITEM_NUMBER() {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER) {
            this.ITEM_NUMBER = ITEM_NUMBER;
        }

        public static class CREATEDATEBean {
            /**
             * date : 30
             * day : 1
             * hours : 17
             * minutes : 55
             * month : 6
             * nanos : 0
             * seconds : 33
             * time : 1532944533000
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

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getNanos() {
                return nanos;
            }

            public void setNanos(int nanos) {
                this.nanos = nanos;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }

        public static class ASKDATEBean {
            /**
             * date : 28
             * day : 6
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532707200000
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

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getNanos() {
                return nanos;
            }

            public void setNanos(int nanos) {
                this.nanos = nanos;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }
    }
}
