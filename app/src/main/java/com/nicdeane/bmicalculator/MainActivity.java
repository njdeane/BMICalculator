package com.nicdeane.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton male;
    private RadioButton female;
    private EditText age;
    private EditText feet;
    private EditText inches;
    private EditText weight;
    private Button calculate;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setupButtonClickListener();

    }

    private void findViews() {
        male = findViewById(R.id.radio_button_male);
        female = findViewById(R.id.radio_button_female);
        age = findViewById(R.id.edit_text_age);
        feet = findViewById(R.id.edit_text_feet);
        inches = findViewById(R.id.edit_text_inches);
        weight = findViewById(R.id.edit_text_weight);
        calculate = findViewById(R.id.button_calculate);
        resultText = findViewById(R.id.text_view_result);
    }

    private void setupButtonClickListener() {
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {

    }


}