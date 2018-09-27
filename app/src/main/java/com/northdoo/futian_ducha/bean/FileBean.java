package com.northdoo.futian_ducha.bean;

/**
 * Created by Administrator on 2018/8/23.
 */

public class FileBean
{

    /**
     * createDate : {"date":10,"day":5,"hours":14,"minutes":35,"month":7,"seconds":38,"time":1533882938000,"timezoneOffset":-480,"year":118}
     * creatorGUID : {AC1D3318-FFFF-FFFF-C398-86D20000001D}
     * creatorName : 督查测试
     * departmentGUID :
     * departmentName :
     * fileGUID : {C9DA6134-4E93-40D5-8F2F-E94BFB063AD1}
     * fileName : 123456.png
     * filenameext : .png
     * filesize : 625456
     * isdel : false
     */

    private CreateDateBean createDate;
    private String creatorGUID;
    private String creatorName;
    private String departmentGUID;
    private String departmentName;
    private String fileGUID;
    private String fileName;
    private String filenameext;
    private String filesize;
    private boolean isdel;

    public CreateDateBean getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(CreateDateBean createDate)
    {
        this.createDate = createDate;
    }

    public String getCreatorGUID()
    {
        return creatorGUID;
    }

    public void setCreatorGUID(String creatorGUID)
    {
        this.creatorGUID = creatorGUID;
    }

    public String getCreatorName()
    {
        return creatorName;
    }

    public void setCreatorName(String creatorName)
    {
        this.creatorName = creatorName;
    }

    public String getDepartmentGUID()
    {
        return departmentGUID;
    }

    public void setDepartmentGUID(String departmentGUID)
    {
        this.departmentGUID = departmentGUID;
    }

    public String getDepartmentName()
    {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }

    public String getFileGUID()
    {
        return fileGUID;
    }

    public void setFileGUID(String fileGUID)
    {
        this.fileGUID = fileGUID;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFilenameext()
    {
        return filenameext;
    }

    public void setFilenameext(String filenameext)
    {
        this.filenameext = filenameext;
    }

    public String getFilesize()
    {
        return filesize;
    }

    public void setFilesize(String filesize)
    {
        this.filesize = filesize;
    }

    public boolean isIsdel()
    {
        return isdel;
    }

    public void setIsdel(boolean isdel)
    {
        this.isdel = isdel;
    }

    public static class CreateDateBean
    {
        /**
         * date : 10
         * day : 5
         * hours : 14
         * minutes : 35
         * month : 7
         * seconds : 38
         * time : 1533882938000
         * timezoneOffset : -480
         * year : 118
         */

        private int date;
        private int day;
        private int hours;
        private int minutes;
        private int month;
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
