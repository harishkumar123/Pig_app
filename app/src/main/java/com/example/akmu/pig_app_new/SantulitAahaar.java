package com.example.akmu.pig_app_new;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SantulitAahaar extends AppCompatActivity {
    public String [] hindi= {
            " शूकर पालन एप्प",
            "शूकरों के लिए संतुलित आहार ",
            "खाद्य-पदार्थो के विकल्प",

            "मक्का को टूटे चावल, गेंहूँ, बाजरा,जौ, शीरा द्वारा",
            "मूँगफली की खली को तिल, नारियल, शीशम अथवा सोयाबीन की खली द्वारा ",
            "फिश मील को वसा रहित दूध के पाउडर द्वारा ",

            "मक्का",//6
            "मूँगफली की खली ",
            "गेंहॅू का चोकर ",
            "शीरा ",
            "फिश मील",
            "लवण मिश्रण ",
            "नमक",
            "विभिन्न अवस्थाओं में शूकरों का दाना"
    };

    public String [] tobeused;

    public String [] tobeused1={//headings
            "खाद्य पदार्थ (%)",
            "वीनिंग शूकर\n(5-15 किग्रा)\nवीनर राशन",
            "वृद्धिशील शूकर\n(15-50 किग्रा)\nग्रोवर राशन",
            "व्यस्क शूकर\n(50-90 किग्रा)\nफिनिशर राशन",
            "गाभिन शूकरी\n",
            "दूध पिलाने वाली शूकरी",
            "नर शूकर",

            "श्रेणी",//7
            "वजन \n(किग्रा)",
            "दाना प्रतिदिन \n(किग्रा)",

            "वृद्धि शील शूकर",//10
            "गर्भवती शूकरी ",
            "दूध पिलाने वाली शूकरी ",
            "नर शूकर ",
            "शूकरी "
    };

    TextView text1,text2;
    String text, text11;
    ImageView imgView;
    Button text12;

    private WebView webView1,webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_santulit_aahaar);

        tobeused=hindi.clone();

        setTitle(tobeused[0]);
        //setTitleColor(Color.parseColor("#1e5e59"));

        if (getSupportActionBar() != null){
          //  getSupportActionBar().setTitle(Html.fromHtml("<font color='#1e5e59'>"+tobeused[0]+"</font>"));
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

        text12=(Button) findViewById(R.id.text1);
        text12.setText(tobeused[1]);
        text12.setTextSize(20);

        webView1=(WebView)findViewById(R.id.webViewSa);
// bgcolor="#90caf9"
        text = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
        text+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";
       // text+= "<tr height =10><td colspan=\"12\" align=\"center\" valign=\"middle\"><h4><font color=\"black\" size=\"4\">"+tobeused[1]+"</font></h4></td></tr>";
        text+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused1[0]+"</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[1] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[2] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[3] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[4] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[5] + "</font></h4></td><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[6] + "</font></h4></td></tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[6]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"55"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"50"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"45"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"50"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"55"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"60"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[7]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"18"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"15"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[8]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"13"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"18"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"25"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"18"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"13"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[9]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"-"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[10]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"3"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[11]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"1.5"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[12]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+"0.5"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webView1.loadDataWithBaseURL("file:///android_asset/", text, "text/html", "utf-8", null);

      //  text2=(TextView)findViewById(R.id.text2);
       // text2.setText(tobeused[2]);
       // text2.setTextSize(23);

        webView2=(WebView)findViewById(R.id.webViewKP);
        // bgcolor="#90caf9"
        text11 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body>";
        text11+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";
        text11+= "<tr height =10><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"black\" size=\"4\">"+tobeused[2]+"</font></h4></td></tr>";
        text11+= "<tr height =10>";
        text11+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
        text11+= "<ul>";
        text11+="<li><h4>"+tobeused[3]+"</h4></li>";
        text11+="<li><h4>"+tobeused[4]+"</h4></li>";
        text11+="<li><h4>"+tobeused[5]+"</h4></li>";
        text11+= "</ul>";

        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"black\" size=\"4\">"+tobeused[13]+"</font></h4></td></tr>";
        text11+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused1[7]+"</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[8] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[9] + "</font></h4></td></tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused1[10]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"25"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"1.0"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+""+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"25-45"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"2.0"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+""+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"45-100"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"2.0-3.0"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+""+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"100 से ऊपर"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"3.0-4.0"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused1[11]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"150"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"3.5"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused1[12]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"150"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"5.0"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused1[13]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"150"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"3.5"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused1[14]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"150-225"+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+"4.5"+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webView2.loadDataWithBaseURL("file:///android_asset/", text11, "text/html", "utf-8", null);

        imgView=(ImageView)findViewById(R.id.imageViewSA);
        imgView.setImageResource(R.drawable.pic9);

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
