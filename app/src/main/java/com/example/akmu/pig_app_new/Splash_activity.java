package com.example.akmu.pig_app_new;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Splash_activity extends AppCompatActivity {

    Handler handler ;
    TextView textView;
    public String [] hindi={
            "शूकर पालन एप्प"
    };


    public String [] to_be_used;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_activity);


           textView=(TextView)findViewById(R.id.textView2);

        to_be_used=hindi.clone();

        textView.setText(to_be_used[0]);
       // textView.setTextColor(Color.parseColor("#1e5e59"));
        textView.setTextSize(23);

        handler= new Handler();

       handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash_activity.this,MainActivity.class);
                finish();
                startActivity(intent);
            }
        },4000);




    }

}
