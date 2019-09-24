package com.example.myweb;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
         Button button1 = (Button)findViewById(R.id.button1);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast toast = Toast.makeText(getApplicationContext(), "Click the Browse button please", Toast.LENGTH_LONG);
                 toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                 toast.show();
             }
         });

         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = text.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(txt));
                startActivity(intent);
            }
        });

    }
}
