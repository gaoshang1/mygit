package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/3.
 */

public class UrgeList
{
    /**
     * result : success
     * msg : successful
     * list : [{"REMIND_GUID":"{6463E3C6-AEDD-44DC-9C4D-48307A80D56D}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试aa","CREATE_DATE":{"date":1,"day":3,"hours":18,"minutes":0,"month":7,"nanos":0,"seconds":41,"time":1533117641000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]},{"REMIND_GUID":"{143F2243-6321-41CA-AE1C-E39520B671EE}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试aa","CREATE_DATE":{"date":1,"day":3,"hours":17,"minutes":59,"month":7,"nanos":0,"seconds":31,"time":1533117571000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]},{"REMIND_GUID":"{7730F8D1-884D-4EB0-969C-0140391536CA}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试","CREATE_DATE":{"date":27,"day":5,"hours":14,"minutes":54,"month":6,"nanos":0,"seconds":14,"time":1532674454000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]},{"REMIND_GUID":"{A0AF3914-7D3D-493E-8E5D-0DF9F04A63EE}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试测试测试","CREATE_DATE":{"date":27,"day":5,"hours":14,"minutes":53,"month":6,"nanos":0,"seconds":50,"time":1532674430000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]},{"REMIND_GUID":"{AF7EC7FD-1C9B-452A-A705-326FB6ED53F6}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试","CREATE_DATE":{"date":27,"day":5,"hours":14,"minutes":52,"month":6,"nanos":0,"seconds":46,"time":1532674366000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]},{"REMIND_GUID":"{207198E3-61B4-48FA-9EF0-B7F90AF55E06}","SENDER_GUID":"{AC1D3318-FFFF-FFFF-C398-86D20000001D}","SENDER_DEPARTMENT_GUID":"{56C750D0-65BD-B34C-834A-F763D825E987}","RECIEVE_DEPARTMENT_GUID":"{A133C21C-FEE3-C644-8A4D-41631D1C4055}","RECIEVE_DEPARTMENT_NAME":"信访局（应急办）","RECIEVER_GUIDS":null,"MESSAGE_CONTENT":"测试","CREATE_DATE":{"date":27,"day":5,"hours":11,"minutes":40,"month":6,"nanos":0,"seconds":37,"time":1532662837000,"timezoneOffset":-480,"year":118},"SUB_OR_CO_GUID":"{E50DA2D1-6C91-4B76-AB3E-721AA7C45565}","STEP":1,"SENDER_NAME":"督查测试","ISDELETED":0,"msgRec":[]}]
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
         * REMIND_GUID : {6463E3C6-AEDD-44DC-9C4D-48307A80D56D}
         * SENDER_GUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
         * SENDER_DEPARTMENT_GUID : {56C750D0-65BD-B34C-834A-F763D825E987}
         * RECIEVE_DEPARTMENT_GUID : {A133C21C-FEE3-C644-8A4D-41631D1C4055}
         * RECIEVE_DEPARTMENT_NAME : 信访局（应急办）
         * RECIEVER_GUIDS : null
         * MESSAGE_CONTENT : 测试aa
         * CREATE_DATE : {"date":1,"day":3,"hours":18,"minutes":0,"month":7,"nanos":0,"seconds":41,"time":1533117641000,"timezoneOffset":-480,"year":118}
         * SUB_OR_CO_GUID : {E50DA2D1-6C91-4B76-AB3E-721AA7C45565}
         * STEP : 1
         * SENDER_NAME : 督查测试
         * ISDELETED : 0
         * msgRec : []
         */

        private String REMIND_GUID;
        private String SENDER_GUID;
        private String SENDER_DEPARTMENT_GUID;
        private String RECIEVE_DEPARTMENT_GUID;
        private String RECIEVE_DEPARTMENT_NAME;
        private String RECIEVER_GUIDS;
        private String MESSAGE_CONTENT;
        private CREATEDATEBean CREATE_DATE;
        private String SUB_OR_CO_GUID;
        private int STEP;
        private String SENDER_NAME;
        private int ISDELETED;
        private List<?> msgRec;

        public String getREMIND_GUID()
        {
            return REMIND_GUID;
        }

        public void setREMIND_GUID(String REMIND_GUID)
        {
            this.REMIND_GUID = REMIND_GUID;
        }

        public String getSENDER_GUID()
        {
            return SENDER_GUID;
        }

        public void setSENDER_GUID(String SENDER_GUID)
        {
            this.SENDER_GUID = SENDER_GUID;
        }

        public String getSENDER_DEPARTMENT_GUID()
        {
            return SENDER_DEPARTMENT_GUID;
        }

        public void setSENDER_DEPARTMENT_GUID(String SENDER_DEPARTMENT_GUID)
        {
            this.SENDER_DEPARTMENT_GUID = SENDER_DEPARTMENT_GUID;
        }

        public String getRECIEVE_DEPARTMENT_GUID()
        {
            return RECIEVE_DEPARTMENT_GUID;
        }

        public void setRECIEVE_DEPARTMENT_GUID(String RECIEVE_DEPARTMENT_GUID)
        {
            this.RECIEVE_DEPARTMENT_GUID = RECIEVE_DEPARTMENT_GUID;
        }

        public String getRECIEVE_DEPARTMENT_NAME()
        {
            return RECIEVE_DEPARTMENT_NAME;
        }

        public void setRECIEVE_DEPARTMENT_NAME(String RECIEVE_DEPARTMENT_NAME)
        {
            this.RECIEVE_DEPARTMENT_NAME = RECIEVE_DEPARTMENT_NAME;
        }

        public String getRECIEVER_GUIDS()
        {
            return RECIEVER_GUIDS;
        }

        public void setRECIEVER_GUIDS(String RECIEVER_GUIDS)
        {
            this.RECIEVER_GUIDS = RECIEVER_GUIDS;
        }

        public String getMESSAGE_CONTENT()
        {
            return MESSAGE_CONTENT;
        }

        public void setMESSAGE_CONTENT(String MESSAGE_CONTENT)
        {
            this.MESSAGE_CONTENT = MESSAGE_CONTENT;
        }

        public CREATEDATEBean getCREATE_DATE()
        {
            return CREATE_DATE;
        }

        public void setCREATE_DATE(CREATEDATEBean CREATE_DATE)
        {
            this.CREATE_DATE = CREATE_DATE;
        }

        public String getSUB_OR_CO_GUID()
        {
            return SUB_OR_CO_GUID;
        }

        public void setSUB_OR_CO_GUID(String SUB_OR_CO_GUID)
        {
            this.SUB_OR_CO_GUID = SUB_OR_CO_GUID;
        }

        public int getSTEP()
        {
            return STEP;
        }

        public void setSTEP(int STEP)
        {
            this.STEP = STEP;
        }

        public String getSENDER_NAME()
        {
            return SENDER_NAME;
        }

        public void setSENDER_NAME(String SENDER_NAME)
        {
            this.SENDER_NAME = SENDER_NAME;
        }

        public int getISDELETED()
        {
            return ISDELETED;
        }

        public void setISDELETED(int ISDELETED)
        {
            this.ISDELETED = ISDELETED;
        }

        public List<?> getMsgRec()
        {
            return msgRec;
        }

        public void setMsgRec(List<?> msgRec)
        {
            this.msgRec = msgRec;
        }

        public static class CREATEDATEBean
        {
            /**
             * date : 1
             * day : 3
             * hours : 18
             * minutes : 0
             * month : 7
             * nanos : 0
             * seconds : 41
             * time : 1533117641000
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
