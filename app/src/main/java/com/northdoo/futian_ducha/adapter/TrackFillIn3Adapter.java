package com.northdoo.futian_ducha.adapter;

import android.content.Context;
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

public class TrackFillIn3Adapter extends RecyclerView.Adapter<TrackFillIn3Adapter.MyViewHolder>
{
    Context context;
    List<GoalListBean.SubBeanX.PdsBean> mData;

    public TrackFillIn3Adapter(Context context, List<GoalListBean.SubBeanX.PdsBean> mData)
    {
        this.mData = mData;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_track_fillin, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position)
    {
        holder.text.setText(mData.get(position).getPLANDETAIL());
    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView text;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
        }
    }


}
