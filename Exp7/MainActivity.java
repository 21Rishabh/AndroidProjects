package com.example.listview;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    ListView nlistview;
    int[] IMAGES={R.drawable.afghanistan_64,R.drawable.australia_64,R.drawable.bangladesh_64,R.drawable.india_64,
        R.drawable.netherlands_64,R.drawable.pakistan_64,R.drawable.zimbabwe_64};
    String[] NAMES={"Afghanistan","Australia","Bangladesh","India","Netherlands","Pakistan","Zimbabwe"};
    String[] Captain={"Gulbadin Naib","Aaron Finch","Mashrafe Mortaza ","Virat Kholi","Pieter Seelaar","Sarfraz Ahmed","Sean Williams"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          nlistview= (ListView) findViewById(R.id.listView);
        CustomAdapter customAdapter=new CustomAdapter();
        nlistview.setAdapter(customAdapter);

    }

     public class CustomAdapter extends BaseAdapter {



        CustomAdapter() {
        }

        @Override
        public int getCount() {

            return IMAGES.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }


        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            View view1 =getLayoutInflater().inflate(R.layout.activity_list,null);
             ImageView image =(ImageView)view1.findViewById(R.id.imageView);
           TextView txt1= (TextView)view1.findViewById(R.id.textView_names);
           TextView txt2= (TextView)view1.findViewById(R.id.textView_captain);
            image.setImageResource(IMAGES[i]);
            txt1.setText(NAMES[i]);
            txt2.setText(Captain[i]);
            return view1;

        }
    }
}