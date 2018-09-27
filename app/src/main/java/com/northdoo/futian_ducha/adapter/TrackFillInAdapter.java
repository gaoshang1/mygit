package com.northdoo.futian_ducha.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.northdoo.futian_ducha.R;
import com.northdoo.futian_ducha.bean.GoalListBean;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */

public class TrackFillInAdapter extends RecyclerView.Adapter<TrackFillInAdapter.MyViewHolder>
{
    Context context;
    List<GoalListBean> mData;

    public TrackFillInAdapter(Context context, List<GoalListBean> mData)
    {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_track, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position)
    {
        holder.text.setText(mData.get(position).getGOAL());
        holder.listview.setLayoutManager(new LinearLayoutManager(context)
        {
            @Override
            public boolean canScrollVertically()
            {
                return false;
            }
        });
        TrackFillIn2Adapter adapter = new TrackFillIn2Adapter(context, mData.get(position).getSub());
        holder.listview.setAdapter(adapter);


    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView text;
        RecyclerView listview;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
            listview = (RecyclerView) itemView.findViewById(R.id.listview);
        }
    }


}
