package com.nicdeane.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton male = findViewById(R.id.radio_button_male);
        RadioButton female = findViewById(R.id.radio_button_female);
        EditText age = findViewById(R.id.edit_text_age);
        EditText feet = findViewById(R.id.edit_text_feet);
        EditText inches = findViewById(R.id.edit_text_inches);
        EditText weight = findViewById(R.id.edit_text_weight);
        Button calculate = findViewById(R.id.button_calculate);
        TextView resultText = findViewById(R.id.text_view_result);



    }
}