package com.example.akmu.pig_app_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main6Activity extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView textView;

    public String [] hindi={
            "शूकर पालन एप्प",
            "शूकर प्रजनन" ,
            " मादा - नर चुनाव " ,
            " प्रजनन " ,
            "शूकरी में गर्म (हीट) होने के लक्षण " ,
            "प्रजनन विधि "


    };

    public String [] to_be_used;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        to_be_used=hindi.clone();

        setTitle(to_be_used[0]);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        textView=(TextView)findViewById(R.id.textView1);

        textView.setText(to_be_used[1]);
        button1.setText(to_be_used[2]);
        button2.setText(to_be_used[3]);
        button3.setText(to_be_used[4]);
        button4.setText(to_be_used[5]);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main6Activity.this,Main_sixth_fragment.class);
                intent.putExtra("number","1");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main6Activity.this,Main_sixth_fragment.class);
                intent.putExtra("number","2");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main6Activity.this,Main_sixth_fragment.class);
                intent.putExtra("number","3");
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Main6Activity.this,Main_sixth_fragment.class);
                intent.putExtra("number","4");
                startActivity(intent);
            }
        });



    }

}
