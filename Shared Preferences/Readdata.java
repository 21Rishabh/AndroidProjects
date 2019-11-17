package com.example.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Readdata extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.read_data);
        t1 = (TextView)findViewById(R.id.textView2);




        Intent intent = getIntent();
        String a1= intent.getStringExtra("NAME");
        Long a2= intent.getLongExtra("Id",0);
        Long a3= intent.getLongExtra("AGE",0);
        String a4= intent.getStringExtra("ADD");

        t1.setText(a1 + " " + a2 + " " +  a3 + " "  + a4 );

    }

}


