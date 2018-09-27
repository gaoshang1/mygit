package com.northdoo.futian_ducha.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class TrackConfirm3Adapter extends RecyclerView.Adapter<TrackConfirm3Adapter.MyViewHolder>
{
    Context context;
    List<GoalListBean.SubBeanX.SubBean> mData;
    onClicks onClicks;
    int type = 1;

    public TrackConfirm3Adapter(Context context, List<GoalListBean.SubBeanX.SubBean> mData, int type)
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
        View view = LayoutInflater.from(context).inflate(R.layout.item_co_operation, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position)
    {
        if (type == 2)
        {
            holder.but.setText("操作");
        }
        holder.cb.setText("催办:" + mData.get(position).getREMIND_TIMES());
        holder.text.setText(mData.get(position).getCO_UNIT_NAME());
        holder.cb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(context, UrgeListActivity.class);
                intent.putExtra("subOrCoGuid", mData.get(position).getCO_GUID());
                intent.putExtra("step", type);
                context.startActivity(intent);
            }
        });

        holder.but.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onClicks.OnClickListener(mData.get(position).getCO_GUID(), 2,null);
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

        TextView text;
        TextView cb;
        Button but;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            text = (TextView) itemView.findViewById(R.id.text);
            cb = (TextView) itemView.findViewById(R.id.cb);
            but = (Button) itemView.findViewById(R.id.but);
        }
    }


}
