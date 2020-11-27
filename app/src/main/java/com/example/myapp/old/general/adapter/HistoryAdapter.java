package com.example.myapp.old.general.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.old.R;

public class HistoryAdapter  extends RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder> {


    String[] data1,data2;
    int[] images;
    Context context;
    public HistoryAdapter(Context ct, String[] s1, String[] s2, int[] img){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    public class HistoryViewHolder extends RecyclerView.ViewHolder {

        TextView textPerson;
        TextView textActivity;
        ImageView imagePerson;
        public HistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            textPerson = itemView.findViewById(R.id.History_recPerson);
            textActivity = itemView.findViewById(R.id.History_recActivities);
            imagePerson = itemView.findViewById(R.id.History_recImage);
        }
    }
    @NonNull
    @Override
    public HistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.rec_item,parent,false);
        return new HistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryViewHolder holder, int position) {

        holder.textPerson.setText(data1[position]);
        holder.textActivity.setText(data2[position]);
        holder.imagePerson.setImageResource(images[position]);
    }


    @Override
    public int getItemCount() {
        return data1.length;
    }


}