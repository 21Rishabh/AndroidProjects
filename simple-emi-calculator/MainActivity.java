package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,loan,i,dur;
    CheckBox chk;
    Button emi;
    TextView result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText)findViewById(R.id.editText);
        loan=(EditText)findViewById(R.id.editText2);
        i=(EditText)findViewById(R.id.editText3);
        dur=(EditText)findViewById(R.id.editText4);
        chk=(CheckBox)findViewById(R.id.checkBox);
        emi=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.textView6);



        chk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Press the button below",Toast.LENGTH_SHORT).show();
            }
        });

        emi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt=name.getText().toString();

                float p= Float.parseFloat(loan.getText().toString());
                float r= Float.parseFloat(i.getText().toString());
                float n= Float.parseFloat(dur.getText().toString());
                float pow,pow1;
                float Emi;

                n*=12;
                r=r/12/100;
                pow=(float)Math.pow((1+r),n);
                pow1=pow-1;
                Emi=(p*r*pow)/(pow-1);
                result.setText("Welcome " +txt+ ",Your calculated EMI is " + Emi);




            }
        });



    }
}
