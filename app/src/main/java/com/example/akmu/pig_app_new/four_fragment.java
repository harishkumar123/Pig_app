package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by akmu on 12/14/2017.
 */


public class four_fragment extends Fragment {

    public four_fragment(){
    }
    public String [] hindi={
            "शूकर पालन एप्प",
            "शूकर आवास प्रबन्धन",
            "आवास निर्माण : सामान्यत  भवन निर्माण पूर्व-पश्चिम की ओर आबादी वाले क्षेत्र से दूर दक्षिण दिशा में होना चाहिए। शूकर आवास के प्रत्येक भाग (फर्श, नांद, दीवारें, छत इत्यादि)को सावधानीपूर्वक वर्तमान एवं भविष्य की आवश्यकताओं के अनुरूप बनाना चाहिए । ",
            "स्थान की आवश्यकता",
            "फर्श: शूकर आवास का फर्श कंकरीट-सीमेंट का बना होना चाहिए। फर्श खुरदरा होना चाहिए क्योंकि चिकने फर्श पर शूकर के गिरने या उसे चोट लगने का खतरा सदैव बना रहता है । ",
            "नांद : यह कंकरीट-सीमेंट से निर्मित करना चाहिए। इन नांदों के कोने गोलाई लिए हुए होने चाहिए, जिससे सफाई में आसानी रहे। नांद प्रति शूकर 0.3 मी गहरी, 0.3 मी लंबी एवं 0.20 मी चौड़ी होनी चाहिए। ",
            "दीवारें : शूकर गृह की दीवारों को 1-1.5 मी ऊँचाई तक चिकने सीमेंट से प्लास्टरिंग करना चाहिए, जिससे उन्हें साफ करने में आसानी हो। 1-1.5 मी से ऊपर की दीवार लोहे के पाइपों का प्रयोग कर निर्मित कर सकते हैं । इसके अतिरिक्त दीवारों के कोने गोलाई लिए हुए होने चाहिए।",
            "छत : फर्श से छत की ऊँचाई लगभग 3 मी होनी चाहिए जिससे मौसम बदलने का प्रभाव शूकर-गृह के अंदर कम से कम हो। प्रायः छत एसबेस्टस से बनाई जाती है। जी.आई.चादर या घास-फूस से भी छत बनाई जा सकती है। एसबेस्टस की छत बनाने में खर्च अधिक है। जी.आई. चादर की छत के नीचे शूकरों को रखने पर जाड़े में अधिक जाड़ा और गर्मी में अधिक गर्मी लगती है।",
            "शूकर फार्म की रूपरेखा ",
            "शूकर फार्मों की रूपरेखा बनाते समय विभिन्न श्रेणियों के शूकरों को किस प्रकार से रखा जाए, इसके लिए 12 मादा + 2 नर के फार्म का खाका चित्र द्वारा दिया गया है। ",

            "शूकर श्रेणी", //10
            "आच्छादित स्थान \n(वर्ग मीटर)",
            "खुला स्थान \n(वर्ग मीटर)",
            "वायु स्थान \n(घन मीटर)",
            "पशुओं की संख्या",

            "नर शूकर",//15
            "गाभिन/ब्याने वाली शूकरी",
            "शूकरी के बच्चे",
            "शुष्क शूकरी"
    };

    public String [] tobeused;

    Button text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;

    private WebView webViewSKA;
    String text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.four_fragment_layout, container, false);

        tobeused=hindi.clone();

        getActivity().setTitle(tobeused[0]);

        text1=(Button)view.findViewById(R.id.text1);
        text2=(TextView)view.findViewById(R.id.text2);
        text3=(TextView)view.findViewById(R.id.text3);
        text4=(TextView)view.findViewById(R.id.text4);
        text5=(TextView)view.findViewById(R.id.text5);
        text6=(TextView)view.findViewById(R.id.text6);
        text7=(TextView)view.findViewById(R.id.text7);
        text8=(TextView)view.findViewById(R.id.text8);
        text9=(TextView)view.findViewById(R.id.text9);

        webViewSKA=(WebView)view.findViewById(R.id.webViewSkA);

        text = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body bgcolor=\"#ffffff\">";
        text+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";

        text+= "<tr height =10><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>"+tobeused[10]+"</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + tobeused[11] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + tobeused[12] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + tobeused[13] + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + tobeused[14] + "</h4></td></tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[15]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"6.0-7.5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"8.8-12.0"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"11.0"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"1"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[16]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"7.5-9.0"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"8.8-12.0"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"11.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"1"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[17]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"0.9-1.8"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"0.9-1.8"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"8.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"30"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[18]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"1.8-2.7"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"1.4-1.8"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"8.5"+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"3-10"+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        String nodatafound="&#8226;";

        text1.setText(tobeused[1]);
        text2.setText(Html.fromHtml(nodatafound)+" "+tobeused[2]);
        webViewSKA.loadDataWithBaseURL("file:///android_asset/", text, "text/html", "utf-8", null);
        text3.setText(Html.fromHtml(nodatafound)+" "+tobeused[3]);
        text4.setText(Html.fromHtml(nodatafound)+" "+tobeused[4]);
        text5.setText(Html.fromHtml(nodatafound)+" "+tobeused[5]);
        text6.setText(Html.fromHtml(nodatafound)+" "+tobeused[6]);
        text7.setText(Html.fromHtml(nodatafound)+" "+tobeused[7]);
        text8.setText(Html.fromHtml(nodatafound)+" "+tobeused[8]);
        text9.setText(tobeused[9]);

        text1.setTextColor(Color.parseColor("#ffffff"));
        text2.setTextColor(Color.parseColor("#000000"));
        text3.setTextColor(Color.parseColor("#000000"));
        text4.setTextColor(Color.parseColor("#000000"));
        text5.setTextColor(Color.parseColor("#000000"));
        text6.setTextColor(Color.parseColor("#000000"));
        text7.setTextColor(Color.parseColor("#000000"));
        text8.setTextColor(Color.parseColor("#000000"));
        text9.setTextColor(Color.parseColor("#000000"));

        Justification.justify(text1);
        Justification.justify(text2);
        Justification.justify(text3);
        Justification.justify(text4);
        Justification.justify(text5);
        Justification.justify(text6);
        Justification.justify(text7);
        Justification.justify(text8);
        Justification.justify(text9);

        text1.setTextSize(20);
        text2.setTextSize(18);
        text3.setTextSize(20);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);
        text7.setTextSize(18);
        text8.setTextSize(20);
        text9.setTextSize(18);

        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}

