package com.example.myapp.old.desktop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.old.R;
import com.example.myapp.old.desktop.goOutFragmentDirections;
import com.example.myapp.old.desktop.notificationFragmentDirections;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.NotifyViewHolder> {

    String data1[],data2[];
    int images[];
    Context context;

    public NotificationAdapter(Context ct,String s1[],String s2[],int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }


    public class NotifyViewHolder extends RecyclerView.ViewHolder {
        TextView textPerson;
        TextView textActivity;
        ImageView imagePerson;
        public NotifyViewHolder(@NonNull View itemView) {
            super(itemView);
            textPerson = itemView.findViewById(R.id.notification_notifyPerson);
            textActivity = itemView.findViewById(R.id.notification_notifyActivities);
            imagePerson = itemView.findViewById(R.id.notification_notifyImage);

        }
    }
    @NonNull
    @Override
    public NotifyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.notification_row_item,parent,false);
        return new NotifyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.NotifyViewHolder holder, int position) {
        holder.textPerson.setText(data1[position]);
        holder.textActivity.setText(data2[position]);
        holder.imagePerson.setImageResource(images[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(notificationFragmentDirections.actionNotificationFragmentToDetailActivitiesFragment());
            }

        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

}
