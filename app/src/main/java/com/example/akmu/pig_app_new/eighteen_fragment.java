package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;


public class eighteen_fragment extends Fragment {


    private WebView webViewteamname,webViewteamname1;
    String text, text1;


    public String [] tobeused={
            "शूकर पालन एप्प",
            "भाकृअनुप-भारतीय पशु-चिकित्सा अनुसंधान संस्थान, इज्जतनगर (उ.प्र.) भारत",//1
            "डा रूपसी तिवारी, प्रधान वैज्ञानिक एवं प्रभारी एटिक ",
            "डा त्रिवेणी दत्त, संयुक्त निदेशक, (शैक्षणिक) एवं डीन",
            "डा बी. एच. एम. पटेल, प्रधान वैज्ञानिक, आई.वी.आर.आई. कैम्पस, बैंगलुरू",
            "डा बीना मिश्रा, प्रधान वैज्ञानिक, जैविक उत्पाद विभाग ",
            "डा पुतान सिंह, प्रधान वैज्ञानिक, पशु पोषण विभाग",
            "डा संजय कुमार, विभागाध्यक्ष, पशुधन अर्थशास्त्र एवं सांख्यिकि विभाग",
            "डा जे. के. प्रसाद, प्रधान वैज्ञानिक पशु पुर्नुत्पादन विभाग",
            "डा के. महेन्द्रन, वैज्ञानिक, पशु औषधि विभाग",
            "डा महेश चन्दर, विभागाध्यक्ष, प्रसार शिक्षा विभाग",
            "डा बब्लू कुमार,वरिष्ट वैज्ञानिक, जैविक उत्पाद विभाग",
            "डा अमरपाल, विभागाध्यक्ष, सर्जरी विभाग ",
            "भाकृअनुप- भारतीय कृषि सांख्यिकी अनुसंधान संस्थान, नई दिल्ली ",
            "डा सुदीप मारवाह, प्रधान वैज्ञानिक",
            "डा मुकेश कुमार, वरिष्ठ वैज्ञानिक",
            "डा सौमेन पाल, वैज्ञानिक",
            "प्रोजेक्ट टीम"
    };

    Button tvHeading1;


    public eighteen_fragment() {

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_eighteen_layout, container, false);
        webViewteamname=(WebView)view.findViewById(R.id.webViewteamname);

        webViewteamname1=(WebView)view.findViewById(R.id.webViewteamname1);

        tvHeading1=(Button)view.findViewById(R.id.TextWAWHdng);

        getActivity().setTitle(tobeused[0]);
        tvHeading1.setText(tobeused[17]);

     //bgcolor="#90caf9"
        text = "<html><body >";
        text+= "<table border=\"0px solid black\">";

        text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused[1]+"</font></h4></td></tr>";
        text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+"ICAR-IVRI, Izatnagar (UP), India"+"</font></h4></td></tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[2]+"</h4></li>";
        text+="<li><h4>"+tobeused[3]+"</h4></li>";
        text+="<li><h4>"+tobeused[4]+"</h4></li>";
        text+="<li><h4>"+tobeused[5]+"</h4></li>";
        text+="<li><h4>"+tobeused[6]+"</h4></li>";
        text+="<li><h4>"+tobeused[7]+"</h4></li>";
        text+="<li><h4>"+tobeused[8]+"</h4></li>";
        text+="<li><h4>"+tobeused[9]+"</h4></li>";
        text+="<li><h4>"+tobeused[10]+"</h4></li>";
        text+="<li><h4>"+tobeused[11]+"</h4></li>";
        text+="<li><h4>"+tobeused[12]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+tobeused[13]+"</font></h4></td></tr>";
        text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+"ICAR-IASRI, New Delhi"+"</font></h4></td></tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[14]+"</h4></li>";
        text+="<li><h4>"+tobeused[15]+"</h4></li>";
        text+="<li><h4>"+tobeused[16]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webViewteamname.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);

        tvHeading1.requestFocus();
        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }









}
