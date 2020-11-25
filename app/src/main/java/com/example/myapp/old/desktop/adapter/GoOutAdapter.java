package com.example.myapp.old.desktop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.old.R;
import com.example.myapp.old.desktop.desktopFragmentDirections;
import com.example.myapp.old.desktop.goOutFragmentDirections;

public class GoOutAdapter extends RecyclerView.Adapter<GoOutAdapter.GoOutViewHolder> {
    String[] goOutActivities;
    int[] goOutimages;
    Context context;

    public GoOutAdapter(Context ct,String[] s1,int[] img){
        context = ct;
        goOutActivities = s1;
        goOutimages = img;
    }
    @NonNull
    @Override
    public GoOutViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.goout_row_item,parent,false);
        return new GoOutViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GoOutViewHolder holder, int position) {
        String activity = (position+1) +" "+goOutActivities[position];
        holder.text_goOutActivities.setText(activity);
        holder.image_gooutImages.setImageResource(goOutimages[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Navigation.findNavController(view).navigate(goOutFragmentDirections.actionGoOutFragmentToAttendGoOutFragment());

            }

        });
    }

    @Override
    public int getItemCount() {
        return goOutActivities.length;
    }

    public class GoOutViewHolder extends RecyclerView.ViewHolder {
        TextView text_goOutActivities;
        ImageView image_gooutImages;
        public GoOutViewHolder(@NonNull View itemView) {
            super(itemView);
            text_goOutActivities = itemView.findViewById(R.id.goout_activities_tv);
            image_gooutImages = itemView.findViewById(R.id.goout_gooutimages);

        }
    }
}
