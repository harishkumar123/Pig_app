package com.example.akmu.pig_app_new;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Button;

public class PaniAvshykta extends AppCompatActivity {
    String [] hindi={
            "शूकर पालन एप्प",
            "पानी की आवश्यकता ",
            "आठ से बारह सप्ताह की उम्र के बच्चों को लगभग 4 लीटर पानी प्रतिदिन देना चाहिए। इसी प्रकार 8 से 25 सप्ताह के उम्र तक के शूकरों को 6 से 8 लीटर, गर्भवती शूकरियों को 10 से 20 लीटर, बच्चों को दूध पिलाने वाली शूकरियों को 20 से 30 लीटर एवं नर शूकरों को 20 से 25 लीटर पानी प्रतिदिन देना चाहिए।",
    };
    public String [] tobeused;

    Button text1;
    String text;
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pani_avshykta);

        tobeused=hindi.clone();

        setTitle(tobeused[0]);

        if (getSupportActionBar() != null){
           // getSupportActionBar().setTitle(Html.fromHtml("<font color='#1e5e59'>"+tobeused[0]+"</font>"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);//abc_ic_ab_back_mtrl_am_alpha
            getSupportActionBar().setDisplayShowHomeEnabled(true);
         /*   Drawable upArrow=null;
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

        text1=(Button) findViewById(R.id.text1);
        text1.setText(tobeused[1]);
        text1.setTextSize(20);
        text1.setTextColor(Color.parseColor("#ffffff"));

        webView1=(WebView)findViewById(R.id.webViewPA);
        //bgcolor="#90caf9"
        text = "<html><body >";
        text+= "<table border=\"0px solid black\">";

        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[2]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webView1.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);
    }
}
