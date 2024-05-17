package com.example.mysubwayapplication;

import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    List<String> date;
    List<String> day;
    List<String> time;
    List<String> hours;

    //for layout
    LayoutInflater inflater;

    public RecyclerViewAdapter(Context context,List<String> date, List<String> day, List<String> time, List<String> hours) {
        this.date = date;
        this.day = day;
        this.time = time;
        this.hours = hours;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.slotdetails,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.viewHolder holder, int position) {

        holder.sd_date.setText(date.get(position));
        holder.sd_day.setText(day.get(position));
        holder.sd_time.setText(time.get(position));
        holder.sd_hours.setText(hours.get(position));

    }

    @Override
    public int getItemCount() {
        return date.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView sd_date,sd_day,sd_time,sd_hours;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            sd_day = (TextView) itemView.findViewById(R.id.slotDetailsDay);
            sd_date = (TextView) itemView.findViewById(R.id.slotDetailsDate);
            sd_time = (TextView) itemView.findViewById(R.id.slotDetailsTime);
            sd_hours = (TextView) itemView.findViewById(R.id.slotDetailsHour);

        }
    }
}
