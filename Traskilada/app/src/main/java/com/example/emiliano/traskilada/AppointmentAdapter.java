package com.example.emiliano.traskilada;

import android.content.Context;
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

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.ViewHolder> {

    private List<AppointmentList> appointmentItems;
    private Context context;

    public AppointmentAdapter(List<AppointmentList> appointmentItems, Context context) {
        this.appointmentItems = appointmentItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AppointmentList appointmentList = appointmentItems.get(position);

        holder.textViewClient.setText(appointmentList.getUserName());
        holder.textViewService.setText(appointmentList.getService());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewClient;
        public TextView textViewService;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewClient = (TextView) itemView.findViewById(R.id.textViewClient);
            textViewService = (TextView) itemView.findViewById(R.id.textViewService);
        }
    }
}
