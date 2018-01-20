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
 * Created by akmu on 12/15/2017.
 */

public class nine_fragment extends Fragment {


    public nine_fragment() {
    }

   /* public String[] hindi = {
            " शूकर पालन एप्प",
            "शूकर फार्म पर दैनिक कार्यक्रम  " ,
            "फार्म की सफाई एवं स्वस्थ शूकर " ,
            "1. श्रमिकों की उपस्थिति का पता लगाना एवं उनके कार्यों का वितरण करना। " ,
                    "2. प्रत्येक बाड़े मेंसुबह एवं शाम सघन निरीक्षण  करना और बीमार शूूकरों की पहचान करके उनको स्वस्थ शूकरों से अलग करना। " ,
                    "3. शूकर बाड़ों में पानी का उचित प्रबंध करना एवं शूकरों को नहलाना। " ,
                    "4. फार्म की सफाई का कार्य तेज धार वाले पाइप से एवं बाड़ों में फिनाइल का छिड़काव करना। " ,
                    "5. दाना एवं चारे की व्यवस्था करना। दाने की आधी-आधी मात्रा सुबह एवं शाम देनी चाहिए। " ,
                    "6. बीमार शूकरों की चिकित्सा सम्बन्धी व्यवस्था करना तथा समयानुसार फुटबाथ का उपयोग करना। " ,
                    "7. अभिलेखानुसार समय पर स्वाइन फीवर एवं खुरपका-मुँहपका के टीकों की व्यवस्था करना।  " ,
                    "8. नवजात बच्चों पर पूर्व वर्णित पहचान संख्या देना। " ,
                    "9. अभिलेखों को प्रतिदिन पूरा करना। " ,
                    "10. पूर्वान्ह में बचे हुए कार्यों को अपरान्ह में पूरे करना।"


    };
    */
   public String[] hindi = {
           " शूकर पालन एप्प",
           "शूकर फार्म पर दैनिक कार्यक्रम  " ,
           "फार्म की सफाई एवं स्वस्थ शूकर " ,
           "1. श्रमिकों की उपस्थिति का पता लगाना एवं उनके कार्यों का वितरण करना । " ,
           "2. प्रत्येक बाड़े में सुबह एवं शाम सघन निरीक्षण करना और बीमार  शूकरों  की पहचान करके उनको स्वस्थ शूकरों से अलग करना । " ,
           "3. शूकर बाड़ों में पानी का उचित प्रबंध करना एवं शूकरों को नहलाना । " ,
           "4. फार्म की सफाई का कार्य तेज धार वाले पाइप से एवं बाड़ों में फिनाइल का छिड़काव करना । " ,
           "5. दाना एवं चारे की व्यवस्था करना । दाने की आधी-आधी मात्रा सुबह एवं शाम देनी चाहिए । " ,
           "6. बीमार शूकरों की चिकित्सा सम्बन्धी व्यवस्था करना तथा समयानुसार फुटबाथ का उपयोग करना । " ,
           "7. अभिलेखानुसार समय पर स्वाइन फीवर एवं खुरपका-मुँहपका के टीकों की व्यवस्था करना ।  " ,
           "8. नवजात बच्चों पर पूर्व वर्णित पहचान संख्या देना । " ,
           "9. अभिलेखों को प्रतिदिन पूरा करना । " ,
           "10. पूर्वान्ह में बचे हुए कार्यों को अपरान्ह में पूरे करना ।"


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



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.nine_fragment_layout, container, false);

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



        String nodatafound = "&#8226;";


        text1.setText(to_be_used[1]);
        text2.setText(to_be_used[2]);
        text3.setText(to_be_used[3]);
        text4.setText(to_be_used[4]);
        text5.setText(to_be_used[5]);
        text6.setText(to_be_used[6]);
        text7.setText(to_be_used[7]);
        text8.setText(to_be_used[8]);
        text9.setText(to_be_used[9]);
        text10.setText(to_be_used[10]);
        text11.setText(to_be_used[11]);
        text12.setText(to_be_used[12]);


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


        text1.setTextSize(20);
        text2.setTextSize(20);
        text3.setTextSize(18);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);
        text7.setTextSize(18);
        text8.setTextSize(18);
        text9.setTextSize(18);
        text10.setTextSize(18);
        text11.setTextSize(18);
        text12.setTextSize(18);

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





        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}