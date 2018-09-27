package com.northdoo.luohu;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/14.
 */

public class Parameters implements Parcelable
{
    public String url;
    public String name;
    public String param;
    public String id;
    public String title;
    public Map<String, String> params = new HashMap<>();

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getParam()
    {
        return param;
    }

    public void setParam(String param)
    {
        this.param = param;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Map<String, String> getParams()
    {
        return params;
    }

    public void setParams(Map<String, String> params)
    {
        this.params = params;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(this.url);
        dest.writeString(this.name);
        dest.writeString(this.param);
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeInt(this.params.size());
        for (Map.Entry<String, String> entry : this.params.entrySet())
        {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public Parameters()
    {
    }

    public Parameters(String url, String param)
    {
        this.url = url;
        this.param = param;
    }

    protected Parameters(Parcel in)
    {
        this.url = in.readString();
        this.name = in.readString();
        this.param = in.readString();
        this.id = in.readString();
        this.title = in.readString();
        int paramsSize = in.readInt();
        this.params = new HashMap<>(paramsSize);
        for (int i = 0; i < paramsSize; i++)
        {
            String key = in.readString();
            String value = in.readString();
            this.params.put(key, value);
        }
    }

    public static final Creator<Parameters> CREATOR = new Creator<Parameters>()
    {
        @Override
        public Parameters createFromParcel(Parcel source)
        {
            return new Parameters(source);
        }

        @Override
        public Parameters[] newArray(int size)
        {
            return new Parameters[size];
        }
    };
}
