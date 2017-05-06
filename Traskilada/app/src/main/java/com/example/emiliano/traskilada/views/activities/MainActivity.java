package com.example.emiliano.traskilada.views.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.emiliano.traskilada.adapters.AppointmentAdapter;
import com.example.emiliano.traskilada.R;
import com.example.emiliano.traskilada.models.AppointmentList;

import java.util.ArrayList;
import java.util.List;


import com.example.emiliano.traskilada.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<AppointmentList> appointmentLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        appointmentLists = new ArrayList<>();
        adapter = new AppointmentAdapter(appointmentLists);


        recyclerView.setAdapter(adapter);
        prepareAppointmentData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void prepareAppointmentData(){
        appointmentLists.add(new AppointmentList("Jazmin","Afeitado"));
        appointmentLists.add(new AppointmentList("Mica Ferreira","Daddy Yankee"));
        appointmentLists.add(new AppointmentList("Benito Camelo","Transformer en la nuca"));
        appointmentLists.add(new AppointmentList("El Vladis","Limada de uñas"));
        appointmentLists.add(new AppointmentList("Margarito","Tatuado de cejas"));
        appointmentLists.add(new AppointmentList("Casi Miro","Masaje en los hongos de los pies"));
        appointmentLists.add(new AppointmentList("Elma Montt","Fade"));
        appointmentLists.add(new AppointmentList("Elsa Pato","Pulida de cabeza"));
        appointmentLists.add(new AppointmentList("Debora Melo","Pintadón de cabello"));
        appointmentLists.add(new AppointmentList("Marcia Ana","Peinado chidori"));
        appointmentLists.add(new AppointmentList("Elvis Tek","Hamburgruesa"));
        appointmentLists.add(new AppointmentList("Aquiles Bailo","Una bañada"));
        appointmentLists.add(new AppointmentList("Susana Oria","Pintada de uñas de las patas"));
    }
}