package com.example.myapp3;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Lifecycle","onCreate invoked");
    }
        protected void onStart() {
            super.onStart();
            Log.d("Activity Lifecycle","onStart invoked");
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.d("Activity Lifecycle","onResume invoked");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.d("Activity Lifecycle","onPause invoked");
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.d("Activity Lifecycle","onStop invoked");
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("Activity Lifecycle","onRestart invoked");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("Activity Lifecycle","onDestroy invoked");
        }
    }

