package com.example.emiliano.traskilada.views.activities;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.emiliano.traskilada.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Octavio on 2017/05/06.
 */

public class CreateAppointmentActivity extends AppCompatActivity {
    private EditText dateEditText;
    private EditText timeEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_appointment_layout);

        findViewsById();
        setListeners();
        disableKeyboards();
    }

    /***
     * This method prevents the keyboard from showing up when you focus on the edit texts.
     * NOTE: It only works from lollipop and above.
     */
    private void disableKeyboards() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            dateEditText.setShowSoftInputOnFocus(false);
            timeEditText.setShowSoftInputOnFocus(false);
        }
    }

    private void findViewsById() {
        dateEditText = (EditText) findViewById(R.id.appointment_input_date);
        timeEditText = (EditText) findViewById(R.id.appointment_input_time);
    }

    /***
     * This method adds the currency symbol at the start of the number in the payment edit text.
     */
    private void setListeners() {
        dateEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) showDateDialog();
            }
        });

        timeEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) showTimeDialog();
            }
        });

    }

    Calendar myCalendar = Calendar.getInstance();

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDateEdit();
        }

    };

    TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {
            myCalendar.set(Calendar.HOUR_OF_DAY, i);
            myCalendar.set(Calendar.MINUTE, i1);
            updateTimeEdit();
        }
    };

    public void showDateDialog() {
        new DatePickerDialog(this, date, myCalendar.get(Calendar.YEAR),
                myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    public void showTimeDialog() {
        new TimePickerDialog(this, time, myCalendar.get(Calendar.HOUR_OF_DAY),
                myCalendar.get(Calendar.MINUTE), false).show();
    }

    private void updateDateEdit() {
        String myFormat = "dd/MM/yy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        dateEditText.setText(sdf.format(myCalendar.getTime()));
    }

    private void updateTimeEdit() {
        String myFormat = "HH:mm a";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        timeEditText.setText(sdf.format(myCalendar.getTime()));
    }
}
