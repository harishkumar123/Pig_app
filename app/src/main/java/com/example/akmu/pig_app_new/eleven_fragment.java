package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by akmu on 12/16/2017.
 */

public class eleven_fragment extends Fragment {

    public eleven_fragment() {
    }



    public String[] hindi = {
            "शूकर पालन एप्प",
            "शूकरों की बिक्री " ,

            " यदि पशु सीमित संख्या मे हों, तो उन्हें स्थानीय बाजार में उचित मूल्य पर धीरे-धीरे बेचना चाहिए। यदि संख्या ज्यादा हो, तो उन्हें पशुवधशाला को बेचना चाहिए।  " ,
            " निर्यात-योग्य उच्च कोटि के शूकर माँस का उत्पादन करने के लिए निम्न बातों पर ध्यान देना आवश्यक है: " ,
            "1. रोग-रहित शूकर उत्पादन  " ,
            "2. स्वच्छ एवं उच्च कोटि का माँस उत्पादन हेतु उन्नत पशुवधशाला, बेकन फैक्ट्री तथा भंडारण की व्यवस्था " ,
            "3. शूकर पालकों के लिए धन एवं विपणन सम्बन्धी सहायता एवं व्यवस्था " ,

            "शूकरों के विपणन हेतु उचित परिवहन " ,

            "सरकारी एवं प्राइवेट वधशालायें  " ,

            "1. मीट प्रोडक्ट आफ इंडिया बेकन फैक्ट्री, कुटटूकुल्लम, केरल " ,
            "2. वेस्ट बंगाल लाइव स्टाक डेवलपमेंट कार्पोरेशन बेकन फैक्ट्री, हारिंगघटटा, वेस्ट बंगाल " ,
            "3. मुम्बई मुनिसिपल कार्पोरेशन अवाटायर, डिओनर, मुम्बई, महाराष्ट्र " ,
            "4. भाकृअनुप-नेशनल रिसर्च सैन्टर आन पिग, रानी, गोवाहटी, आसाम " ,
            "5. आरोहन पोर्क प्रोसेसिंग यूनिट, सानपुर, गोवाहटी, आसाम " ,
            "6. पोर्कजा पोर्क प्रोसेसिंग यूनिट, विजयवाड़ा, आन्ध्रप्रदेश " ,
            "7. बेकन फैक्ट्री, सेन्ट्रल डेयरी फार्म, अलीगढ़, उत्तर प्रदेश " ,
            "8. गवर्नमेंट बेकन फैक्ट्री, गानावरम कृष्णा-521101, आन्ध्रप्रदेश " ,
            "9. गवर्नमेंट बेकन फैक्ट्री, कनकी, राँची -834005, झारखण्ड " ,
            "10. एम.ए.एफ.सी.ओ. बेकन फैक्ट्री, नेशलन पार्क, बोरीवलि, मुम्बई-40002, महाराष्ट्र " ,
            "11. मीट कम्पलेक्स, अलवर-301001 राजस्थान " ,
            "12. पोर्क प्रोसेसिंग प्लांट, खरार-140301 पंजाब"


    };

    public String[] to_be_used;


    Button text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;
    TextView text9;
    TextView text10;
    TextView text11;
    TextView text12;
    TextView text13;
    TextView text14;
    TextView text15;
    TextView text16;
    TextView text17;
    TextView text18;
    TextView text19;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.eleven_fragment_layout, container, false);

        to_be_used = hindi.clone();


        getActivity().setTitle(to_be_used[0]);

        text1 = (Button) view.findViewById(R.id.text1);
        text2 = (TextView) view.findViewById(R.id.text2);
        text3 = (TextView) view.findViewById(R.id.text3);
        text4 = (TextView) view.findViewById(R.id.text4);
        text5 = (TextView) view.findViewById(R.id.text5);
        text6 = (TextView) view.findViewById(R.id.text6);
        text7 = (TextView) view.findViewById(R.id.text7);
        text8 = (TextView) view.findViewById(R.id.text8);
        text9 = (TextView) view.findViewById(R.id.text9);
        text10 = (TextView) view.findViewById(R.id.text10);
        text11 = (TextView) view.findViewById(R.id.text11);
        text12 = (TextView) view.findViewById(R.id.text12);
        text13 = (TextView) view.findViewById(R.id.text13);
        text14 = (TextView) view.findViewById(R.id.text14);
        text15 = (TextView) view.findViewById(R.id.text15);
        text16 = (TextView) view.findViewById(R.id.text16);
        text17 = (TextView) view.findViewById(R.id.text17);
        text18 = (TextView) view.findViewById(R.id.text18);
        text19 = (TextView) view.findViewById(R.id.text19);

        String nodatafound = "&#8226;";


        text1.setText(to_be_used[1]);
        text2.setText(Html.fromHtml(nodatafound) + " " +to_be_used[2]);
        text3.setText(Html.fromHtml(nodatafound) + " " + to_be_used[3]);
        text4.setText(to_be_used[4]);
        text5.setText(to_be_used[5]);
        text6.setText(to_be_used[6]);
        text7.setText(Html.fromHtml(nodatafound) + " " + to_be_used[7]);
        text8.setText(to_be_used[8]);
        text9.setText(to_be_used[9]);
        text10.setText(to_be_used[10]);
        text11.setText(to_be_used[11]);
        text12.setText(to_be_used[12]);
        text13.setText(to_be_used[13]);
        text14.setText(to_be_used[14]);
        text15.setText(to_be_used[15]);
        text16.setText(to_be_used[16]);
        text17.setText(to_be_used[17]);
        text18.setText(to_be_used[18]);
        text19.setText(to_be_used[19]);


        text1.setTextColor(Color.parseColor("#ffffff"));
        text2.setTextColor(Color.parseColor("#FF2D2B2C"));
        text3.setTextColor(Color.parseColor("#FF2D2B2C"));
        text4.setTextColor(Color.parseColor("#FF2D2B2C"));
        text5.setTextColor(Color.parseColor("#FF2D2B2C"));
        text6.setTextColor(Color.parseColor("#FF2D2B2C"));
        text7.setTextColor(Color.parseColor("#FF2D2B2C"));
        text8.setTextColor(Color.parseColor("#FF2D2B2C"));
        text9.setTextColor(Color.parseColor("#FF2D2B2C"));
        text10.setTextColor(Color.parseColor("#FF2D2B2C"));
        text11.setTextColor(Color.parseColor("#FF2D2B2C"));
        text12.setTextColor(Color.parseColor("#FF2D2B2C"));
        text13.setTextColor(Color.parseColor("#FF2D2B2C"));
        text14.setTextColor(Color.parseColor("#FF2D2B2C"));
        text15.setTextColor(Color.parseColor("#FF2D2B2C"));
        text16.setTextColor(Color.parseColor("#FF2D2B2C"));
        text17.setTextColor(Color.parseColor("#FF2D2B2C"));
        text18.setTextColor(Color.parseColor("#FF2D2B2C"));
        text19.setTextColor(Color.parseColor("#FF2D2B2C"));


        text1.setTextSize(20);
        text2.setTextSize(18);
        text3.setTextSize(18);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);
        text7.setTextSize(18);
        text8.setTextSize(20);
        text9.setTextSize(18);
        text10.setTextSize(18);
        text11.setTextSize(18);
        text12.setTextSize(18);
        text13.setTextSize(18);
        text14.setTextSize(18);
        text15.setTextSize(18);
        text16.setTextSize(18);
        text17.setTextSize(18);
        text18.setTextSize(18);
        text19.setTextSize(18);

        Justification.justify(text1);
        Justification.justify(text2);
        Justification.justify(text3);
        Justification.justify(text4);
        Justification.justify(text5);
        Justification.justify(text6);
        Justification.justify(text7);
        Justification.justify(text8);
        Justification.justify(text9);
        Justification.justify(text10);

        Justification.justify(text11);
        Justification.justify(text12);
        Justification.justify(text13);
        Justification.justify(text14);
        Justification.justify(text15);
        Justification.justify(text16);
        Justification.justify(text17);
        Justification.justify(text18);
        Justification.justify(text19);




        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}