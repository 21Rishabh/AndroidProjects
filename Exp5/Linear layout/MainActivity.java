package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt1= (EditText)findViewById(R.id.editText);
        final EditText txt2= (EditText)findViewById(R.id.editText2);
        Button but1= (Button)findViewById(R.id.button);
        Button but2= (Button)findViewById(R.id.button2);
        Button but3= (Button)findViewById(R.id.button3);
        Button but4= (Button)findViewById(R.id.button5);
        Button but5= (Button)findViewById(R.id.button6);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setTextSize(20);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setTextColor(Color.GREEN);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setBackgroundColor(Color.BLACK);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setTextSize(30);

            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setTextColor(Color.YELLOW);
            }
        });
    }
}
