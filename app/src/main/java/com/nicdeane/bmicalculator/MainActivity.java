package com.nicdeane.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

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
                double bmi = calculateBMI();
                String ageText = age.getText().toString();
                int age = Integer.parseInt(ageText);
                if (age >= 18) {
                    displayResult(bmi);
                } else {
                    displayGuidance(bmi);
                }

            }
        });
    }

    private double calculateBMI() {
        // getting values from UI
        String feetText = feet.getText().toString();
        String inchesText = inches.getText().toString();
        String weightText = weight.getText().toString();

        // converting values to ints
        int feet = Integer.parseInt(feetText);
        int inches = Integer.parseInt(inchesText);
        int weight = Integer.parseInt(weightText);

        // perform calculations
        int height = (feet * 12) + inches;
        double heightInMeters = height * 0.0254;

        return weight / (heightInMeters * heightInMeters);
    }

    private void displayResult(double bmi) {
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        String bmiText = decimalFormatter.format(bmi);
        String fullResult;
        if (bmi < 18.5) {
            fullResult = "Your BMI is: " + bmiText + " You are underweight!";
        } else if (bmi > 25) {
            fullResult = "Your BMI is: " + bmiText + " You are way too fat!";
        } else {
            fullResult = "Your BMI is: " + bmiText + " You are a healthy weight.";
        }
        resultText.setText(fullResult);
    }

    private void displayGuidance(double bmi) {
        resultText.setText("Get Fucked Mate.");
    }


}