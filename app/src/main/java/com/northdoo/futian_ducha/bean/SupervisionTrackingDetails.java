package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/15.
 */

public class SupervisionTrackingDetails
{


    /**
     * sup : {"SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","TYPE_GUID":"{AC1D334D-0000-0000-0A27-53880000003B}","EMPLOYEE_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","ITEM_TITLE":"测试测试测试25","ITEM_NUMBER":"福常记[2018]10号","FROM_NUMBER":"特色他","LEADER_NAME":"特殊","MAIN_CONTEXT":"测试测试长沙村是","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","ITEM_SOURCE":"特色他","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"SIMPLE_TASK":1,"DEL_STATUS":0,"SUPERVISION_HOLDER":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","TYPE_NAME":"区委常委会议","EMPLOYEE_NAME":"督查测试","leaders":[{"INSTRUCTION_GUID":"{55E7EBC3-8D2C-47CF-A3ED-873963B99415}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","LEADER":"特殊","INSTRUCTION":"特殊特殊","CREATE_DATE":{"date":27,"day":5,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532620800000,"timezoneOffset":-480,"year":118},"ISDELETE":0}],"specificList":{"totalrecords":1,"items":[{"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","ITEM_NUMBER":"福常记[2018]10号-1","ITEM_TITLE":"测试测试测试25","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"BACK_TIME":2,"SEND_DATE":{"date":25,"day":3,"hours":10,"minutes":39,"month":6,"nanos":0,"seconds":10,"time":1532486350000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":"测试","DUTY_PHONE":"82978027","DUTY_LEADER":"熊国雄","DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":"测试目标要求","BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":1,"INFORM_ALL_TIMES":1,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"信访局（应急办）","SUP_NOTICE_ID":"福督[2018]7794号","DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","DUTY_LEADER_GUID":null,"NAME":"已交办","LIGHT":0,"FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":0,"COS":"财政局"}]},"file":[]}
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
         * SUPERVISION_GUID : {558B1ABF-6CF6-47CD-AB4B-921D0765934A}
         * TYPE_GUID : {AC1D334D-0000-0000-0A27-53880000003B}
         * EMPLOYEE_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * ITEM_TITLE : 测试测试测试25
         * ITEM_NUMBER : 福常记[2018]10号
         * FROM_NUMBER : 特色他
         * LEADER_NAME : 特殊
         * MAIN_CONTEXT : 测试测试长沙村是
         * CREATE_DATE : {"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118}
         * DICTIONARY_GUID : {09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}
         * ITEM_SOURCE : 特色他
         * END_DATE : {"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119}
         * SIMPLE_TASK : 1
         * DEL_STATUS : 0
         * SUPERVISION_HOLDER : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * TYPE_NAME : 区委常委会议
         * EMPLOYEE_NAME : 督查测试
         * leaders : [{"INSTRUCTION_GUID":"{55E7EBC3-8D2C-47CF-A3ED-873963B99415}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","LEADER":"特殊","INSTRUCTION":"特殊特殊","CREATE_DATE":{"date":27,"day":5,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532620800000,"timezoneOffset":-480,"year":118},"ISDELETE":0}]
         * specificList : {"totalrecords":1,"items":[{"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","ITEM_NUMBER":"福常记[2018]10号-1","ITEM_TITLE":"测试测试测试25","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"BACK_TIME":2,"SEND_DATE":{"date":25,"day":3,"hours":10,"minutes":39,"month":6,"nanos":0,"seconds":10,"time":1532486350000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":"测试","DUTY_PHONE":"82978027","DUTY_LEADER":"熊国雄","DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":"测试目标要求","BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":1,"INFORM_ALL_TIMES":1,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"信访局（应急办）","SUP_NOTICE_ID":"福督[2018]7794号","DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","DUTY_LEADER_GUID":null,"NAME":"已交办","LIGHT":0,"FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":0,"COS":"财政局"}]}
         * file : []
         */

        private String SUPERVISION_GUID;
        private String TYPE_GUID;
        private String EMPLOYEE_GUID;
        private String ITEM_TITLE;
        private String ITEM_NUMBER;
        private String FROM_NUMBER;
        private String LEADER_NAME;
        private String MAIN_CONTEXT;
        private CREATEDATEBean CREATE_DATE;
        private String DICTIONARY_GUID;
        private String ITEM_SOURCE;
        private ENDDATEBean END_DATE;
        private int SIMPLE_TASK;
        private int DEL_STATUS;
        private String SUPERVISION_HOLDER;
        private String TYPE_NAME;
        private String EMPLOYEE_NAME;
        private SpecificListBean specificList;
        private List<LeadersBean> leaders;
        private List<FileBean>  file;

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

        public String getFROM_NUMBER()
        {
            return FROM_NUMBER;
        }

        public void setFROM_NUMBER(String FROM_NUMBER)
        {
            this.FROM_NUMBER = FROM_NUMBER;
        }

        public String getLEADER_NAME()
        {
            return LEADER_NAME;
        }

        public void setLEADER_NAME(String LEADER_NAME)
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

        public String getITEM_SOURCE()
        {
            return ITEM_SOURCE;
        }

        public void setITEM_SOURCE(String ITEM_SOURCE)
        {
            this.ITEM_SOURCE = ITEM_SOURCE;
        }

        public ENDDATEBean getEND_DATE()
        {
            return END_DATE;
        }

        public void setEND_DATE(ENDDATEBean END_DATE)
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

        public SpecificListBean getSpecificList()
        {
            return specificList;
        }

        public void setSpecificList(SpecificListBean specificList)
        {
            this.specificList = specificList;
        }

        public List<LeadersBean> getLeaders()
        {
            return leaders;
        }

        public void setLeaders(List<LeadersBean> leaders)
        {
            this.leaders = leaders;
        }

        public List<FileBean>  getFile()
        {
            return file;
        }

        public void setFile(List<FileBean>  file)
        {
            this.file = file;
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
            private long time=0;
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
            private long time=0;
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

        public static class SpecificListBean
        {
            /**
             * totalrecords : 1
             * items : [{"SPECIFIC_GUID":"{FA26A33D-F5C6-4B2D-AC32-F46A3E32ED8A}","SUPERVISION_GUID":"{558B1ABF-6CF6-47CD-AB4B-921D0765934A}","ITEM_NUMBER":"福常记[2018]10号-1","ITEM_TITLE":"测试测试测试25","END_DATE":{"date":31,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1564502400000,"timezoneOffset":-480,"year":119},"BACK_TIME":2,"SEND_DATE":{"date":25,"day":3,"hours":10,"minutes":39,"month":6,"nanos":0,"seconds":10,"time":1532486350000,"timezoneOffset":-480,"year":118},"CONTEXT":null,"DUTY_MAN":"测试","DUTY_PHONE":"82978027","DUTY_LEADER":"熊国雄","DICTIONARY_GUID":"{09BFCB0B-FFFF-FFFF-BF3A-AB8300000022}","CREATE_DATE":{"date":25,"day":3,"hours":0,"minutes":0,"month":6,"nanos":0,"seconds":0,"time":1532448000000,"timezoneOffset":-480,"year":118},"READ":0,"NEXT_BACK_DATE":{"date":25,"day":2,"hours":0,"minutes":0,"month":8,"nanos":0,"seconds":0,"time":1537804800000,"timezoneOffset":-480,"year":118},"SIMPLE_TASK":1,"SPE_PLAN":"测试目标要求","BLAME_TASK":0,"PASS_ALONG_TIMES":0,"REMIND_TIMES":0,"SUPERVISE_TIMES":0,"MEETING_TIMES":1,"INFORM_ALL_TIMES":1,"FEEDBACK_TIMES":0,"DELAY_TIMES":0,"BLAME_TIMES":0,"DEL_STATUS":0,"DEPARTMENT_NAME":"信访局（应急办）","SUP_NOTICE_ID":"福督[2018]7794号","DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","DUTY_LEADER_GUID":null,"NAME":"已交办","LIGHT":0,"FEEDBACK_UNREADNUMBER":0,"DELAY_UNREADNUMBER":0,"COS":"财政局"}]
             */

            private int totalrecords;
            private List<ItemsBean> items;

            public int getTotalrecords()
            {
                return totalrecords;
            }

            public void setTotalrecords(int totalrecords)
            {
                this.totalrecords = totalrecords;
            }

            public List<ItemsBean> getItems()
            {
                return items;
            }

            public void setItems(List<ItemsBean> items)
            {
                this.items = items;
            }

            public static class ItemsBean
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
                 * NAME : 已交办
                 * LIGHT : 0
                 * FEEDBACK_UNREADNUMBER : 0
                 * DELAY_UNREADNUMBER : 0
                 * COS : 财政局
                 */

                private String SPECIFIC_GUID;
                private String SUPERVISION_GUID;
                private String ITEM_NUMBER;
                private String ITEM_TITLE;
                private ENDDATEBeanX END_DATE;
                private int BACK_TIME;
                private SENDDATEBean SEND_DATE;
                private Object CONTEXT;
                private String DUTY_MAN;
                private String DUTY_PHONE;
                private String DUTY_LEADER;
                private String DICTIONARY_GUID;
                private CREATEDATEBeanX CREATE_DATE;
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
                private String NAME;
                private int LIGHT;
                private int FEEDBACK_UNREADNUMBER;
                private int DELAY_UNREADNUMBER;
                private String COS;

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

                public ENDDATEBeanX getEND_DATE()
                {
                    return END_DATE;
                }

                public void setEND_DATE(ENDDATEBeanX END_DATE)
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

                public CREATEDATEBeanX getCREATE_DATE()
                {
                    return CREATE_DATE;
                }

                public void setCREATE_DATE(CREATEDATEBeanX CREATE_DATE)
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

                public String getNAME()
                {
                    return NAME;
                }

                public void setNAME(String NAME)
                {
                    this.NAME = NAME;
                }

                public int getLIGHT()
                {
                    return LIGHT;
                }

                public void setLIGHT(int LIGHT)
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

                public String getCOS()
                {
                    return COS;
                }

                public void setCOS(String COS)
                {
                    this.COS = COS;
                }

                public static class ENDDATEBeanX
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
                    private long time=0;
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
                    private long time=0;
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
                    private long time=0;
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
                    private long time=0;
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

        public static class LeadersBean
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
            private CREATEDATEBeanXX CREATE_DATE;
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

            public CREATEDATEBeanXX getCREATE_DATE()
            {
                return CREATE_DATE;
            }

            public void setCREATE_DATE(CREATEDATEBeanXX CREATE_DATE)
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

            public static class CREATEDATEBeanXX
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
                private long time=0;
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
