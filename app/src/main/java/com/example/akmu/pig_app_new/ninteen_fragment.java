package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

public class ninteen_fragment extends Fragment {


    public  String [] tobeused ={
            "शूकर पालन एप्प",
            "विशेष आभार",
            "वैज्ञानिक एवं तकनीकी योगदान के लिए विशेष आभार",
            "डा. राजकुमार सिंह, निदेशक एवं कुलपति",
            "डा. बी. पी. मिश्रा, संयुक्त निदेशक (शोध)",
            "डा ज्ञानेन्द्र कुमार गौड़, प्रभारी, पशुधन उत्पादन एवं प्रबन्ध अनुभाग",
            "डा एस. नस्कर, प्रधान वैज्ञानिक, पशुधन उत्पादन एवं प्रबन्ध, पूर्वी रीजनल स्टेशन, भाकृअनुप-भारतीय पशु चिकित्सा अनुसंधान संस्थान, कोलकाता (पश्चिम बंगाल)",
            "डा निहार रंजन साहू, वैज्ञानिक, पशु अनुवांशिकी अनुभाग",
            "डा डी. वर्धन, वरिष्ठ वैज्ञानिक, पशुधन अर्थशास्त्र एवं सांख्यिकी विभाग",
            "डा हीराराम,  वैज्ञानिक, पारजैविकी विभाग",
            "डा मोहन, एन. एच. प्रधान वैज्ञानिक, राष्ट्रीय शूकर अनुसंधान केन्द्र, गुवाहाटी, असम",
            "",
            "श्री अरविन्द कुमार शर्मा, आई.टी. प्रोफेशनल",
            "श्री अवनक्ष सिंह सम्याल, आई.टी. प्रोफेशनल "
    };

    private WebView webViewvah;
    String text;
    private Button tvHeading;


    public ninteen_fragment() {

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ninteen_layout, container, false);
        getActivity().setTitle(tobeused[0]);

        tvHeading=(Button)view.findViewById(R.id.textViewktgbdhnhdng1);
        tvHeading.setText(tobeused[1]);

        webViewvah=(WebView)view.findViewById(R.id.webViewVah);
    // bgcolor="#90caf9"
        text = "<html><body>";
        text+= "<table border=\"0px solid black\">";

        text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>";
        text+="<font color=\"black\">"+tobeused[2]+"</font>";
        text+="</h4></td></tr>";
        text+= "<tr height =10>";
        text+= "<td align=\"justify\" valign=\"middle\">";
        text+= "<ul>";
        text+="<li><h4>"+tobeused[3]+"</h4></li>";
        text+="<li><h4>"+tobeused[4]+"</h4></li>";
        text+="<li><h4>"+tobeused[5]+"</h4></li>";
        text+="<li><h4>"+tobeused[6]+"</h4></li>";
        text+="<li><h4>"+tobeused[7]+"</h4></li>";
        text+="<li><h4>"+tobeused[8]+"</h4></li>";
        text+="<li><h4>"+tobeused[9]+"</h4></li>";
        text+="<li><h4>"+tobeused[10]+"</h4></li>";
      //  text+="<li><h4>"+tobeused[11]+"</h4></li>";
        text+="<li><h4>"+tobeused[12]+"</h4></li>";
        text+="<li><h4>"+tobeused[13]+"</h4></li>";
        text+= "</ul>";
        text+= "</td>";
        text+= "</tr>";
        text+= "</table>";
        text+= "</body></html>";

        webViewvah.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);


        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }







}
