package com.northdoo.futian_ducha.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/8/22.
 */

public class CollectDoDetails
{


    /**
     * INSTANCE_GUID : {AC1D3522-0000-0000-07FA-07E2000092AC}
     * DOCTITLE : 《感谢信》，请经促局阅处。
     * COMDOC_CLASSIFY : null
     * SECRETGRADE : null
     * URGENTGRADE : null
     * TOPIC : null
     * NEEDRECEIPT : 0
     * ISDISPATCH : 0
     * ISENCRYPT : 0
     * TASK_EXPIREDATE : null
     * TASK_EXPIREDDAY : 0
     * DOCCONTENT : null
     * REINSTANCEGUID : null
     * LEADERDIRECTION : null
     * ISBACKRESULT : no
     * TIMELIMIT : null
     * ISLIMIT : 0
     * ISUNTREAD : null
     * FILE_NO : null
     * receiptType : 不需回执
     * urging : 本公文没有催办业务
     * isbackResult : 否
     * isUntread : 否
     * attachFiles : [{"FILEGUID":"{AC1D3522-0000-0000-07FA-07F2000092AD}","FILENAMEEXT":"pdf","TITLE":"image17013","FILESIZE":638023,"REALFULLPATH":"\\ftoa\\risefile\\risetransfer\\fujian\\{4998B148-B3AF-8042-8B34-CADC0CF8B61D}\\fangting\\20178\\image17013.{AC1D3522-0000-0000-07FA-07F2000092AD}.1.1.pdf","CREATORNAME":"方婷","CREATEDATE":{"date":22,"day":2,"hours":16,"minutes":5,"month":7,"nanos":0,"seconds":59,"time":1503389159000,"timezoneOffset":-480,"year":117},"filePath":"XFwxNzIuMjkuNDYuNDJcYXBwXGZ0b2FccmlzZWZpbGVccmlzZXRyYW5zZmVyXGZ1amlhblx7NDk5OEIxNDgtQjNBRi04MDQyLThCMzQtQ0FEQzBDRjhCNjFEfVxmYW5ndGluZ1wyMDE3OFxpbWFnZTE3MDEzLntBQzFEMzUyMi0wMDAwLTAwMDAtMDdGQS0wN0YyMDAwMDkyQUR9LjEuMS5wZGY="},{"FILEGUID":"{AC1D3522-0000-0000-07FA-1010000092B2}","FILENAMEEXT":"pdf","TITLE":"感谢信","FILESIZE":0,"REALFULLPATH":"\\ftoa\\risefile\\risetransfer\\fujian\\{4998B148-B3AF-8042-8B34-CADC0CF8B61D}\\fangting\\20178\\感谢信.{AC1D3522-0000-0000-07FA-1010000092B2}.pdf","CREATORNAME":"方婷","CREATEDATE":{"date":22,"day":2,"hours":16,"minutes":6,"month":7,"nanos":0,"seconds":1,"time":1503389161000,"timezoneOffset":-480,"year":117},"filePath":"XFwxNzIuMjkuNDYuNDJcYXBwXGZ0b2FccmlzZWZpbGVccmlzZXRyYW5zZmVyXGZ1amlhblx7NDk5OEIxNDgtQjNBRi04MDQyLThCMzQtQ0FEQzBDRjhCNjFEfVxmYW5ndGluZ1wyMDE3OFzmhJ/osKLkv6Eue0FDMUQzNTIyLTAwMDAtMDAwMC0wN0ZBLTEwMTAwMDAwOTJCMn0ucGRm"}]
     * result : success
     * msg : successful
     */

    private String INSTANCE_GUID;
    private String DOCTITLE;
    private String COMDOC_CLASSIFY;
    private String SECRETGRADE;
    private String URGENTGRADE;
    private String TOPIC;
    private int NEEDRECEIPT;
    private int ISDISPATCH;
    private int ISENCRYPT;
    private String TASK_EXPIREDATE;
    private int TASK_EXPIREDDAY;
    private String DOCCONTENT;
    private String REINSTANCEGUID;
    private String LEADERDIRECTION;
    private String ISBACKRESULT;
    private int ISLIMIT;
    private String ISUNTREAD;
    private String FILE_NO;
    private String receiptType;
    private String urging;
    private String isbackResult;
    private String isUntread;
    private String result;
    private String msg;
    private List<AttachFilesBean> attachFiles;

    public String getINSTANCE_GUID()
    {
        return INSTANCE_GUID;
    }

    public void setINSTANCE_GUID(String INSTANCE_GUID)
    {
        this.INSTANCE_GUID = INSTANCE_GUID;
    }

    public String getDOCTITLE()
    {
        return DOCTITLE;
    }

    public void setDOCTITLE(String DOCTITLE)
    {
        this.DOCTITLE = DOCTITLE;
    }

    public String getCOMDOC_CLASSIFY()
    {
        return COMDOC_CLASSIFY;
    }

    public void setCOMDOC_CLASSIFY(String COMDOC_CLASSIFY)
    {
        this.COMDOC_CLASSIFY = COMDOC_CLASSIFY;
    }

    public String getSECRETGRADE()
    {
        return SECRETGRADE;
    }

    public void setSECRETGRADE(String SECRETGRADE)
    {
        this.SECRETGRADE = SECRETGRADE;
    }

    public String getURGENTGRADE()
    {
        return URGENTGRADE;
    }

    public void setURGENTGRADE(String URGENTGRADE)
    {
        this.URGENTGRADE = URGENTGRADE;
    }

    public String getTOPIC()
    {
        return TOPIC;
    }

    public void setTOPIC(String TOPIC)
    {
        this.TOPIC = TOPIC;
    }

    public void setISENCRYPT(int ISENCRYPT)
    {
        this.ISENCRYPT = ISENCRYPT;
    }

    public String getTASK_EXPIREDATE()
    {
        return TASK_EXPIREDATE;
    }

    public void setTASK_EXPIREDATE(String TASK_EXPIREDATE)
    {
        this.TASK_EXPIREDATE = TASK_EXPIREDATE;
    }

    public int getTASK_EXPIREDDAY()
    {
        return TASK_EXPIREDDAY;
    }

    public void setTASK_EXPIREDDAY(int TASK_EXPIREDDAY)
    {
        this.TASK_EXPIREDDAY = TASK_EXPIREDDAY;
    }

    public String getDOCCONTENT()
    {
        return DOCCONTENT;
    }

    public void setDOCCONTENT(String DOCCONTENT)
    {
        this.DOCCONTENT = DOCCONTENT;
    }

    public String getREINSTANCEGUID()
    {
        return REINSTANCEGUID;
    }

    public void setREINSTANCEGUID(String REINSTANCEGUID)
    {
        this.REINSTANCEGUID = REINSTANCEGUID;
    }

    public String getLEADERDIRECTION()
    {
        return LEADERDIRECTION;
    }

    public void setLEADERDIRECTION(String LEADERDIRECTION)
    {
        this.LEADERDIRECTION = LEADERDIRECTION;
    }

    public String getISBACKRESULT()
    {
        return ISBACKRESULT;
    }

    public void setISBACKRESULT(String ISBACKRESULT)
    {
        this.ISBACKRESULT = ISBACKRESULT;
    }

    public int getISLIMIT()
    {
        return ISLIMIT;
    }

    public void setISLIMIT(int ISLIMIT)
    {
        this.ISLIMIT = ISLIMIT;
    }

    public String getISUNTREAD()
    {
        return ISUNTREAD;
    }

    public void setISUNTREAD(String ISUNTREAD)
    {
        this.ISUNTREAD = ISUNTREAD;
    }

    public String getFILE_NO()
    {
        return FILE_NO;
    }

    public void setFILE_NO(String FILE_NO)
    {
        this.FILE_NO = FILE_NO;
    }

    public String getReceiptType()
    {
        return receiptType;
    }

    public void setReceiptType(String receiptType)
    {
        this.receiptType = receiptType;
    }

    public int getNEEDRECEIPT()
    {
        return NEEDRECEIPT;
    }

    public void setNEEDRECEIPT(int NEEDRECEIPT)
    {
        this.NEEDRECEIPT = NEEDRECEIPT;
    }

    public int getISDISPATCH()
    {
        return ISDISPATCH;
    }

    public void setISDISPATCH(int ISDISPATCH)
    {
        this.ISDISPATCH = ISDISPATCH;
    }

    public int getISENCRYPT()
    {
        return ISENCRYPT;
    }


    public String getUrging()
    {
        return urging;
    }

    public void setUrging(String urging)
    {
        this.urging = urging;
    }

    public String getIsbackResult()
    {
        return isbackResult;
    }

    public void setIsbackResult(String isbackResult)
    {
        this.isbackResult = isbackResult;
    }

    public String getIsUntread()
    {
        return isUntread;
    }

    public void setIsUntread(String isUntread)
    {
        this.isUntread = isUntread;
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

    public List<AttachFilesBean> getAttachFiles()
    {
        return attachFiles;
    }

    public void setAttachFiles(List<AttachFilesBean> attachFiles)
    {
        this.attachFiles = attachFiles;
    }

    public static class AttachFilesBean
    {
        /**
         * FILEGUID : {AC1D3522-0000-0000-07FA-07F2000092AD}
         * FILENAMEEXT : pdf
         * TITLE : image17013
         * FILESIZE : 638023
         * REALFULLPATH : \ftoa\risefile\risetransfer\fujian\{4998B148-B3AF-8042-8B34-CADC0CF8B61D}\fangting\20178\image17013.{AC1D3522-0000-0000-07FA-07F2000092AD}.1.1.pdf
         * CREATORNAME : 方婷
         * CREATEDATE : {"date":22,"day":2,"hours":16,"minutes":5,"month":7,"nanos":0,"seconds":59,"time":1503389159000,"timezoneOffset":-480,"year":117}
         * filePath : XFwxNzIuMjkuNDYuNDJcYXBwXGZ0b2FccmlzZWZpbGVccmlzZXRyYW5zZmVyXGZ1amlhblx7NDk5OEIxNDgtQjNBRi04MDQyLThCMzQtQ0FEQzBDRjhCNjFEfVxmYW5ndGluZ1wyMDE3OFxpbWFnZTE3MDEzLntBQzFEMzUyMi0wMDAwLTAwMDAtMDdGQS0wN0YyMDAwMDkyQUR9LjEuMS5wZGY=
         */

        private String FILEGUID;
        private String FILENAMEEXT;
        private String TITLE;
        private int FILESIZE;
        private String REALFULLPATH;
        private String CREATORNAME;
        private CREATEDATEBean CREATEDATE;
        private String filePath;

        public String getFILEGUID()
        {
            return FILEGUID;
        }

        public void setFILEGUID(String FILEGUID)
        {
            this.FILEGUID = FILEGUID;
        }

        public String getFILENAMEEXT()
        {
            return FILENAMEEXT;
        }

        public void setFILENAMEEXT(String FILENAMEEXT)
        {
            this.FILENAMEEXT = FILENAMEEXT;
        }

        public String getTITLE()
        {
            return TITLE;
        }

        public void setTITLE(String TITLE)
        {
            this.TITLE = TITLE;
        }

        public int getFILESIZE()
        {
            return FILESIZE;
        }

        public void setFILESIZE(int FILESIZE)
        {
            this.FILESIZE = FILESIZE;
        }

        public String getREALFULLPATH()
        {
            return REALFULLPATH;
        }

        public void setREALFULLPATH(String REALFULLPATH)
        {
            this.REALFULLPATH = REALFULLPATH;
        }

        public String getCREATORNAME()
        {
            return CREATORNAME;
        }

        public void setCREATORNAME(String CREATORNAME)
        {
            this.CREATORNAME = CREATORNAME;
        }

        public CREATEDATEBean getCREATEDATE()
        {
            return CREATEDATE;
        }

        public void setCREATEDATE(CREATEDATEBean CREATEDATE)
        {
            this.CREATEDATE = CREATEDATE;
        }

        public String getFilePath()
        {
            return filePath;
        }

        public void setFilePath(String filePath)
        {
            this.filePath = filePath;
        }

        public static class CREATEDATEBean
        {
            /**
             * date : 22
             * day : 2
             * hours : 16
             * minutes : 5
             * month : 7
             * nanos : 0
             * seconds : 59
             * time : 1503389159000
             * timezoneOffset : -480
             * year : 117
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
