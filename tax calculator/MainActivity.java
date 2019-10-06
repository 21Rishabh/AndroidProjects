package com.example.taxcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText name,year,sal,per,hra,ta,med;  // Imporatant details
    TextView result,result2;  // Results

    Button but; //Tax calculator button


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	// Initializing variables with specifiv id's of different views
        name = (EditText) findViewById(R.id.editText2);		// Name of the user
        year = (EditText) findViewById(R.id.editText3);		//Assessment year
        sal = (EditText) findViewById(R.id.editText4);		//Basic Salary
        per = (EditText) findViewById(R.id.editText5);		//Comapany perqusites
        hra = (EditText) findViewById(R.id.editText6);		//House Rent allowance
        ta = (EditText) findViewById(R.id.editText8);		//Transport allowance
        med = (EditText) findViewById(R.id.editText7);		// Any medical reiumbursement

        but = (Button) findViewById(R.id.button);			//Button to calcuate the income tax
        result = (TextView)findViewById(R.id.textView13);		// result showing tax 
        result2 = (TextView) findViewById(R.id.textView12);		// result showing name,year,cess





        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double gs,net;
                double tax=0.0;
                double tax2=0.0;
                double health,edu; //Health and Education cess

                double bs= Double.parseDouble(sal.getText().toString()); //basic salary	// Taking imporatant values from the user in order to calculate income tax
                double cp= Double.parseDouble(per.getText().toString()); //perquisites
                double hr= Double.parseDouble(hra.getText().toString()); // HRA
                double tc= Double.parseDouble(ta.getText().toString());	//concession
                double m= Double.parseDouble(med.getText().toString()); //medical reiumbursement
                String NAME= name.getText().toString();
                String y= year.getText().toString();

                gs= bs+cp+hr+tc+m; //Total Gross Salary

                net= gs-(hr+tc+m);  //Net Income, that is all the rebate is deducted from the Total Gross salary





	// As per the tax slabs for 2019-20
                    if(net<250000)		
                    {
                        String s;
                        s="nil";
                        tax=Float.valueOf(s);


                    }

                    else if(net>=250000 && net<500000)
                    {
                        tax= 0.05*(net-250000);
                        health=tax*0.02;
                        edu=tax*0.01;
                        tax2=health+edu;
                    }
                    else if(net>=500000 && net<1000000)
                    {
                        tax= (25000)+0.2*(net-500000);
                        health=tax*0.02;
                        edu=tax*0.01;
                        tax2=health+edu;
                    }
                    else if(net>=1000000)
                    {
                        tax= (112500)+0.3*(net-1000000);
                        health=tax*0.02;
                        edu=tax*0.01;
                        tax2=health+edu;
                    }
                 result.setText("Income Tax "+tax);
                    result2.setText("Name "+NAME+" Assessment year "+y+" Health and Educational cess "+tax2);



            }
        });

    }


}
