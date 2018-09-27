package com.northdoo.futian_ducha.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.northdoo.futian_ducha.R;
import com.northdoo.futian_ducha.TrackFillInDetailActivity;
import com.northdoo.futian_ducha.UrgeListActivity;
import com.northdoo.futian_ducha.bean.GoalListBean;
import com.northdoo.futian_ducha.onClicks;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */

public class TrackFillIn2Adapter extends RecyclerView.Adapter<TrackFillIn2Adapter.MyViewHolder>
{
    Context context;
    List<GoalListBean.SubBeanX> mData;
    onClicks onClicks;

    public TrackFillIn2Adapter(Context context, List<GoalListBean.SubBeanX> mData)
    {
        this.mData = mData;
        this.context = context;
        onClicks = (TrackFillInDetailActivity) context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.item_executor, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position)
    {

        holder.but2.setText("操作");
        holder.title1.setText("状    态");

        switch (mData.get(position).getWRITEPLAN_STATUS())
        {
            case "0":
                holder.text1.setText("填写中");
                break;
            case "1":
                holder.text1.setText("无效");
                break;
            case "2":
                holder.text1.setText("已填写");
                break;

            case "4":
                holder.text1.setText("驳回");
                break;
            default:
                holder.text1.setText("已通过");

        }


        holder.text2.setText(mData.get(position).getLEADING_UNIT_NAME());
        holder.lwjhjd.setVisibility(View.VISIBLE);
        holder.cb2.setText("催办:" + mData.get(position).getREMIND_TIMES());
        holder.listview.setLayoutManager(new LinearLayoutManager(context)
        {
            @Override
            public boolean canScrollVertically()
            {
                return false;
            }
        });
        TrackFillIn3Adapter adapter = new TrackFillIn3Adapter(context, mData.get(position).getPds());
        holder.listview.setAdapter(adapter);
        holder.cb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(context, UrgeListActivity.class);
                intent.putExtra("subOrCoGuid", mData.get(position).getSUB_GUID());
                intent.putExtra("step", "2");
                context.startActivity(intent);
            }
        });
        holder.but2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onClicks.OnClickListener(mData.get(position).getSUB_GUID(), 1, mData.get(position).getWRITEPLAN_STATUS());
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return mData.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {

        TextView title1;
        TextView text1;
        TextView text2;
        TextView text3;
        TextView cb2;
        Button but2;
        RecyclerView listview;
        LinearLayout lwjhjd;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            title1 = (TextView) itemView.findViewById(R.id.title1);
            text1 = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
            text3 = (TextView) itemView.findViewById(R.id.text3);
            cb2 = (TextView) itemView.findViewById(R.id.cb2);
            but2 = (Button) itemView.findViewById(R.id.but2);
            lwjhjd = (LinearLayout) itemView.findViewById(R.id.lwjhjd);
            listview = (RecyclerView) itemView.findViewById(R.id.listview);
        }
    }

}
