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




public class thirteen_fragment extends Fragment {

    public thirteen_fragment() {
    }

    public String [] hindi={
            "शूकर पालन एप्प",
            "शूकर पालन प्रश्नोत्तरी " ,

            "खनिज-लवण बाजार में किन-किन नामों से उपलब्ध हैं तथा उनको किस अनुपात में देना चाहिए ? " ,
            "बाजार में खनिज-लवण अलग-अलग नाम, दर एवं मात्रा में उपलब्ध है जैसे: मिनफा, मिनफ गोल्ड, एग्रीमिनफोर्ट, एग्रीमिन, र्कोिन्समिन, ग्रोवीब्लन्ड, वीटाहब्लन्ड, लाइकामिन नाम से आता है। उपर्युक्त बाड़ों में कुछ में खनिज, कुछ में लवण एवं कुछ में दोनों होते हैं। अतः कम्पनी के दिशा-निर्देशों के आधार पर ही इन्हें आहार में मिलाना चाहिए। एक अच्छा लवण एवं विटामिन मिश्रण निम्नलिखित तालिका के अनुसार होना चाहिये। यह लवण मिश्रण 5-10 ग्राम प्रति शूकर के हिसाब से खिलाया जा सकता है: " ,
            " प्रसव वर्ष भर होता रहना चाहिए या अंतराल में ?" ,
            " प्रसव वर्ष भर होने से आवास की जगह एवं श्रमिकों का सही तरह से उपयोग हो सकेगा। साथ-साथ किसान को उचित आमदनी मिलती रहेगी। इसके अतिरिक्त केवल सर्दियों में प्रसव से मृत्यु दर बढने का खतरा रहता है। सही योजना बनाकर प्रसव अन्तराल सुनिश्चित किया जा सकता है। इस योजना को ध्यान में रखकर अच्छा रखरखाव एवं प्रबंधन भी संभव है। " ,

            " पशुओं को छोटी आयु पर या वयस्क होने पर बेचना चाहिए ? " ,

            " यदि उच्च नस्ल के पशु (लैडरेस, यार्कशायर, डयूरॉक) फार्म में हैं तो उनके बच्चों को दो माह की उम्र पर नये फार्मो (जो शुरू हो रहे हों) को बेचा जा सकता है। यदि फार्म पर अच्छी नस्ल नहीं है और आहार कम लागत पर उपलब्ध हो रहा है तो पशुओं को बड़ा कर के बेचना चाहिए।  " ,

            "फार्म के पशु एक साथ खरीदने चाहिए या कम संख्या में धीरे धीरे? " ,

            " बेहतर होगा कि पशुओं को एक साथ अच्छे फार्म से खरीदें। यदि पशुओं को दो बार में खरीदना है तो कम से कम एक महीने का अन्तर रखना चाहिए। " ,

            " एक फार्म (10 से 15 प्रजनक वयस्क शूकर बच्चों के साथ) के लिए कितनी जगह की आवश्यकता पड़ती है?  " ,
            " सामान्य तौर पर 15 मीटर (चैड़ा) एवं 20 मीटर (लम्बा क्षेत्र) आवास के लिए आवश्यक है।  " ,
            " शूकर प्रबंधन के लिए कितने श्रमिकों की आवश्यकता होती है?  " ,

            " आमतौर पर 10 मादा + 2 नर के फार्म के लिए दो श्रमिकों की आवश्यकता होती है। यदि फार्म में अनुपयोगी आहार बाहर से लाना पड़ता है तो एक अतिरिक्त श्रमिक की आवश्यकता पड़ती है।  " ,

            " शूकर पालन व्यवसाय कितने प्रकार से चला सकते हैं?  " ,
            " छोटे शूकरों को खरीदकर बड़ा करके बेचना या मादा तथा नर का प्रजनन कराके बच्चे पैदा करना। " ,
            " दांत से शूकर की आयु का आँकलन  किस तरह करते हैं? " ,

            " शुरूआत में बच्चों के अस्थायी दांत होते हैं। इस समय एक जबड़े के सामने 3 जोड़े इंसाइजर दांत होते हैं (दूध वाले दांत) जो समय अनुसार गिर जाते हैं और उनके स्थान पर स्थायी दांत आ जाते हैं। छः महीने में प्रथम जोड़ा (बीच वाला), एक साल में तीसरा जोड़ा (कोने वाला) एवं डेढ़ साल में दूसरा जोड़ा (इंटरमीडिएट) स्थायी दांत निकल आते हैं।  " ,

            " अनाथ बच्चों की देखभाल कैसे करें? " ,

            "जिस मादा के पास दूध नहीं होता है उसके बच्चों को अनाथ कहते हैं। यदि उसी दिन कोई दूसरी मादा ब्यायी है और उसके बच्चों की संख्या कम है तो उसके साथ अनाथ बच्चों को स्थानांतरण किया जा सकता है। अनाथ बच्चों को शिफ्ट करते समय इन बच्चों तथा मादा के बच्चों के उपर तथा मादा की थूथन के पास फिनायल डाल देना चाहिए जिससे मादा अनाथ बच्चों को पहचान न सके। यदि उस दिन अन्य मादा न ब्यायी हो तो अनाथ बच्चों को निप्पल से बकरी का दूध पिलाने की कोशिश करें । अनाथ बच्चों को एक घंटे के अंतराल पर दूध पिलाते रहना चाहिए।" ,

            " शूकरों में बधियाकरण कब और क्यों? " ,

            " बधियाकरण 3 से 4 सप्ताह पर करना उचित रहता है। यदि किन्हीं कारणों से शूकर का बधियाकरण उपरोक्त अवधि में नहीं कर पाते हैं, तो दो महीने के अन्दर निश्चित तौर पर कर देना चाहिए। ज्यादातर उपभोक्ता बधिया किए हुए नर को खरीदना पंसद करते हैं। इसलिए कुछ पशु पालक बेचने से पहले शूकर को बधिया किसी भी उम्र या वजन पर करते हैं, जो उचित नहीं है।  " ,

            " शूकरी के ब्याते समय दो बच्चों के बीच अंतराल कितना होता है और सभी बच्चों के ब्याने में कितना समय लगता है।  " ,

            "ब्याने की शुरूआत में मादा की परेशानियाँ (उठना, बैठना, गेट/लोहा काटना, बिछावन इकट्ठा करना) के बाद उसके जननांग से पानी के साथ पहला बच्चा बाहर आने पर होती हैं। दो बच्चों के मध्य का समय लगभग 10-15 मिनट तथा पहले एवं अंतिम बच्चे के मध्य का समय लगभग 2-2:30 घंटा होता है। यदि किसी कारणवश अधिक समय लगता है तो यह माना जा सकता है कि एक या अधिक बच्चे मर या सड़ चुके हैं।  " ,

            " टीके खरीदते समय किन-किन बातों का ध्यान रखना चाहिए? " ,
            " टीके खरीदते समय अपना थर्मस साथ ले जाना चाहिए। टीके खरीदने के बाद उनको रूई से लपेटकर बर्फ भरे हुए थर्मस में रखना चाहिए। " ,

            " शूकरों के लिए प्रतिदिन कितने पानी की आवष्यकता होती है? " ,

            " शूकर का शारीरिक वजन कैसे ले सकते हैं ? " ,

            " 50 किलो तक के पशु का वजन उसे बोरे में बंद करके स्प्रिंग काँटे से ले सकते हैं। लेकिन बडे पशु का वजन इस विधि द्वारा नहीं लिया जा सकता है। कुछ फार्मो ने प्लेटफार्म काँटा लगा लिया है, जिसकी मदद से शूकरों का वजन लिया जा सकता है।  " ,

            " शूकर प्रतिदिन कितना वजन ग्रहण कर लेता है ? " ,
            " शरीर का वजन नस्ल, अवस्था एवं आहार की गुणवत्ता पर निर्भर करता है। पेटभर पशु आहार देने पर वीनर (5-12 किग्रा), ग्रोवर (12-50 किलोग्राम) एवं फिनिशर (50-100 किग्रा) शूकर एक दिन में 300-400 ग्राम, 500-600 ग्राम एवं 600-700 ग्राम भार ग्रहण कर लेता है। "

    };

    public String [] hindi2= {
           " प्रश्न 1:"," प्रश्न 2:"," प्रश्न 3:"," प्रश्न 4:"," प्रश्न 5:",
            " प्रश्न 6:"," प्रश्न 7:"," प्रश्न 8:"," प्रश्न 9:"," प्रश्न 10:",
            " प्रश्न 11:"," प्रश्न 12:"," प्रश्न 13:"," प्रश्न 14:"," प्रश्न 15:",
            " उत्तर:"
    };

    public String[] hindi1={
            "प्रति 250 ग्रामः " ,
            "विटामिन ए " ,//1
            "5,00,000 आई. यू. " ,
            "विटामिन डी3 " ,
            "1,00,000आई.यू. " ,
            "विटामिन बी2 " ,
            "0.2 ग्राम " ,
            "विटामिन ई एसीट्रेट एफ.जी. 50% " ,
            "75 मिली ग्राम " ,
            "विटामिन के " ,
            "0.1 ग्राम " ,
            "विटामिन बी12 " ,
            "600 एमसीजी " ,
            "कैल्शियम पेन्टोथिनेट " ,
            "0.25 ग्राम " ,
            "नियासिन (निकोटिनिक अम्ल) " ,
            "1 ग्राम " ,
            "कोलिन किलोराइडएफ जी. 50%" ,
            "15 ग्राम " ,
            "कैल्शियम " ,
            "70 ग्राम " ,
            "मैग्नीस " ,
            "2.75 ग्राम " ,
            "आयोडीन " ,
            "0.1 ग्राम " ,
            "आयरन " ,
            "0.75 ग्राम " ,
            "जिंक " ,
            "1.5 ग्राम " ,
            "कोपर " ,
            "0.2 ग्राम " ,
            "कोबाल्ट " ,
            "0.045 ग्राम " ,
            "फॉस्फोरस",
            "20 ग्राम ",

            "शूकर का प्रकार ",//35
            "लीटर " ,//36

            "नर शूकर ",
            "45.5 " ,
            "गाभिन शूकरी ",
            "18.22 " ,
            "शूकर के बच्चे",
            "3.5-4.0 " ,
            "सूखी शूकरी",
            "4.4-5.0",
    };

    public String [] to_be_used;
    public String [] to_be_used1;

    TextView textt;
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

    private WebView webViewSKA1;
    String text;

    private WebView webViewSKA2;
    String tex1t;


    TextView text_question_answer1;
    TextView text_question_answer2;
    TextView text_question_answer3;
    TextView text_question_answer4;
    TextView text_question_answer5;
    TextView text_question_answer6;
    TextView text_question_answer7;
    TextView text_question_answer8;
    TextView text_question_answer9;
    TextView text_question_answer10;
    TextView text_question_answer11;
    TextView text_question_answer12;
    TextView text_question_answer13;
    TextView text_question_answer14;
    TextView text_question_answer15;
    TextView text_question_answer16;
    TextView text_question_answer17;
    TextView text_question_answer18;
    TextView text_question_answer19;
    TextView text_question_answer20;
    TextView text_question_answer21;
    TextView text_question_answer22;
    TextView text_question_answer23;
    TextView text_question_answer24;
    TextView text_question_answer25;
    TextView text_question_answer26;
    TextView text_question_answer27;
    TextView text_question_answer28;
    TextView text_question_answer29;

     public String [] to_be_used2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.thirteen_fragment_layout, container, false);

        to_be_used=hindi.clone();
        to_be_used1=hindi1.clone();
        to_be_used2=hindi2.clone();

        String nodatafound="&#8226;";

        getActivity().setTitle(to_be_used[0]);

        text_question_answer1=(TextView)view.findViewById(R.id.new_text1);
        text_question_answer2=(TextView)view.findViewById(R.id.new_text2);
        text_question_answer3=(TextView)view.findViewById(R.id.new_text3);
        text_question_answer4=(TextView)view.findViewById(R.id.new_text4);
        text_question_answer5=(TextView)view.findViewById(R.id.new_text5);
        text_question_answer6=(TextView)view.findViewById(R.id.new_text6);
        text_question_answer7=(TextView)view.findViewById(R.id.new_text7);
        text_question_answer8=(TextView)view.findViewById(R.id.new_text8);
        text_question_answer9=(TextView)view.findViewById(R.id.new_text9);
        text_question_answer10=(TextView)view.findViewById(R.id.new_text10);

        text_question_answer11=(TextView)view.findViewById(R.id.new_text11);
        text_question_answer12=(TextView)view.findViewById(R.id.new_text12);
        text_question_answer13=(TextView)view.findViewById(R.id.new_text13);
        text_question_answer14=(TextView)view.findViewById(R.id.new_text14);
        text_question_answer15=(TextView)view.findViewById(R.id.new_text15);
        text_question_answer16=(TextView)view.findViewById(R.id.new_text16);
        text_question_answer17=(TextView)view.findViewById(R.id.new_text17);
        text_question_answer18=(TextView)view.findViewById(R.id.new_text18);
        text_question_answer19=(TextView)view.findViewById(R.id.new_text19);
        text_question_answer20=(TextView)view.findViewById(R.id.new_text20);

        text_question_answer21=(TextView)view.findViewById(R.id.new_text21);
        text_question_answer22=(TextView)view.findViewById(R.id.new_text22);
        text_question_answer23=(TextView)view.findViewById(R.id.new_text23);
        text_question_answer24=(TextView)view.findViewById(R.id.new_text24);
        text_question_answer25=(TextView)view.findViewById(R.id.new_text25);
        text_question_answer26=(TextView)view.findViewById(R.id.new_text26);
        text_question_answer27=(TextView)view.findViewById(R.id.new_text27);
        text_question_answer28=(TextView)view.findViewById(R.id.new_text28);
        text_question_answer29=(TextView)view.findViewById(R.id.new_text29);

        text_question_answer1.setText(to_be_used2[0]);
        text_question_answer2.setText(to_be_used2[15]);
        text_question_answer3.setText(to_be_used2[1]);
        text_question_answer4.setText(to_be_used2[15]);
        text_question_answer5.setText(to_be_used2[2]);

        text_question_answer6.setText(to_be_used2[15]);
        text_question_answer7.setText(to_be_used2[3]);
        text_question_answer8.setText(to_be_used2[15]);
        text_question_answer9.setText(to_be_used2[4]);
        text_question_answer10.setText(to_be_used2[15]);

        text_question_answer11.setText(to_be_used2[5]);
        text_question_answer12.setText(to_be_used2[15]);
        text_question_answer13.setText(to_be_used2[6]);
        text_question_answer14.setText(to_be_used2[15]);
        text_question_answer15.setText(to_be_used2[7]);

        text_question_answer16.setText(to_be_used2[0]);
        text_question_answer17.setText(to_be_used2[8]);
        text_question_answer18.setText(to_be_used2[15]);
        text_question_answer19.setText(to_be_used2[9]);
        text_question_answer20.setText(to_be_used2[15]);

        text_question_answer21.setText(to_be_used2[10]);
        text_question_answer22.setText(to_be_used2[15]);
        text_question_answer23.setText(to_be_used2[11]);
        text_question_answer24.setText(to_be_used2[15]);
        text_question_answer25.setText(to_be_used2[12]);

        text_question_answer26.setText(to_be_used2[13]);
        text_question_answer27.setText(to_be_used2[15]);
        text_question_answer28.setText(to_be_used2[14]);
        text_question_answer29.setText(to_be_used2[15]);



        //text3.setTextColor(Color.parseColor("#FF2D2B2C"));



        text1=(Button) view.findViewById(R.id.text1);
        text2=(TextView)view.findViewById(R.id.text2);
        webViewSKA1=(WebView)view.findViewById(R.id.webViewQno1) ;
        //bgcolor="#90caf9"
        text = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body>";
        text+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";
        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ to_be_used1[0]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[1]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[2]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[3]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[4]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[5]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[6]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[7]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[8]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[9]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[10]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[11]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[12]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[13]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[14]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[15]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[16]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[17]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[18]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[19]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[20]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[21]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[22]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[23]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[24]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[25]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[26]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[27]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[28]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[29]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[30]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[31]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[32]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[33]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[34]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "</table>";
        text+= "</body></html>";
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
        text16=(TextView)view.findViewById(R.id.text16);
        text17=(TextView)view.findViewById(R.id.text17);
        text18=(TextView)view.findViewById(R.id.text18);
        text19=(TextView)view.findViewById(R.id.text19);
        text20=(TextView)view.findViewById(R.id.text20);

        text21=(TextView)view.findViewById(R.id.text21);
        text22=(TextView)view.findViewById(R.id.text22);
        text23=(TextView)view.findViewById(R.id.text23);
        text24=(TextView)view.findViewById(R.id.text24);
        text25=(TextView)view.findViewById(R.id.text25);
        text26=(TextView)view.findViewById(R.id.text26);
        webViewSKA2=(WebView)view.findViewById(R.id.webViewQno13) ;
        //bgcolor="#90caf9"
        tex1t = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
        tex1t+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\" cellpadding=\"5\" cellspacing=\"0\">";
        tex1t+= "<tr height =10>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4><font color=\"black\">"+to_be_used1[35]+"</font></h4>";
        tex1t+="</td>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4><font color=\"black\">"+to_be_used1[36]+"</font></h4>";
        tex1t+="</td>";
        tex1t+= "</tr>";

        tex1t+= "<tr height =10>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[37]+"</h4>";
        tex1t+="</td>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[38]+"</h4>";
        tex1t+="</td>";
        tex1t+= "</tr>";

        tex1t+= "<tr height =10>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[39]+"</h4>";
        tex1t+="</td>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[40]+"</h4>";
        tex1t+="</td>";
        tex1t+= "</tr>";

        tex1t+= "<tr height =10>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[41]+"</h4>";
        tex1t+="</td>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[42]+"</h4>";
        tex1t+="</td>";
        tex1t+= "</tr>";

        tex1t+= "<tr height =10>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[43]+"</h4>";
        tex1t+="</td>";
        tex1t+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        tex1t+="<h4>"+to_be_used1[44]+"</h4>";
        tex1t+="</td>";
        tex1t+= "</tr>";

        tex1t+= "</table>";
        tex1t+= "</body></html>";
        text27=(TextView)view.findViewById(R.id.text27);
        text28=(TextView)view.findViewById(R.id.text28);
        text29=(TextView)view.findViewById(R.id.text29);
        text30=(TextView)view.findViewById(R.id.text30);

        text1.setText(to_be_used[1]);
        text2.setText(to_be_used[2]);
        webViewSKA1.loadDataWithBaseURL("file:///android_asset/", text, "text/html", "utf-8", null);
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
        webViewSKA2.loadDataWithBaseURL("file:///android_asset/", tex1t, "text/html", "utf-8", null);
        text27.setText(to_be_used[27]);
        text28.setText(to_be_used[28]);
        text29.setText(to_be_used[29]);
        text30.setText(to_be_used[30]);

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

        text1.setTextSize(20);
        text2.setTextSize(20);
        text3.setTextSize(18);
        text4.setTextSize(20);
        text5.setTextSize(18);
        text6.setTextSize(20);
        text7.setTextSize(18);
        text8.setTextSize(20);
        text9.setTextSize(18);
        text10.setTextSize(20);

        text11.setTextSize(18);
        text12.setTextSize(20);
        text13.setTextSize(18);
        text14.setTextSize(20);
        text15.setTextSize(18);
        text16.setTextSize(20);
        text17.setTextSize(18);
        text18.setTextSize(20);
        text19.setTextSize(18);
        text20.setTextSize(20);

        text21.setTextSize(18);
        text22.setTextSize(20);
        text23.setTextSize(18);
        text24.setTextSize(20);
        text25.setTextSize(18);
        text26.setTextSize(20);
        text27.setTextSize(20);
        text28.setTextSize(18);
        text29.setTextSize(20);
        text30.setTextSize(18);

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

        return view;
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}

