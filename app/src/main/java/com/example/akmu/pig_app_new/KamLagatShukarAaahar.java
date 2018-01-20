package com.example.akmu.pig_app_new;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;

public class KamLagatShukarAaahar extends AppCompatActivity {
    public String [] hindi={
            " शूकर पालन एप्प",
            " कम लागत में शूकर आहार" ,
            " घरों, होटलों, हाॅस्टलों एवं मेस आदि से बचे भोजन को खिलाने से गुणवत्ता अनुसार 20-45 किग्रा. की वृद्धि प्राप्त की जा सकती है, परन्तु खिलाने से पूर्व हानिकारक वस्तुएँ हटा लें और गर्मी के मौसम में अच्छी प्रकार उबालकर उसे खिलाना चाहिए। ऐसे बचे भोजन में 70% प्रतिशत नमी होती है अतः एक किलो आहार की जगह 3 किलो बचा किचन वेस्ट खिलाना चाहिए। " ,
            " शीरा ऊर्जा का मुख्य स्त्रोत है, परन्तु इसका उपयोग तभी लाभदायक है जब यह सस्ता हो । इसका अधिक उपयोग छोटे शूकरों में दस्त लगा सकता है। वृद्धिशील शूकरों में राशन का 20% तथा बड़े शूकरों में 40% तक शीरा खिलाया जा सकता है।" ,
            " बेकरी का बचा सूखा पदार्थ अनाजों का प्रतिपूरक बन सकता है। बेकरी का बचा पदार्थ देते समय यह ध्यान रखना चाहिए कि यह पुराना होने के कारण पेट की बीमारी उत्पन्न कर सकता है क्योंकि इसमें फफॅूदी आने का डर बना रहता है। ",
            " आलू सस्ता होने पर शूकर आहार में यह प्रयुक्त हो सकता है। जब भी आलू खिलायें उबाल कर खिलायें । तीन भाग आलू एवं एक भाग अनाज मिलाकर शूकर आहार तैयार कर सकते हैं।" ,
            " शकरकन्दी शूकरों का स्वादिष्ट आहार है और ऊर्जा का अच्छा स्रोत है। आहार में अनाज का 35 से 50% शकरकन्दी का आटा दिया जा सकता है। परन्तु इसे छोटे शावकों को नहीं खिलाना चाहिए। " ,
            " सब्जी मण्डी की बची गाजर, चुकन्दर, गोभी आदि को भी शूकर आहार में सम्मिलित किया जा सकता है। " ,
            " चावल की पाॅलिश भी बड़े शूकरों को 50% अनाज के साथ मिलाकर खिला सकते हैें। छोटे शावकों को ये राशन में मिलाकर नहीं देना चाहिए। इससे शावकोें में दस्त लगने का खतरा बना रहता है।" ,
            " गेंहूँ या चावल के टुकड़े यदि पर्याप्त मात्रा में सस्ते उपलब्ध हो तो इनको कुल आहार का 60% तक प्रयोग किया जा सकता है।" ,
            " शूकरों को स्वस्थ एवं कम लागत में पालने के लिए मुलायम चारे जैसे बरसीम, मक्का इत्यादि को 2-3 किग्रा प्रतिदिन खिलाना उत्तम होता है।" ,
            " आमतौर पर उपयुक्त तरह के बचे आहार के साथ बाजार में उपलब्ध खनिज लवण को आहार के साथ 5-10 ग्राम मिलाना चाहिए।" ,
            " केले के पत्ते, सूबबूल के पत्ते व फलियाँ, पपीता, अनन्नास, कद्दू, टमाटर आदि के सस्ते होने पर उन्हें आवश्यकतानुसार शूकर आहार के रूप में 5 से 20% तक दे सकते हैं। ",
            " गुड़ की मैली में पर्याप्त मात्रा में ग्लूकोज होने के कारण यह मक्के की जगह प्रयोग में लाया जा सकता है। इस मैली में फाइबर न होने के कारण 1 किलो चोकर में 1 किग्रा मैली एवं पानी मिलाकर घोल बनाकर खिलाये। एक वयस्क पशु को 3.5 किलो मैली खिलायी जा सकती है यदि इससे अधिक मैली खिलायेंगे तो अधिक रसायन के कारण शूकर का पेट फूलकर मरने का डर रहता है। ",
            "(iv) क्षेत्र विशेष राशन",
            "चारा एवं सब्जी खिलाते हुए",
            "गुड़ की मैली खाता हुआ शूकर"
    };

    public String [] tobeused;

    Button text1;
    String text;
    private WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_kam_lagat_shukar_aaahar);
        tobeused=hindi.clone();

        setTitle(tobeused[0]);
        if (getSupportActionBar() != null){
            //getSupportActionBar().setTitle(Html.fromHtml("<font color='#1e5e59'>"+tobeused[0]+"</font>"));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);//abc_ic_ab_back_mtrl_am_alpha
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            Drawable upArrow=null;
          /*  if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
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

        webView1=(WebView)findViewById(R.id.webViewKLSA);
//       bgcolor="#90caf9"
        text = "<html><body >";
        text+= "<table border=\"0px solid black\">";
        text += "<tr height =10>";
        text += "<td align=\"center\" valign=\"middle\">";
        text += "<img src=\"pic10.jpg\" height='60%' width='60%' ></img>";
        text += "</td>";
        text += "</tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[2]+"</h4></li>";
        text+="<li><h4>"+tobeused[3]+"</h4></li>";
        text+="<li><h4>"+tobeused[4]+"</h4></li>";
        text+="<li><h4>"+tobeused[5]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";
        text += "<tr height =10>";
        text += "<td align=\"center\" valign=\"middle\">";
        text += "<img src=\"pic11.jpg\" height='60%' width='60%' ></img>";
        text += "</td>";
        text += "</tr>";
        text += "<tr height =10>";
        text += "<td align=\"center\" valign=\"middle\">";
        text += "<h4>"+tobeused[15]+"</h4>";
        text += "</td>";
        text += "</tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[6]+"</h4></li>";
        text+="<li><h4>"+tobeused[7]+"</h4></li>";
        text+="<li><h4>"+tobeused[8]+"</h4></li>";
        text+="<li><h4>"+tobeused[9]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";
        text += "<tr height =10>";
        text += "<td align=\"center\" valign=\"middle\">";
        text += "<img src=\"pic12.jpg\" height='60%' width='60%' ></img>";
        text += "</td>";
        text += "</tr>";
        text += "<tr height =10>";
        text += "<td align=\"center\" valign=\"middle\">";
        text += "<h4>"+tobeused[16]+"</h4>";
        text += "</td>";
        text += "</tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[10]+"</h4></li>";
        text+="<li><h4>"+tobeused[11]+"</h4></li>";
        text+="<li><h4>"+tobeused[12]+"</h4></li>";
        text+="<li><h4>"+tobeused[13]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";
        text+= "</table>";
        text+= "</body></html>";

        webView1.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);
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
