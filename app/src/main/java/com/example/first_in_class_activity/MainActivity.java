package com.example.first_in_class_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText height;
    private EditText weight;
    private Switch isMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        isMale = findViewById(R.id.ismale);
    }


    public void btnFind_BMI(View view) {
        String msg = "";

        String H = height.getText().toString();
        Double h = Double.parseDouble(H);

        msg += "Height = " + h;


        String W = weight.getText().toString();
        Double w = Double.parseDouble(W);

        msg += ", \n Weight = " + w;


        if (isMale.isChecked()) {
            msg += ", \n Your BMI is:" + ((w / (h * h)) )* 1.05;
        }else {
            msg += ", \n Your BMI is:" + (w / (h * h));
        }

    }
}