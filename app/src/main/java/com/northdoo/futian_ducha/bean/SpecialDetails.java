package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/22.
 */

public class SpecialDetails
{


    /**
     * supSpe : {"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","ITEM_NUMBER":"福常记[2018]10号-1","ITEM_TITLE":"测试测试测试25","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"BACK_TIME":2,"SEND_DATE":{"date":25,"day":3,"hours":10,"minutes":39,"month":6,"nanos":0,"seconds":10,"time":1532486350000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":"测试","DUTY_PHONE":"82978027","DUTY_LEADER":"熊国雄","DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":"测试目标要求","BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":1,"INFORM_ALL_TIMES":1,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"信访局（应急办）","SUP_NOTICE_ID":"福督[2018]7794号","DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","DUTY_LEADER_GUID":null,"content":[{"CONTENT_GUID":"{C15225E7-421A-4D26-897A-1C86288CB916}","CONTENT":"第一季度：测试认识人","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":0,"DEL_STATUS":0},{"CONTENT_GUID":"{D9450958-52E4-4900-91FF-E269BF9B9896}","CONTENT":"第二季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":1,"DEL_STATUS":0},{"CONTENT_GUID":"{0C5A267E-6251-405A-B1F4-5B4CFB988EA6}","CONTENT":"第三季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":2,"DEL_STATUS":0},{"CONTENT_GUID":"{A15A3019-437E-44C5-89E5-05F42031B390}","CONTENT":"第四季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":3,"DEL_STATUS":0}],"holders1":[],"holders2":[],"cos":[{"HOLD_GUID":"{E15CF8B8-A9B9-4BF1-8883-E3659D9B5511}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","EMPLOYEE_GUID":null,"HOLD_TYPE":4,"CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"READ_TYPE":0,"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","DEPARTMENT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","TRUST_GUID":null,"DEL_STATUS":0,"EMPLOYEE_NAME":null,"DEPARTMENT_NAME":"财政局"}],"typeGuid":"{AC1D334D-0000-0000-0A27-53880000003B}","instructionList":[{"INSTRUCTION_GUID":"{55E7EBC3-8D2C-47CF-A3ED-873963B99415}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","LEADER":"特殊","INSTRUCTION":"特殊特殊","CREATE_DATE":{"date":27,"day":5,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532620800000,"timezoneOffset":-480,"year":118},"ISDELETE":0}],"file":[]}
     * result : success
     * msg : successful
     */

    private SupSpeBean supSpe;
    private String result;
    private String msg;

    public SupSpeBean getSupSpe()
    {
        return supSpe;
    }

    public void setSupSpe(SupSpeBean supSpe)
    {
        this.supSpe = supSpe;
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

    public static class SupSpeBean
    {
        /**
         * SPECIFIC_GUID : {FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}
         * SUPERVISION_GUID : {558B1ABF-6CF6-47CD-AB4B-921D0765934A}
         * ITEM_NUMBER : 福常记[2018]10号-1
         * ITEM_TITLE : 测试测试测试25
         * END_DATE : {"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119}
         * BACK_TIME : 2
         * SEND_DATE : {"date":25,"day":3,"hours":10,"minutes":39,"month":6,"nanos":0,"seconds":10,"time":1532486350000,"timezoneOffset":-480,"year":118}
         * CONTEXT : null
         * DUTY_MAN : 测试
         * DUTY_PHONE : 82978027
         * DUTY_LEADER : 熊国雄
         * DICTIONARY_GUID : {09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}
         * CREATE_DATE : {"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118}
         * READ : 0
         * NEXT_BACK_DATE : {"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118}
         * SIMPLE_TASK : 1
         * SPE_PLAN : 测试目标要求
         * BLAME_TASK : 0
         * PASS_ALONG_TIMES : 0
         * REMIND_TIMES : 0
         * SUPERVISE_TIMES : 0
         * MEETING_TIMES : 1
         * INFORM_ALL_TIMES : 1
         * FEEDBACK_TIMES : 0
         * DELAY_TIMES : 0
         * BLAME_TIMES : 0
         * DEL_STATUS : 0
         * DEPARTMENT_NAME : 信访局（应急办）
         * SUP_NOTICE_ID : 福督[2018]7794号
         * DEPARTMENT_GUID : {A133C21C-FEE3-C644-8A4D-41631D1C4055}
         * DUTY_LEADER_GUID : null
         * content : [{"CONTENT_GUID":"{C15225E7-421A-4D26-897A-1C86288CB916}","CONTENT":"第一季度：测试认识人","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":0,"DEL_STATUS":0},{"CONTENT_GUID":"{D9450958-52E4-4900-91FF-E269BF9B9896}","CONTENT":"第二季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":1,"DEL_STATUS":0},{"CONTENT_GUID":"{0C5A267E-6251-405A-B1F4-5B4CFB988EA6}","CONTENT":"第三季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":2,"DEL_STATUS":0},{"CONTENT_GUID":"{A15A3019-437E-44C5-89E5-05F42031B390}","CONTENT":"第四季度：测试","SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"TABINDEX":3,"DEL_STATUS":0}]
         * holders1 : []
         * holders2 : []
         * cos : [{"HOLD_GUID":"{E15CF8B8-A9B9-4BF1-8883-E3659D9B5511}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","EMPLOYEE_GUID":null,"HOLD_TYPE":4,"CREATE_DATE":{"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118},"READ_TYPE":0,"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","DEPARTMENT_GUID":"{6901F467-5E33-1C41-B0AC-49DA332438C2}","TRUST_GUID":null,"DEL_STATUS":0,"EMPLOYEE_NAME":null,"DEPARTMENT_NAME":"财政局"}]
         * typeGuid : {AC1D334D-0000-0000-0A27-53880000003B}
         * instructionList : [{"INSTRUCTION_GUID":"{55E7EBC3-8D2C-47CF-A3ED-873963B99415}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","LEADER":"特殊","INSTRUCTION":"特殊特殊","CREATE_DATE":{"date":27,"day":5,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532620800000,"timezoneOffset":-480,"year":118},"ISDELETE":0}]
         * file : []
         */

        private String SPECIFIC_GUID;
        private String SUPERVISION_GUID;
        private String ITEM_NUMBER;
        private String ITEM_TITLE;
        private ENDDATEBean END_DATE;
        private int BACK_TIME;
        private SENDDATEBean SEND_DATE;
        private Object CONTEXT;
        private String DUTY_MAN;
        private String DUTY_PHONE;
        private String DUTY_LEADER;
        private String DICTIONARY_GUID;
        private CREATEDATEBean CREATE_DATE;
        private int READ;
        private NEXTBACKDATEBean NEXT_BACK_DATE;
        private int SIMPLE_TASK;
        private String SPE_PLAN;
        private int BLAME_TASK;
        private int PASS_ALONG_TIMES;
        private int REMIND_TIMES;
        private int SUPERVISE_TIMES;
        private int MEETING_TIMES;
        private int INFORM_ALL_TIMES;
        private int FEEDBACK_TIMES;
        private int DELAY_TIMES;
        private int BLAME_TIMES;
        private int DEL_STATUS;
        private String DEPARTMENT_NAME;
        private String SUP_NOTICE_ID;
        private String DEPARTMENT_GUID;
        private Object DUTY_LEADER_GUID;
        private String typeGuid;
        private List<ContentBean> content;
        private List<?> holders1;
        private List<?> holders2;
        private List<CosBean> cos;
        private List<InstructionListBean> instructionList;
        private SpecificListBean specificList;
        private List<FileBean>  file;

        public String getSPECIFIC_GUID()
        {
            return SPECIFIC_GUID;
        }

        public void setSPECIFIC_GUID(String SPECIFIC_GUID)
        {
            this.SPECIFIC_GUID = SPECIFIC_GUID;
        }

        public String getSUPERVISION_GUID()
        {
            return SUPERVISION_GUID;
        }

        public void setSUPERVISION_GUID(String SUPERVISION_GUID)
        {
            this.SUPERVISION_GUID = SUPERVISION_GUID;
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

        public ENDDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(ENDDATEBean END_DATE)
        {
            this.END_DATE = END_DATE;
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

        public Object getCONTEXT()
        {
            return CONTEXT;
        }

        public void setCONTEXT(Object CONTEXT)
        {
            this.CONTEXT = CONTEXT;
        }

        public String getDUTY_MAN()
        {
            return DUTY_MAN;
        }

        public void setDUTY_MAN(String DUTY_MAN)
        {
            this.DUTY_MAN = DUTY_MAN;
        }

        public String getDUTY_PHONE()
        {
            return DUTY_PHONE;
        }

        public void setDUTY_PHONE(String DUTY_PHONE)
        {
            this.DUTY_PHONE = DUTY_PHONE;
        }

        public String getDUTY_LEADER()
        {
            return DUTY_LEADER;
        }

        public void setDUTY_LEADER(String DUTY_LEADER)
        {
            this.DUTY_LEADER = DUTY_LEADER;
        }

        public String getDICTIONARY_GUID()
        {
            return DICTIONARY_GUID;
        }

        public void setDICTIONARY_GUID(String DICTIONARY_GUID)
        {
            this.DICTIONARY_GUID = DICTIONARY_GUID;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public int getREAD()
        {
            return READ;
        }

        public void setREAD(int READ)
        {
            this.READ = READ;
        }

        public NEXTBACKDATEBean getNEXT_BACK_DATE()
        {
            return NEXT_BACK_DATE;
        }

        public void setNEXT_BACK_DATE(NEXTBACKDATEBean NEXT_BACK_DATE)
        {
            this.NEXT_BACK_DATE = NEXT_BACK_DATE;
        }

        public int getSIMPLE_TASK()
        {
            return SIMPLE_TASK;
        }

        public void setSIMPLE_TASK(int SIMPLE_TASK)
        {
            this.SIMPLE_TASK = SIMPLE_TASK;
        }

        public String getSPE_PLAN()
        {
            return SPE_PLAN;
        }

        public void setSPE_PLAN(String SPE_PLAN)
        {
            this.SPE_PLAN = SPE_PLAN;
        }

        public int getBLAME_TASK()
        {
            return BLAME_TASK;
        }

        public void setBLAME_TASK(int BLAME_TASK)
        {
            this.BLAME_TASK = BLAME_TASK;
        }

        public int getPASS_ALONG_TIMES()
        {
            return PASS_ALONG_TIMES;
        }

        public void setPASS_ALONG_TIMES(int PASS_ALONG_TIMES)
        {
            this.PASS_ALONG_TIMES = PASS_ALONG_TIMES;
        }

        public int getREMIND_TIMES()
        {
            return REMIND_TIMES;
        }

        public void setREMIND_TIMES(int REMIND_TIMES)
        {
            this.REMIND_TIMES = REMIND_TIMES;
        }

        public int getSUPERVISE_TIMES()
        {
            return SUPERVISE_TIMES;
        }

        public void setSUPERVISE_TIMES(int SUPERVISE_TIMES)
        {
            this.SUPERVISE_TIMES = SUPERVISE_TIMES;
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

        public int getBLAME_TIMES()
        {
            return BLAME_TIMES;
        }

        public void setBLAME_TIMES(int BLAME_TIMES)
        {
            this.BLAME_TIMES = BLAME_TIMES;
        }

        public int getDEL_STATUS()
        {
            return DEL_STATUS;
        }

        public void setDEL_STATUS(int DEL_STATUS)
        {
            this.DEL_STATUS = DEL_STATUS;
        }

        public String getDEPARTMENT_NAME()
        {
            return DEPARTMENT_NAME;
        }

        public void setDEPARTMENT_NAME(String DEPARTMENT_NAME)
        {
            this.DEPARTMENT_NAME = DEPARTMENT_NAME;
        }

        public String getSUP_NOTICE_ID()
        {
            return SUP_NOTICE_ID;
        }

        public void setSUP_NOTICE_ID(String SUP_NOTICE_ID)
        {
            this.SUP_NOTICE_ID = SUP_NOTICE_ID;
        }

        public String getDEPARTMENT_GUID()
        {
            return DEPARTMENT_GUID;
        }

        public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
        {
            this.DEPARTMENT_GUID = DEPARTMENT_GUID;
        }

        public Object getDUTY_LEADER_GUID()
        {
            return DUTY_LEADER_GUID;
        }

        public void setDUTY_LEADER_GUID(Object DUTY_LEADER_GUID)
        {
            this.DUTY_LEADER_GUID = DUTY_LEADER_GUID;
        }

        public String getTypeGuid()
        {
            return typeGuid;
        }

        public void setTypeGuid(String typeGuid)
        {
            this.typeGuid = typeGuid;
        }

        public List<ContentBean> getContent()
        {
            return content;
        }

        public void setContent(List<ContentBean> content)
        {
            this.content = content;
        }

        public List<?> getHolders1()
        {
            return holders1;
        }

        public void setHolders1(List<?> holders1)
        {
            this.holders1 = holders1;
        }

        public List<?> getHolders2()
        {
            return holders2;
        }

        public void setHolders2(List<?> holders2)
        {
            this.holders2 = holders2;
        }

        public List<CosBean> getCos()
        {
            return cos;
        }

        public void setCos(List<CosBean> cos)
        {
            this.cos = cos;
        }

        public List<InstructionListBean> getInstructionList()
        {
            return instructionList;
        }

        public void setInstructionList(List<InstructionListBean> instructionList)
        {
            this.instructionList = instructionList;
        }

        public List<FileBean>  getFile()
        {
            return file;
        }

        public void setFile(List<FileBean>  file)
        {
            this.file = file;
        }

        public SpecificListBean getSpecificList()
        {
            return specificList;
        }

        public void setSpecificList(SpecificListBean specificList)
        {
            this.specificList = specificList;
        }

        public static class ENDDATEBean
        {
            /**
             * date : 31
             * day : 3
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1564502400000
             * timezoneOffset : -480
             * year : 119
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
             * date : 25
             * day : 3
             * hours : 10
             * minutes : 39
             * month : 6
             * nanos : 0
             * seconds : 10
             * time : 1532486350000
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
             * date : 25
             * day : 3
             * hours : 0
             * minutes : 0
             * month : 6
             * nanos : 0
             * seconds : 0
             * time : 1532448000000
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

        public static class NEXTBACKDATEBean
        {
            /**
             * date : 25
             * day : 2
             * hours : 0
             * minutes : 0
             * month : 8
             * nanos : 0
             * seconds : 0
             * time : 1537804800000
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

        public static class ContentBean
        {
            /**
             * CONTENT_GUID : {C15225E7-421A-4D26-897A-1C86288CB916}
             * CONTENT : 第一季度：测试认识人
             * SPECIFIC_GUID : {FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}
             * CREATE_DATE : {"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118}
             * TABINDEX : 0
             * DEL_STATUS : 0
             */

            private String CONTENT_GUID;
            private String CONTENT;
            private String SPECIFIC_GUID;
            private CREATEDATEBeanX CREATE_DATE;
            private int TABINDEX;
            private int DEL_STATUS;

            public String getCONTENT_GUID()
            {
                return CONTENT_GUID;
            }

            public void setCONTENT_GUID(String CONTENT_GUID)
            {
                this.CONTENT_GUID = CONTENT_GUID;
            }

            public String getCONTENT()
            {
                return CONTENT;
            }

            public void setCONTENT(String CONTENT)
            {
                this.CONTENT = CONTENT;
            }

            public String getSPECIFIC_GUID()
            {
                return SPECIFIC_GUID;
            }

            public void setSPECIFIC_GUID(String SPECIFIC_GUID)
            {
                this.SPECIFIC_GUID = SPECIFIC_GUID;
            }

            public CREATEDATEBeanX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBeanX CREATE_DATE)
            {
                this.CREATE_DATE = CREATE_DATE;
            }

            public int getTABINDEX()
            {
                return TABINDEX;
            }

            public void setTABINDEX(int TABINDEX)
            {
                this.TABINDEX = TABINDEX;
            }

            public int getDEL_STATUS()
            {
                return DEL_STATUS;
            }

            public void setDEL_STATUS(int DEL_STATUS)
            {
                this.DEL_STATUS = DEL_STATUS;
            }

            public static class CREATEDATEBeanX
            {
                /**
                 * date : 25
                 * day : 3
                 * hours : 10
                 * minutes : 36
                 * month : 6
                 * nanos : 0
                 * seconds : 23
                 * time : 1532486183000
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

        public static class CosBean
        {
            /**
             * HOLD_GUID : {E15CF8B8-A9B9-4BF1-8883-E3659D9B5511}
             * SUPERVISION_GUID : {558B1ABF-6CF6-47CD-AB4B-921D0765934A}
             * EMPLOYEE_GUID : null
             * HOLD_TYPE : 4
             * CREATE_DATE : {"date":25,"day":3,"hours":10,"minutes":36,"month":6,"nanos":0,"seconds":23,"time":1532486183000,"timezoneOffset":-480,"year":118}
             * READ_TYPE : 0
             * SPECIFIC_GUID : {FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}
             * DEPARTMENT_GUID : {6901F467-5E33-1C41-B0AC-49DA332438C2}
             * TRUST_GUID : null
             * DEL_STATUS : 0
             * EMPLOYEE_NAME : null
             * DEPARTMENT_NAME : 财政局
             */

            private String HOLD_GUID;
            private String SUPERVISION_GUID;
            private Object EMPLOYEE_GUID;
            private int HOLD_TYPE;
            private CREATEDATEBeanXX CREATE_DATE;
            private int READ_TYPE;
            private String SPECIFIC_GUID;
            private String DEPARTMENT_GUID;
            private Object TRUST_GUID;
            private int DEL_STATUS;
            private Object EMPLOYEE_NAME;
            private String DEPARTMENT_NAME;

            public String getHOLD_GUID()
            {
                return HOLD_GUID;
            }

            public void setHOLD_GUID(String HOLD_GUID)
            {
                this.HOLD_GUID = HOLD_GUID;
            }

            public String getSUPERVISION_GUID()
            {
                return SUPERVISION_GUID;
            }

            public void setSUPERVISION_GUID(String SUPERVISION_GUID)
            {
                this.SUPERVISION_GUID = SUPERVISION_GUID;
            }

            public Object getEMPLOYEE_GUID()
            {
                return EMPLOYEE_GUID;
            }

            public void setEMPLOYEE_GUID(Object EMPLOYEE_GUID)
            {
                this.EMPLOYEE_GUID = EMPLOYEE_GUID;
            }

            public int getHOLD_TYPE()
            {
                return HOLD_TYPE;
            }

            public void setHOLD_TYPE(int HOLD_TYPE)
            {
                this.HOLD_TYPE = HOLD_TYPE;
            }

            public CREATEDATEBeanXX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBeanXX CREATE_DATE)
            {
                this.CREATE_DATE = CREATE_DATE;
            }

            public int getREAD_TYPE()
            {
                return READ_TYPE;
            }

            public void setREAD_TYPE(int READ_TYPE)
            {
                this.READ_TYPE = READ_TYPE;
            }

            public String getSPECIFIC_GUID()
            {
                return SPECIFIC_GUID;
            }

            public void setSPECIFIC_GUID(String SPECIFIC_GUID)
            {
                this.SPECIFIC_GUID = SPECIFIC_GUID;
            }

            public String getDEPARTMENT_GUID()
            {
                return DEPARTMENT_GUID;
            }

            public void setDEPARTMENT_GUID(String DEPARTMENT_GUID)
            {
                this.DEPARTMENT_GUID = DEPARTMENT_GUID;
            }

            public Object getTRUST_GUID()
            {
                return TRUST_GUID;
            }

            public void setTRUST_GUID(Object TRUST_GUID)
            {
                this.TRUST_GUID = TRUST_GUID;
            }

            public int getDEL_STATUS()
            {
                return DEL_STATUS;
            }

            public void setDEL_STATUS(int DEL_STATUS)
            {
                this.DEL_STATUS = DEL_STATUS;
            }

            public Object getEMPLOYEE_NAME()
            {
                return EMPLOYEE_NAME;
            }

            public void setEMPLOYEE_NAME(Object EMPLOYEE_NAME)
            {
                this.EMPLOYEE_NAME = EMPLOYEE_NAME;
            }

            public String getDEPARTMENT_NAME()
            {
                return DEPARTMENT_NAME;
            }

            public void setDEPARTMENT_NAME(String DEPARTMENT_NAME)
            {
                this.DEPARTMENT_NAME = DEPARTMENT_NAME;
            }

            public static class CREATEDATEBeanXX
            {
                /**
                 * date : 25
                 * day : 3
                 * hours : 10
                 * minutes : 36
                 * month : 6
                 * nanos : 0
                 * seconds : 23
                 * time : 1532486183000
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

        public static class InstructionListBean
        {
            /**
             * INSTRUCTION_GUID : {55E7EBC3-8D2C-47CF-A3ED-873963B99415}
             * SUPERVISION_GUID : {558B1ABF-6CF6-47CD-AB4B-921D0765934A}
             * LEADER : 特殊
             * INSTRUCTION : 特殊特殊
             * CREATE_DATE : {"date":27,"day":5,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532620800000,"timezoneOffset":-480,"year":118}
             * ISDELETE : 0
             */

            private String INSTRUCTION_GUID;
            private String SUPERVISION_GUID;
            private String LEADER;
            private String INSTRUCTION;
            private CREATEDATEBeanXXX CREATE_DATE;
            private int ISDELETE;

            public String getINSTRUCTION_GUID()
            {
                return INSTRUCTION_GUID;
            }

            public void setINSTRUCTION_GUID(String INSTRUCTION_GUID)
            {
                this.INSTRUCTION_GUID = INSTRUCTION_GUID;
            }

            public String getSUPERVISION_GUID()
            {
                return SUPERVISION_GUID;
            }

            public void setSUPERVISION_GUID(String SUPERVISION_GUID)
            {
                this.SUPERVISION_GUID = SUPERVISION_GUID;
            }

            public String getLEADER()
            {
                return LEADER;
            }

            public void setLEADER(String LEADER)
            {
                this.LEADER = LEADER;
            }

            public String getINSTRUCTION()
            {
                return INSTRUCTION;
            }

            public void setINSTRUCTION(String INSTRUCTION)
            {
                this.INSTRUCTION = INSTRUCTION;
            }

            public CREATEDATEBeanXXX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBeanXXX CREATE_DATE)
            {
                this.CREATE_DATE = CREATE_DATE;
            }

            public int getISDELETE()
            {
                return ISDELETE;
            }

            public void setISDELETE(int ISDELETE)
            {
                this.ISDELETE = ISDELETE;
            }

            public static class CREATEDATEBeanXXX
            {
                /**
                 * date : 27
                 * day : 5
                 * hours : 0
                 * minutes : 0
                 * month : 6
                 * nanos : 0
                 * seconds : 0
                 * time : 1532620800000
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

        public static class SpecificListBean
        {
            /**
             * totalrecords : 3
             * items : [{"LIGHT":"red","FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":1,"MAIN":"督查测试","COS":null,"DETPLAN_GUID":"{6A813D3A-C752-4005-86A0-AE70B8AC673C}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0001","ITEM_TITLE":"test2","END_DATE":null,"NEXT_BACK_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":1,"day":3,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533052800000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":1,"day":3,"hours":14,"minutes":8,"month":7,"nanos":0,"seconds":36,"time":1533103716000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":1,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0},{"LIGHT":"green","FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":0,"MAIN":"督查测试","COS":"办文科测试,两办测试用户","DETPLAN_GUID":"{F761C6A9-F1F0-4FD1-B5DB-13548D39A775}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0003","ITEM_TITLE":"test2","END_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"NEXT_BACK_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":9,"minutes":10,"month":7,"nanos":0,"seconds":48,"time":1533863448000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":1,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0},{"LIGHT":"green","FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":0,"MAIN":"督查测试","COS":"办文科测试,两办测试用户","DETPLAN_GUID":"{4E84F3C6-7351-40DA-8909-5F543B41175E}","SPECIFIC_GUID":"{0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}","DICTIONARY_GUID":"{BFA80164-FFFF-FFFF-DD67-A38E00000023}","ITEM_NUMBER":"FTDC2018QT162-1-0002","ITEM_TITLE":"test2","END_DATE":{"date":1,"day":6,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1535731200000,"timezoneOffset":-480,"year":118},"NEXT_BACK_DATE":{"date":30,"day":0,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1538236800000,"timezoneOffset":-480,"year":118},"BACK_TIME":0,"SEND_DATE":{"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118},"CREATE_DATE":{"date":10,"day":5,"hours":9,"minutes":9,"month":7,"nanos":0,"seconds":31,"time":1533863371000,"timezoneOffset":-480,"year":118},"CONTEXT":"test","READ":0,"EXIST":1,"DELETE_DATE":null,"REMOVER":null,"REMIND_TIMES":0,"MEETING_TIMES":0,"INFORM_ALL_TIMES":0,"FEEDBACK_TIMES":0,"DELAY_TIMES":1,"PASS_ALONG_TIMES":0}]
             */

            private int totalrecords;
            private List<SpecificListBean.ItemsBean> items;

            public int getTotalrecords()
            {
                return totalrecords;
            }

            public void setTotalrecords(int totalrecords)
            {
                this.totalrecords = totalrecords;
            }

            public List<SpecificListBean.ItemsBean> getItems()
            {
                return items;
            }

            public void setItems(List<SpecificListBean.ItemsBean> items)
            {
                this.items = items;
            }

            public static class ItemsBean
            {
                /**
                 * LIGHT : red
                 * FEEDBACK_UNREADNUMBER : 0
                 * DELAY_UNREADNUMBER : 1
                 * MAIN : 督查测试
                 * COS : null
                 * DETPLAN_GUID : {6A813D3A-C752-4005-86A0-AE70B8AC673C}
                 * SPECIFIC_GUID : {0BAEB639-DA39-4A20-AED6-F0EB4D5747F6}
                 * DICTIONARY_GUID : {BFA80164-FFFF-FFFF-DD67-A38E00000023}
                 * ITEM_NUMBER : FTDC2018QT162-1-0001
                 * ITEM_TITLE : test2
                 * END_DATE : null
                 * NEXT_BACK_DATE : {"date":10,"day":5,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533830400000,"timezoneOffset":-480,"year":118}
                 * BACK_TIME : 0
                 * SEND_DATE : {"date":1,"day":3,"hours":0,"minutes":0,"month":7,"nanos":0,"seconds":0,"time":1533052800000,"timezoneOffset":-480,"year":118}
                 * CREATE_DATE : {"date":1,"day":3,"hours":14,"minutes":8,"month":7,"nanos":0,"seconds":36,"time":1533103716000,"timezoneOffset":-480,"year":118}
                 * CONTEXT : null
                 * READ : 0
                 * EXIST : 1
                 * DELETE_DATE : null
                 * REMOVER : null
                 * REMIND_TIMES : 0
                 * MEETING_TIMES : 0
                 * INFORM_ALL_TIMES : 0
                 * FEEDBACK_TIMES : 1
                 * DELAY_TIMES : 1
                 * PASS_ALONG_TIMES : 0
                 */

                private String LIGHT;
                private int FEEDBACK_UNREADNUMBER;
                private int DELAY_UNREADNUMBER;
                private String MAIN;
                private Object COS;
                private String DETPLAN_GUID;
                private String SPECIFIC_GUID;
                private String DICTIONARY_GUID;
                private String ITEM_NUMBER;
                private String ITEM_TITLE;
                private Object END_DATE;
                private SpecificListBean.ItemsBean.NEXTBACKDATEBeanX NEXT_BACK_DATE;
                private int BACK_TIME;
                private SpecificListBean.ItemsBean.SENDDATEBeanX SEND_DATE;
                private SpecificListBean.ItemsBean.CREATEDATEBeanX CREATE_DATE;
                private Object CONTEXT;
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

                public String getLIGHT()
                {
                    return LIGHT;
                }

                public void setLIGHT(String LIGHT)
                {
                    this.LIGHT = LIGHT;
                }

                public int getFEEDBACK_UNREADNUMBER()
                {
                    return FEEDBACK_UNREADNUMBER;
                }

                public void setFEEDBACK_UNREADNUMBER(int FEEDBACK_UNREADNUMBER)
                {
                    this.FEEDBACK_UNREADNUMBER = FEEDBACK_UNREADNUMBER;
                }

                public int getDELAY_UNREADNUMBER()
                {
                    return DELAY_UNREADNUMBER;
                }

                public void setDELAY_UNREADNUMBER(int DELAY_UNREADNUMBER)
                {
                    this.DELAY_UNREADNUMBER = DELAY_UNREADNUMBER;
                }

                public String getMAIN()
                {
                    return MAIN;
                }

                public void setMAIN(String MAIN)
                {
                    this.MAIN = MAIN;
                }

                public Object getCOS()
                {
                    return COS;
                }

                public void setCOS(Object COS)
                {
                    this.COS = COS;
                }

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

                public Object getEND_DATE()
                {
                    return END_DATE;
                }

                public void setEND_DATE(Object END_DATE)
                {
                    this.END_DATE = END_DATE;
                }

                public SpecificListBean.ItemsBean.NEXTBACKDATEBeanX getNEXT_BACK_DATE()
                {
                    return NEXT_BACK_DATE;
                }

                public void setNEXT_BACK_DATE(SpecificListBean.ItemsBean.NEXTBACKDATEBeanX NEXT_BACK_DATE)
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

                public SpecificListBean.ItemsBean.SENDDATEBeanX getSEND_DATE()
                {
                    return SEND_DATE;
                }

                public void setSEND_DATE(SpecificListBean.ItemsBean.SENDDATEBeanX SEND_DATE)
                {
                    this.SEND_DATE = SEND_DATE;
                }

                public SpecificListBean.ItemsBean.CREATEDATEBeanX getCREATE_DATE()
                {
                    return CREATE_DATE;
                }

                public void setCREATE_DATE(SpecificListBean.ItemsBean.CREATEDATEBeanX CREATE_DATE)
                {
                    this.CREATE_DATE = CREATE_DATE;
                }

                public Object getCONTEXT()
                {
                    return CONTEXT;
                }

                public void setCONTEXT(Object CONTEXT)
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

                public static class NEXTBACKDATEBeanX
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

                public static class SENDDATEBeanX
                {
                    /**
                     * date : 1
                     * day : 3
                     * hours : 0
                     * minutes : 0
                     * month : 7
                     * nanos : 0
                     * seconds : 0
                     * time : 1533052800000
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

                public static class CREATEDATEBeanX
                {
                    /**
                     * date : 1
                     * day : 3
                     * hours : 14
                     * minutes : 8
                     * month : 7
                     * nanos : 0
                     * seconds : 36
                     * time : 1533103716000
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
}
