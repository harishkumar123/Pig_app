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
 * Created by akmu on 12/15/2017.
 */

public class seven_fragment extends Fragment {

    public seven_fragment(){
    }


    public String [] hindi={
            " शूकर पालन एप्प",
            " शूकरों का रख-रखाव" ,
            "(i) प्रसव के समय " ,
            " प्रसव की संभावित तिथि से लगभग 15 दिन पहले शूकरी को ब्याने वाले बाड़े में ले आना चाहिए। संक्रमण रोकने के लिए बाड़े को अच्छी तरह से साफ तथा फिनाइल द्वारा विसंक्रमित करना चाहिए। जब बाड़े बिल्कुल सूखे हों, तब उनमें पुआल, जई या गेंहूँ की भूसी का बिछावन डालना चाहिए। " ,
            " ब्याने वाले बाड़े  के अंदर चारों ओर से एक बचाव रेलिंग लगाकर शावकों को अपनी माँ के नीचे दबने से रोका जा सकता है। रेलिंग फर्श से 12 इंच की ऊँचाई पर तथा दीवारों से 10-12 इंच की दूरी पर होना चाहिए।" ,
            " मादा ब्याने से पहले प्रायः बेचैनी महसूस करने लगती है, बिछावन को समेट कर घोंसले नुमा रचना का निर्माण करने लगती है। बेचैनी के कारण वह बाड़े में लगे गेट व हैडिंल्स को काटने का प्रयास करने लगती है। मादा के थन में सूजन आने लगती है तथा थन से दूध टपकने लगता है। मादा पूँछ मोड़ना प्रारम्भ करने लगती है। मादा का बार-बार पानी पीना, गोबर और मूत्र त्याग करना ब्याने के प्रमुख लक्षण हैं। ब्याने का पूर्ण समय 2 से 4 घंटे माना गया है। " ,
            " ब्याने के बाद कुछ बिछावन बदल देना चाहिए और ऐसा करते समय केवल गन्दा भूसा हटाना चाहिए। मुख्य बिछावन कुछ दिनों तक वैसा ही पड़े रहने देना चाहिए। ब्याने के बाद शूकरी के पिछले भाग एवं थनों को आवश्यकतानुसार गरम पानी तथा कीटाणुनाशक से अच्छी तरह रगड़कर धो देना चाहिए।  ",
            "(ii) शावकों की देखभाल " ,
            " पैदा होने के तुरन्त बाद शूकर शावकों पर लगी झिल्ली को तुरन्त हटा देना चाहिए तथा उनके नाक, कान, मुँह अथवा आँख पर लगा म्यूकस साफ कर देना चाहिए। नाल को शरीर से एक इंच की दूरी पर डेटॉल या सेवनॉल  के घोल में डूबे ब्लेड अथवा कैंची से काटकर उस स्थान पर अच्छा होने तक टिंचर आयोडीन घोल लगाना चाहिए। कृत्रिम ऊष्मा शिशु शूकरों को सर्दी से बचाने में मदद करती है ।  " ,
            " शूकर शावकों के जन्म के समय प्रत्येक जबड़े में नुकीले चार-चार सूचिका दन्त होते हैं। सावधानी के साथ दाँत काट कर एंटीसेप्टिक/रोगाणुरोधक दवा का प्रयोग करें। यदि इन दन्तों को नहीं काटा जाता है तो मादा शूकरी के थनों में घाव होने के कारण थनैला रोग होने का खतरा बढ़ जाता है। इसके साथ-साथ मादा उत्तेजित होकर बच्चों को हानि पहुँचा सकती है। " ,
            " शावकों को माँ के थन के पास ले जाना चाहिए जिससे वे दूध पीना प्रारम्भ कर सकें तथा माँ उन्हें पहचान सके। " ,
            " माँ का पहला दूध (खीस) जितनी जल्दी हो सके, बच्चों को पिला देना चाहिए। इस दूध में रोगप्रतिरोधी क्षमता होती है। बच्चों को प्रतिदिन प्रथम सप्ताह में 6-7 बार, द्वितीय सप्ताह में 5-6 बार एवं तृतीय सप्ताह में 4-5 बार दूध पिलाना चाहिए।  " ,
            " शावकों की संख्या अधिक होने की स्थिति में शूकरी को पर्याप्त मात्रा में संतुलित आहार देना चाहिए अन्यथा शावकों के वजन में वृद्धि पर विपरीत असर पड़ने लगता है। यदि बच्चों की संख्या शूकरी के थनों की संख्या से ज्यादा हो या जिस मादा के पास दूध नहीं होता उनके बच्चों को दूसरी शूकरी का खीस व दूध पिलाना चाहिए। इसके लिए दूसरी माँ की जेर अथवा योनि स्राव इन बच्चों के ऊपर लगा देना चाहिए। शूकरी का दूध न मिलने पर बच्चों को बकरी या गाय का दूध भी पिलाया जा सकता है। " ,
            " रक्त-अल्पता (एनीमिया) को रोकने के लिए 3 दिन की आयु पर लौह तत्व की पूर्ति के लिए दवाएँ देनी चाहिए। पैदा होने के बाद शावकों को एक सप्ताह तक 10-15 ग्राम ग्लूकोज प्रतिदिन 2-3 खुराक में बाँट कर देने से उनकी मृत्युदर कम हो जाती है। शरीर भार में जल्दी वृद्धि के लिए 2-3 सप्ताह की आयु में,शावकों को प्रशिक्षित व्यक्ति या पशु-चिकित्सक से बधियाकरण कराना चाहिए। " ,
            "(iii) वीनिंग " ,
            " शावकों को 6-8 सप्ताह की आयु पर उनकी माँ से अलग कर (वीनिंग) देना चाहिए। वीनिंग के समय शावकों का वजन लगभग 5-11 किग्रा होता है। "


    };

    public String [] to_be_used;


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





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.seven_fragment_layout, container, false);

        to_be_used=hindi.clone();


        getActivity().setTitle(to_be_used[0]);

        text1=(Button)view.findViewById(R.id.text1);
        text2=(TextView)view.findViewById(R.id.text2);
        text3=(TextView)view.findViewById(R.id.text3);
        text4=(TextView)view.findViewById(R.id.text4);
        text5=(TextView)view.findViewById(R.id.text5);
        text6=(TextView)view.findViewById(R.id.text6);
        text7=(TextView)view.findViewById(R.id.text7);
        text8=(TextView)view.findViewById(R.id.text8);
        text9=(TextView)view.findViewById(R.id.text9);
        text10=(TextView)view.findViewById(R.id.text10);
        text11=(TextView)view.findViewById(R.id.text11);
        text12=(TextView)view.findViewById(R.id.text12);
        text13=(TextView)view.findViewById(R.id.text13);
        text14=(TextView)view.findViewById(R.id.text14);
        text15=(TextView)view.findViewById(R.id.text15);


        String nodatafound="&#8226;";


        text1.setText(to_be_used[1]);
        text2.setText(to_be_used[2]);
        text3.setText(Html.fromHtml(nodatafound)+" "+to_be_used[3]);
        text4.setText(Html.fromHtml(nodatafound)+" "+to_be_used[4]);
        text5.setText(Html.fromHtml(nodatafound)+" "+to_be_used[5]);
        text6.setText(Html.fromHtml(nodatafound)+" "+to_be_used[6]);
        text7.setText(to_be_used[7]);
        text8.setText(Html.fromHtml(nodatafound)+" "+to_be_used[8]);
        text9.setText(Html.fromHtml(nodatafound)+" "+to_be_used[9]);
        text10.setText(Html.fromHtml(nodatafound)+" "+to_be_used[10]);
        text11.setText(Html.fromHtml(nodatafound)+" "+to_be_used[11]);
        text12.setText(Html.fromHtml(nodatafound)+" "+to_be_used[12]);
        text13.setText(Html.fromHtml(nodatafound)+" "+to_be_used[13]);
        text14.setText(to_be_used[14]);
        text15.setText(Html.fromHtml(nodatafound)+" "+to_be_used[15]);




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



        text1.setTextSize(20);
        text2.setTextSize(20);
        text3.setTextSize(18);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);
        text7.setTextSize(20);
        text8.setTextSize(18);
        text9.setTextSize(18);
        text10.setTextSize(18);
        text11.setTextSize(18);
        text12.setTextSize(18);
        text13.setTextSize(18);
        text14.setTextSize(20);
        text15.setTextSize(18);

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



        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
