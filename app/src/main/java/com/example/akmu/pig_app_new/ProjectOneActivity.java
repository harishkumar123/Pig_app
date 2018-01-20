package com.example.akmu.pig_app_new;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ProjectOneActivity extends AppCompatActivity {
    String [] to_be_used={
            "शूकर पालन एप्प",
            "प्रतिवर्ष शूकरों का विक्रय (हर्ड प्रोजेक्शन)",
            "आर्थिक विश्लेषण",
            "नकदी प्रवाह विश्लेषण",
            "श्रृण भुगतान अनुसूची",
            "आर्थिक मूल्यांकन",

            "पूँजीगत लागत",
            "आवर्ती लागत (वर्ष-1)",
            "आय(वर्ष-1)",
            "आवर्ती लागत (वर्ष-2)",
            "आय(वर्ष-2)",
            "आवर्ती लागत एवं आय वर्ष-3, वर्ष-4, एवं वर्ष-5 में वर्ष-2 के समान रहेगी।",
            "प्रोजेक्ट-I \n(10 प्रजनक मादा + 2 प्रजनक नर)",
            "प्रोजेक्ट-II \n(20 प्रजनक मादा + 2 प्रजनक नर)",
            "प्रोजेक्ट-III \n(50 प्रजनक मादा + 4 प्रजनक नर)",
            "प्रोजेक्ट-IV \n(100 प्रजनक मादा + 5 प्रजनक नर)"
    };
    public static int clicktext=0;

    Button textViewMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_one);
        setTitle(to_be_used[0]);
        if (getSupportActionBar() != null){
            //getSupportActionBar().setTitle(Html.fromHtml("<font color='#1e5e59'>"+to_be_used[0]+"</font>"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);//abc_ic_ab_back_mtrl_am_alpha
            getSupportActionBar().setDisplayShowHomeEnabled(true);
           /* Drawable upArrow=null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                // only for gingerbread and newer versions
                upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
            }else{
                //  upArrow = getResources().getDrawable(android.R.drawable.abc_ic_ab_back_mtrl_am_alpha);
            }
            //abc_ic_ab_back_material
            upArrow.setColorFilter(getResources().getColor(R.color.color_dark), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.nav_header_color_again)));*/

        }

        textViewMain = (Button) findViewById(R.id.text1);

        if(twenty_fragment.clicktext==30) {//Project 1
            textViewMain.setText(to_be_used[12]);
            textViewMain.setTextColor(Color.parseColor("#ffffff"));
            textViewMain.setTextSize(20);
        }else if(twenty_fragment.clicktext==31){// Project 2
            textViewMain.setText(to_be_used[13]);
            textViewMain.setTextColor(Color.parseColor("#ffffff"));
            textViewMain.setTextSize(20);
        }else if(twenty_fragment.clicktext==32){//Project 3
            textViewMain.setText(to_be_used[14]);
            textViewMain.setTextColor(Color.parseColor("#ffffff"));
            textViewMain.setTextSize(20);
        }else if(twenty_fragment.clicktext==33){//Project 4
            textViewMain.setText(to_be_used[15]);
            textViewMain.setTextColor(Color.parseColor("#ffffff"));
            textViewMain.setTextSize(20);
        }

        Button btp1=(Button)findViewById(R.id.point_1_text);
        btp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twenty_fragment.clicktext==30) {//Project 1
                    clicktext = 1;
                    Intent pt1 = new Intent(ProjectOneActivity.this, ProjectOneSubActivity.class);
                    startActivity(pt1);
                }else if (twenty_fragment.clicktext==31){//Project 2
                    clicktext = 1;
                    Intent pt1 = new Intent(ProjectOneActivity.this, ProjectTwoOneActivity.class);
                    startActivity(pt1);
                }else if (twenty_fragment.clicktext==32) {//Project 3
                    clicktext = 1;
                    Intent pt1 = new Intent(ProjectOneActivity.this, ProjectThreeActivity.class);
                    startActivity(pt1);
                }else if (twenty_fragment.clicktext==33) {//Project 4
                    clicktext = 1;
                    Intent pt1 = new Intent(ProjectOneActivity.this, ProjectFourActivity.class);
                    startActivity(pt1);
                }
            }
        });

        Button btp2=(Button)findViewById(R.id.point_2_text);
        btp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (twenty_fragment.clicktext==30) {//Project 1
                    clicktext = 2;
                    Intent pt2 = new Intent(ProjectOneActivity.this, ProjectOneSubActivity.class);
                    startActivity(pt2);
              }  else if (twenty_fragment.clicktext==31){//Project 2
                  clicktext = 2;
                  Intent pt2 = new Intent(ProjectOneActivity.this, ProjectTwoOneActivity.class);
                  startActivity(pt2);
              }  else if (twenty_fragment.clicktext==32) {//Project 3
                    clicktext = 2;
                    Intent pt2 = new Intent(ProjectOneActivity.this, ProjectThreeActivity.class);
                    startActivity(pt2);
                } else if (twenty_fragment.clicktext==33) {//Project 4
                    clicktext = 2;
                    Intent pt2 = new Intent(ProjectOneActivity.this, ProjectFourActivity.class);
                    startActivity(pt2);
                }
            }
        });

        Button btp3=(Button)findViewById(R.id.point_3_text);
        btp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twenty_fragment.clicktext==30){//Project 1
                    clicktext = 3;
                    Intent pt3 = new Intent(ProjectOneActivity.this, ProjectOneSubActivity.class);
                    startActivity(pt3);
                }else if (twenty_fragment.clicktext==31){//Project 2
                    clicktext = 3;
                    Intent pt3 = new Intent(ProjectOneActivity.this, ProjectTwoOneActivity.class);
                    startActivity(pt3);
                }else if (twenty_fragment.clicktext==32) {//Project 3
                    clicktext = 3;
                    Intent pt3 = new Intent(ProjectOneActivity.this, ProjectThreeActivity.class);
                    startActivity(pt3);
                }else if (twenty_fragment.clicktext==33) {//Project 4
                    clicktext = 3;
                    Intent pt3 = new Intent(ProjectOneActivity.this, ProjectFourActivity.class);
                    startActivity(pt3);
                }
            }
        });

        Button btp4=(Button)findViewById(R.id.point_4_text);
        btp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twenty_fragment.clicktext==30) {//Project 1
                    clicktext = 4;
                    Intent pt4 = new Intent(ProjectOneActivity.this, ProjectOneSubActivity.class);
                    startActivity(pt4);
                }
                else if (twenty_fragment.clicktext==31){//Project 2
                    clicktext = 4;
                    Intent pt4 = new Intent(ProjectOneActivity.this, ProjectTwoOneActivity.class);
                    startActivity(pt4);
                }else if (twenty_fragment.clicktext==32) {//Project 3
                    clicktext = 4;
                    Intent pt4 = new Intent(ProjectOneActivity.this, ProjectThreeActivity.class);
                    startActivity(pt4);
                } else if (twenty_fragment.clicktext==33) {//Project 4
                    clicktext = 4;
                    Intent pt4 = new Intent(ProjectOneActivity.this, ProjectFourActivity.class);
                    startActivity(pt4);
                }
            }
        });

        Button btp5=(Button)findViewById(R.id.point_5_text);
        btp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (twenty_fragment.clicktext==30) {//Project 1
                    clicktext = 5;
                    Intent pt5 = new Intent(ProjectOneActivity.this, ProjectOneSubActivity.class);
                    startActivity(pt5);
                } else if (twenty_fragment.clicktext==31){//Project 2
                    clicktext = 5;
                    Intent pt5 = new Intent(ProjectOneActivity.this, ProjectTwoOneActivity.class);
                    startActivity(pt5);
                } else if (twenty_fragment.clicktext==32) {//Project 3
                    clicktext = 5;
                    Intent pt5 = new Intent(ProjectOneActivity.this, ProjectThreeActivity.class);
                    startActivity(pt5);
                }else if (twenty_fragment.clicktext==33) {//Project 4
                    clicktext = 5;
                    Intent pt5 = new Intent(ProjectOneActivity.this, ProjectFourActivity.class);
                    startActivity(pt5);
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
