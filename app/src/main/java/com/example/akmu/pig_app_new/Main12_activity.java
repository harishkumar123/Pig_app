package com.example.akmu.pig_app_new;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main12_activity extends AppCompatActivity {


    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    public String [] hindi={
            "शूकर पालन एप्प",
            "क्या करें, क्या न करें " ,
            " शूकर पालन परिचय " ,
            "  शूकरों का चुनाव एवं प्रजनन " ,
            " आवास प्रबन्धन " ,
            " आहार व्यवस्था " ,
            " शूकरों का रख-रखाव " ,
            " शूकर रोग एवं नियंत्रण " ,
            " शूकर फार्म के दैनिक कार्यक्रम " ,
            "  शूकर सह मत्स्य पालन " ,
            " शूकरों की बिक्री " ,


    };

    public String [] to_be_used;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        to_be_used=hindi.clone();

        setTitle(to_be_used[0]);


        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
       textView=(TextView)findViewById(R.id.textView1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);

        textView.setText(to_be_used[1]);
        button1.setText(to_be_used[2]);
        button2.setText(to_be_used[3]);
        button3.setText(to_be_used[4]);
        button4.setText(to_be_used[5]);
        button5.setText(to_be_used[6]);
        button6.setText(to_be_used[7]);
        button7.setText(to_be_used[8]);
        button8.setText(to_be_used[9]);
        button9.setText(to_be_used[10]);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

}
