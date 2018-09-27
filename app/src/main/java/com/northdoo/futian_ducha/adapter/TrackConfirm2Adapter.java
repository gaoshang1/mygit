package com.northdoo.futian_ducha.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.northdoo.futian_ducha.R;
import com.northdoo.futian_ducha.TrackConfirmDetailsActivity;
import com.northdoo.futian_ducha.TrackFillInDetailActivity;
import com.northdoo.futian_ducha.UrgeListActivity;
import com.northdoo.futian_ducha.bean.GoalListBean;
import com.northdoo.futian_ducha.onClicks;

import java.util.List;

/**
 * Created by Administrator on 2017/12/4.
 */

public class TrackConfirm2Adapter extends RecyclerView.Adapter<TrackConfirm2Adapter.MyViewHolder>
{
    Context context;
    List<GoalListBean.SubBeanX> mData;
    onClicks onClicks;
    int type = 1;

    public TrackConfirm2Adapter(Context context, List<GoalListBean.SubBeanX> mData, int type)
    {
        this.mData = mData;
        this.type = type;
        this.context = context;
        if (type == 1)
        {
            onClicks = (TrackConfirmDetailsActivity) context;
        } else if (type == 2)
        {
            onClicks = (TrackFillInDetailActivity) context;
        }
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

        if (type == 1)
        {
            holder.text1.setText(mData.get(position).getCHARGE_LEADER_NAME());

        } else if (type == 2)
        {
            holder.but2.setText("操作");
            holder.title1.setText("状    态");
            holder.text1.setText(mData.get(position).getWRITEPLAN_STATUS());

        }
        holder.img.setImageResource(mData.get(position).getSTATUS().equals("已确认") ? R.mipmap.gx : R.mipmap.sc);
        holder.cb2.setText("催办:" + mData.get(position).getREMIND_TIMES());
        holder.text2.setText(mData.get(position).getLEADING_UNIT_NAME());
        holder.listview.setLayoutManager(new LinearLayoutManager(context)
        {
            @Override
            public boolean canScrollVertically()
            {
                return false;
            }
        });
        TrackConfirm3Adapter adapter = new TrackConfirm3Adapter(context, mData.get(position).getSub(), type);
        holder.listview.setAdapter(adapter);

        holder.cb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(context, UrgeListActivity.class);
                intent.putExtra("subOrCoGuid", mData.get(position).getSUB_GUID());
                intent.putExtra("step", type);
                context.startActivity(intent);
            }
        });
        holder.but2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onClicks.OnClickListener(mData.get(position).getSUB_GUID(), 1, null);
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
        TextView cb2;
        Button but2;
        ImageView img;
        RecyclerView listview;
        View div;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            title1 = (TextView) itemView.findViewById(R.id.title1);
            text1 = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
            cb2 = (TextView) itemView.findViewById(R.id.cb2);
            div = itemView.findViewById(R.id.div);
            img = (ImageView) itemView.findViewById(R.id.img);
            but2 = (Button) itemView.findViewById(R.id.but2);
            listview = (RecyclerView) itemView.findViewById(R.id.listview);
        }
    }

}
