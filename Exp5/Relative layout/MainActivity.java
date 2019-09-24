package com.example.myaplication7;

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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView txt1= (TextView)findViewById(R.id.textView);
        final TextView txt2= (TextView)findViewById(R.id.textView2);
        Button but1=(Button)findViewById(R.id.button);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setTextColor(Color.BLACK);
                txt2.setTextColor(Color.BLACK);


            }
        });

    }
}
