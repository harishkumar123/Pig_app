package com.example.akmu.pig_app_new;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class ProjectTwoOneActivity extends AppCompatActivity {
    String [] to_be_used= {

            "शूकर पालन एप्प",
            "प्रतिवर्ष शूकरों का विक्रय (हर्ड प्रोजेक्शन)",
            "आर्थिक विश्लेषण",
            "नकदी प्रवाह विश्लेषण",
            "श्रृण भुगतान अनुसूची",
            "आर्थिक मूल्यांकन",

            "वर्ष",//6
            "माह",
            "प्रजनक शूकर",
            "पैदा हुए शावक*",
            "दूध पीने वाले शावक*",
            "बेचे गये शावक(वीनर)*",
            "बेचे गए फैटनर्स*",
            "प्रतिवर्ष बेचे गए शूकर",

            "प्रथम बैच",//14
            "दिवत्या  बैच",

            "शूकरी-10",//16
            "गाभिन-10",
            "दूध पिलाने वाली-10",

            "43 (3 माह)",//19
            "43 (4 माह)",
            "43 (5 माह)",
            "वीनर्स-90",//22

            "43 (6 माह)",//23
            "43 (7 माह)",

            "43 (8 माह) बेचे गए",//25
            "43 (6 माह)",

            "वीनर्स-180 \nफैटनर्स-172",
            "",

            "इसी प्रकार",
            "प्रोजेक्ट के अन्त में",
            "*शावक(< 2 माह आयु)-10% मृत्यु दर : 100-10 = 90, फैटनर्स(5% मृत्यु दर): \n45-2.25 =42.75",//31

            "वर्ष - 1",//32
            "क्र.सं.",//33
            "विवरण",//34
            "आवश्यकता",
            "भौतिक इकाई",
            "लागत (रू/ईकाई)",
            "कुल लागत (रू)",//38

            "बाड़े एवं अन्य संरचनाएं",//39
            "दूध पिलानेवाली शूकरी का बाड़ा(4)",
            "80 वर्ग फिट/बाड़ा",
            "नर प्रजनक शूकर एवं प्रजनन बाड़ा (2)",
            "65 वर्ग फिट/नर शूकर",
            "शुष्क शूकरी बाड़ा(6)",
            "20 वर्ग फिट/शूकरी",
            "फैटनर(3-5माह) बाड़ा(43)",
            "10 वर्ग फिट/फैटनर",
            "फैटनर(6-8 माह)बाड़ा (43)",
            "15 वर्ग फिट/फैटनर",
            "स्टोर रूम",
            "100 वर्ग फिट",
            "योग",
            "जल आपूर्ति की व्यवस्था-बोरवेल, पंप सैट-1 एचपी, वाटर टैंक",//53

            "प्रजनक शूकरों की कीमत",
            "शूकरियों की कीमत",
            "शूकर की कीमत",
            "कुल पूँजीगत लागत",//57

            "आवर्ती लागत (वर्ष-1)",//58

            "प्रजनक शूकरों के दाने की लागत",//59
            "2.5 किग्रा/शूकर/दिन",
            "20075 किग्रा (22X365X2.5)",

            "हरा चारा",
            "2 किग्रा/शूकर/दिन",
            "16060 किग्रा (22X365X2)",

            "शावकों(<2 माह)के दाने की लागत",
            "0.3 किग्रा/शावक/दिन",
            "3240 किग्रा (180X60X0.3)",

            "फैटनर्स(3-5 माह)के दाने की लागत",
            "1.5 किग्रा/शावक/दिन",
            "5805 किग्रा (43X90X1.5)",//70

            "बीमा की लागत",
            "प्रजनक शूकरों की लागत का 4%",
            "रू 136000 (120000+16000)",

            "कार्य संविदा की लागत",
            "2 मजदूर",
            "12 माह",

            "औषधियों की लागत",
            "22 प्रजनक + 100 शावक",

            "अन्य लागत",
            "22 प्रजनक + 43 फैटनर्स",

            "कुल आवर्ती लागत",//81

            "कुलवित्तीय परिव्यय (टीएफओ) (831500+675910)",
            "सीमान्त राशि(टीएफओ का 15%)",
            "बैंक श्रृण(टीएफओ का 85%)",//84

            "आय(वर्ष-1)",//85

            "शावकों की बिक्री (रू 3000/शावक)",
            "खाद की बिक्री",
            "बोरों की बिक्री",

            "कुल आय",//89

            "वर्ष-2 से वर्ष-5 तक",//90
            "आवर्ती लागत (वर्ष-2)",//91

            "हरा चारा (प्रजनक)",

            "6480 किग्रा (360X60X0.3)",

            "23220 किग्रा (172X90X1.5)",

            "फैटनर्स(6-8 माह)के दाने की लागत",
            "2 किग्रा/शावक/दिन",
            "30960 किग्रा (172X365X2.5)",

            "12 प्रजनक + 400 शावक",
            "12 प्रजनक + 172 फैटनर्स",

            "आय (वर्ष-2)",//100

            "शावकों (वीनर) की बिक्री (रू 3000/शावक)",
            "फैटनर्स की बिक्री (रू 120/किग्रा × 90 किग्रा शारीरिक भार)",
            "खाद की बिक्री",
            "15840 (22 प्रजनक × 12 माह × रू 60/माह)" +"\n30960 (86 फैटनर्स × 6 माह × रू 30/माह)",
            "बोरों की बिक्री",
            "1614.7 बोरे × 2 = 3229.4",

            "आवर्ती लागत एवं आय वर्ष-3, वर्ष-4, एवं वर्ष-5 में वर्ष-2 के समान रहेगी।",
            "वर्ष के अन्त में कुल योग",//108

            "इसी प्रकार",
            "प्रोजेक्ट के अन्त में",
            "*शावक(< 2 माह आयु)-10% मृत्यु दर : 100-10 = 90, फैटनर्स(5% मृत्यु दर): \n45-2.25 =42.75",//111

            "नकदी प्रवाह विश्लेषण",//112

            "वर्ष-1",
            "वर्ष-2",
            "वर्ष-3",
            "वर्ष-4",
            "वर्ष-5",//117

            "पूँजीगत लागत",
            "आवर्ती लागत",
            "आहार की लागत",//120
            "बीमा की लागत",//121
            "कार्य संविदा की लागत",//122
            "औषधियों की लागत",
            "अन्य लागत",
            "कुल लागत",
            "आय",
            "शावकों (वीनर) की बिक्री",
            "फैटनर्स की बिक्री",
            "खाद की बिक्री",
            "बोरों की बिक्री",
            "बाड़ों की वर्ष-5 में घटी हुई कीमत",
            "प्रजनक शूकरों का वर्ष-5 में कीमत",
            "कुल आय",
            "कुल लाभ",

            "श्रृण भुगतान अनुसूची",
            //next
            "श्रृण की शेष राशि",
            "वार्षिक किस्त (मुख्य राशि)",
            "वार्षिक किश्त (ब्याज)",
            "शुद्ध लाभ",
            //next
            "5 वर्षों में कुल शुद्ध लाभ : रू 2547309",
            "प्रतिवर्ष शुद्ध लाभ : रू 509462",
            "प्रतिमाह शुद्ध लाभ : रू 42455",
            //next
            "आर्थिक मूल्यांकन",
            "शुद्ध वर्तमान मूल्य (एनपीवी) : रू 2822914",
            "आय की आन्तरिक दर(आईआरआर) : 62%",
            "लाभ लागत अनुपात(बी/सी) : 1.35",
            "प्रोजेक्ट की एनपीवी एवं आईआरआर उच्च हैं, जो प्रोजेक्ट की आर्थिक और वित्तीय सुदृढ़ता को दर्शाता है।",
            "प्रोजेक्ट तकनीकी रूप से व्यवहारिक और आर्थिक रूप से व्यवहार्य है।",

            //next
            "आर्थिक विश्लेषण",
            "15840 (22 प्रजनक × 12 माह × रू 60/माह)" +"\n30960 (86 फैटनर्स × 6 माह × रू 30/माह)",//150
            "कुल आय",//151
            "12 माह"

    };

    View v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;
    TextView tvPLYear1,tvALYear1,tvAyayear1,tvY2t5AlYear2,tvAyayear2;
    WebView webViewPLYear1,webViewALYear1, webViewAyayear1,webViewY2t5AlYear2, webViewAyayear2;

    String text1,text2,text3,text4,text5,text6;
    private WebView webViewSKA;
    Button text11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_two_one);
        setTitle(to_be_used[0]);
        if (getSupportActionBar() != null){
           // getSupportActionBar().setTitle(Html.fromHtml("<font color='#1e5e59'>"+to_be_used[0]+"</font>"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);//abc_ic_ab_back_mtrl_am_alpha
            getSupportActionBar().setDisplayShowHomeEnabled(true);
          /*  Drawable upArrow=null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
                // only for gingerbread and newer versions
                upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
            }else{
                //  upArrow = getResources().getDrawable(android.R.drawable.abc_ic_ab_back_mtrl_am_alpha);//abc_ic_ab_back_material
            }
            //abc_ic_ab_back_material
            upArrow.setColorFilter(getResources().getColor(R.color.color_dark), PorterDuff.Mode.SRC_ATOP);
            getSupportActionBar().setHomeAsUpIndicator(upArrow);
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.nav_header_color_again)));
*/
        }

        text11=(Button)findViewById(R.id.text11);

        webViewSKA=(WebView)findViewById(R.id.webViewPSVHP);

        webViewPLYear1=(WebView)findViewById(R.id.webViewAVPL1);
        webViewALYear1=(WebView)findViewById(R.id.webViewAVPL2);
        webViewAyayear1=(WebView)findViewById(R.id.webViewAVPL3);
        webViewY2t5AlYear2=(WebView)findViewById(R.id.webViewAVPL4);
        webViewAyayear2=(WebView)findViewById(R.id.webViewAVPL5);

        tvPLYear1=(TextView) findViewById(R.id.text121);
        tvALYear1=(TextView) findViewById(R.id.text122);
        tvAyayear1=(TextView) findViewById(R.id.text123);
        tvY2t5AlYear2=(TextView) findViewById(R.id.text124);
        tvAyayear2=(TextView) findViewById(R.id.text125);

        v1=(View)findViewById(R.id.AVPL1);
        v2=(View)findViewById(R.id.AVPL2);
        v3=(View)findViewById(R.id.AVPL3);
        v4=(View)findViewById(R.id.AVPL4);
        v5=(View)findViewById(R.id.AVPL5);
        v6=(View)findViewById(R.id.AVPL6);
        v7=(View)findViewById(R.id.AVPL7);
        v8=(View)findViewById(R.id.AVPL8);
        v9=(View)findViewById(R.id.AVPL9);
        v10=(View)findViewById(R.id.AVPL10);

        // System.out.println("LEBGHTH OF ARRAY"+to_be_used.length);
        if (ProjectOneActivity.clicktext==1) {
            text11.setText(to_be_used[1]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
          //  text11.setTextSize(23);
            //bgcolor="#90caf9"
            text1 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text1 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text1 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[6] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[7] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[8] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[9] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[10] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[11] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[12] + "</font></h4><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[13] + "</font></h4></td></td></tr>";
            //text1+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>"+""+"</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[14] + "</h4></td><td colspan=\\\"2\\\" align=\\\"center\\\" valign=\\\"middle\\\"><h4>\" + to_be_used[9] + \"</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[15] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[11] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[12] + "</h4><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[13] + "</h4></td></td></tr>";
            text1 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[14] + "</font></h4></td><td align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[15] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td> <td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[14] + "</font></h4></td><td align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[15] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td></tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[16] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "4" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[16] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "6" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "7" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "8" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[18] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "100" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "9" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "10" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[19] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "11" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "100" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[20] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "12" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[21] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4><font color=\"black\">" + to_be_used[22] + "</font></h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[108] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "200" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "180" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "90" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td></tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[23] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[19] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[18] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "100" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[24] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[20] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[25] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[21] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "4" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[19] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[23] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[18] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "100" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[20] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[24] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "6" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[21] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[25] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "7" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[23] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[19] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "8" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[18] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "50" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[24] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[20] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "9" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[25] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[21] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "10" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[17] + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[19] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[23] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "11" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[18] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "100" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[20] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[24] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "12" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "--" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "90" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "45" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[21] + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[25] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4><font color=\"black\">" + to_be_used[27] + "</font></h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[108] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "400" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "360" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "180" + "</h4></td><td align=\"center\" valign=\"middle\"><h4>" + "86" + "</h4></td><td align=\"center\" valign=\"middle\"><h4>" + "86" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td></tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "3" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"4\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[109] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "360" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "180" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"4\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[109] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "360" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "180" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "5" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"4\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[109] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "360" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "180" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "86" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4><font color=\"black\">" + to_be_used[27] + "</font></h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"9\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4><font color=\"black\">" + to_be_used[110] + "</font></h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "810" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "344" + "</h4>";
            text1 += "</td>";
            text1 += "<td  align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "344" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"15\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[111] + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "</table>";
            text1 += "</body></html>";
        }else if (ProjectOneActivity.clicktext==2) {
            webViewSKA.setVisibility(View.GONE);
            text11.setText(to_be_used[2]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
           // text11.setTextSize(23);
            tvPLYear1.setVisibility(View.VISIBLE);
            tvPLYear1.setText(to_be_used[32]+"\n"+to_be_used[118]+"\n");
            tvPLYear1.setTextColor(Color.parseColor("#FF2D2B2C"));
            tvPLYear1.setTextSize(20);
            v1.setVisibility(View.VISIBLE);

            text2 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text2 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text2 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[33] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[34] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[35] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[36] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[37] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[38] + "</font></h4></td></tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "1" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"10\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[39] + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[40] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[41] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "640" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "300" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "192000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[42] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[43] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "130" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "300" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "39000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[44] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[45] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "240" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "300" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "72000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[46] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[47] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "430" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "300" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "129000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[48] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[49] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "645" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "300" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "193500" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[50] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[51] +  "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "100" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "400" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "40000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"8\" align=\"center\" valign=\"middle\">";
            text2 += "<h4><font color=\"black\">" + to_be_used[52] + "</font></h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "665500" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "2" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"8\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[53] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "30000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "3" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"10\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[54] + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[55] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "20" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "6000" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "120000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + to_be_used[56] + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "2" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "8000" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "16000" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "<tr height =10>";
            text2 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text2 += "<h4>" + "" + "</h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"8\" align=\"center\" valign=\"middle\">";
            text2 += "<h4><font color=\"black\">" + to_be_used[57] + "</font></h4>";
            text2 += "</td>";
            text2 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text2 += "<h4>" + "831500" + "</h4>";
            text2 += "</td>";
            text2 += "</tr>";

            text2 += "</table>";
            text2 += "</body></html>";
            webViewPLYear1.setVisibility(View.VISIBLE);
            webViewPLYear1.loadDataWithBaseURL("file:///android_asset/", text2, "text/html", "utf-8", null);
            v2.setVisibility(View.VISIBLE);

            tvALYear1.setVisibility(View.VISIBLE);
            tvALYear1.setText(to_be_used[58]);
            tvALYear1.setTextColor(Color.parseColor("#FF2D2B2C"));
            tvALYear1.setTextSize(20);
            v3.setVisibility(View.VISIBLE);

            text3 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text3 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text3 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[33] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[34] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[35] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[36] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[37] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[38] + "</font></h4></td></tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "1" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[59] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[60]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[61] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "18" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "361350" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[62] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[63]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[64] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "1" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "16060" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[65] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[66]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[67] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "18" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "58320" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[68] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[69]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[70] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "18" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "104490" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "2" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[71] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[72]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[73] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "0.04" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "5440" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "3" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[74] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[75]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[76] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "4000" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "96000" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "4" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[77] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[78]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "222" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "125" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "27750" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "5" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[79] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" +to_be_used[80]+  "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "65" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "100" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "6500" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"8\" align=\"center\" valign=\"middle\">";
            text3 += "<h4><font color=\"black\">" + to_be_used[81] + "</font></h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "675910" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "6" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"8\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[82] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "1507410" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "7" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"8\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[83] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "226111.5" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "<tr height =10>";
            text3 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + "8" + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"8\" align=\"justify\" valign=\"middle\">";
            text3 += "<h4>" + to_be_used[84] + "</h4>";
            text3 += "</td>";
            text3 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text3 += "<h4>" + "1281299" + "</h4>";
            text3 += "</td>";
            text3 += "</tr>";

            text3 += "</table>";
            text3 += "</body></html>";

            webViewALYear1.setVisibility(View.VISIBLE);
            webViewALYear1.loadDataWithBaseURL("file:///android_asset/", text3, "text/html", "utf-8", null);
            v4.setVisibility(View.VISIBLE);

            tvAyayear1.setVisibility(View.VISIBLE);
            tvAyayear1.setText(to_be_used[85]);
            tvAyayear1.setTextColor(Color.parseColor("#FF2D2B2C"));
            tvAyayear1.setTextSize(20);
            v5.setVisibility(View.VISIBLE);

            text4 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text4 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            // text4 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[33] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[34] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[35] + "</h4></td></tr>";

            text4 += "<tr height =10>";
            text4 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text4 += "<h4>" + "1" + "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + to_be_used[86] +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "90" +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "27000" +  "</h4>";
            text4 += "</td>";
            text4 += "</tr>";

            text4 += "<tr height =10>";
            text4 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text4 += "<h4>" + "2" + "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + to_be_used[87] +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + to_be_used[150] +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "19710" +  "</h4>";
            text4 += "</td>";
            text4 += "</tr>";

            text4 += "<tr height =10>";
            text4 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text4 += "<h4>" + "3" + "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + to_be_used[88] +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "582.4 बोरे × 2 = 1164.8" +  "</h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "1164.8" +  "</h4>";
            text4 += "</td>";
            text4 += "</tr>";

            text4 += "<tr height =10>";
            text4 += "<td colspan=\"5\" align=\"center\" valign=\"middle\">";
            text4 += "<h4><font color=\"black\">" + to_be_used[151] + "</font></h4>";
            text4 += "</td>";
            text4 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text4 += "<h4>" + "290874.8" +  "</h4>";
            text4 += "</td>";
            text4 += "</tr>";

            text4 += "</table>";
            text4 += "</body></html>";

            webViewAyayear1.setVisibility(View.VISIBLE);
            webViewAyayear1.loadDataWithBaseURL("file:///android_asset/", text4, "text/html", "utf-8", null);
            v6.setVisibility(View.VISIBLE);

            tvY2t5AlYear2.setVisibility(View.VISIBLE);
            tvY2t5AlYear2.setText(to_be_used[90]+"\n"+to_be_used[91]);
            tvY2t5AlYear2.setTextColor(Color.parseColor("#FF2D2B2C"));
            tvY2t5AlYear2.setTextSize(20);
            v7.setVisibility(View.VISIBLE);

            text5 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text5 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text5 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[33] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[34] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[35] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[36] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[37] + "<font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[38] + "</font></h4></td></tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "1" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[59] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[60]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[61] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "18" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "361350" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[92] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[63]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[64] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "1" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "16060" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[65] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[66]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[93] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "18" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "116640" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[68] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[69]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[94] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "18" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "417960" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[95] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[63]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[97] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "18" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "557280" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";


            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "2" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[71] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[72]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "136000" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "0.04" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "5440" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "3" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[74] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[75]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[152] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "4000" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "96000" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "4" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[77] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[98]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "422" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "125" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "52750" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + "5" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text5 += "<h4>" + to_be_used[79] + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" +to_be_used[99]+  "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "194" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "100" + "</h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "19400" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";

            text5 += "<tr height =10>";
            text5 += "<td colspan=\"9\" align=\"center\" valign=\"middle\">";
            text5 += "<h4><font color=\"black\">" + to_be_used[81] + "</font></h4>";
            text5 += "</td>";
            text5 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text5 += "<h4>" + "1642880" + "</h4>";
            text5 += "</td>";
            text5 += "</tr>";


            text5 += "</table>";
            text5 += "</body></html>";

            webViewY2t5AlYear2.setVisibility(View.VISIBLE);
            webViewY2t5AlYear2.loadDataWithBaseURL("file:///android_asset/", text5, "text/html", "utf-8", null);
            v8.setVisibility(View.VISIBLE);

            tvAyayear2.setVisibility(View.VISIBLE);
            tvAyayear2.setText(to_be_used[100]);
            tvAyayear2.setTextColor(Color.parseColor("#FF2D2B2C"));
            tvAyayear2.setTextSize(20);
            v9.setVisibility(View.VISIBLE);

            text6 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text6 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "1" + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[101] + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text6 += "<h4>" + "180" +  "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "540000" + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "2" + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[102] + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text6 += "<h4>" + "172" +  "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "1857600" + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "3" + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[103] + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[104] +  "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "46800" + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "4" + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[105] + "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text6 += "<h4>" + to_be_used[106] +  "</h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "3229.4" + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"5\" align=\"center\" valign=\"middle\">";
            text6 += "<h4><font color=\"black\">" + to_be_used[151] + "</font></h4>";
            text6 += "</td>";
            text6 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text6 += "<h4>" + "2447629" + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "<tr height =10>";
            text6 += "<td colspan=\"7\" align=\"center\" valign=\"middle\">";
            text6 += "<h4>"+"*" + to_be_used[107] + "</h4>";
            text6 += "</td>";
            text6 += "</tr>";

            text6 += "</table>";
            text6 += "</body></html>";

            webViewAyayear2.setVisibility(View.VISIBLE);
            webViewAyayear2.loadDataWithBaseURL("file:///android_asset/", text6, "text/html", "utf-8", null);
            v10.setVisibility(View.VISIBLE);

        }else if(ProjectOneActivity.clicktext==3){
            text11.setText(to_be_used[112]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
          //  text11.setTextSize(23);

            text1 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text1 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";


            text1 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[33] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[34] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[113] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[114] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[115] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[116] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[117] + "</font></h4></td></tr>";


            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "1" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[118] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "831500" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"10\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "2" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"14\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[119] + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[120] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "540220" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1469290" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1469290" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1469290" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1469290" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[121] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5440" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5440" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5440" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5440" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "5440" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[122] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "96000" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "96000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "96000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "96000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "96000" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[123] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "27750" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "52750" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "52750" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "52750" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "52750" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[124] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "6500" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "19400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "19400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "19400" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "19400" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "3" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[125] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1507410" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"14\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[126] + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[127] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "270000" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "540000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "540000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "540000" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "540000" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[128] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1857600" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1857600" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1857600" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1857600" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[129] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "19710" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "46800" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "46800" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "46800" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "46800" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[130] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1164.8" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3229.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3229.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3229.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3229.4" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[131] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "499125" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[132] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "204000" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";


            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "5" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[133] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "290874.8" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3150754" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[134] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "-1216535.2" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1507874" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";


            text1 += "</table>";
            text1 += "</body></html>";
        }else if(ProjectOneActivity.clicktext==4) {
            text11.setText(to_be_used[135]);
            //text11.setTextColor(Color.parseColor("#1e5e59"));
           // text11.setTextSize(23);

            text1 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text1 += "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";


            text1 += "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[33] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[34] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[113] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[114] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[115] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[116] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used[117] + "</h4></tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "1" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[133] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "290874.8" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "2447629" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "3150754" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";


            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "2" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[125] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1642880" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "3" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[134] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "290874.8" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "804749.4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1507874" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";


            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "4" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[136] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1281299" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "960973.9" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "640649.3" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "320324.6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "5" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[137] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "320324.6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "320324.6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "320324.6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "320324.6" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";


            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "6" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[138] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "153755.8" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "115316.9" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "76877.9" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "38439" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "0" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1 += "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "7" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + to_be_used[139] + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "137119" +  "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "369107.9" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "407546.9" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "445985.8" + "</h4>";
            text1 += "</td>";
            text1 += "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1 += "<h4>" + "1187550" + "</h4>";
            text1 += "</td>";
            text1 += "</tr>";

            text1+= "<tr height =10>";
            text1 += "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
            text1 += "<h4>" + "" + "</h4>";
            text1 += "</td>";
            text1+= "<td colspan=\"14\" align=\"justify\" valign=\"middle\">";
            text1+= "<ul>";
            text1+="<li><h4>"+to_be_used[140]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[141]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[142]+"</h4></li>";
            text1+= "</ul>";
            text1+= "</td>";
            text1+= "</tr>";

            text1 += "</table>";
            text1 += "</body></html>";

        }else if(ProjectOneActivity.clicktext==5) {
            text11.setText(to_be_used[143]);
         //   text11.setTextColor(Color.parseColor("#1e5e59"));
           // text11.setTextSize(23);

            text1 = "<html><head></head><body >";
            text1 += "<table border=\"0 px solid black\" cellpadding=\"0\" cellspacing=\"0\">";

            text1+= "<tr height =10>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1+= "<ul>";
            text1+="<li><h4>"+to_be_used[144]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[145]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[146]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[147]+"</h4></li>";
            text1+="<li><h4>"+to_be_used[148]+"</h4></li>";
            text1+= "</ul>";
            text1+= "</td>";
            text1+= "</tr>";
            text1 += "</table>";
            text1 += "</body></html>";
        }

        webViewSKA.loadDataWithBaseURL("file:///android_asset/", text1, "text/html", "utf-8", null);

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
