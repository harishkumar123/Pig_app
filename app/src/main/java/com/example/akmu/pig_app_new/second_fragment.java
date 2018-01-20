package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by akmu on 12/13/2017.
 */

public class second_fragment extends Fragment {

    public second_fragment() {
    }


 public String [] hindi={
         "शूकर पालन एप्प",
         "शूकर पालन का महत्व",
         "1. आरम्भिक लागत अत्यन्त कम होने की वजह से बेरोजगारी एवं गरीबी-उन्मूलन के लिए यह एक उत्तम व्यवसाय है।",
         "2. शूकर घरों, होटलों, बेकरी, मेस इत्यादि के बचे खाद्य-पदार्थों, निम्न श्रेणी के अनाज, सब्जीमंडी के बचे साग-सब्जी को खाकर कम समय में तीव्र वृद्धि-दर दर्शाते हैं।",
         "3. शूकरी प्रजनन कराने पर 90% तक गर्भ धारण कर लेती है। शूकरी एक वर्ष में 2 बार बच्चे देती है एवं एक बार में 8-10 बच्चों को जन्म देती है, जिनकी मृत्यु दर भी कम होती है।",
         "4. शूकर मात्र 8 महीने में लगभग 100 किलोग्राम तक पहुँच जाता है तथा बच्चा पैदा करने योग्य हो जाता है।",
         "5. शूकर में गर्भकाल कम (112-115 दिन) होने के कारण वंश वृद्धि शीघ्र होती है।",
         "6. शूकर मानव अनुपयोगी खाद्य-पदार्थों को भोजन के रूप में ग्रहण कर उन्हें तीव्र गति से माँस में परिवर्तित करने की क्षमता रखता है।"
 };




    public String [] to_be_used;

    Button text;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container, false);

        to_be_used=hindi.clone();


        getActivity().setTitle(to_be_used[0]);


        text=(Button)view.findViewById(R.id.text1);
        text1=(TextView)view.findViewById(R.id.text2);
        text2=(TextView)view.findViewById(R.id.text3);
        text3=(TextView)view.findViewById(R.id.text4);
        text4=(TextView)view.findViewById(R.id.text5);
        text5=(TextView)view.findViewById(R.id.text6);
        text6=(TextView)view.findViewById(R.id.text7);


        text.setText(to_be_used[1]);
        text1.setText(to_be_used[2]);
        text2.setText(to_be_used[3]);
        text3.setText(to_be_used[4]);
        text4.setText(to_be_used[5]);
        text5.setText(to_be_used[6]);
        text6.setText(to_be_used[7]);

        text.setTextColor(Color.parseColor("#ffffff"));
        text1.setTextColor(Color.parseColor("#000000"));
        text2.setTextColor(Color.parseColor("#000000"));
        text3.setTextColor(Color.parseColor("#000000"));
        text4.setTextColor(Color.parseColor("#000000"));
        text5.setTextColor(Color.parseColor("#000000"));
        text6.setTextColor(Color.parseColor("#000000"));

        text.setTextSize(20);
        text1.setTextSize(18);
        text2.setTextSize(18);
        text3.setTextSize(18);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);

       // Justification.justify(text);


       // Typeface mtypeFace = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");


       //  text1.setTypeface(mtypeFace);
       //  text2.setTypeface(mtypeFace);
       //  text3.setTypeface(mtypeFace);
       //  text4.setTypeface(mtypeFace);
       //  text5.setTypeface(mtypeFace);
       //  text6.setTypeface(mtypeFace);

       Justification.justify(text1);
        Justification.justify(text2);
        Justification.justify(text3);
        Justification.justify(text4);
        Justification.justify(text5);
        Justification.justify(text6);




        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
