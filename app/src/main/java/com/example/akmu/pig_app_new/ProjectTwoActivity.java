package com.example.akmu.pig_app_new;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;

public class ProjectTwoActivity extends AppCompatActivity {


    public String [] tobeused={
            "शूकर पालन एप्प",
            "	फार्म पर हमेशा प्रजनन योग्य शूकरियां ही रहेगीं, जिनका 100% प्रजनन कराया जाएगा। इन शूकरियों को 9 ब्यांत के बाद बेचा जाएगा और नयी मादाओं का क्रय किया जायेगा।",
            "	यह प्रोजेक्ट 5 वर्ष के लिए है, जिसमें 9 ब्यांत से प्राप्त शावकों को बेचा जायेगा। शावकों को 2 महीने की उम्र में माँ से अलग किया जायेगा और उनमें सेे आधे शावकों को बेचा जायेगा तथा आधे शावकों को 8 माह के बाद बेचा जायेगा।",
            "	प्रजनक शूकर की मृत्यु के कारण से हुआ नुकसान उस की बीमा राशि के मुआवजों से पूरा किया जायेगा।",
            "	निवेश में बढ़ती हुई कीमत को माँस/शावकों की कीमत वृद्धि से निष्प्रभावी किया जायेगा।",
            "	अच्छी नस्ल के स्वस्थ्य प्रजनक शूकर जिनका माँस उत्तम, वृद्धि दर तेज तथा प्रजनन क्षमता अधिक हो, को अच्छे ब्रीडर्स या सरकारी संस्था से खरीदने होंगे।",
            "	पशुओं की खरीद के लिए फरवरी-मार्च एवं अक्टूबर-नवम्बर के महीने अनुकूल है।",
            "	फार्म में लाने से कम से कम एक सप्ताह पहले शूकरों को प्रमुख रोगों (शूकर ज्वर, खुरपका-मुँहपका) के टीके लगाये जायेंगे।",

            "1",//8
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "",
            "",
            "",
            "",
            "",
            "",
            "10",
            "",
            "",
            "",
            "",
            "11",
            "12",

            "प्रजनक शूकरों की उम्र (माह)",//30
            "बैचों की संख्या (प्रजनक शूकर)",
            "दो बैचों में अन्तराल (माह)",
            "प्रति वर्ष ब्यातों की संख्या",
            "शावकों की संख्या/ब्यांत/शूकरी",
            "शावकों (2 माह तक) में मृत्युदर (%)",
            "फैटनर्स में मृत्युदर (%)",
            "दूध छुड़ाने की अवधि (माह)",
            "स्थान की आवश्यकता (वर्ग फिट/शूकर)",
            "प्रजनक नर शूकर",
            "दूध पिलाती शूकरी बच्चों के साथ",
            "शूकरी बिना बच्चों के साथ (शुष्क शूकरी)",
            "फैटनर्स (3-5 माह की आयु)",
            "फैटनर्स (6-8 माह की आयु)",
            "स्टोर रूम (वर्ग फिट)",
            "दाने की आवश्यकता (किग्रा/दिन)",
            "प्रजनक शूकर",
            "शावक (< 2 माह आयु)",
            "फैटनर्स (3-5 माह आयु)",
            "फैटनर्स (6-8 माह आयु)",
            "हरा चारा (किग्रा/दिन/वयस्क)",
            "फैटनर का औसत वजन (किग्रा)",

            "6-7",//52
            "2",
            "3",
            "2",
            "10",
            "10",
            "5",
            "2",
            "",
            "65",
            "80",
            "20",
            "10",
            "15",
            "100",
            "",
            "2.5",
            "0.3",
            "1.5",
            "2.0",
            "2.0",
            "90",

            "1",//74
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "",
            "",
            "",
            "",
            "11",
            "12",
            "13",
            "14",
            "",
            "",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",//99

            "प्रति नर प्रजनक शूकर की कीमत (रू)",//100
            "प्रति प्रजनक शूकरी की कीमत (रू)",
            "बाड़े के निर्माण की लागत (रू/वर्ग फिट)",
            "स्टोर रूम के निर्माण की लागत (रू/वर्ग फिट)",
            "दाने की कीमत (रू/किग्रा)",
            "हरा चारा की कीमत (रू/किग्रा)",
            "बीमा (%)",
            "औषधियों की कीमत (रू/शूकर)",
            "अन्य लागत-बिजली, पानी आदि (रू/शूकर)",
            "कार्य संविदा की लागत - रू/मजदूर/माह (अपेक्षित मजदूरों की संख्या)",
            "10 मादा + 2 नर",
            "20 मादा + 2 नर",
            "50 मादा + 2 नर",
            "100 मादा + 2 नर",
            "शावकों (वीनर) का बिक्री मूल्य (रू/शावक)",
            "फैटनर / प्रजनक शूकरों की कीमत (रू/किग्रा)",
            "अन्त में प्रजनक शूकर-शूकरियों की कीमत",
            "खाद द्वारा आय",
            "शावक (वीनर) या फैटनर (रू/माह)",
            "वयस्क शूकर (रू./माह)",
            "बोरों का बिक्री मूल्य (रू./बोरा)",
            "बाडों पर अवमूल्यन (%)",
            "सीमान्त/मार्जिन धन (%)",
            "श्रृण दर (%)",
            "श्रृण की अवधि (वर्ष)",
            "रियायत अवधि (वर्ष)",

            "8000",//126
            "6000",
            "300",
            "400",
            "18",
            "1.0",
            "4",
            "125",
            "100",
            "",
            "4000(1)",
            "4000(2)",
            "10000(2)",
            "10000(3)",
            "3000",
            "120",
            "मूल कीमत का 150%",
            "",
            "30",
            "60",
            "2",
            "5",
            "15",
            "12",
            "5",
            "1",

            "प्रोजेक्ट"

    };

    public String [] tobeused1={
            "क्र.सं.",
            "विवरण",
            "परिकल्पनायें",
            "तकनीकी मानक",
            "आर्थिक मानक"
    };

    String text1;
    private WebView webViewSKA;
    Button text11;

    public static int clicktext=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_two);

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

        text11=(Button)findViewById(R.id.text1);

        webViewSKA=(WebView)findViewById(R.id.webViewPSVHP);



        if(twenty_fragment.clicktext==21) {

            text11.setText(tobeused1[2]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
          //  text11.setTextSize(23);
            // bgcolor="#90caf9"
            text1 = "<html><head></head><body>";
            text1 += "<table border=\"0 px solid black\" cellpadding=\"0\" cellspacing=\"0\">";

            text1+= "<tr height =10>";
            text1 += "<td align=\"justify\" valign=\"middle\">";
            text1+= "<ul>";
            text1+="<li><h4>"+tobeused[1]+"</h4></li>";
            text1+="<li><h4>"+tobeused[2]+"</h4></li>";
            text1+="<li><h4>"+tobeused[3]+"</h4></li>";
            text1+="<li><h4>"+tobeused[4]+"</h4></li>";
            text1+="<li><h4>"+tobeused[5]+"</h4></li>";
            text1+="<li><h4>"+tobeused[6]+"</h4></li>";
            text1+="<li><h4>"+tobeused[7]+"</h4></li>";
            text1+= "</ul>";
            text1+= "</td>";
            text1+= "</tr>";
            text1 += "</table>";
            text1 += "</body></html>";


        }else if(twenty_fragment.clicktext==22){//Aarthik Manak

            text11.setText(tobeused1[3]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
            //text11.setTextSize(23);
            // bgcolor="#90caf9"
            text1 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body>";
            text1+= "<table  border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text1+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused1[0]+"</font></h4></td><td colspan=\"6\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[1] + "</font></h4></td></tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[8]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[30]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[52]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[9]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[31]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[53]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[10]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[32]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[54]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[11]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[33]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[55]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[12]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[34]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[56]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[13]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[35]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[57]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[14]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[36]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[58]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[15]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[37]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[59]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[16]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[38]+"</h4>";
            text1+="</td>";
            // text+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
            // text+="<h4>"+tobeused[60]+"</h4>";
            //text+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[17]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[38]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[61]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[18]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[39]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[62]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[19]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[40]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[63]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[20]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[41]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[64]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[21]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[42]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[65]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[22]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[43]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[66]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[23]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[44]+"</h4>";
            text1+="</td>";
            // text+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
            // text+="<h4>"+tobeused[67]+"</h4>";
            //text+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[24]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[45]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[68]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[25]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[46]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[69]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[26]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[47]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[70]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[27]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[48]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[71]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[28]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[49]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[72]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[29]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[50]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[73]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1 += "</table>";
            text1 += "</body></html>";
        }else if(twenty_fragment.clicktext==23){//Takniki Manak

            text11.setText(tobeused1[4]);
           // text11.setTextColor(Color.parseColor("#1e5e59"));
          //  text11.setTextSize(23);
            //bgcolor="#90caf9"
            text1 = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
            text1+= "<table  border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

            text1+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused1[0]+"</font></h4></td><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + tobeused1[1] + "</font></h4></td></tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[74]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[100]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[126]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[75]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[101]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[127]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[76]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[102]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[128]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[77]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[103]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[129]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[78]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[104]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[130]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[79]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[105]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[131]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[80]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[106]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[132]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[81]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[107]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[133]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[82]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[108]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[134]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[83]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[109]+"</h4>";
            text1+="</td>";
      /*  text11+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[135]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";*/

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[84]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[110]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[136]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[85]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[111]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[137]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[86]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[112]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[138]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[87]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[113]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[139]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[88]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[114]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[140]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[89]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[115]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[141]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[90]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[116]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[142]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[91]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[117]+"</h4>";
            text1+="</td>";
      /*  text11+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[143]+"</h4>";
        text11+= "</td>";*/
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[92]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[118]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[144]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[93]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[119]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[145]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[94]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[120]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[146]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[95]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[121]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[147]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[96]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[122]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[148]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[97]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[123]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[149]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[98]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[124]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[150]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "<tr height =10>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[99]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
            text1+="<h4>"+tobeused[125]+"</h4>";
            text1+="</td>";
            text1+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
            text1+="<h4>"+tobeused[151]+"</h4>";
            text1+= "</td>";
            text1+= "</tr>";

            text1+= "</table>";
            text1+= "</body></html>";
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
