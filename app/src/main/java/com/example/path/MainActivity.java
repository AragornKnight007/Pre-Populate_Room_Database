package com.example.path;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;


import android.os.Bundle;

import android.text.TextUtils;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText edtquestion, edtcard;
    AppCompatButton btnfind;

    String a;
    String ab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initialize();


    }

    private void initialize() {
        edtquestion = findViewById(R.id.edtquestion);

        edtcard = findViewById(R.id.edtcard);
        btnfind = findViewById(R.id.btnfind);


        btnfind.setOnClickListener(v -> {


            a = edtquestion.getText().toString();
            ab = edtcard.getText().toString();


            if ((TextUtils.isEmpty(a))) {

                edtquestion.setError("This field is required");

                return;
            } else if ((TextUtils.isEmpty(ab))) {

                edtcard.setError("This field is required");

                return;

            }


            int c = Integer.parseInt(a);
            int d = Integer.parseInt(ab);

            if ((!(c >= 1 && c <= 64))) {

                edtquestion.setError("Please Insert Number In Range Between 1 - 64");

                return;


            } else if (!(d >= 1 && d <= 64)) {
                edtcard.setError("Please Insert Number In Range Between 1 - 64");
                return;

            }



            fetchResult.qnum = Integer.parseInt(a);
            fetchResult.card = "$" + ab;


            Intent intent = new Intent(MainActivity.this, fetchResult.class);
            startActivity(intent);
            edtquestion.setText("");
            edtcard.setText("");



        });



    }


}