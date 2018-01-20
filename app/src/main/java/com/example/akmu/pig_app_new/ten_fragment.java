package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by akmu on 12/16/2017.
 */

/*public class ten_fragment extends Fragment {


    public ten_fragment() {
    }
    */

  /*  public String[] hindi = {
            "शूकर पालन एप्प",
            "फार्म में होने वाली समस्यायें, कारण एवं सुझाव " ,
           // " समस्यायें\tकारण\tसुझाव\n" +
                    "1. लंगड़ा (बिना सूजन)",
            " कारण : शावकों पर मादा द्वारा पैर रखने से, फर्श गीला होने के कारण शूकरांे के फिसलने से तथा खुर पकने से ",
            " सुझाव : दर्द कम करने वाली दवा का प्रयोग, गिरने से रोकने के लिए सही बिछावन को प्रयोग, सूखा फर्श रखना" ,
                    "2. लंगड़ा (सूजन के साथ) ",
            "कारण : गीला फर्श होने के कारण शूकरों के  फिसल जाने से ",
            "सुझाव :फर्श पर बिछावन बिछाना, फर्श को सूखा रखना तथा दर्द निवारक दवा देना" ,
                    "3. शावकों का पेट फूलना ",
            "कारण : गुदा द्वार बन्द हो जाना, गैस बनना, कब्ज होना",
            "सुझाव :गुदा द्वार बन्द होने की स्थिति में आपरेशन किया जाये, गैस की समस्या दूर करने के लिए रैनटीडीन तथा कब्ज के  लिए पैराफिन तेल देना चाहिये" ,
                    "4. शावकों का शरीर पीला पड़ना ",
            "कारण : शुरूआत में पेट भर दूध न मिलने से तथा हाईपोग्लाईसेमिया होना",
            "सुझाव :ग्लूकोज पाउडर मुहॅ में डालें तथा डैक्सट्रोज ड्रिप द्वारा दें " ,
                    "5. मुँह एवं कान के पास खरोंच लगना ",
            "कारण : दूध के लिए शावकों का आपस में लड़ना तथा नुकीले दांत न काटना",
            "सुझाव :नुकीले दांतों को काट दें तथा शावकों को दूसरी मादा के पास स्थानान्तरित करें " ,
                    "6. अंधे बच्चे पैदा होना",
            "कारण : आहार में विटामिन ए एवं अन्य मिनरल्स (खनिज)न होने पर",
            "सुझाव :प्रचुर मात्रा में विटामिन, मिनरल्स (खनिज) दें तथा पशुओं को हरा चारा भी खिलायें।" ,
                    "7. मरे बच्चे पैदा होना",
            "कारण : निश्चित समय के बाद ब्याने पर एवं विटामिन ए, कैलशियम एवं आयोडीन की कमी के कारण",
            "सुझाव :निश्चित समय पर न ब्याने पर पशु चिकित्सक की सलाह अवश्य लें" ,
                    "8. पीला दस्त करना",
            "कारण : ज्यादा मात्रा मंे दूध पीने से शावकोेेेेें का पेट खराब होना ",
            "सुझाव : शावकों को अधिक दूध पीने से रोकें तथा उचित दस्त निवारक दवाईयां दें।" ,
                    "9. सफेद दस्त करना",
            "कारण : शावकों के पेट में जीवाणुओं, विषाणुओं द्वारा संक्रमण होने के कारण",
            "सुझाव : पशु-चिकित्सक की सलाह से उचित एंटिबायोटिक दें" ,
                    "10. खुजली होना ",
            "कारण : आहार में कमी होने से एवं मक्खियां होने के कारण ",
            "सुझाव : आहार में बदलाव लाना तथा ऐविल या सिट्राजिन आदि दवाईयां देना।" ,
                    "11. दाने बनना",
            "कारण : मक्खियां-मच्छर होना एवं गन्दगी के कारण से",
            "सुझाव : पशुओं एवं बाड़ों के पास सफाई रखना" ,
                    "12. गले के नीचे सूजन आना",
            "कारण : आहार में प्रोटीन की कमी होना एवं गला घोंटू बीमारी के कारण",
            "सुझाव : पशु आहार में खल की मात्रा बढ़ाना एवं उपयुक्त इलाज कराना" ,
                    "13. आंत उतरना/आंत्रवृद्धि",
            "कारण :  आनुवांशिक कारण",
            "सुझाव : बार-बार शिकायत के आने पर नर बदलना चाहिए" ,
                    "14. उल्टी करना",
            "कारण :  गैस बनने एवं पेट खराब होने से ",
            "सुझाव : उल्टी की दवा दंे" ,
                    "15. पूँछ का कटना",
            "कारण : ज्यादा शूकरों को कम जगह में रखने पर",
            "सुझाव : आयु एवं वजन के हिसाब से रहने एवं खाने की उचित व्यवस्था",

            "16.कब्ज",
            "कारण : पशु आहार में रेशों की मात्रा बढ़ने (अधिक चोकर, मक्का आदि) से",
            "सुझाव : गीला दाना, हरा चारा एवं घूमने के लिए जगह की व्यवस्था",
            "17. गुदाद्वार बाहर निकलना",
            "कारण : कब्ज होने से एवं ठंड लगने से",
            "सुझाव : ठंड से बचाना एवं हल्का दाना देना " ,
                    "18. कमजोर शावक",
            "कारण : आपस में प्रतियोगिता के चलते दूधएवं दाना कम मिलना",
            "सुझाव :भूख बढ़ाने के लिए विटामिन युक्त दवा पिलाना " ,
                    "19. खुजली एवं गीली/लाल त्वचा",
            "कारण : बाह्य परजीवी के कारण एवं खनिज लवण की कमी होने से ",
            "सुझाव :आईवरमेक्टिन एवं जिंक का प्रयोग करने से " ,
                    "20. साँस फूलना",
            "कारण : ठंड लगने से एवं गलाघोटू बीमारी होने से",
            "सुझाव : ठंड से बचाव एवं पशु-चिकित्सक की सलाह लेकर इलाज करें " ,
                    "21. मुँह, कान एवं पैरों के अंदर वाले हिस्सों पर दाना होना",
            "कारण : यह पाक्स बीमारी के कारण हो सकता है",
            "सुझाव : पाक्स रोग के लिए सही एंटीबाडी का प्रयोग करना " ,
                    "22. पिछले पैरों में लकवा",
            "कारण : कैल्शियम, फास्फोरस एवं विटामिन ए, बी की कमी होने से ",
            "सुझाव : आवश्यकतानुसार कैल्शियम, फास्फोरस एवं विटामिन्स देना " ,
                    "23. अण्ड कोष में सूजन",
            "कारण : ब्रूसैला बैक्टीरिया उपस्थित होने के कारण",
            "सुझाव : पशु-चिकित्सक की सलाह लेकर इलाज कराना एवं जांच उपरान्त नर को हटाना " ,
                    "24. थूथन के सहारे खड़े रहना",
            "कारण : शावकों को मादा से दूध न मिलने से ऊर्जा की कमी",
            "सुझाव : ऊपर से बकरी एवं गाय का दूध पिलाना " ,
                    "25. काँपना",
            "कारण : ठंड लगनेएवं ग्लूकोज कम होने से",
            "सुझाव : ठंड से बचाव एवं ग्लूकोज पाउडर देना " ,
                    "26. बिेना बाल बच्चा पैदा होना",
            "कारण :  आयोडीन की कमी",
            "सुझाव : आयोडीन नमक का उपयोग"

    };

    */

  /*  public String[] hindi = {
            "शूकर पालन एप्प",
            "फार्म में होने वाली समस्यायें, कारण एवं सुझाव " ,
            // " समस्यायें\tकारण\tसुझाव\n" +
            "1. लंगड़ा (बिना सूजन)",
            " कारण : शावकों पर मादा द्वारा पैर रखने से, फर्श गीला होने के कारण शूकरों के फिसलने से तथा खुर पकने से ",
            " सुझाव : दर्द कम करने वाली दवा का प्रयोग, गिरने से रोकने के लिए सही बिछावन को प्रयोग, सूखा फर्श रखना" ,
            "2. लंगड़ा (सूजन के साथ) ",
            "कारण : गीला फर्श होने के कारण शूकरों के  फिसल जाने से ",
            "सुझाव : फर्श पर बिछावन बिछाना, फर्श को सूखा रखना तथा दर्द निवारक दवा देना" ,
            "3. शावकों का पेट फूलना ",
            "कारण : गुदा द्वार बन्द हो जाना, गैस बनना, कब्ज होना",
            "सुझाव : गुदा द्वार बन्द होने की स्थिति में आपरेशन किया जाये, गैस की समस्या दूर करने के लिए रैनटीडीन तथा कब्ज के लिए पैराफिन तेल देना चाहिये" ,
            "4. शावकों का शरीर पीला पड़ना ",
            "कारण : शुरूआत में पेट भर दूध न मिलने से तथा हाईपोग्लाईसेमिया होना",
            "सुझाव : ग्लूकोज पाउडर मुहॅ में डालें तथा डैक्सट्रोज ड्रिप द्वारा दें " ,
            "5. मुँह एवं कान के पास खरोंच लगना ",
            "कारण : दूध के लिए शावकों का आपस में लड़ना तथा नुकीले दांत न काटना",
            "सुझाव : नुकीले दांतों को काट दें तथा शावकों को दूसरी मादा के पास स्थानान्तरित करें " ,
            "6. अंधे बच्चे पैदा होना",
            "कारण : आहार में विटामिन ए एवं अन्य मिनरल्स (खनिज)न होने पर",
            "सुझाव : प्रचुर मात्रा में विटामिन, मिनरल्स (खनिज) दें तथा पशुओं को हरा चारा भी खिलायें।" ,
            "7. मरे बच्चे पैदा होना",
            "कारण : निश्चित समय के बाद ब्याने पर एवं विटामिन ए, कैलशियम एवं आयोडीन की कमी के कारण",
            "सुझाव : निश्चित समय पर न ब्याने पर पशु चिकित्सक की सलाह अवश्य लें" ,
            "8. पीला दस्त करना",
            "कारण : ज्यादा मात्रा में दूध पीने से शावकों का पेट खराब होना ",
            "सुझाव : शावकों को अधिक दूध पीने से रोकें तथा उचित दस्त निवारक दवाईयां दें।" ,
            "9. सफेद दस्त करना",
            "कारण : शावकों के पेट में जीवाणुओं, विषाणुओं द्वारा संक्रमण होने के कारण",
            "सुझाव : पशु-चिकित्सक की सलाह से उचित एंटिबायोटिक दें" ,
            "10. खुजली होना ",
            "कारण : आहार में कमी होने से एवं मक्खियां होने के कारण ",
            "सुझाव : आहार में बदलाव लाना तथा ऐविल या सिट्राजिन आदि दवाईयां देना।" ,
            "11. दाने बनना",
            "कारण : मक्खियां-मच्छर होना एवं गन्दगी के कारण से",
            "सुझाव : पशुओं एवं बाड़ों के पास सफाई रखना" ,
            "12. गले के नीचे सूजन आना",
            "कारण : आहार में प्रोटीन की कमी होना एवं गला घोंटू बीमारी के कारण",
            "सुझाव : पशु आहार में खल की मात्रा बढ़ाना एवं उपयुक्त इलाज कराना" ,
            "13. आंत उतरना/आंत्रवृद्धि",
            "कारण : आनुवांशिक कारण",
            "सुझाव : बार-बार शिकायत के आने पर नर बदलना चाहिए" ,
            "14. उल्टी करना",
            "कारण : गैस बनने एवं पेट खराब होने से ",
            "सुझाव : उल्टी की दवा दें" ,
            "15. पूँछ का कटना",
            "कारण : ज्यादा शूकरों को कम जगह में रखने पर",
            "सुझाव : आयु एवं वजन के हिसाब से रहने एवं खाने की उचित व्यवस्था",

            "16. कब्ज",
            "कारण : पशु आहार में रेशों की मात्रा बढ़ने (अधिक चोकर, मक्का आदि) से",
            "सुझाव : गीला दाना, हरा चारा एवं घूमने के लिए जगह की व्यवस्था",
            "17. गुदाद्वार बाहर निकलना",
            "कारण : कब्ज होने से एवं ठंड लगने से",
            "सुझाव : ठंड से बचाना एवं हल्का दाना देना " ,
            "18. कमजोर शावक",
            "कारण : आपस में प्रतियोगिता के चलते दूध एवं दाना कम मिलना",
            "सुझाव : भूख बढ़ाने के लिए विटामिन युक्त दवा पिलाना " ,
            "19. खुजली एवं गीली/लाल त्वचा",
            "कारण : बाह्य परजीवी के कारण एवं खनिज लवण की कमी होने से ",
            "सुझाव :आईवरमेक्टिन एवं जिंक का प्रयोग करने से " ,
            "20. साँस फूलना",
            "कारण : ठंड लगने से एवं गलाघोटू बीमारी होने से",
            "सुझाव : ठंड से बचाव एवं पशु-चिकित्सक की सलाह लेकर इलाज करें " ,
            "21. मुँह, कान एवं पैरों के अंदर वाले हिस्सों पर दाना होना",
            "कारण : यह पाक्स बीमारी के कारण हो सकता है",
            "सुझाव : पाक्स रोग के लिए सही एंटीबाडी का प्रयोग करना " ,
            "22. पिछले पैरों में लकवा",
            "कारण : कैल्शियम, फास्फोरस एवं विटामिन ए, बी की कमी होने से ",
            "सुझाव : आवश्यकतानुसार कैल्शियम, फास्फोरस एवं विटामिन्स देना " ,
            "23. अण्ड कोष में सूजन",
            "कारण : ब्रूसैला बैक्टीरिया उपस्थित होने के कारण",
            "सुझाव : पशु-चिकित्सक की सलाह लेकर इलाज कराना एवं जांच उपरान्त नर को हटाना " ,
            "24. थूथन के सहारे खड़े रहना",
            "कारण : शावकों को मादा से दूध न मिलने से ऊर्जा की कमी",
            "सुझाव : ऊपर से बकरी एवं गाय का दूध पिलाना " ,
            "25. काँपना",
            "कारण : ठंड लगनेएवं ग्लूकोज कम होने से",
            "सुझाव : ठंड से बचाव एवं ग्लूकोज पाउडर देना " ,
            "26. बिेना बाल बच्चा पैदा होना",
            "कारण : आयोडीन की कमी",
            "सुझाव : आयोडीन नमक का उपयोग"

    };


    public String[] to_be_used;

    TextView text1;
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
    TextView text20;

    TextView text21;
    TextView text22;
    TextView text23;
    TextView text24;
    TextView text25;
    TextView text26;
    TextView text27;
    TextView text28;
    TextView text29;
    TextView text30;

    TextView text31;
    TextView text32;
    TextView text33;
    TextView text34;
    TextView text35;
    TextView text36;
    TextView text37;
    TextView text38;
    TextView text39;
    TextView text40;
    TextView text41;
    TextView text42;
    TextView text43;
    TextView text44;
    TextView text45;
    TextView text46;
    TextView text47;
    TextView text48;
    TextView text49;
    TextView text50;
    TextView text51;
    TextView text52;
    TextView text53;
    TextView text54;
    TextView text55;
    TextView text56;
    TextView text57;
    TextView text58;
    TextView text59;
    TextView text60;
    TextView text61;
    TextView text62;
    TextView text63;
    TextView text64;
    TextView text65;
    TextView text66;
    TextView text67;
    TextView text68;
    TextView text69;
    TextView text70;
    TextView text71;
    TextView text72;
    TextView text73;
    TextView text74;
    TextView text75;
    TextView text76;
    TextView text77;
    TextView text78;
    TextView text79;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ten_fragment_layout, container, false);

        to_be_used = hindi.clone();


        getActivity().setTitle(to_be_used[0]);


        text1 = (TextView) view.findViewById(R.id.text1);
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
        text20 = (TextView) view.findViewById(R.id.text20);

        text21 = (TextView) view.findViewById(R.id.text21);
        text22 = (TextView) view.findViewById(R.id.text22);
        text23 = (TextView) view.findViewById(R.id.text23);
        text24 = (TextView) view.findViewById(R.id.text24);
        text25 = (TextView) view.findViewById(R.id.text25);
        text26 = (TextView) view.findViewById(R.id.text26);
        text27 = (TextView) view.findViewById(R.id.text27);
        text28 = (TextView) view.findViewById(R.id.text28);
        text29 = (TextView) view.findViewById(R.id.text29);
        text30 = (TextView) view.findViewById(R.id.text30);

        text31 = (TextView) view.findViewById(R.id.text31);
        text32 = (TextView) view.findViewById(R.id.text32);
        text33 = (TextView) view.findViewById(R.id.text33);
        text34 = (TextView) view.findViewById(R.id.text34);
        text35 = (TextView) view.findViewById(R.id.text35);
        text36 = (TextView) view.findViewById(R.id.text36);
        text37 = (TextView) view.findViewById(R.id.text37);
        text38 = (TextView) view.findViewById(R.id.text38);
        text39 = (TextView) view.findViewById(R.id.text39);
        text40 = (TextView) view.findViewById(R.id.text40);

        text41 = (TextView) view.findViewById(R.id.text41);
        text42 = (TextView) view.findViewById(R.id.text42);
        text43 = (TextView) view.findViewById(R.id.text43);
        text44 = (TextView) view.findViewById(R.id.text44);
        text45 = (TextView) view.findViewById(R.id.text45);
        text46 = (TextView) view.findViewById(R.id.text46);
        text47 = (TextView) view.findViewById(R.id.text47);
        text48 = (TextView) view.findViewById(R.id.text48);
        text49 = (TextView) view.findViewById(R.id.text49);
        text50 = (TextView) view.findViewById(R.id.text50);

        text51 = (TextView) view.findViewById(R.id.text51);
        text52 = (TextView) view.findViewById(R.id.text52);
        text53 = (TextView) view.findViewById(R.id.text53);
        text54 = (TextView) view.findViewById(R.id.text54);
        text55 = (TextView) view.findViewById(R.id.text55);
        text56 = (TextView) view.findViewById(R.id.text56);
        text57 = (TextView) view.findViewById(R.id.text57);
        text58 = (TextView) view.findViewById(R.id.text58);
        text59 = (TextView) view.findViewById(R.id.text59);
        text60 = (TextView) view.findViewById(R.id.text60);

        text61 = (TextView) view.findViewById(R.id.text61);
        text62 = (TextView) view.findViewById(R.id.text62);
        text63 = (TextView) view.findViewById(R.id.text63);
        text64 = (TextView) view.findViewById(R.id.text64);
        text65 = (TextView) view.findViewById(R.id.text65);
        text66 = (TextView) view.findViewById(R.id.text66);
        text67 = (TextView) view.findViewById(R.id.text67);
        text68 = (TextView) view.findViewById(R.id.text68);
        text69 = (TextView) view.findViewById(R.id.text69);
        text70 = (TextView) view.findViewById(R.id.text70);

        text71 = (TextView) view.findViewById(R.id.text71);
        text72 = (TextView) view.findViewById(R.id.text72);
        text73 = (TextView) view.findViewById(R.id.text73);
        text74 = (TextView) view.findViewById(R.id.text74);
        text75 = (TextView) view.findViewById(R.id.text75);
        text76 = (TextView) view.findViewById(R.id.text76);
        text77 = (TextView) view.findViewById(R.id.text77);
        text78 = (TextView) view.findViewById(R.id.text78);
        text79 = (TextView) view.findViewById(R.id.text79);



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
        text13.setText(to_be_used[13]);
        text14.setText(to_be_used[14]);
        text15.setText(to_be_used[15]);
        text16.setText(to_be_used[16]);
        text17.setText(to_be_used[17]);
        text18.setText(to_be_used[18]);
        text19.setText(to_be_used[19]);
        text20.setText(to_be_used[20]);

        text21.setText(to_be_used[21]);
        text22.setText(to_be_used[22]);
        text23.setText(to_be_used[23]);
        text24.setText(to_be_used[24]);
        text25.setText(to_be_used[25]);
        text26.setText(to_be_used[26]);
        text27.setText(to_be_used[27]);
        text28.setText(to_be_used[28]);
        text29.setText(to_be_used[29]);
        text30.setText(to_be_used[30]);

        text31.setText(to_be_used[31]);
        text32.setText(to_be_used[32]);
        text33.setText(to_be_used[33]);
        text34.setText(to_be_used[34]);
        text35.setText(to_be_used[35]);
        text36.setText(to_be_used[36]);
        text37.setText(to_be_used[37]);
        text38.setText(to_be_used[38]);
        text39.setText(to_be_used[39]);
        text40.setText(to_be_used[40]);

        text41.setText(to_be_used[41]);
        text42.setText(to_be_used[42]);
        text43.setText(to_be_used[43]);
        text44.setText(to_be_used[44]);
        text45.setText(to_be_used[45]);
        text46.setText(to_be_used[46]);
        text47.setText(to_be_used[47]);
        text48.setText(to_be_used[48]);
        text49.setText(to_be_used[49]);
        text50.setText(to_be_used[50]);

        text51.setText(to_be_used[51]);
        text52.setText(to_be_used[52]);
        text53.setText(to_be_used[53]);
        text54.setText(to_be_used[54]);
        text55.setText(to_be_used[55]);
        text56.setText(to_be_used[56]);
        text57.setText(to_be_used[57]);
        text58.setText(to_be_used[58]);
        text59.setText(to_be_used[59]);
        text60.setText(to_be_used[60]);

        text61.setText(to_be_used[61]);
        text62.setText(to_be_used[62]);
        text63.setText(to_be_used[63]);
        text64.setText(to_be_used[64]);
        text65.setText(to_be_used[65]);
        text66.setText(to_be_used[66]);
        text67.setText(to_be_used[67]);
        text68.setText(to_be_used[68]);
        text69.setText(to_be_used[69]);
        text70.setText(to_be_used[70]);

        text71.setText(to_be_used[71]);
        text72.setText(to_be_used[72]);
        text73.setText(to_be_used[73]);
        text74.setText(to_be_used[74]);
        text75.setText(to_be_used[75]);
        text76.setText(to_be_used[76]);
        text77.setText(to_be_used[77]);
        text78.setText(to_be_used[78]);
        text79.setText(to_be_used[79]);


        text1.setTextColor(Color.parseColor("#FF2D2B2C"));
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
        text20.setTextColor(Color.parseColor("#FF2D2B2C"));

        text21.setTextColor(Color.parseColor("#FF2D2B2C"));
        text22.setTextColor(Color.parseColor("#FF2D2B2C"));
        text23.setTextColor(Color.parseColor("#FF2D2B2C"));
        text24.setTextColor(Color.parseColor("#FF2D2B2C"));
        text25.setTextColor(Color.parseColor("#FF2D2B2C"));
        text26.setTextColor(Color.parseColor("#FF2D2B2C"));
        text27.setTextColor(Color.parseColor("#FF2D2B2C"));
        text28.setTextColor(Color.parseColor("#FF2D2B2C"));
        text29.setTextColor(Color.parseColor("#FF2D2B2C"));
        text30.setTextColor(Color.parseColor("#FF2D2B2C"));

        text31.setTextColor(Color.parseColor("#FF2D2B2C"));
        text32.setTextColor(Color.parseColor("#FF2D2B2C"));
        text33.setTextColor(Color.parseColor("#FF2D2B2C"));
        text34.setTextColor(Color.parseColor("#FF2D2B2C"));
        text35.setTextColor(Color.parseColor("#FF2D2B2C"));
        text36.setTextColor(Color.parseColor("#FF2D2B2C"));
        text37.setTextColor(Color.parseColor("#FF2D2B2C"));
        text38.setTextColor(Color.parseColor("#FF2D2B2C"));
        text39.setTextColor(Color.parseColor("#FF2D2B2C"));
        text40.setTextColor(Color.parseColor("#FF2D2B2C"));

        text41.setTextColor(Color.parseColor("#FF2D2B2C"));
        text42.setTextColor(Color.parseColor("#FF2D2B2C"));
        text43.setTextColor(Color.parseColor("#FF2D2B2C"));
        text44.setTextColor(Color.parseColor("#FF2D2B2C"));
        text45.setTextColor(Color.parseColor("#FF2D2B2C"));
        text46.setTextColor(Color.parseColor("#FF2D2B2C"));
        text47.setTextColor(Color.parseColor("#FF2D2B2C"));
        text48.setTextColor(Color.parseColor("#FF2D2B2C"));
        text49.setTextColor(Color.parseColor("#FF2D2B2C"));
        text50.setTextColor(Color.parseColor("#FF2D2B2C"));
        text51.setTextColor(Color.parseColor("#FF2D2B2C"));
        text52.setTextColor(Color.parseColor("#FF2D2B2C"));
        text53.setTextColor(Color.parseColor("#FF2D2B2C"));
        text54.setTextColor(Color.parseColor("#FF2D2B2C"));
        text55.setTextColor(Color.parseColor("#FF2D2B2C"));
        text56.setTextColor(Color.parseColor("#FF2D2B2C"));
        text57.setTextColor(Color.parseColor("#FF2D2B2C"));
        text58.setTextColor(Color.parseColor("#FF2D2B2C"));
        text59.setTextColor(Color.parseColor("#FF2D2B2C"));
        text60.setTextColor(Color.parseColor("#FF2D2B2C"));
        text61.setTextColor(Color.parseColor("#FF2D2B2C"));
        text62.setTextColor(Color.parseColor("#FF2D2B2C"));
        text63.setTextColor(Color.parseColor("#FF2D2B2C"));
        text64.setTextColor(Color.parseColor("#FF2D2B2C"));
        text65.setTextColor(Color.parseColor("#FF2D2B2C"));
        text66.setTextColor(Color.parseColor("#FF2D2B2C"));
        text67.setTextColor(Color.parseColor("#FF2D2B2C"));
        text68.setTextColor(Color.parseColor("#FF2D2B2C"));
        text69.setTextColor(Color.parseColor("#FF2D2B2C"));
        text70.setTextColor(Color.parseColor("#FF2D2B2C"));
        text71.setTextColor(Color.parseColor("#FF2D2B2C"));
        text72.setTextColor(Color.parseColor("#FF2D2B2C"));
        text73.setTextColor(Color.parseColor("#FF2D2B2C"));
        text74.setTextColor(Color.parseColor("#FF2D2B2C"));
        text75.setTextColor(Color.parseColor("#FF2D2B2C"));
        text76.setTextColor(Color.parseColor("#FF2D2B2C"));
        text77.setTextColor(Color.parseColor("#FF2D2B2C"));
        text78.setTextColor(Color.parseColor("#FF2D2B2C"));
        text79.setTextColor(Color.parseColor("#FF2D2B2C"));


        text1.setTextSize(23);
        text2.setTextSize(20);
        text3.setTextSize(20);
        text4.setTextSize(20);
        text5.setTextSize(20);
        text6.setTextSize(20);
        text7.setTextSize(20);
        text8.setTextSize(20);
        text9.setTextSize(20);
        text10.setTextSize(20);


        text11.setTextSize(20);
        text12.setTextSize(20);
        text13.setTextSize(20);
        text14.setTextSize(20);
        text15.setTextSize(20);
        text16.setTextSize(20);
        text17.setTextSize(20);
        text18.setTextSize(20);
        text19.setTextSize(20);
        text20.setTextSize(20);


        text21.setTextSize(20);
        text22.setTextSize(20);
        text23.setTextSize(20);
        text24.setTextSize(20);
        text25.setTextSize(20);
        text26.setTextSize(20);
        text27.setTextSize(20);
        text28.setTextSize(20);
        text29.setTextSize(20);
        text30.setTextSize(20);


        text31.setTextSize(20);
        text32.setTextSize(20);
        text33.setTextSize(20);
        text34.setTextSize(20);
        text35.setTextSize(20);
        text36.setTextSize(20);
        text37.setTextSize(20);
        text38.setTextSize(20);
        text39.setTextSize(20);
        text40.setTextSize(20);


        text41.setTextSize(20);
        text42.setTextSize(20);
        text43.setTextSize(20);
        text44.setTextSize(20);
        text45.setTextSize(20);
        text46.setTextSize(20);
        text47.setTextSize(20);
        text48.setTextSize(20);
        text49.setTextSize(20);
        text50.setTextSize(20);


        text51.setTextSize(20);
        text52.setTextSize(20);
        text53.setTextSize(20);
        text54.setTextSize(20);
        text55.setTextSize(20);
        text56.setTextSize(20);
        text57.setTextSize(20);
        text58.setTextSize(20);
        text59.setTextSize(20);
        text60.setTextSize(20);


        text61.setTextSize(20);
        text62.setTextSize(20);
        text63.setTextSize(20);
        text64.setTextSize(20);
        text65.setTextSize(20);
        text66.setTextSize(20);
        text67.setTextSize(20);
        text68.setTextSize(20);
        text69.setTextSize(20);
        text70.setTextSize(20);


        text71.setTextSize(20);
        text72.setTextSize(20);
        text73.setTextSize(20);
        text74.setTextSize(20);
        text75.setTextSize(20);
        text76.setTextSize(20);
        text77.setTextSize(20);
        text78.setTextSize(20);
        text79.setTextSize(20);


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
        Justification.justify(text20);

        Justification.justify(text21);
        Justification.justify(text22);
        Justification.justify(text23);
        Justification.justify(text24);
        Justification.justify(text25);
        Justification.justify(text26);
        Justification.justify(text27);
        Justification.justify(text28);
        Justification.justify(text29);
        Justification.justify(text30);

        Justification.justify(text31);
        Justification.justify(text32);
        Justification.justify(text33);
        Justification.justify(text34);
        Justification.justify(text35);
        Justification.justify(text36);
        Justification.justify(text37);
        Justification.justify(text38);
        Justification.justify(text39);
        Justification.justify(text40);

        Justification.justify(text41);
        Justification.justify(text42);
        Justification.justify(text43);
        Justification.justify(text44);
        Justification.justify(text45);
        Justification.justify(text46);
        Justification.justify(text47);
        Justification.justify(text48);
        Justification.justify(text49);
        Justification.justify(text50);

        Justification.justify(text51);
        Justification.justify(text52);
        Justification.justify(text53);
        Justification.justify(text54);
        Justification.justify(text55);
        Justification.justify(text56);
        Justification.justify(text57);
        Justification.justify(text58);
        Justification.justify(text59);
        Justification.justify(text60);

        Justification.justify(text61);
        Justification.justify(text62);
        Justification.justify(text63);
        Justification.justify(text64);
        Justification.justify(text65);
        Justification.justify(text66);
        Justification.justify(text67);
        Justification.justify(text68);
        Justification.justify(text69);
        Justification.justify(text70);

        Justification.justify(text71);
        Justification.justify(text72);
        Justification.justify(text73);
        Justification.justify(text74);
        Justification.justify(text75);
        Justification.justify(text76);
        Justification.justify(text77);
        Justification.justify(text78);
        Justification.justify(text79);







        return view;
    }
}

  */

public class ten_fragment extends Fragment {


    public ten_fragment() {
    }

    public String[] hindi = {
            "शूकर पालन एप्प",
            "फार्म में होने वाली समस्यायें, कारण एवं सुझाव " ,
            "समस्यायें",
            "कारण",
            "सुझाव",
            " लंगड़ाना (बिना सूजन)",//5
            "  शावकों पर मादा द्वारा पैर रखने से, फर्श गीला होने के कारण शूकरों के फिसलने से तथा खुर पकने से ",
            " दर्द कम करने वाली दवा का प्रयोग, गिरने से रोकने के लिए सही बिछावन को प्रयोग, सूखा फर्श रखना" ,
            " लंगड़ाना (सूजन के साथ) ",
            " गीला फर्श होने के कारण शूकरों के  फिसल जाने से ",
            "फर्श पर बिछावन बिछाना, फर्श को सूखा रखना तथा दर्द निवारक दवा देना" ,
            " शावकों का पेट फूलना ",
            " गुदा द्वार बन्द हो जाना, गैस बनना, कब्ज होना",
            " गुदा द्वार बन्द होने की स्थिति में आपरेशन किया जाये, गैस की समस्या दूर करने के लिए रैनटीडीन तथा कब्ज के लिए पैराफिन तेल देना चाहिये" ,
            " शावकों का शरीर पीला पड़ना ",
            "शुरूआत में पेट भर दूध न मिलने से तथा हाईपोग्लाईसेमिया होना",
            "ग्लूकोज पाउडर मुहॅ में डालें तथा डैक्सट्रोज ड्रिप द्वारा दें " ,
            " मुँह एवं कान के पास खरोंच लगना ",
            " दूध के लिए शावकों का आपस में लड़ना तथा नुकीले दांत न काटना",
            " नुकीले दांतों को काट दें तथा शावकों को दूसरी मादा के पास स्थानान्तरित करें " ,
            " अंधे बच्चे पैदा होना",
            "आहार में विटामिन ए एवं अन्य मिनरल्स (खनिज)न होने पर",
            "प्रचुर मात्रा में विटामिन, मिनरल्स (खनिज) दें तथा पशुओं को हरा चारा भी खिलायें।" ,
            " मरे बच्चे पैदा होना",
            " निश्चित समय के बाद ब्याने पर एवं विटामिन ए, कैलशियम एवं आयोडीन की कमी के कारण",
            " निश्चित समय पर न ब्याने पर पशु चिकित्सक की सलाह अवश्य लें" ,
            " पीला दस्त करना",
            "ज्यादा मात्रा में दूध पीने से शावकों का पेट खराब होना ",
            " शावकों को अधिक दूध पीने से रोकें तथा उचित दस्त निवारक दवाईयां दें।" ,
            " सफेद दस्त करना",
            " शावकों के पेट में जीवाणुओं, विषाणुओं द्वारा संक्रमण होने के कारण",
            " पशु-चिकित्सक की सलाह से उचित एंटिबायोटिक दें" ,
            " खुजली होना ",
            " आहार में कमी होने से एवं मक्खियां होने के कारण ",
            " आहार में बदलाव लाना तथा ऐविल या सिट्राजिन आदि दवाईयां देना।" ,
            " दाने बनना",
            " मक्खियां-मच्छर होना एवं गन्दगी के कारण से",
            "पशुओं एवं बाड़ों के पास सफाई रखना" ,
            " गले के नीचे सूजन आना",
            " आहार में प्रोटीन की कमी होना एवं गला घोंटू बीमारी के कारण",
            " पशु आहार में खल की मात्रा बढ़ाना एवं उपयुक्त इलाज कराना" ,
            " आंत उतरना/आंत्रवृद्धि",
            " आनुवांशिक कारण",
            " बार-बार शिकायत के आने पर नर बदलना चाहिए" ,
            " उल्टी करना",
            "गैस बनने एवं पेट खराब होने से ",
            " उल्टी की दवा दें" ,
            " पूँछ का कटना",
            " ज्यादा शूकरों को कम जगह में रखने पर",
            "आयु एवं वजन के हिसाब से रहने एवं खाने की उचित व्यवस्था",

            " कब्ज",
            " पशु आहार में रेशों की मात्रा बढ़ने (अधिक चोकर, मक्का आदि) से",
            "गीला दाना, हरा चारा एवं घूमने के लिए जगह की व्यवस्था",
            "गुदाद्वार बाहर निकलना",
            " कब्ज होने से एवं ठंड लगने से",
            " ठंड से बचाना एवं हल्का दाना देना " ,
            " कमजोर शावक",
            " आपस में प्रतियोगिता के चलते दूध एवं दाना कम मिलना",
            "भूख बढ़ाने के लिए विटामिन युक्त दवा पिलाना " ,
            " खुजली एवं गीली/लाल त्वचा",
            " बाह्य परजीवी के कारण एवं खनिज लवण की कमी होने से ",
            "आईवरमेक्टिन एवं जिंक का प्रयोग करने से " ,
            " साँस फूलना",
            " ठंड लगने से एवं गलाघोटू बीमारी होने से",
            " ठंड से बचाव एवं पशु-चिकित्सक की सलाह लेकर इलाज करें " ,
            " मुँह, कान एवं पैरों के अंदर वाले हिस्सों पर दाना होना",
            " यह पाक्स बीमारी के कारण हो सकता है",
            " पाक्स रोग के लिए सही एंटीबाडी का प्रयोग करना " ,
            " पिछले पैरों में लकवा",
            " कैल्शियम, फास्फोरस एवं विटामिन ए, बी की कमी होने से ",
            " आवश्यकतानुसार कैल्शियम, फास्फोरस एवं विटामिन्स देना " ,
            " अण्ड कोष में सूजन",
            " ब्रूसैला बैक्टीरिया उपस्थित होने के कारण",
            " पशु-चिकित्सक की सलाह लेकर इलाज कराना एवं जांच उपरान्त नर को हटाना " ,
            " थूथन के सहारे खड़े रहना",
            " शावकों को मादा से दूध न मिलने से ऊर्जा की कमी",
            " ऊपर से बकरी एवं गाय का दूध पिलाना " ,
            " काँपना",
            " ठंड लगनेएवं ग्लूकोज कम होने से",
            " ठंड से बचाव एवं ग्लूकोज पाउडर देना " ,
            " बिेना बाल बच्चा पैदा होना",
            " आयोडीन की कमी",
            " आयोडीन नमक का उपयोग"
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
    TextView text20;

    TextView text21;
    TextView text22;
    TextView text23;
    TextView text24;
    TextView text25;
    TextView text26;
    TextView text27;
    TextView text28;
    TextView text29;
    TextView text30;

    TextView text31;
    TextView text32;
    TextView text33;
    TextView text34;
    TextView text35;
    TextView text36;
    TextView text37;
    TextView text38;
    TextView text39;
    TextView text40;
    TextView text41;
    TextView text42;
    TextView text43;
    TextView text44;
    TextView text45;
    TextView text46;
    TextView text47;
    TextView text48;
    TextView text49;
    TextView text50;
    TextView text51;
    TextView text52;
    TextView text53;
    TextView text54;
    TextView text55;
    TextView text56;
    TextView text57;
    TextView text58;
    TextView text59;
    TextView text60;
    TextView text61;
    TextView text62;
    TextView text63;
    TextView text64;
    TextView text65;
    TextView text66;
    TextView text67;
    TextView text68;
    TextView text69;
    TextView text70;
    TextView text71;
    TextView text72;
    TextView text73;
    TextView text74;
    TextView text75;
    TextView text76;
    TextView text77;
    TextView text78;
    TextView text79;

    private WebView webViewSKA;
    String text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.ten_fragment_layout, container, false);

        to_be_used = hindi.clone();


        getActivity().setTitle(to_be_used[0]);


        text1 = (Button) view.findViewById(R.id.text1);
        webViewSKA=(WebView)view.findViewById(R.id.webViewKSS);
        // bgcolor="#90caf9"
        text = "<html><body>";
        text+= "<table border=\"1px solid black\" cellpadding=\"5\" cellspacing=\"0\">";

        text+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4>" + "" + "</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+to_be_used[2]+"</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[3] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used[4] + "</font></h4></td></tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"1"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[5]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[6]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[7]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"2"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[8]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[9]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[10]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"3"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[11]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[12]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[13]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"4"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[14]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[15]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[16]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"5"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[17]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[18]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[19]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"6"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[20]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[21]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[22]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"7"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[23]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[24]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[25]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"8"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[26]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[27]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[28]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"9"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[29]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[30]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[31]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"10"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[32]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[33]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[34]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"11"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[35]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[36]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[37]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"12"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[38]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[39]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[40]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"13"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[41]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[42]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[43]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"14"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[44]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[45]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[46]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"15"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[47]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[48]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[49]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"16"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[50]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[51]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[52]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"17"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[53]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[54]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[55]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"18"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[56]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[57]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[58]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"19"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[59]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[60]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[61]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"20"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[62]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[63]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[64]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"21"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[65]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[66]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[67]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"22"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[68]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[69]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[70]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"23"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[71]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[72]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[73]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"24"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[74]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[75]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[76]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"25"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[77]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[78]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[79]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+"26"+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[80]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[81]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used[82]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        webViewSKA.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);
       /* text2 = (TextView) view.findViewById(R.id.text2);
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
        text20 = (TextView) view.findViewById(R.id.text20);

        text21 = (TextView) view.findViewById(R.id.text21);
        text22 = (TextView) view.findViewById(R.id.text22);
        text23 = (TextView) view.findViewById(R.id.text23);
        text24 = (TextView) view.findViewById(R.id.text24);
        text25 = (TextView) view.findViewById(R.id.text25);
        text26 = (TextView) view.findViewById(R.id.text26);
        text27 = (TextView) view.findViewById(R.id.text27);
        text28 = (TextView) view.findViewById(R.id.text28);
        text29 = (TextView) view.findViewById(R.id.text29);
        text30 = (TextView) view.findViewById(R.id.text30);

        text31 = (TextView) view.findViewById(R.id.text31);
        text32 = (TextView) view.findViewById(R.id.text32);
        text33 = (TextView) view.findViewById(R.id.text33);
        text34 = (TextView) view.findViewById(R.id.text34);
        text35 = (TextView) view.findViewById(R.id.text35);
        text36 = (TextView) view.findViewById(R.id.text36);
        text37 = (TextView) view.findViewById(R.id.text37);
        text38 = (TextView) view.findViewById(R.id.text38);
        text39 = (TextView) view.findViewById(R.id.text39);
        text40 = (TextView) view.findViewById(R.id.text40);

        text41 = (TextView) view.findViewById(R.id.text41);
        text42 = (TextView) view.findViewById(R.id.text42);
        text43 = (TextView) view.findViewById(R.id.text43);
        text44 = (TextView) view.findViewById(R.id.text44);
        text45 = (TextView) view.findViewById(R.id.text45);
        text46 = (TextView) view.findViewById(R.id.text46);
        text47 = (TextView) view.findViewById(R.id.text47);
        text48 = (TextView) view.findViewById(R.id.text48);
        text49 = (TextView) view.findViewById(R.id.text49);
        text50 = (TextView) view.findViewById(R.id.text50);

        text51 = (TextView) view.findViewById(R.id.text51);
        text52 = (TextView) view.findViewById(R.id.text52);
        text53 = (TextView) view.findViewById(R.id.text53);
        text54 = (TextView) view.findViewById(R.id.text54);
        text55 = (TextView) view.findViewById(R.id.text55);
        text56 = (TextView) view.findViewById(R.id.text56);
        text57 = (TextView) view.findViewById(R.id.text57);
        text58 = (TextView) view.findViewById(R.id.text58);
        text59 = (TextView) view.findViewById(R.id.text59);
        text60 = (TextView) view.findViewById(R.id.text60);

        text61 = (TextView) view.findViewById(R.id.text61);
        text62 = (TextView) view.findViewById(R.id.text62);
        text63 = (TextView) view.findViewById(R.id.text63);
        text64 = (TextView) view.findViewById(R.id.text64);
        text65 = (TextView) view.findViewById(R.id.text65);
        text66 = (TextView) view.findViewById(R.id.text66);
        text67 = (TextView) view.findViewById(R.id.text67);
        text68 = (TextView) view.findViewById(R.id.text68);
        text69 = (TextView) view.findViewById(R.id.text69);
        text70 = (TextView) view.findViewById(R.id.text70);

        text71 = (TextView) view.findViewById(R.id.text71);
        text72 = (TextView) view.findViewById(R.id.text72);
        text73 = (TextView) view.findViewById(R.id.text73);
        text74 = (TextView) view.findViewById(R.id.text74);
        text75 = (TextView) view.findViewById(R.id.text75);
        text76 = (TextView) view.findViewById(R.id.text76);
        text77 = (TextView) view.findViewById(R.id.text77);
        text78 = (TextView) view.findViewById(R.id.text78);
        text79 = (TextView) view.findViewById(R.id.text79);*/



        text1.setText(to_be_used[1]);
      /*  text2.setText(to_be_used[2]);
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
        text13.setText(to_be_used[13]);
        text14.setText(to_be_used[14]);
        text15.setText(to_be_used[15]);
        text16.setText(to_be_used[16]);
        text17.setText(to_be_used[17]);
        text18.setText(to_be_used[18]);
        text19.setText(to_be_used[19]);
        text20.setText(to_be_used[20]);

        text21.setText(to_be_used[21]);
        text22.setText(to_be_used[22]);
        text23.setText(to_be_used[23]);
        text24.setText(to_be_used[24]);
        text25.setText(to_be_used[25]);
        text26.setText(to_be_used[26]);
        text27.setText(to_be_used[27]);
        text28.setText(to_be_used[28]);
        text29.setText(to_be_used[29]);
        text30.setText(to_be_used[30]);

        text31.setText(to_be_used[31]);
        text32.setText(to_be_used[32]);
        text33.setText(to_be_used[33]);
        text34.setText(to_be_used[34]);
        text35.setText(to_be_used[35]);
        text36.setText(to_be_used[36]);
        text37.setText(to_be_used[37]);
        text38.setText(to_be_used[38]);
        text39.setText(to_be_used[39]);
        text40.setText(to_be_used[40]);

        text41.setText(to_be_used[41]);
        text42.setText(to_be_used[42]);
        text43.setText(to_be_used[43]);
        text44.setText(to_be_used[44]);
        text45.setText(to_be_used[45]);
        text46.setText(to_be_used[46]);
        text47.setText(to_be_used[47]);
        text48.setText(to_be_used[48]);
        text49.setText(to_be_used[49]);
        text50.setText(to_be_used[50]);

        text51.setText(to_be_used[51]);
        text52.setText(to_be_used[52]);
        text53.setText(to_be_used[53]);
        text54.setText(to_be_used[54]);
        text55.setText(to_be_used[55]);
        text56.setText(to_be_used[56]);
        text57.setText(to_be_used[57]);
        text58.setText(to_be_used[58]);
        text59.setText(to_be_used[59]);
        text60.setText(to_be_used[60]);

        text61.setText(to_be_used[61]);
        text62.setText(to_be_used[62]);
        text63.setText(to_be_used[63]);
        text64.setText(to_be_used[64]);
        text65.setText(to_be_used[65]);
        text66.setText(to_be_used[66]);
        text67.setText(to_be_used[67]);
        text68.setText(to_be_used[68]);
        text69.setText(to_be_used[69]);
        text70.setText(to_be_used[70]);

        text71.setText(to_be_used[71]);
        text72.setText(to_be_used[72]);
        text73.setText(to_be_used[73]);
        text74.setText(to_be_used[74]);
        text75.setText(to_be_used[75]);
        text76.setText(to_be_used[76]);
        text77.setText(to_be_used[77]);
        text78.setText(to_be_used[78]);
        text79.setText(to_be_used[79]);*/


        text1.setTextColor(Color.parseColor("#ffffff"));
       /* text2.setTextColor(Color.parseColor("#FF2D2B2C"));
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
        text20.setTextColor(Color.parseColor("#FF2D2B2C"));

        text21.setTextColor(Color.parseColor("#FF2D2B2C"));
        text22.setTextColor(Color.parseColor("#FF2D2B2C"));
        text23.setTextColor(Color.parseColor("#FF2D2B2C"));
        text24.setTextColor(Color.parseColor("#FF2D2B2C"));
        text25.setTextColor(Color.parseColor("#FF2D2B2C"));
        text26.setTextColor(Color.parseColor("#FF2D2B2C"));
        text27.setTextColor(Color.parseColor("#FF2D2B2C"));
        text28.setTextColor(Color.parseColor("#FF2D2B2C"));
        text29.setTextColor(Color.parseColor("#FF2D2B2C"));
        text30.setTextColor(Color.parseColor("#FF2D2B2C"));

        text31.setTextColor(Color.parseColor("#FF2D2B2C"));
        text32.setTextColor(Color.parseColor("#FF2D2B2C"));
        text33.setTextColor(Color.parseColor("#FF2D2B2C"));
        text34.setTextColor(Color.parseColor("#FF2D2B2C"));
        text35.setTextColor(Color.parseColor("#FF2D2B2C"));
        text36.setTextColor(Color.parseColor("#FF2D2B2C"));
        text37.setTextColor(Color.parseColor("#FF2D2B2C"));
        text38.setTextColor(Color.parseColor("#FF2D2B2C"));
        text39.setTextColor(Color.parseColor("#FF2D2B2C"));
        text40.setTextColor(Color.parseColor("#FF2D2B2C"));

        text41.setTextColor(Color.parseColor("#FF2D2B2C"));
        text42.setTextColor(Color.parseColor("#FF2D2B2C"));
        text43.setTextColor(Color.parseColor("#FF2D2B2C"));
        text44.setTextColor(Color.parseColor("#FF2D2B2C"));
        text45.setTextColor(Color.parseColor("#FF2D2B2C"));
        text46.setTextColor(Color.parseColor("#FF2D2B2C"));
        text47.setTextColor(Color.parseColor("#FF2D2B2C"));
        text48.setTextColor(Color.parseColor("#FF2D2B2C"));
        text49.setTextColor(Color.parseColor("#FF2D2B2C"));
        text50.setTextColor(Color.parseColor("#FF2D2B2C"));
        text51.setTextColor(Color.parseColor("#FF2D2B2C"));
        text52.setTextColor(Color.parseColor("#FF2D2B2C"));
        text53.setTextColor(Color.parseColor("#FF2D2B2C"));
        text54.setTextColor(Color.parseColor("#FF2D2B2C"));
        text55.setTextColor(Color.parseColor("#FF2D2B2C"));
        text56.setTextColor(Color.parseColor("#FF2D2B2C"));
        text57.setTextColor(Color.parseColor("#FF2D2B2C"));
        text58.setTextColor(Color.parseColor("#FF2D2B2C"));
        text59.setTextColor(Color.parseColor("#FF2D2B2C"));
        text60.setTextColor(Color.parseColor("#FF2D2B2C"));
        text61.setTextColor(Color.parseColor("#FF2D2B2C"));
        text62.setTextColor(Color.parseColor("#FF2D2B2C"));
        text63.setTextColor(Color.parseColor("#FF2D2B2C"));
        text64.setTextColor(Color.parseColor("#FF2D2B2C"));
        text65.setTextColor(Color.parseColor("#FF2D2B2C"));
        text66.setTextColor(Color.parseColor("#FF2D2B2C"));
        text67.setTextColor(Color.parseColor("#FF2D2B2C"));
        text68.setTextColor(Color.parseColor("#FF2D2B2C"));
        text69.setTextColor(Color.parseColor("#FF2D2B2C"));
        text70.setTextColor(Color.parseColor("#FF2D2B2C"));
        text71.setTextColor(Color.parseColor("#FF2D2B2C"));
        text72.setTextColor(Color.parseColor("#FF2D2B2C"));
        text73.setTextColor(Color.parseColor("#FF2D2B2C"));
        text74.setTextColor(Color.parseColor("#FF2D2B2C"));
        text75.setTextColor(Color.parseColor("#FF2D2B2C"));
        text76.setTextColor(Color.parseColor("#FF2D2B2C"));
        text77.setTextColor(Color.parseColor("#FF2D2B2C"));
        text78.setTextColor(Color.parseColor("#FF2D2B2C"));
        text79.setTextColor(Color.parseColor("#FF2D2B2C"));*/


        text1.setTextSize(20);
    /*    text2.setTextSize(20);
        text3.setTextSize(20);
        text4.setTextSize(20);
        text5.setTextSize(20);
        text6.setTextSize(20);
        text7.setTextSize(20);
        text8.setTextSize(20);
        text9.setTextSize(20);
        text10.setTextSize(20);


        text11.setTextSize(20);
        text12.setTextSize(20);
        text13.setTextSize(20);
        text14.setTextSize(20);
        text15.setTextSize(20);
        text16.setTextSize(20);
        text17.setTextSize(20);
        text18.setTextSize(20);
        text19.setTextSize(20);
        text20.setTextSize(20);


        text21.setTextSize(20);
        text22.setTextSize(20);
        text23.setTextSize(20);
        text24.setTextSize(20);
        text25.setTextSize(20);
        text26.setTextSize(20);
        text27.setTextSize(20);
        text28.setTextSize(20);
        text29.setTextSize(20);
        text30.setTextSize(20);


        text31.setTextSize(20);
        text32.setTextSize(20);
        text33.setTextSize(20);
        text34.setTextSize(20);
        text35.setTextSize(20);
        text36.setTextSize(20);
        text37.setTextSize(20);
        text38.setTextSize(20);
        text39.setTextSize(20);
        text40.setTextSize(20);


        text41.setTextSize(20);
        text42.setTextSize(20);
        text43.setTextSize(20);
        text44.setTextSize(20);
        text45.setTextSize(20);
        text46.setTextSize(20);
        text47.setTextSize(20);
        text48.setTextSize(20);
        text49.setTextSize(20);
        text50.setTextSize(20);


        text51.setTextSize(20);
        text52.setTextSize(20);
        text53.setTextSize(20);
        text54.setTextSize(20);
        text55.setTextSize(20);
        text56.setTextSize(20);
        text57.setTextSize(20);
        text58.setTextSize(20);
        text59.setTextSize(20);
        text60.setTextSize(20);


        text61.setTextSize(20);
        text62.setTextSize(20);
        text63.setTextSize(20);
        text64.setTextSize(20);
        text65.setTextSize(20);
        text66.setTextSize(20);
        text67.setTextSize(20);
        text68.setTextSize(20);
        text69.setTextSize(20);
        text70.setTextSize(20);


        text71.setTextSize(20);
        text72.setTextSize(20);
        text73.setTextSize(20);
        text74.setTextSize(20);
        text75.setTextSize(20);
        text76.setTextSize(20);
        text77.setTextSize(20);
        text78.setTextSize(20);
        text79.setTextSize(20);*/




        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}