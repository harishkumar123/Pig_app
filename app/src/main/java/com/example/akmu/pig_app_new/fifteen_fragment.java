package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by akmu on 12/20/2017.
 */

public class fifteen_fragment extends Fragment {

    public fifteen_fragment() {
    }

    public String [] tobeused={
            "शूकर पालन एप्प",
            "मुख्यालय",
            "परिसर",
            "क्षेत्रीय कार्यालय",

            "निदेशक एवं कुलपति ",//4
            "भाकृअनुप-भारतीय पशु चिकित्सा अनुसंधान संस्थान",
            "इज्जतनगर-243122 (उ0प्र0) भारत ",
            "दूरभाष: 0581-2300096 (कार्या.)",
            "फैक्स: 0581-2303284",
            "ईमेल: directorivri@gmail.com, dirivri@ivri.res.in, director.ivri@icar.gov.in",

            "संयुक्त निदेशक ",
            "भाकृअनुप-भारतीय पशु चिकित्सा अनुसंधान संस्थान",
            "हेब्बल, बैंगलुरू-560024 (कर्नाटक), भारत",
            "",
            "दूरभाष: 080-23411218 (कार्या.)",
            "फैक्स: 080-23412509",
            "ईमेल:jd.ivribengaluru@icar.gov.in",

            "केन्द्र प्रभारी",
            "भाकृअनुप-भारतीय पशु चिकित्सा अनुसंधान संस्थान",
            "मुक्तेष्वर - 263138, जिला - नैनीताल (उत्तराखंड)",
            "दूरभाष: 05942-286346 (कार्या.)",
            "फैक्स: 05942-286347",
            "ईमेल: sic_ivri@hotmail.com",

            "केन्द्र प्रभारी",
            "भारतीय पशु चिकित्सा अनुसंधान संस्थान, पूर्वी क्षेत्रीय स्टेशन",
            "37, बेलगाछिया रोड, कोलकाता -700037 (पश्चिम बंगाल)",
            "दूरभाष: 033-25286358, 25560120 (कार्या.)",
            "फैक्स: 033-25565725",
            "ईमेल: subuicar@rediffmail.com",

            "केन्द्र प्रभारी",
            "भारतीय पशु चिकित्सा अनुसंधान संस्थान, क्षेत्रीय स्टेशन",
            "कांगड़ा, पालमपुर-176061 (हिमाचल प्रदेश)",
            "दूरभाष: 0184-230526 (कार्या.)",
            "ईमेल: sicandps1961@gmail.com",

            "केन्द्र प्रभारी",
            "भारतीय पशु चिकित्सा अनुसंधान संस्थान, क्षेत्रीय स्टेशन ",
            "कृषि कालेज परिसर, शिवाजीनगर",
            "पुणे-411005 (महाराष्ट्र)",
            "दूरभाष: 020-25537401",
            "ईमेल: kiranvph@rediffmail.com"

            ,"पता",
            "पता"

    };


    WebView webViewaddr;
    String text;

    Button tvHeading1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fifteen_fragment_layout, container, false);




        getActivity().setTitle(tobeused[0]);





                tvHeading1=(Button)view.findViewById(R.id.TextWAWHdng);
                tvHeading1.setText(tobeused[40]);

                webViewaddr=(WebView)view.findViewById(R.id.webViewaddressivri);
                // bgcolor="#90caf9"
                text = "<html><body>";
                text+= "<table border=\"1px solid black\">";

                text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+tobeused[1]+"</h4></td></tr>";
                // text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+"HEADQUARTER"+"</h4></td></tr>";
                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[4] +", <br/>";
                text+=tobeused[5]+", <br/> ";
                text+=tobeused[6]+", <br/>";
                text+=tobeused[7]+", <br/>";
                text+=tobeused[8]+", <br/>";
                text+=tobeused[9]+"  <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+tobeused[2]+"</h4></td></tr>";
                // text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+"CAMPUS"+"</h4></td></tr>";
                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[10] +", <br/>";
                text+=tobeused[11]+", <br/> ";
                text+=tobeused[12]+", <br/>";
                text+=tobeused[13]+", <br/>";
                text+=tobeused[14]+", <br/>";
                text+=tobeused[15]+",  <br/>";
                text+=tobeused[16]+"  <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[17] +", <br/>";
                text+=tobeused[18]+", <br/> ";
                text+=tobeused[19]+", <br/>";
                text+=tobeused[20]+", <br/>";
                text+=tobeused[21]+", <br/>";
                text+=tobeused[22]+"  <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+tobeused[3]+"</h4></td></tr>";
                // text+= "<tr height =10><td colspan=\"3\" align=\"center\" valign=\"middle\"><h4>"+"REGIONAL STATION"+"</h4></td></tr>";
                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[23] +", <br/>";
                text+=tobeused[24]+", <br/> ";
                text+=tobeused[25]+", <br/>";
                text+=tobeused[26]+", <br/>";
                text+=tobeused[27]+", <br/>";
                text+=tobeused[28]+"  <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[29] +", <br/>";
                text+=tobeused[30]+", <br/> ";
                text+=tobeused[31]+", <br/>";
                text+=tobeused[32]+", <br/>";
                text+=tobeused[33]+" <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "<tr height =10>";
                text+= "<td colspan=\"3\" align=\"left\" valign=\"middle\">";
                text+=tobeused[34] +", <br/>";
                text+=tobeused[35]+", <br/> ";
                text+=tobeused[36]+", <br/>";
                text+=tobeused[37]+", <br/>";
                text+=tobeused[38]+", <br/>";
                text+=tobeused[39]+"  <br/>";
                text+= "</td>";
                text+= "</tr>";

                text+= "</table>";
                text+= "</body></html>";
                webViewaddr.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);









        return view;
    }
        @Override
        public void onConfigurationChanged(Configuration newConfig) {
                super.onConfigurationChanged(newConfig);
        }

 /*   @Override
    public void onDestroyView(){
        super.onDestroyView();
        Toast.makeText(getActivity(),"destroy fifteen fragment",Toast.LENGTH_LONG).show();
    }
    */

}


