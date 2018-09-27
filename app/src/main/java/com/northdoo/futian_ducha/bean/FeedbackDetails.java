package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/22.
 */

public class FeedbackDetails {

    /**
     * ub : {"UNDERTAKE_BACK_GUID":"{CDEB3CCE-063A-40D3-867D-3F8B0A26B056}","SPECIFIC_GUID":"{ABF57EE2-A807-46FC-9791-40D138B62C0F}","MESSAGE":1,"CONTEXT":null,"CREATE_DATE":{"date":30,"day":1,"hours":18,"minutes":1,"month":6,"nanos":0,"seconds":52,"time":1532944912000,"timezoneOffset":-480,"year":118},"DELETE_DATE":null,"EXIST":1,"END_DATE":null,"PROGRESS":"测试测试测试","PROBLEM":"测试测试","PRO_DEPT":"测试测试测试","PLAN":"测试","RESULT":1,"RESULT_REASON":"测试aa","RESULT_DATE":{"date":8,"day":3,"hours":17,"minutes":41,"month":7,"nanos":0,"seconds":2,"time":1533721262000,"timezoneOffset":-480,"year":118},"ASK_DATE":{"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118},"READ":0,"REFUSE_NUMBER":null,"DEPARTMENT_NAME":"信访局（应急办）","APPMAN":"信访办公室测试","APPMAN_GUID":"{09BE3364-FFFF-FFFF-B4C0-C8E100000001}","SUPERVISION_GUID":"{A49F343E-DC46-488F-AE86-C68A1E2C92A1}","DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","COMPLETE":1,"ITEM_TITLE":null}
     * spe : {"ITEM_NUMBER":"FTDC2018SRW305-2","ITEM_TITLE":"测试7.26下午","SPE_PLAN":"测试测试测试测试"}
     * contents : [{"CONTENT_GUID":"{23FC6827-62F1-40BF-8981-1F4A8CE7A754}","CONTENT":"测试测试测试","SPECIFIC_GUID":"{ABF57EE2-A807-46FC-9791-40D138B62C0F}","CREATE_DATE":{"date":26,"day":4,"hours":14,"minutes":51,"month":6,"nanos":0,"seconds":19,"time":1532587879000,"timezoneOffset":-480,"year":118},"TABINDEX":0,"DEL_STATUS":0}]
     * cos : 发展和改革局
     * file : []
     * result : success
     * msg : successful
     */

    private UbBean ub;
    private SpeBean spe;
    private String cos;
    private String result;
    private String msg;
    private List<ContentsBean> contents;
    private List<FileBean> file;

    public UbBean getUb() {
        return ub;
    }

    public void setUb(UbBean ub) {
        this.ub = ub;
    }

    public SpeBean getSpe() {
        return spe;
    }

    public void setSpe(SpeBean spe) {
        this.spe = spe;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

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

    public List<ContentsBean> getContents() {
        return contents;
    }

    public void setContents(List<ContentsBean> contents) {
        this.contents = contents;
    }

    public List<FileBean> getFile() {
        return file;
    }

    public void setFile(List<FileBean> file) {
        this.file = file;
    }

    public static class UbBean {
        /**
         * UNDERTAKE_BACK_GUID : {CDEB3CCE-063A-40D3-867D-3F8B0A26B056}
         * SPECIFIC_GUID : {ABF57EE2-A807-46FC-9791-40D138B62C0F}
         * MESSAGE : 1
         * CONTEXT : null
         * CREATE_DATE : {"date":30,"day":1,"hours":18,"minutes":1,"month":6,"nanos":0,"seconds":52,"time":1532944912000,"timezoneOffset":-480,"year":118}
         * DELETE_DATE : null
         * EXIST : 1
         * END_DATE : null
         * PROGRESS : 测试测试测试
         * PROBLEM : 测试测试
         * PRO_DEPT : 测试测试测试
         * PLAN : 测试
         * RESULT : 1
         * RESULT_REASON : 测试aa
         * RESULT_DATE : {"date":8,"day":3,"hours":17,"minutes":41,"month":7,"nanos":0,"seconds":2,"time":1533721262000,"timezoneOffset":-480,"year":118}
         * ASK_DATE : {"date":26,"day":4,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532534400000,"timezoneOffset":-480,"year":118}
         * READ : 0
         * REFUSE_NUMBER : null
         * DEPARTMENT_NAME : 信访局（应急办）
         * APPMAN : 信访办公室测试
         * APPMAN_GUID : {09BE3364-FFFF-FFFF-B4C0-C8E100000001}
         * SUPERVISION_GUID : {A49F343E-DC46-488F-AE86-C68A1E2C92A1}
         * DEPARTMENT_GUID : {A133C21C-FEE3-C644-8A4D-41631D1C4055}
         * COMPLETE : 1
         * ITEM_TITLE : null
         */
        private String UNDERTAKE_BACK_GUID;
        private String SPECIFIC_GUID;
        private int MESSAGE;
        private String CONTEXT;
        private CREATEDATEBean CREATE_DATE;
        private Object DELETE_DATE;
        private int EXIST;
        private ASKDATEBean END_DATE;
        private String PROGRESS;
        private String PROBLEM;
        private String PRO_DEPT;
        private String PLAN;
        private int RESULT;
        private String RESULT_REASON;
        private RESULTDATEBean RESULT_DATE;
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

        public String getCONTEXT() {
            return CONTEXT;
        }

        public void setCONTEXT(String CONTEXT) {
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

        public ASKDATEBean getEND_DATE() {
            return END_DATE;
        }

        public void setEND_DATE(ASKDATEBean END_DATE) {
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

        public String getRESULT_REASON() {
            return RESULT_REASON;
        }

        public void setRESULT_REASON(String RESULT_REASON) {
            this.RESULT_REASON = RESULT_REASON;
        }

        public RESULTDATEBean getRESULT_DATE() {
            return RESULT_DATE;
        }

        public void setRESULT_DATE(RESULTDATEBean RESULT_DATE) {
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
             * hours : 18
             * minutes : 1
             * month : 6
             * nanos : 0
             * seconds : 52
             * time : 1532944912000
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

        public static class RESULTDATEBean {
            /**
             * date : 8
             * day : 3
             * hours : 17
             * minutes : 41
             * month : 7
             * nanos : 0
             * seconds : 2
             * time : 1533721262000
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
             * date : 26
             * day : 4
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532534400000
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

    public static class SpeBean {
        /**
         * ITEM_NUMBER : FTDC2018SRW305-2
         * ITEM_TITLE : 测试7.26下午
         * SPE_PLAN : 测试测试测试测试
         */

        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private String SPE_PLAN;

        public String getITEM_NUMBER() {
            return ITEM_NUMBER;
        }

        public void setITEM_NUMBER(String ITEM_NUMBER) {
            this.ITEM_NUMBER = ITEM_NUMBER;
        }

        public String getITEM_TITLE() {
            return ITEM_TITLE;
        }

        public void setITEM_TITLE(String ITEM_TITLE) {
            this.ITEM_TITLE = ITEM_TITLE;
        }

        public String getSPE_PLAN() {
            return SPE_PLAN;
        }

        public void setSPE_PLAN(String SPE_PLAN) {
            this.SPE_PLAN = SPE_PLAN;
        }
    }

    public static class ContentsBean {
        /**
         * CONTENT_GUID : {23FC6827-62F1-40BF-8981-1F4A8CE7A754}
         * CONTENT : 测试测试测试
         * SPECIFIC_GUID : {ABF57EE2-A807-46FC-9791-40D138B62C0F}
         * CREATE_DATE : {"date":26,"day":4,"hours":14,"minutes":51,"month":6,"nanos":0,"seconds":19,"time":1532587879000,"timezoneOffset":-480,"year":118}
         * TABINDEX : 0
         * DEL_STATUS : 0
         */

        private String CONTENT_GUID;
        private String CONTENT;
        private String SPECIFIC_GUID;
        private CREATEDATEBeanX CREATE_DATE;
        private int TABINDEX;
        private int DEL_STATUS;

        public String getCONTENT_GUID() {
            return CONTENT_GUID;
        }

        public void setCONTENT_GUID(String CONTENT_GUID) {
            this.CONTENT_GUID = CONTENT_GUID;
        }

        public String getCONTENT() {
            return CONTENT;
        }

        public void setCONTENT(String CONTENT) {
            this.CONTENT = CONTENT;
        }

        public String getSPECIFIC_GUID() {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID) {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public CREATEDATEBeanX getCREATE_DATE() {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBeanX CREATE_DATE) {
            this.CREATE_DATE = CREATE_DATE;
        }

        public int getTABINDEX() {
            return TABINDEX;
        }

        public void setTABINDEX(int TABINDEX) {
            this.TABINDEX = TABINDEX;
        }

        public int getDEL_STATUS() {
            return DEL_STATUS;
        }

        public void setDEL_STATUS(int DEL_STATUS) {
            this.DEL_STATUS = DEL_STATUS;
        }

        public static class CREATEDATEBeanX {
            /**
             * date : 26
             * day : 4
             * hours : 14
             * minutes : 51
             * month : 6
             * nanos : 0
             * seconds : 19
             * time : 1532587879000
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
