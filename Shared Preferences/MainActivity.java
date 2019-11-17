package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4;
    Button bt,bt2;
    public static final String preference="key";
    public static final String name="namekey1";
    public static final String ID="namekey2";
    public static final String age="namekey3";
    public static final String address="namekey4";
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        bt=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);

          sharedPreferences = getSharedPreferences(preference , Context.MODE_PRIVATE);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n=et1.getText().toString();
                Long id = Long.parseLong(et2.getText().toString());
                Long a=Long.parseLong(et3.getText().toString());
                String add=et4.getText().toString();

                SharedPreferences.Editor e = sharedPreferences.edit();
                e.putString("name",n);
                e.putLong("ID",id);
                e.putLong("age",a);
                e.putString("address",add);
                e.commit();


            }


        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NAME=  sharedPreferences.getString("name",null);
                Long Id=sharedPreferences.getLong("ID",0);
                Long AGE=sharedPreferences.getLong("age",0);
                String ADD=sharedPreferences.getString("address",null);





                Intent intent = new Intent(MainActivity.this, Readdata.class);
                intent.putExtra("NAME",NAME);
                intent.putExtra("Id",Id);
                intent.putExtra("AGE",AGE);
                intent.putExtra("ADD",ADD);
                startActivity(intent);
            }
        });

    }
}
