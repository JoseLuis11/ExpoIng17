package com.example.emiliano.traskilada.views.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.emiliano.traskilada.R;

import java.text.NumberFormat;

/**
 * Created by Octavio on 2017/05/06.
 */

public class CashierBalancingActivity extends AppCompatActivity {

    // UI references
    private EditText dateEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cashier_balancing_activity);

        findViewsById();
        setCurrencySymbol();
    }

    private void findViewsById() {
        dateEditText = (EditText) findViewById(R.id.input_payment_amount);
    }

    /***
     * This method adds the currency symbol at the start of the number in the payment edit text.
     */
    private void setCurrencySymbol(){
        dateEditText.addTextChangedListener(new TextWatcher() {
            private String current = "";
            @Override
            public void afterTextChanged(Editable s) {
                if (!s.toString().equals(current)) {
                    dateEditText.removeTextChangedListener(this);
                }
                String cleanString = s.toString().replaceAll(getString(R.string.symbol_money_local), "");

                double parsed = Double.parseDouble(cleanString);
                if (parsed > 10000000) parsed = 10000000;
                String formatted = NumberFormat.getCurrencyInstance().format((parsed / 100));

                current = formatted;

                dateEditText.setText(formatted);
                dateEditText.setSelection(formatted.length());
                dateEditText.addTextChangedListener(this);
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

    }
}
