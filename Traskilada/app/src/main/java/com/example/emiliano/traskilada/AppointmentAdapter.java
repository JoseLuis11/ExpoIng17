package com.example.emiliano.traskilada;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.emiliano.traskilada.models.AppointmentList;

import java.util.List;

/**
 * Created by JoseLuis on 06/05/2017.
 */

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.AppointmentViewHolder> {

    private List<AppointmentList> appointmentItems;

    public class AppointmentViewHolder extends RecyclerView.ViewHolder{
        public TextView user;
        public TextView service;

        public AppointmentViewHolder(View view){
            super(view);
            user = (TextView)view.findViewById(R.id.textViewClient);
            service = (TextView)view.findViewById(R.id.textViewService);
        }

    }

    public AppointmentAdapter(List<AppointmentList> appointmentItems) {
        this.appointmentItems = appointmentItems;
    }

    @Override
    public AppointmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent, false);
        return new AppointmentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AppointmentViewHolder holder, int position) {
        AppointmentList appointmentList = appointmentItems.get(position);

        holder.user.setText(appointmentList.getUserName());
        holder.service.setText(appointmentList.getService());

    }

    @Override
    public int getItemCount() {
        return appointmentItems.size();
    }


}
