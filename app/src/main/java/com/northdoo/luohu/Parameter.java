package com.northdoo.luohu;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017/8/14.
 */

public class Parameter implements Parcelable
{
    public String key;
    public String values;

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValues()
    {
        return values;
    }

    public void setValues(String values)
    {
        this.values = values;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(this.key);
        dest.writeString(this.values);
    }

    public Parameter(String key, String values)
    {
        this.key=key;
        this.values=values;
    }

    protected Parameter(Parcel in)
    {
        this.key = in.readString();
        this.values = in.readString();
    }

    public static final Creator<Parameter> CREATOR = new Creator<Parameter>()
    {
        @Override
        public Parameter createFromParcel(Parcel source)
        {
            return new Parameter(source);
        }

        @Override
        public Parameter[] newArray(int size)
        {
            return new Parameter[size];
        }
    };
}
