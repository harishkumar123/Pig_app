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
 * Created by akmu on 12/16/2017.
 */

/*public class tweleve_fragment extends Fragment {

    public tweleve_fragment(){

    }
    */

    /*public String [] hindi={
            "शूकर पालन एप्प",
            "क्या करें, क्या न करें " ,
                  //  "क्या करें    (✓)\tक्या न करें   (☓)" ,
                    " शूकर पालन परिचय " ,
                    "क्या करें : अपनी परिस्थिति को देखकर शूकर फार्म खोले ",
            "दूसरों को देखकर तुरंत शूकर फार्म खोलने की कोशिश न करंे " ,
                    "क्या करें : पशुओं की संख्या अपनी क्षमता के हिसाब से एवं बिक्री के हिसाब से सुनिश्चित करें ",
            "फार्म को आबादी के करीब एवं ऐसी जगह नही खोलना चाहिए जहाॅं अपशिष्ट पदार्थ निकालने की व्यवस्था न हो " ,
                    "क्या करें : फार्म की परियोजना आर्थिक स्थिति पर निर्भर करनी चाहिए ",
            "बिना टेªनिंग लिए प्रोजेक्ट नही बनाना चाहिए " ,
                    "क्या करें : परियोजना की तकनीकी एवं आर्थिक जानकारी बैंक प्रोफार्मा के हिसाब से होनी चाहिए ",
            "शूूकर फार्म बिना टेªनिंग लिए न खोलें " ,

                    "  शूकरों का चुनाव एवं प्रजनन " ,
                    "क्या करें :पशु परिचित फार्म से तथा अच्छी नस्ल के गुण वाले खरीदने चाहिए ",
            "एक ही समय में दो फार्म से पशु न खरीदंे " ,
                    "क्या करें :नस्ल का चुनाव अपने क्षेत्र की जलवायु के अनुसार करना चाहिए",
            "एक फाॅर्म में अलग-अलग नस्लों के पशुओं को न रखें " ,
                    "क्या करें :अपने फार्म के लिए सही नर का चयन करना चाहिए तथा नस्ल की सुधार के लिए सही प्रजनन तरीकों को अपनाना चाहिए ",
            "अच्छा नर 3 वर्षो से अधिक प्रजनन के लिए प्रयोग नहीं करना चाहिए तथा 1 नर 1 वर्ष में केवल 10 मादाओं पर ही प्रयोग करना चाहिए " ,
                    "क्या करें :नर शूकरांे को जानकारी वाले फार्मो  से ही खरीदना चाहिए साथ ही खरीदते समय सम्भव हो सके तो नर शूकर की लगभग तीन पीढ़ी की जानकारी लेनी चाहिए",
            "दो नरांे को एक साथ एक बाड़े में नहीं रखना चाहिए " ,
                    "प्रजनन सुबह एवं शाम के समय ही कराना चाहिए",
            "जुलाई-अगस्त में प्रजनन न करायें ताकि  प्रसव सर्दी में न हो।?" ,
                    "मादा ब्याने से एक दो दिन पहले पुआल को बिछाना चाहिए ",
            "पिछली ब्याॅत में जिस मादा ने दूध उत्पादन न किया हो उसे हटा देना चाहिए " ,

                    " आवास प्रबन्धन " ,
                    "सफाई की दृष्टि से फर्श पक्का हो (सीमेन्ट या खडं़जा)",
            "अलग-अलग आयु वर्गो के शूकरो को एक साथ बड़े बाडे़ में नही रखना चाहिए " ,
                    " आहार व्यवस्था " ,
                    "फार्म के प्रजनक पशुओं को हमेशा संतुलित आहार ही दें " ,
                    " वृद्धिशील शूकरों के संतुलित आहार में किसी भी हालत में क्रूड प्रोटीन 12ः से कम नहीं होनी चाहिये " ,
                    "पशुओं के आहार का मूल्य कम करने के लिये खल तथा मक्का की मात्रा को ज्यादा कम न करें " ,
                    "शूकरांे को राशन सुबह और शाम देना चाहिए",
            "फफूॅंदी लगा राशन नही खिलाना चाहिए " ,
                    "हरा चारा हमेशा साबुत देना चाहिए ",
            "एक पशु को हरा चारा 5 किलो से अधिक नहीं देना चाहिए " ,
                    " शूकरों का रख-रखाव " ,
                    "आयरन, बी काम्पलेक्स इन्जेक्शन बच्चों को देना चाहिए ",
            " नुकीले दांत को सादा कैची से न काटें " ,
                    "वीनिंग 6 से 8 सप्ताह के बीच करनी चाहिए",
            "प्रसव के  बाद मादा को पहली ऋतुकाल में प्रजनन नहीं कराना चाहिए " ,
                    "बधियाकरण एक महीने के अन्दर करना चाहिए",
            "कमजोर एवं दस्त करने वाले बच्चों को नजरंदाज न करें " ,
                    "बच्चों का बधियाकरण अधिक सर्दी के मौसम में जहाँ तक संभव हो न करायंे।",
            "एक बाड़े में दो मादाओं को बच्चों के साथ न रखें। " ,
                    "पानी बचाने के लिए फव्वारा लगाया जा सकता है " ,
                    " यदि तालाब की व्यवस्था है तो बीमार पशुु को तालाब में न छोड़े एवं तालाब में गंदा पानी न छोड़ें " ,
                    "ब्याने वाली मादा के बाड़ें में शावकों के लिए एक सप्ताह तक हीटर लगाया जा सकता है",
            "बेहतर होगा प्रसव अधिकठंड मे न हो " ,

                    " शूकर रोग एवं नियंत्रण " ,
                    "फार्म के किसी भी पशु में बीमारी के लक्षण दिखने पर शरीर का तापमान लेना चाहिए",
            "बिना पशु-चिकित्सक की सलाह के किसी भी दवा का प्रयोग न करें  " ,
                    "जिन पशुओं में बुखार आया हो उनमें ही एन्टीबायोटिक्स का प्रयोग करना चाहिए ",
            "सीरेंज को केवल एक बार प्रयोग करंे " ,
            "निर्धारित समय पर परजीवियों की दवाई लगाये",
            "जरूरत से ज्यादा मात्रा एवं बिना कारण बार-बार दवा न दें " ,
                    "संदेह की स्थिति में पशु गोबर की जाँच करायें",
            "पशु को दवा देना न भूलें " ,
                    "मादा पशु निर्धारित समय पर न ब्याये तो पशु-चिकित्सक की सलाह लें",
            "गर्भपात हुए मादा को तुरंत अन्य पशुओं के साथ न मिलायंे " ,
                    "प्रसव से संबंधित रोगों का इलाज    पशु-चिकित्सक से करायें",
            "मादाओं में प्रसव संबंधित शिकायत आने पर सम्बन्धित नर का प्रयोग प्रजनन में न करें  " +
                    "आयोडीनरहित नमक, लवण-मिश्रण पशु आहार में मिलायंे ",
            "लम्बे समय तक पशुओं को बिना लवण मिले आहार न दें " ,
                    "पशु आहार में मुख्य लवण/विटामिन की उपलब्धता को सुनिश्चित करें ",
            "खनिज-लवण पशुओं को अलग से न दें " ,
                    "टीकाकरण सही एवं योजनाबद्ध तरीके से करें ताकि दो टीकों में अन्तराल बना रहे ",
            "कोई भी पशु टीकाकरण से न छूटे " ,
                    "टीकाकरण करते समय दिनांक/बैच नम्बर अवश्य लिख लें",
            "पहले से संक्रमित/पीड़ित पशु का टीकाकरण न करें। ठीक होने के बाद टीकाकरण किया जा सकता है " ,
                    "संक्रमित/पीड़ित पशु को तुरंत अलग करके उसका उपचार करना चाहिए ",
            "संक्रमित पशु का इलाज पशु-चिकित्सक की सलाह के बिना नहीं करना चाहिए " ,
                    "टीके को फ्रिज में रखकर उचित समय पर टीकाकरण करना चाहिए",
            "टीकाकरण पुरानी सुई से न करें  " ,
                    "अच्छी कोटी का चूना खरीदें ताकि उसका उचित उपयोग व फायदा मिल सके",
            "कम्पनी से दिया हुआ या जरूरत से कम कीटाणुनाशक का उपयोग न करें " ,
                    "कीटाणुनाशक अच्छी कम्पनी का खरीदें ताकि उचित फायदा मिल सके",
            "ब्लीचिंग पाउडर का उपयोग बाड़े में पशुओं के रहते नही करना चाहिए",

            " शूकर फार्म के दैनिक कार्यक्रम " ,
                    "अलग-अलग आयु के पशु अलग-अलग बाडांे़ में रखने चाहिए ताकि आपस में झगड़ा न कर सकें ",
            "बाड़े के अन्दर कोई लोहे का टुकड़ा, नट, बोल्ट या पत्थर का टुकड़ा नहीं छोड़ना चाहिए " ,
                    "पशु आहार या दाना कम से कम दिन में दो बार दिया जाना चाहिये ताकि पशु व्यस्त रहे ",
            "बुरी आदत वाले पशुआंे को बाड़े में दूसरे पशुओं के साथ न छोडं़े " ,
                    "प्रतिदिन फार्म में जाकर एक नजर पशुओं को अवश्य देखें ",
            "फार्म के कर्मचारियों द्वारा बतायी बातों पर पूर्ण रूप से निर्भर न रहें " ,
                    "अनुपयोगी पदार्थ जैसे सीरिंज, कवर, पुरानी खाली शीशियाँ एक निश्चित स्थान (कूड़ेदान) में फेकंे ",
            "किसी भी बीमार पशु में शुरूआत में दिखे लक्षणों को अनदेखा न करें " ,
                    "पहचान चिन्ह अल्प आयु पर ही लगाना चाहिए",
            "आँकड़ों के रिकार्ड करने का कार्य स्थगित न करें " ,
                    "कम से कम ब्रीडिंग रिकार्ड रखना चाहिए ",
            "कोई भी रिकार्ड कच्ची पर्ची में लिखकर नही रखना चाहिए " ,
                    "शूकर के गोबर को उपयोग में लाने के लिए फार्म के किनारे पर दो गढ्ढे बनाने चाहिए ",
            "शूकर का गोबर फार्म के इधर उधर न फेकें ताकि दुर्गंध न फैले " ,
                    "  शूकर सह मत्स्य पालन " ,
                    "शूकर सह मत्स्य पालन पूरी जानकारी लेने के बाद ही खोलंे",
            "शूकर का मलवा सीधे तलाब में न छोडें " ,
                    "तालाब में मछलियों की संख्या सूकरों की संख्या के आधार पर निर्धारित करें ",
            "शूकर का बाड़ा तालाब के बिल्कुल किनारे पर न बनायें " ,
                    " शूकरों की बिक्री " ,
                    "शूकरों को सही समय पर बेचंे ताकि उचित मूल्य मिल सके",
            "मजबूरी में जल्दी या असामयिक सस्ते शावक न बेचें " ,
                    "प्रजनन ऐसे समय करायें जिस समय अधिक मांग हो और उचित मूल्य मिल सके ",
            "शूकर खरीदने वाले आदमी बार-बार न बदलें ",
            "अलग-अलग आयु वर्ग के पशुआंे को एक ही ट्रक में ले जाने के लिए पार्टीशन की आवश्यकता पड़ती है ",
            "पैर बांधकर एक दो पशुओं को बड़े ट्रक में न ले जायें " ,
                    "परिवहन से पूर्व पशु को पर्याप्त मात्रा में पानी देना चाहिए ","परिवहन से पूर्व भरपेट आहार नहीं देना चाहिए " ,
                    "वाहन के किनारों पर कोई धारदार सतह नही होनी चाहिए, जो पशुओं को घायल कर सके ",
            "पशुओं को चढ़ाने के बाद ट्रक को पूरा त्रिपाल से नहीं ढकना चाहिए " ,
                    "शूकर को वध शाला भेजने से 12 घंटे पहले कुछ नहीं खिलाना चाहिए",
            "80 किग्रा से कम वजन के पशुओं को वधशाला नहीं भेजना चाहिए " ,
                    "साल में बिकने वाले शूकरों की योजना पहले से बनानी चाहिए " ,
                    " शूकर का वध फार्म के अंदर नहीं करना चाहिये"


    };

    */

   /* public String [] hindi={
            "शूकर पालन एप्प",
            "क्या करें, क्या न करें " ,
            //  "क्या करें    (✓)\tक्या न करें   (☓)" ,
            " शूकर पालन परिचय " ,
            "क्या करें : अपनी परिस्थिति को देखकर शूकर फार्म खोले ",
            "दूसरों को देखकर तुरंत शूकर फार्म खोलने की कोशिश न करें " ,
            "क्या करें : पशुओं की संख्या अपनी क्षमता के हिसाब से एवं बिक्री के हिसाब से सुनिश्चित करें ",
            "फार्म को आबादी के करीब एवं ऐसी जगह नही खोलना चाहिए जहाॅं अपशिष्ट पदार्थ निकालने की व्यवस्था न हो " ,
            "क्या करें : फार्म की परियोजना आर्थिक स्थिति पर निर्भर करनी चाहिए ",
            "बिना ट्रेनिंग लिए प्रोजेक्ट नही बनाना चाहिए " ,
            "क्या करें : परियोजना की तकनीकी एवं आर्थिक जानकारी बैंक प्रोफार्मा के हिसाब से होनी चाहिए ",
            "शूूकर फार्म बिना ट्रेनिंग लिए न खोलें " ,

            "  शूकरों का चुनाव एवं प्रजनन " ,
            "क्या करें : पशु परिचित फार्म से तथा अच्छी नस्ल के गुण वाले खरीदने चाहिए ",
            "एक ही समय में दो फार्म से पशु न खरीदें " ,
            "क्या करें : नस्ल का चुनाव अपने क्षेत्र की जलवायु के अनुसार करना चाहिए",
            "एक फाॅर्म में अलग-अलग नस्लों के पशुओं को न रखें " ,
            "क्या करें : अपने फार्म के लिए सही नर का चयन करना चाहिए तथा नस्ल की सुधार के लिए सही प्रजनन तरीकों को अपनाना चाहिए ",
            "अच्छा नर 3 वर्षो से अधिक प्रजनन के लिए प्रयोग नहीं करना चाहिए तथा 1 नर 1 वर्ष में केवल 10 मादाओं पर ही प्रयोग करना चाहिए " ,
            "क्या करें : नर शूकरों को जानकारी वाले फार्मो से ही खरीदना चाहिए साथ ही खरीदते समय संभव हो सके तो नर शूकर की लगभग तीन पीढ़ी की जानकारी लेनी चाहिए",
            "दो नरों को एक साथ एक बाड़े में नहीं रखना चाहिए " ,
            "प्रजनन सुबह एवं शाम के समय ही कराना चाहिए",
            "जुलाई-अगस्त में प्रजनन न करायें ताकि प्रसव सर्दी में न हो।?" ,
            "मादा ब्याने से एक दो दिन पहले पुआल को बिछाना चाहिए ",
            "पिछली ब्याॅत में जिस मादा ने दूध उत्पादन न किया हो उसे हटा देना चाहिए " ,

            " आवास प्रबन्धन " ,
            "सफाई की दृष्टि से फर्श पक्का हो (सीमेन्ट या खंड़जा)",
            "अलग-अलग आयु वर्गो के शूकरो को एक साथ बड़े बाडे़ में नही रखना चाहिए " ,
            " आहार व्यवस्था " ,
            "फार्म के प्रजनक पशुओं को हमेशा संतुलित आहार ही दें " ,
            "वृद्धिशील शूकरों के संतुलित आहार में किसी भी हालत में क्रूड प्रोटीन 12% से कम नहीं होनी चाहिये " ,
            "पशुओं के आहार का मूल्य कम करने के लिये खल तथा मक्का की मात्रा को ज्यादा कम न करें " ,
            "शूकरों को राशन सुबह और शाम देना चाहिए",
            "फफूॅंदी लगा राशन नही खिलाना चाहिए " ,
            "हरा चारा हमेशा साबुत देना चाहिए ",
            "एक पशु को हरा चारा 5 किलो से अधिक नहीं देना चाहिए " ,
            " शूकरों का रख-रखाव " ,
            "आयरन, बी काम्पलेक्स इन्जेक्शन बच्चों को देना चाहिए ",
            " नुकीले दांत को सादा कैची से न काटें " ,
            "वीनिंग 6 से 8 सप्ताह के बीच करनी चाहिए",
            "प्रसव के बाद मादा को पहली ऋतुकाल में प्रजनन नहीं कराना चाहिए " ,
            "बधियाकरण एक महीने के अन्दर करना चाहिए",
            "कमजोर एवं दस्त करने वाले बच्चों को नजरंदाज न करें " ,
            "बच्चों का बधियाकरण अधिक सर्दी के मौसम में जहाँ तक संभव हो न करायें ।",
            "एक बाड़े में दो मादाओं को बच्चों के साथ न रखें। " ,
            "पानी बचाने के लिए फव्वारा लगाया जा सकता है " ,
            " यदि तालाब की व्यवस्था है तो बीमार पशुु को तालाब में न छोड़े एवं तालाब में गंदा पानी न छोड़ें " ,
            "ब्याने वाली मादा के बाड़ें में शावकों के लिए एक सप्ताह तक हीटर लगाया जा सकता है",
            "बेहतर होगा प्रसव अधिकठंड मे न हो " ,

            " शूकर रोग एवं नियंत्रण " ,
            "फार्म के किसी भी पशु में बीमारी के लक्षण दिखने पर शरीर का तापमान लेना चाहिए",
            "बिना पशु-चिकित्सक की सलाह के किसी भी दवा का प्रयोग न करें  " ,
            "जिन पशुओं में बुखार आया हो उनमें ही एन्टीबायोटिक्स का प्रयोग करना चाहिए ",
            "सीरेंज को केवल एक बार प्रयोग करें " ,
            "निर्धारित समय पर परजीवियों की दवाई लगाये",
            "जरूरत से ज्यादा मात्रा एवं बिना कारण बार-बार दवा न दें " ,
            "संदेह की स्थिति में पशु गोबर की जाँच करायें",
            "पशु को दवा देना न भूलें " ,
            "मादा पशु निर्धारित समय पर न ब्याये तो पशु-चिकित्सक की सलाह लें",
            "गर्भपात हुए मादा को तुरंत अन्य पशुओं के साथ न मिलायें " ,
            "प्रसव से संबंधित रोगों का इलाज पशु-चिकित्सक से करायें",
            "मादाओं में प्रसव संबंधित शिकायत आने पर सम्बन्धित नर का प्रयोग प्रजनन में न करें  " +
                    "आयोडीनरहित नमक, लवण-मिश्रण पशु आहार में मिलायें ",
            "लम्बे समय तक पशुओं को बिना लवण मिले आहार न दें " ,
            "पशु आहार में मुख्य लवण/विटामिन की उपलब्धता को सुनिश्चित करें ",
            "खनिज-लवण पशुओं को अलग से न दें " ,
            "टीकाकरण सही एवं योजनाबद्ध तरीके से करें ताकि दो टीकों में अन्तराल बना रहे ",
            "कोई भी पशु टीकाकरण से न छूटे " ,
            "टीकाकरण करते समय दिनांक/बैच नम्बर अवश्य लिख लें",
            "पहले से संक्रमित/पीड़ित पशु का टीकाकरण न करें। ठीक होने के बाद टीकाकरण किया जा सकता है " ,
            "संक्रमित/पीड़ित पशु को तुरंत अलग करके उसका उपचार करना चाहिए ",
            "संक्रमित पशु का इलाज पशु-चिकित्सक की सलाह के बिना नहीं करना चाहिए " ,
            "टीके को फ्रिज में रखकर उचित समय पर टीकाकरण करना चाहिए",
            "टीकाकरण पुरानी सुई से न करें  " ,
            "अच्छी कोटी का चूना खरीदें ताकि उसका उचित उपयोग व फायदा मिल सके",
            "कम्पनी से दिया हुआ या जरूरत से कम कीटाणुनाशक का उपयोग न करें " ,
            "कीटाणुनाशक अच्छी कम्पनी का खरीदें ताकि उचित फायदा मिल सके",
            "ब्लीचिंग पाउडर का उपयोग बाड़े में पशुओं के रहते नही करना चाहिए",

            " शूकर फार्म के दैनिक कार्यक्रम " ,
            "अलग-अलग आयु के पशु अलग-अलग बाड़ों में रखने चाहिए ताकि आपस में झगड़ा न कर सकें ",
            "बाड़े के अन्दर कोई लोहे का टुकड़ा, नट, बोल्ट या पत्थर का टुकड़ा नहीं छोड़ना चाहिए " ,
            "पशु आहार या दाना कम से कम दिन में दो बार दिया जाना चाहिये ताकि पशु व्यस्त रहे ",
            "बुरी आदत वाले पशुओं को बाड़े में दूसरे पशुओं के साथ न छोड़ें " ,
            "प्रतिदिन फार्म में जाकर एक नजर पशुओं को अवश्य देखें ",
            "फार्म के कर्मचारियों द्वारा बतायी बातों पर पूर्ण रूप से निर्भर न रहें " ,
            "अनुपयोगी पदार्थ जैसे सीरिंज, कवर, पुरानी खाली शीशियाँ एक निश्चित स्थान (कूड़ेदान) में फेकें  ",
            "किसी भी बीमार पशु में शुरूआत में दिखे लक्षणों को अनदेखा न करें " ,
            "पहचान चिन्ह अल्प आयु पर ही लगाना चाहिए",
            "आँकड़ों के रिकार्ड करने का कार्य स्थगित न करें " ,
            "कम से कम ब्रीडिंग रिकार्ड रखना चाहिए ",
            "कोई भी रिकार्ड कच्ची पर्ची में लिखकर नही रखना चाहिए " ,
            "शूकर के गोबर को उपयोग में लाने के लिए फार्म के किनारे पर दो गढ्ढे बनाने चाहिए ",
            "शूकर का गोबर फार्म के इधर उधर न फेकें ताकि दुर्गंध न फैले " ,
            "  शूकर सह मत्स्य पालन " ,
            "शूकर सह मत्स्य पालन पूरी जानकारी लेने के बाद ही खोलें ",
            "शूकर का मलवा सीधे तलाब में न छोडें " ,
            "तालाब में मछलियों की संख्या सूकरों की संख्या के आधार पर निर्धारित करें ",
            "शूकर का बाड़ा तालाब के बिल्कुल किनारे पर न बनायें " ,
            " शूकरों की बिक्री " ,
            "शूकरों को सही समय पर बेचें ताकि उचित मूल्य मिल सके",
            "मजबूरी में जल्दी या असामयिक सस्ते शावक न बेचें " ,
            "प्रजनन ऐसे समय करायें जिस समय अधिक मांग हो और उचित मूल्य मिल सके ",
            "शूकर खरीदने वाले आदमी बार-बार न बदलें ",
            "अलग-अलग आयु वर्ग के पशुओं को एक ही ट्रक में ले जाने के लिए पार्टीशन की आवश्यकता पड़ती है ",
            "पैर बांधकर एक दो पशुओं को बड़े ट्रक में न ले जायें " ,
            "परिवहन से पूर्व पशु को पर्याप्त मात्रा में पानी देना चाहिए ","परिवहन से पूर्व भरपेट आहार नहीं देना चाहिए " ,
            "वाहन के किनारों पर कोई धारदार सतह नही होनी चाहिए, जो पशुओं को घायल कर सके ",
            "पशुओं को चढ़ाने के बाद ट्रक को पूरा त्रिपाल से नहीं ढकना चाहिए " ,
            "शूकर को वध शाला भेजने से 12 घंटे पहले कुछ नहीं खिलाना चाहिए",
            "80 किग्रा से कम वजन के पशुओं को वधशाला नहीं भेजना चाहिए " ,
            "साल में बिकने वाले शूकरों की योजना पहले से बनानी चाहिए " ,
            " शूकर का वध फार्म के अंदर नहीं करना चाहिये"


    };


    public String [] to_be_used;

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
    TextView text80;
    TextView text81;
    TextView text82;
    TextView text83;
    TextView text84;
    TextView text85;
    TextView text86;
    TextView text87;
    TextView text88;
    TextView text89;
    TextView text90;

    TextView text91;
    TextView text92;
    TextView text93;
    TextView text94;
    TextView text95;
    TextView text96;
    TextView text97;
    TextView text98;
    TextView text99;
    TextView text100;

    TextView text101;
    TextView text102;
    TextView text103;
    TextView text104;
    TextView text105;
    TextView text106;
    TextView text107;
    TextView text108;
    TextView text109;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tweleve_fragment_layout, container, false);

        to_be_used=hindi.clone();


        getActivity().setTitle(to_be_used[0]);


        text1=(TextView)view.findViewById(R.id.text1);
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
        text27=(TextView)view.findViewById(R.id.text27);
        text28=(TextView)view.findViewById(R.id.text28);
        text29=(TextView)view.findViewById(R.id.text29);
        text30=(TextView)view.findViewById(R.id.text30);

        text31=(TextView)view.findViewById(R.id.text31);
        text32=(TextView)view.findViewById(R.id.text32);
        text33=(TextView)view.findViewById(R.id.text33);
        text34=(TextView)view.findViewById(R.id.text34);
        text35=(TextView)view.findViewById(R.id.text35);
        text36=(TextView)view.findViewById(R.id.text36);
        text37=(TextView)view.findViewById(R.id.text37);
        text38=(TextView)view.findViewById(R.id.text38);
        text39=(TextView)view.findViewById(R.id.text39);
        text40=(TextView)view.findViewById(R.id.text40);

        text41=(TextView)view.findViewById(R.id.text41);
        text42=(TextView)view.findViewById(R.id.text42);
        text43=(TextView)view.findViewById(R.id.text43);
        text44=(TextView)view.findViewById(R.id.text44);
        text45=(TextView)view.findViewById(R.id.text45);
        text46=(TextView)view.findViewById(R.id.text46);
        text47=(TextView)view.findViewById(R.id.text47);
        text48=(TextView)view.findViewById(R.id.text48);
        text49=(TextView)view.findViewById(R.id.text49);
        text50=(TextView)view.findViewById(R.id.text50);

        text51=(TextView)view.findViewById(R.id.text51);
        text52=(TextView)view.findViewById(R.id.text52);
        text53=(TextView)view.findViewById(R.id.text53);
        text54=(TextView)view.findViewById(R.id.text54);
        text55=(TextView)view.findViewById(R.id.text55);
        text56=(TextView)view.findViewById(R.id.text56);
        text57=(TextView)view.findViewById(R.id.text57);
        text58=(TextView)view.findViewById(R.id.text58);
        text59=(TextView)view.findViewById(R.id.text59);
        text60=(TextView)view.findViewById(R.id.text60);

        text61=(TextView)view.findViewById(R.id.text61);
        text62=(TextView)view.findViewById(R.id.text62);
        text63=(TextView)view.findViewById(R.id.text63);
        text64=(TextView)view.findViewById(R.id.text64);
        text65=(TextView)view.findViewById(R.id.text65);
        text66=(TextView)view.findViewById(R.id.text66);
        text67=(TextView)view.findViewById(R.id.text67);
        text68=(TextView)view.findViewById(R.id.text68);
        text69=(TextView)view.findViewById(R.id.text69);
        text70=(TextView)view.findViewById(R.id.text70);

        text71=(TextView)view.findViewById(R.id.text71);
        text72=(TextView)view.findViewById(R.id.text72);
        text73=(TextView)view.findViewById(R.id.text73);
        text74=(TextView)view.findViewById(R.id.text74);
        text75=(TextView)view.findViewById(R.id.text75);
        text76=(TextView)view.findViewById(R.id.text76);
        text77=(TextView)view.findViewById(R.id.text77);
        text78=(TextView)view.findViewById(R.id.text78);
        text79=(TextView)view.findViewById(R.id.text79);
        text80=(TextView)view.findViewById(R.id.text80);

        text81=(TextView)view.findViewById(R.id.text81);
        text82=(TextView)view.findViewById(R.id.text82);
        text83=(TextView)view.findViewById(R.id.text83);
        text84=(TextView)view.findViewById(R.id.text84);
        text85=(TextView)view.findViewById(R.id.text85);
        text86=(TextView)view.findViewById(R.id.text86);
        text87=(TextView)view.findViewById(R.id.text87);
        text88=(TextView)view.findViewById(R.id.text88);
        text89=(TextView)view.findViewById(R.id.text89);
        text90=(TextView)view.findViewById(R.id.text90);

        text91=(TextView)view.findViewById(R.id.text91);
        text92=(TextView)view.findViewById(R.id.text92);
        text93=(TextView)view.findViewById(R.id.text93);
        text94=(TextView)view.findViewById(R.id.text94);
        text95=(TextView)view.findViewById(R.id.text95);
        text96=(TextView)view.findViewById(R.id.text96);
        text97=(TextView)view.findViewById(R.id.text97);
        text98=(TextView)view.findViewById(R.id.text98);
        text99=(TextView)view.findViewById(R.id.text99);
        text100=(TextView)view.findViewById(R.id.text100);

        text101=(TextView)view.findViewById(R.id.text101);
        text102=(TextView)view.findViewById(R.id.text102);
        text103=(TextView)view.findViewById(R.id.text103);
        text104=(TextView)view.findViewById(R.id.text104);
        text105=(TextView)view.findViewById(R.id.text105);
        text106=(TextView)view.findViewById(R.id.text106);
        text107=(TextView)view.findViewById(R.id.text107);
        text108=(TextView)view.findViewById(R.id.text108);
        text109=(TextView)view.findViewById(R.id.text109);
      //  text110=(TextView)view.findViewById(R.id.text110);



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
        text80.setText(to_be_used[80]);
        text81.setText(to_be_used[81]);
        text82.setText(to_be_used[82]);
        text83.setText(to_be_used[83]);
        text84.setText(to_be_used[84]);
        text85.setText(to_be_used[85]);
        text86.setText(to_be_used[86]);
        text87.setText(to_be_used[87]);
        text88.setText(to_be_used[88]);
        text89.setText(to_be_used[89]);
        text90.setText(to_be_used[90]);
        text91.setText(to_be_used[91]);
        text92.setText(to_be_used[92]);
        text93.setText(to_be_used[93]);
        text94.setText(to_be_used[94]);
        text95.setText(to_be_used[95]);
        text96.setText(to_be_used[96]);
        text97.setText(to_be_used[97]);
        text98.setText(to_be_used[98]);
        text99.setText(to_be_used[99]);
        text100.setText(to_be_used[100]);
        text101.setText(to_be_used[101]);
        text102.setText(to_be_used[102]);
        text103.setText(to_be_used[103]);
        text104.setText(to_be_used[104]);
        text105.setText(to_be_used[105]);
        text106.setText(to_be_used[106]);
        text107.setText(to_be_used[107]);
        text108.setText(to_be_used[108]);
        text109.setText(to_be_used[109]);


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
        text80.setTextColor(Color.parseColor("#FF2D2B2C"));
        text81.setTextColor(Color.parseColor("#FF2D2B2C"));
        text82.setTextColor(Color.parseColor("#FF2D2B2C"));
        text83.setTextColor(Color.parseColor("#FF2D2B2C"));
        text84.setTextColor(Color.parseColor("#FF2D2B2C"));
        text85.setTextColor(Color.parseColor("#FF2D2B2C"));
        text86.setTextColor(Color.parseColor("#FF2D2B2C"));
        text87.setTextColor(Color.parseColor("#FF2D2B2C"));
        text88.setTextColor(Color.parseColor("#FF2D2B2C"));
        text89.setTextColor(Color.parseColor("#FF2D2B2C"));
        text90.setTextColor(Color.parseColor("#FF2D2B2C"));
        text91.setTextColor(Color.parseColor("#FF2D2B2C"));
        text92.setTextColor(Color.parseColor("#FF2D2B2C"));
        text93.setTextColor(Color.parseColor("#FF2D2B2C"));
        text94.setTextColor(Color.parseColor("#FF2D2B2C"));
        text95.setTextColor(Color.parseColor("#FF2D2B2C"));
        text96.setTextColor(Color.parseColor("#FF2D2B2C"));
        text97.setTextColor(Color.parseColor("#FF2D2B2C"));
        text98.setTextColor(Color.parseColor("#FF2D2B2C"));
        text99.setTextColor(Color.parseColor("#FF2D2B2C"));
        text100.setTextColor(Color.parseColor("#FF2D2B2C"));
        text101.setTextColor(Color.parseColor("#FF2D2B2C"));
        text102.setTextColor(Color.parseColor("#FF2D2B2C"));
        text103.setTextColor(Color.parseColor("#FF2D2B2C"));
        text104.setTextColor(Color.parseColor("#FF2D2B2C"));
        text105.setTextColor(Color.parseColor("#FF2D2B2C"));
        text106.setTextColor(Color.parseColor("#FF2D2B2C"));
        text107.setTextColor(Color.parseColor("#FF2D2B2C"));
        text108.setTextColor(Color.parseColor("#FF2D2B2C"));
        text109.setTextColor(Color.parseColor("#FF2D2B2C"));


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
        text80.setTextSize(20);
        text81.setTextSize(20);
        text82.setTextSize(20);
        text83.setTextSize(20);
        text84.setTextSize(20);
        text85.setTextSize(20);
        text86.setTextSize(20);
        text87.setTextSize(20);
        text88.setTextSize(20);
        text89.setTextSize(20);
        text90.setTextSize(20);
        text91.setTextSize(20);
        text92.setTextSize(20);
        text93.setTextSize(20);
        text94.setTextSize(20);
        text95.setTextSize(20);
        text96.setTextSize(20);
        text97.setTextSize(20);
        text98.setTextSize(20);
        text99.setTextSize(20);
        text100.setTextSize(20);
        text101.setTextSize(20);
        text102.setTextSize(20);
        text103.setTextSize(20);
        text104.setTextSize(20);
        text105.setTextSize(20);
        text106.setTextSize(20);
        text107.setTextSize(20);
        text108.setTextSize(20);
        text109.setTextSize(20);


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
        Justification.justify(text80);

        Justification.justify(text81);
        Justification.justify(text82);
        Justification.justify(text83);
        Justification.justify(text84);
        Justification.justify(text85);
        Justification.justify(text86);
        Justification.justify(text87);
        Justification.justify(text88);
        Justification.justify(text89);
        Justification.justify(text90);

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

        Justification.justify(text91);
        Justification.justify(text92);
        Justification.justify(text93);
        Justification.justify(text94);
        Justification.justify(text95);
        Justification.justify(text96);
        Justification.justify(text97);
        Justification.justify(text98);
        Justification.justify(text99);
        Justification.justify(text100);

        Justification.justify(text101);
        Justification.justify(text102);
        Justification.justify(text103);
        Justification.justify(text104);
        Justification.justify(text105);
        Justification.justify(text106);
        Justification.justify(text107);
        Justification.justify(text108);
        Justification.justify(text109);







        return view;
    }
}
*/


/**
 * Created by akmu on 12/16/2017.
 */

public class tweleve_fragment extends Fragment {

    public tweleve_fragment(){

    }

    public String [] hindi={
            "शूकर पालन एप्प",
            "क्या करें, क्या न करें " ,
            // "क्या करें    (✓)\tक्या न करें   (☓)" ,
            " शूकर पालन परिचय " ,
            "क्या करें : अपनी परिस्थिति को देखकर शूकर फार्म खोले ",
            "दूसरों को देखकर तुरंत शूकर फार्म खोलने की कोशिश न करें " ,
            "क्या करें : पशुओं की संख्या अपनी क्षमता के हिसाब से एवं बिक्री के हिसाब से सुनिश्चित करें ",
            "फार्म को आबादी के करीब एवं ऐसी जगह नही खोलना चाहिए जहाॅं अपशिष्ट पदार्थ निकालने की व्यवस्था न हो " ,
            "क्या करें : फार्म की परियोजना आर्थिक स्थिति पर निर्भर करनी चाहिए ",
            "बिना ट्रेनिंग लिए प्रोजेक्ट नही बनाना चाहिए " ,
            "क्या करें : परियोजना की तकनीकी एवं आर्थिक जानकारी बैंक प्रोफार्मा के हिसाब से होनी चाहिए ",
            "शूूकर फार्म बिना ट्रेनिंग लिए न खोलें " ,

            "  शूकरों का चुनाव एवं प्रजनन " ,
            "क्या करें : पशु परिचित फार्म से तथा अच्छी नस्ल के गुण वाले खरीदने चाहिए ",
            "एक ही समय में दो फार्म से पशु न खरीदें " ,
            "क्या करें : नस्ल का चुनाव अपने क्षेत्र की जलवायु के अनुसार करना चाहिए",
            "एक फाॅर्म में अलग-अलग नस्लों के पशुओं को न रखें " ,
            "क्या करें : अपने फार्म के लिए सही नर का चयन करना चाहिए तथा नस्ल की सुधार के लिए सही प्रजनन तरीकों को अपनाना चाहिए ",
            "अच्छा नर 3 वर्षो से अधिक प्रजनन के लिए प्रयोग नहीं करना चाहिए तथा 1 नर 1 वर्ष में केवल 10 मादाओं पर ही प्रयोग करना चाहिए " ,
            "क्या करें : नर शूकरों को जानकारी वाले फार्मो से ही खरीदना चाहिए साथ ही खरीदते समय संभव हो सके तो नर शूकर की लगभग तीन पीढ़ी की जानकारी लेनी चाहिए",
            "दो नरों को एक साथ एक बाड़े में नहीं रखना चाहिए " ,
            "प्रजनन सुबह एवं शाम के समय ही कराना चाहिए",
            "जुलाई-अगस्त में प्रजनन न करायें ताकि प्रसव सर्दी में न हो।?" ,
            "मादा ब्याने से एक दो दिन पहले पुआल को बिछाना चाहिए ",
            "पिछली ब्याॅत में जिस मादा ने दूध उत्पादन न किया हो उसे हटा देना चाहिए " ,

            " आवास प्रबन्धन " ,
            "सफाई की दृष्टि से फर्श पक्का हो (सीमेन्ट या खंड़जा)",
            "अलग-अलग आयु वर्गो के शूकरो को एक साथ बड़े बाडे़ में नही रखना चाहिए " ,
            " आहार व्यवस्था " ,
            "फार्म के प्रजनक पशुओं को हमेशा संतुलित आहार ही दें " ,
            "वृद्धिशील शूकरों के संतुलित आहार में किसी भी हालत में क्रूड प्रोटीन 12% से कम नहीं होनी चाहिये " ,
            "पशुओं के आहार का मूल्य कम करने के लिये खल तथा मक्का की मात्रा को ज्यादा कम न करें " ,
            "शूकरों को राशन सुबह और शाम देना चाहिए",
            "फफूॅंदी लगा राशन नही खिलाना चाहिए " ,
            "हरा चारा हमेशा साबुत देना चाहिए ",
            "एक पशु को हरा चारा 5 किलो से अधिक नहीं देना चाहिए " ,
            " शूकरों का रख-रखाव " ,
            "आयरन, बी काम्पलेक्स इन्जेक्शन बच्चों को देना चाहिए ",
            " नुकीले दांत को सादा कैची से न काटें " ,
            "वीनिंग 6 से 8 सप्ताह के बीच करनी चाहिए",
            "प्रसव के बाद मादा को पहली ऋतुकाल में प्रजनन नहीं कराना चाहिए " ,
            "बधियाकरण एक महीने के अन्दर करना चाहिए",
            "कमजोर एवं दस्त करने वाले बच्चों को नजरंदाज न करें " ,
            "बच्चों का बधियाकरण अधिक सर्दी के मौसम में जहाँ तक संभव हो न करायें ।",
            "एक बाड़े में दो मादाओं को बच्चों के साथ न रखें। " ,
            "पानी बचाने के लिए फव्वारा लगाया जा सकता है " ,
            " यदि तालाब की व्यवस्था है तो बीमार पशुु को तालाब में न छोड़े एवं तालाब में गंदा पानी न छोड़ें " ,
            "ब्याने वाली मादा के बाड़ें में शावकों के लिए एक सप्ताह तक हीटर लगाया जा सकता है",
            "बेहतर होगा प्रसव अधिकठंड मे न हो " ,

            " शूकर रोग एवं नियंत्रण " ,
            "फार्म के किसी भी पशु में बीमारी के लक्षण दिखने पर शरीर का तापमान लेना चाहिए",
            "बिना पशु-चिकित्सक की सलाह के किसी भी दवा का प्रयोग न करें  " ,
            "जिन पशुओं में बुखार आया हो उनमें ही एन्टीबायोटिक्स का प्रयोग करना चाहिए ",
            "सीरेंज को केवल एक बार प्रयोग करें " ,
            "निर्धारित समय पर परजीवियों की दवाई लगाये",
            "जरूरत से ज्यादा मात्रा एवं बिना कारण बार-बार दवा न दें " ,
            "संदेह की स्थिति में पशु गोबर की जाँच करायें",
            "पशु को दवा देना न भूलें " ,
            "मादा पशु निर्धारित समय पर न ब्याये तो पशु-चिकित्सक की सलाह लें",
            "गर्भपात हुए मादा को तुरंत अन्य पशुओं के साथ न मिलायें " ,
            "प्रसव से संबंधित रोगों का इलाज पशु-चिकित्सक से करायें",
            "मादाओं में प्रसव संबंधित शिकायत आने पर सम्बन्धित नर का प्रयोग प्रजनन में न करें  " +
                    "आयोडीनरहित नमक, लवण-मिश्रण पशु आहार में मिलायें ",
            "लम्बे समय तक पशुओं को बिना लवण मिले आहार न दें " ,
            "पशु आहार में मुख्य लवण/विटामिन की उपलब्धता को सुनिश्चित करें ",
            "खनिज-लवण पशुओं को अलग से न दें " ,
            "टीकाकरण सही एवं योजनाबद्ध तरीके से करें ताकि दो टीकों में अन्तराल बना रहे ",
            "कोई भी पशु टीकाकरण से न छूटे " ,
            "टीकाकरण करते समय दिनांक/बैच नम्बर अवश्य लिख लें",
            "पहले से संक्रमित/पीड़ित पशु का टीकाकरण न करें। ठीक होने के बाद टीकाकरण किया जा सकता है " ,
            "संक्रमित/पीड़ित पशु को तुरंत अलग करके उसका उपचार करना चाहिए ",
            "संक्रमित पशु का इलाज पशु-चिकित्सक की सलाह के बिना नहीं करना चाहिए " ,
            "टीके को फ्रिज में रखकर उचित समय पर टीकाकरण करना चाहिए",
            "टीकाकरण पुरानी सुई से न करें  " ,
            "अच्छी कोटी का चूना खरीदें ताकि उसका उचित उपयोग व फायदा मिल सके",
            "कम्पनी से दिया हुआ या जरूरत से कम कीटाणुनाशक का उपयोग न करें " ,
            "कीटाणुनाशक अच्छी कम्पनी का खरीदें ताकि उचित फायदा मिल सके",
            "ब्लीचिंग पाउडर का उपयोग बाड़े में पशुओं के रहते नही करना चाहिए",

            " शूकर फार्म के दैनिक कार्यक्रम " ,
            "अलग-अलग आयु के पशु अलग-अलग बाड़ों में रखने चाहिए ताकि आपस में झगड़ा न कर सकें ",
            "बाड़े के अन्दर कोई लोहे का टुकड़ा, नट, बोल्ट या पत्थर का टुकड़ा नहीं छोड़ना चाहिए " ,
            "पशु आहार या दाना कम से कम दिन में दो बार दिया जाना चाहिये ताकि पशु व्यस्त रहे ",
            "बुरी आदत वाले पशुओं को बाड़े में दूसरे पशुओं के साथ न छोड़ें " ,
            "प्रतिदिन फार्म में जाकर एक नजर पशुओं को अवश्य देखें ",
            "फार्म के कर्मचारियों द्वारा बतायी बातों पर पूर्ण रूप से निर्भर न रहें " ,
            "अनुपयोगी पदार्थ जैसे सीरिंज, कवर, पुरानी खाली शीशियाँ एक निश्चित स्थान (कूड़ेदान) में फेकें  ",
            "किसी भी बीमार पशु में शुरूआत में दिखे लक्षणों को अनदेखा न करें " ,
            "पहचान चिन्ह अल्प आयु पर ही लगाना चाहिए",
            "आँकड़ों के रिकार्ड करने का कार्य स्थगित न करें " ,
            "कम से कम ब्रीडिंग रिकार्ड रखना चाहिए ",
            "कोई भी रिकार्ड कच्ची पर्ची में लिखकर नही रखना चाहिए " ,
            "शूकर के गोबर को उपयोग में लाने के लिए फार्म के किनारे पर दो गढ्ढे बनाने चाहिए ",
            "शूकर का गोबर फार्म के इधर उधर न फेकें ताकि दुर्गंध न फैले " ,
            "  शूकर सह मत्स्य पालन " ,
            "शूकर सह मत्स्य पालन पूरी जानकारी लेने के बाद ही खोलें ",
            "शूकर का मलवा सीधे तलाब में न छोडें " ,
            "तालाब में मछलियों की संख्या सूकरों की संख्या के आधार पर निर्धारित करें ",
            "शूकर का बाड़ा तालाब के बिल्कुल किनारे पर न बनायें " ,
            " शूकरों की बिक्री " ,
            "शूकरों को सही समय पर बेचें ताकि उचित मूल्य मिल सके",
            "मजबूरी में जल्दी या असामयिक सस्ते शावक न बेचें " ,
            "प्रजनन ऐसे समय करायें जिस समय अधिक मांग हो और उचित मूल्य मिल सके ",
            "शूकर खरीदने वाले आदमी बार-बार न बदलें ",
            "अलग-अलग आयु वर्ग के पशुओं को एक ही ट्रक में ले जाने के लिए पार्टीशन की आवश्यकता पड़ती है ",
            "पैर बांधकर एक दो पशुओं को बड़े ट्रक में न ले जायें " ,
            "परिवहन से पूर्व पशु को पर्याप्त मात्रा में पानी देना चाहिए ","परिवहन से पूर्व भरपेट आहार नहीं देना चाहिए " ,
            "वाहन के किनारों पर कोई धारदार सतह नही होनी चाहिए, जो पशुओं को घायल कर सके ",
            "पशुओं को चढ़ाने के बाद ट्रक को पूरा त्रिपाल से नहीं ढकना चाहिए " ,
            "शूकर को वध शाला भेजने से 12 घंटे पहले कुछ नहीं खिलाना चाहिए",
            "80 किग्रा से कम वजन के पशुओं को वधशाला नहीं भेजना चाहिए " ,
            "साल में बिकने वाले शूकरों की योजना पहले से बनानी चाहिए " ,
            " शूकर का वध फार्म के अंदर नहीं करना चाहिये"
    };

    public String [] hindi1={
            "शूकर पालन एप्प",
            "क्या करें    " ,
            "क्या न करें  " ,

            "शूकर पालन परिचय " ,//3
            "अपनी परिस्थिति को देखकर शूकर फार्म खोले ",
            "दूसरों को देखकर तुरंत शूकर फार्म खोलने की कोशिश न करें " ,
            "पशुओं की संख्या अपनी क्षमता के हिसाब से एवं बिक्री के हिसाब से सुनिश्चित करें ",
            "फार्म को आबादी के करीब एवं ऐसी जगह नही खोलना चाहिए जहाॅं अपशिष्ट पदार्थ निकालने की व्यवस्था न हो " ,
            "फार्म की परियोजना आर्थिक स्थिति पर निर्भर करनी चाहिए ",
            "बिना ट्रेनिंग लिए प्रोजेक्ट नही बनाना चाहिए " ,
            "परियोजना की तकनीकी एवं आर्थिक जानकारी बैंक प्रोफार्मा के हिसाब से होनी चाहिए ",
            "शूूकर फार्म बिना ट्रेनिंग लिए न खोलें " ,

            "शूकरों का चुनाव एवं प्रजनन " ,//12
            "पशु परिचित फार्म से तथा अच्छी नस्ल के गुण वाले खरीदने चाहिए ",
            "एक ही समय में दो फार्म से पशु न खरीदें " ,
            "नस्ल का चुनाव अपने क्षेत्र की जलवायु के अनुसार करना चाहिए",
            "एक फाॅर्म में अलग-अलग नस्लों के पशुओं को न रखें " ,
            "अपने फार्म के लिए सही नर का चयन करना चाहिए तथा नस्ल की सुधार के लिए सही प्रजनन तरीकों को अपनाना चाहिए ",
            "अच्छा नर 3 वर्षो से अधिक प्रजनन के लिए प्रयोग नहीं करना चाहिए तथा 1 नर 1 वर्ष में केवल 10 मादाओं पर ही प्रयोग करना चाहिए " ,
            "नर शूकरों को जानकारी वाले फार्मो से ही खरीदना चाहिए साथ ही खरीदते समय संभव हो सके तो नर शूकर की लगभग तीन पीढ़ी की जानकारी लेनी चाहिए",
            "दो नरों को एक साथ एक बाड़े में नहीं रखना चाहिए " ,
            "प्रजनन सुबह एवं शाम के समय ही कराना चाहिए",
            "जुलाई-अगस्त में प्रजनन न करायें ताकि प्रसव सर्दी में न हो।?" ,
            "मादा ब्याने से एक दो दिन पहले पुआल को बिछाना चाहिए ",
            "पिछली ब्याॅत में जिस मादा ने दूध उत्पादन न किया हो उसे हटा देना चाहिए " ,//24

            "आवास प्रबन्धन " ,//25
            "सफाई की दृष्टि से फर्श पक्का हो (सीमेन्ट या खंड़जा)",
            "अलग-अलग आयु वर्गो के शूकरो को एक साथ बड़े बाडे़ में नही रखना चाहिए " ,

            "आहार व्यवस्था " ,//28
            "फार्म के प्रजनक पशुओं को हमेशा संतुलित आहार ही दें " ,
            "वृद्धिशील शूकरों के संतुलित आहार में किसी भी हालत में क्रूड प्रोटीन 12% से कम नहीं होनी चाहिये | पशुओं के आहार का मूल्य कम करने के लिये खल तथा मक्का की मात्रा को ज्यादा कम न करें |" ,
            // "पशुओं के आहार का मूल्य कम करने के लिये खल तथा मक्का की मात्रा को ज्यादा कम न करें " ,
            "शूकरों को राशन सुबह और शाम देना चाहिए",
            "फफूॅंदी लगा राशन नही खिलाना चाहिए " ,
            "हरा चारा हमेशा साबुत देना चाहिए ",
            "एक पशु को हरा चारा 5 किलो से अधिक नहीं देना चाहिए " ,

            " शूकरों का रख-रखाव " ,//35
            "आयरन, बी काम्पलेक्स इन्जेक्शन बच्चों को देना चाहिए ",
            " नुकीले दांत को सादा कैची से न काटें " ,
            "वीनिंग 6 से 8 सप्ताह के बीच करनी चाहिए",
            "प्रसव के बाद मादा को पहली ऋतुकाल में प्रजनन नहीं कराना चाहिए " ,
            "बधियाकरण एक महीने के अन्दर करना चाहिए",
            "कमजोर एवं दस्त करने वाले बच्चों को नजरंदाज न करें " ,
            "बच्चों का बधियाकरण अधिक सर्दी के मौसम में जहाँ तक संभव हो न करायें ।",
            "एक बाड़े में दो मादाओं को बच्चों के साथ न रखें। " ,
            "पानी बचाने के लिए फव्वारा लगाया जा सकता है " ,
            " यदि तालाब की व्यवस्था है तो बीमार पशुु को तालाब में न छोड़े एवं तालाब में गंदा पानी न छोड़ें " ,
            "ब्याने वाली मादा के बाड़ें में शावकों के लिए एक सप्ताह तक हीटर लगाया जा सकता है",
            "बेहतर होगा प्रसव अधिकठंड मे न हो " ,//47

            " शूकर रोग एवं नियंत्रण " ,//48
            "फार्म के किसी भी पशु में बीमारी के लक्षण दिखने पर शरीर का तापमान लेना चाहिए",
            "बिना पशु-चिकित्सक की सलाह के किसी भी दवा का प्रयोग न करें  " ,

            "जिन पशुओं में बुखार आया हो उनमें ही एन्टीबायोटिक्स का प्रयोग करना चाहिए ",
            "सीरेंज को केवल एक बार प्रयोग करें " ,

            "निर्धारित समय पर परजीवियों की दवाई लगाये",
            "जरूरत से ज्यादा मात्रा एवं बिना कारण बार-बार दवा न दें " ,

            "संदेह की स्थिति में पशु गोबर की जाँच करायें",
            "पशु को दवा देना न भूलें " ,

            "मादा पशु निर्धारित समय पर न ब्याये तो पशु-चिकित्सक की सलाह लें",
            "गर्भपात हुए मादा को तुरंत अन्य पशुओं के साथ न मिलायें " ,

            "प्रसव से संबंधित रोगों का इलाज पशु-चिकित्सक से करायें",
            "मादाओं में प्रसव संबंधित शिकायत आने पर सम्बन्धित नर का प्रयोग प्रजनन में न करें  " ,

            "आयोडीनरहित नमक, लवण-मिश्रण पशु आहार में मिलायें ",
            "लम्बे समय तक पशुओं को बिना लवण मिले आहार न दें " ,

            "पशु आहार में मुख्य लवण/विटामिन की उपलब्धता को सुनिश्चित करें ",
            "खनिज-लवण पशुओं को अलग से न दें " ,

            "टीकाकरण सही एवं योजनाबद्ध तरीके से करें ताकि दो टीकों में अन्तराल बना रहे ",
            "कोई भी पशु टीकाकरण से न छूटे " ,

            "टीकाकरण करते समय दिनांक/बैच नम्बर अवश्य लिख लें",
            "पहले से संक्रमित/पीड़ित पशु का टीकाकरण न करें। ठीक होने के बाद टीकाकरण किया जा सकता है " ,

            "संक्रमित/पीड़ित पशु को तुरंत अलग करके उसका उपचार करना चाहिए ",
            "संक्रमित पशु का इलाज पशु-चिकित्सक की सलाह के बिना नहीं करना चाहिए " ,

            "टीके को फ्रिज में रखकर उचित समय पर टीकाकरण करना चाहिए",
            "टीकाकरण पुरानी सुई से न करें  " ,

            "अच्छी कोटी का चूना खरीदें ताकि उसका उचित उपयोग व फायदा मिल सके",
            "कम्पनी से दिया हुआ या जरूरत से कम कीटाणुनाशक का उपयोग न करें " ,

            "कीटाणुनाशक अच्छी कम्पनी का खरीदें ताकि उचित फायदा मिल सके",
            "ब्लीचिंग पाउडर का उपयोग बाड़े में पशुओं के रहते नही करना चाहिए",//76

            " शूकर फार्म के दैनिक कार्यक्रम " ,//77
            "अलग-अलग आयु के पशु अलग-अलग बाड़ों में रखने चाहिए ताकि आपस में झगड़ा न कर सकें ",
            "बाड़े के अन्दर कोई लोहे का टुकड़ा, नट, बोल्ट या पत्थर का टुकड़ा नहीं छोड़ना चाहिए " ,

            "पशु आहार या दाना कम से कम दिन में दो बार दिया जाना चाहिये ताकि पशु व्यस्त रहे ",
            "बुरी आदत वाले पशुओं को बाड़े में दूसरे पशुओं के साथ न छोड़ें " ,

            "प्रतिदिन फार्म में जाकर एक नजर पशुओं को अवश्य देखें ",
            "फार्म के कर्मचारियों द्वारा बतायी बातों पर पूर्ण रूप से निर्भर न रहें " ,

            "अनुपयोगी पदार्थ जैसे सीरिंज, कवर, पुरानी खाली शीशियाँ एक निश्चित स्थान (कूड़ेदान) में फेकें  ",
            "किसी भी बीमार पशु में शुरूआत में दिखे लक्षणों को अनदेखा न करें " ,

            "पहचान चिन्ह अल्प आयु पर ही लगाना चाहिए",
            "आँकड़ों के रिकार्ड करने का कार्य स्थगित न करें " ,

            "कम से कम ब्रीडिंग रिकार्ड रखना चाहिए ",
            "कोई भी रिकार्ड कच्ची पर्ची में लिखकर नही रखना चाहिए " ,

            "शूकर के गोबर को उपयोग में लाने के लिए फार्म के किनारे पर दो गढ्ढे बनाने चाहिए ",
            "शूकर का गोबर फार्म के इधर उधर न फेकें ताकि दुर्गंध न फैले " ,

            "शूकर सह मत्स्य पालन " ,//92
            "शूकर सह मत्स्य पालन पूरी जानकारी लेने के बाद ही खोलें ",
            "शूकर का मलवा सीधे तलाब में न छोडें " ,
            "तालाब में मछलियों की संख्या सूकरों की संख्या के आधार पर निर्धारित करें ",
            "शूकर का बाड़ा तालाब के बिल्कुल किनारे पर न बनायें " ,

            "शूकरों की बिक्री " ,//97
            "शूकरों को सही समय पर बेचें ताकि उचित मूल्य मिल सके",
            "मजबूरी में जल्दी या असामयिक सस्ते शावक न बेचें " ,

            "प्रजनन ऐसे समय करायें जिस समय अधिक मांग हो और उचित मूल्य मिल सके ",
            "शूकर खरीदने वाले आदमी बार-बार न बदलें ",

            "अलग-अलग आयु वर्ग के पशुओं को एक ही ट्रक में ले जाने के लिए पार्टीशन की आवश्यकता पड़ती है ",
            "पैर बांधकर एक दो पशुओं को बड़े ट्रक में न ले जायें " ,

            "परिवहन से पूर्व पशु को पर्याप्त मात्रा में पानी देना चाहिए ",
            "परिवहन से पूर्व भरपेट आहार नहीं देना चाहिए " ,

            "वाहन के किनारों पर कोई धारदार सतह नही होनी चाहिए, जो पशुओं को घायल कर सके ",
            "पशुओं को चढ़ाने के बाद ट्रक को पूरा त्रिपाल से नहीं ढकना चाहिए " ,

            "शूकर को वध शाला भेजने से 12 घंटे पहले कुछ नहीं खिलाना चाहिए",
            "80 किग्रा से कम वजन के पशुओं को वधशाला नहीं भेजना चाहिए " ,

            "साल में बिकने वाले शूकरों की योजना पहले से बनानी चाहिए " ,
            "शूकर का वध फार्म के अंदर नहीं करना चाहिये"
    };

    public String [] to_be_used;
    public String [] to_be_used1;

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
    TextView text80;
    TextView text81;
    TextView text82;
    TextView text83;
    TextView text84;
    TextView text85;
    TextView text86;
    TextView text87;
    TextView text88;
    TextView text89;
    TextView text90;

    TextView text91;
    TextView text92;
    TextView text93;
    TextView text94;
    TextView text95;
    TextView text96;
    TextView text97;
    TextView text98;
    TextView text99;
    TextView text100;
    TextView text101;
    TextView text102;
    TextView text103;
    TextView text104;
    TextView text105;
    TextView text106;
    TextView text107;
    TextView text108;
    TextView text109;
    TextView text110;

    private WebView webViewSKA;
    String text;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tweleve_fragment_layout, container, false);

        to_be_used=hindi.clone();
        to_be_used1=hindi1.clone();


        getActivity().setTitle(to_be_used[0]);

        String crosshtml="&#x274c;";

        String tickhtml="&#10003;";


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
        text27=(TextView)view.findViewById(R.id.text27);
        text28=(TextView)view.findViewById(R.id.text28);
        text29=(TextView)view.findViewById(R.id.text29);
        text30=(TextView)view.findViewById(R.id.text30);

        text31=(TextView)view.findViewById(R.id.text31);
        text32=(TextView)view.findViewById(R.id.text32);
        text33=(TextView)view.findViewById(R.id.text33);
        text34=(TextView)view.findViewById(R.id.text34);
        text35=(TextView)view.findViewById(R.id.text35);
        text36=(TextView)view.findViewById(R.id.text36);
        text37=(TextView)view.findViewById(R.id.text37);
        text38=(TextView)view.findViewById(R.id.text38);
        text39=(TextView)view.findViewById(R.id.text39);
        text40=(TextView)view.findViewById(R.id.text40);

        text41=(TextView)view.findViewById(R.id.text41);
        text42=(TextView)view.findViewById(R.id.text42);
        text43=(TextView)view.findViewById(R.id.text43);
        text44=(TextView)view.findViewById(R.id.text44);
        text45=(TextView)view.findViewById(R.id.text45);
        text46=(TextView)view.findViewById(R.id.text46);
        text47=(TextView)view.findViewById(R.id.text47);
        text48=(TextView)view.findViewById(R.id.text48);
        text49=(TextView)view.findViewById(R.id.text49);
        text50=(TextView)view.findViewById(R.id.text50);

        text51=(TextView)view.findViewById(R.id.text51);
        text52=(TextView)view.findViewById(R.id.text52);
        text53=(TextView)view.findViewById(R.id.text53);
        text54=(TextView)view.findViewById(R.id.text54);
        text55=(TextView)view.findViewById(R.id.text55);
        text56=(TextView)view.findViewById(R.id.text56);
        text57=(TextView)view.findViewById(R.id.text57);
        text58=(TextView)view.findViewById(R.id.text58);
        text59=(TextView)view.findViewById(R.id.text59);
        text60=(TextView)view.findViewById(R.id.text60);

        text61=(TextView)view.findViewById(R.id.text61);
        text62=(TextView)view.findViewById(R.id.text62);
        text63=(TextView)view.findViewById(R.id.text63);
        text64=(TextView)view.findViewById(R.id.text64);
        text65=(TextView)view.findViewById(R.id.text65);
        text66=(TextView)view.findViewById(R.id.text66);
        text67=(TextView)view.findViewById(R.id.text67);
        text68=(TextView)view.findViewById(R.id.text68);
        text69=(TextView)view.findViewById(R.id.text69);
        text70=(TextView)view.findViewById(R.id.text70);

        text71=(TextView)view.findViewById(R.id.text71);
        text72=(TextView)view.findViewById(R.id.text72);
        text73=(TextView)view.findViewById(R.id.text73);
        text74=(TextView)view.findViewById(R.id.text74);
        text75=(TextView)view.findViewById(R.id.text75);
        text76=(TextView)view.findViewById(R.id.text76);
        text77=(TextView)view.findViewById(R.id.text77);
        text78=(TextView)view.findViewById(R.id.text78);
        text79=(TextView)view.findViewById(R.id.text79);
        text80=(TextView)view.findViewById(R.id.text80);

        text81=(TextView)view.findViewById(R.id.text81);
        text82=(TextView)view.findViewById(R.id.text82);
        text83=(TextView)view.findViewById(R.id.text83);
        text84=(TextView)view.findViewById(R.id.text84);
        text85=(TextView)view.findViewById(R.id.text85);
        text86=(TextView)view.findViewById(R.id.text86);
        text87=(TextView)view.findViewById(R.id.text87);
        text88=(TextView)view.findViewById(R.id.text88);
        text89=(TextView)view.findViewById(R.id.text89);
        text90=(TextView)view.findViewById(R.id.text90);

        text91=(TextView)view.findViewById(R.id.text91);
        text92=(TextView)view.findViewById(R.id.text92);
        text93=(TextView)view.findViewById(R.id.text93);
        text94=(TextView)view.findViewById(R.id.text94);
        text95=(TextView)view.findViewById(R.id.text95);
        text96=(TextView)view.findViewById(R.id.text96);
        text97=(TextView)view.findViewById(R.id.text97);
        text98=(TextView)view.findViewById(R.id.text98);
        text99=(TextView)view.findViewById(R.id.text99);
        text100=(TextView)view.findViewById(R.id.text100);

        text101=(TextView)view.findViewById(R.id.text101);
        text102=(TextView)view.findViewById(R.id.text102);
        text103=(TextView)view.findViewById(R.id.text103);
        text104=(TextView)view.findViewById(R.id.text104);
        text105=(TextView)view.findViewById(R.id.text105);
        text106=(TextView)view.findViewById(R.id.text106);
        text107=(TextView)view.findViewById(R.id.text107);
        text108=(TextView)view.findViewById(R.id.text108);
        text109=(TextView)view.findViewById(R.id.text109);
        text110=(TextView)view.findViewById(R.id.text110);



        text1.setText(to_be_used[1]);
        text1.setTextColor(Color.parseColor("#ffffff"));
        text1.setTextSize(20);
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
        text79.setText(to_be_used[79]);
        text80.setText(to_be_used[80]);
        text81.setText(to_be_used[81]);
        text82.setText(to_be_used[82]);
        text83.setText(to_be_used[83]);
        text84.setText(to_be_used[84]);
        text85.setText(to_be_used[85]);
        text86.setText(to_be_used[86]);
        text87.setText(to_be_used[87]);
        text88.setText(to_be_used[88]);
        text89.setText(to_be_used[89]);
        text90.setText(to_be_used[90]);
        text91.setText(to_be_used[91]);
        text92.setText(to_be_used[92]);
        text93.setText(to_be_used[93]);
        text94.setText(to_be_used[94]);
        text95.setText(to_be_used[95]);
        text96.setText(to_be_used[96]);
        text97.setText(to_be_used[97]);
        text98.setText(to_be_used[98]);
        text99.setText(to_be_used[99]);
        text100.setText(to_be_used[100]);
        text101.setText(to_be_used[101]);
        text102.setText(to_be_used[102]);
        text103.setText(to_be_used[103]);
        text104.setText(to_be_used[104]);
        text105.setText(to_be_used[105]);
        text106.setText(to_be_used[106]);
        text107.setText(to_be_used[107]);
        text108.setText(to_be_used[108]);
        text109.setText(to_be_used[109]);
//        text110.setText(to_be_used[110]);

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
        text80.setTextColor(Color.parseColor("#FF2D2B2C"));
        text81.setTextColor(Color.parseColor("#FF2D2B2C"));
        text82.setTextColor(Color.parseColor("#FF2D2B2C"));
        text83.setTextColor(Color.parseColor("#FF2D2B2C"));
        text84.setTextColor(Color.parseColor("#FF2D2B2C"));
        text85.setTextColor(Color.parseColor("#FF2D2B2C"));
        text86.setTextColor(Color.parseColor("#FF2D2B2C"));
        text87.setTextColor(Color.parseColor("#FF2D2B2C"));
        text88.setTextColor(Color.parseColor("#FF2D2B2C"));
        text89.setTextColor(Color.parseColor("#FF2D2B2C"));
        text90.setTextColor(Color.parseColor("#FF2D2B2C"));
        text91.setTextColor(Color.parseColor("#FF2D2B2C"));
        text92.setTextColor(Color.parseColor("#FF2D2B2C"));
        text93.setTextColor(Color.parseColor("#FF2D2B2C"));
        text94.setTextColor(Color.parseColor("#FF2D2B2C"));
        text95.setTextColor(Color.parseColor("#FF2D2B2C"));
        text96.setTextColor(Color.parseColor("#FF2D2B2C"));
        text97.setTextColor(Color.parseColor("#FF2D2B2C"));
        text98.setTextColor(Color.parseColor("#FF2D2B2C"));
        text99.setTextColor(Color.parseColor("#FF2D2B2C"));
        text100.setTextColor(Color.parseColor("#FF2D2B2C"));
        text101.setTextColor(Color.parseColor("#FF2D2B2C"));
        text102.setTextColor(Color.parseColor("#FF2D2B2C"));
        text103.setTextColor(Color.parseColor("#FF2D2B2C"));
        text104.setTextColor(Color.parseColor("#FF2D2B2C"));
        text105.setTextColor(Color.parseColor("#FF2D2B2C"));
        text106.setTextColor(Color.parseColor("#FF2D2B2C"));
        text107.setTextColor(Color.parseColor("#FF2D2B2C"));
        text108.setTextColor(Color.parseColor("#FF2D2B2C"));
        text109.setTextColor(Color.parseColor("#FF2D2B2C"));
       // text110.setTextColor(Color.parseColor("#FF2D2B2C"));

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
        text80.setTextSize(20);
        text81.setTextSize(20);
        text82.setTextSize(20);
        text83.setTextSize(20);
        text84.setTextSize(20);
        text85.setTextSize(20);
        text86.setTextSize(20);
        text87.setTextSize(20);
        text88.setTextSize(20);
        text89.setTextSize(20);
        text90.setTextSize(20);
        text91.setTextSize(20);
        text92.setTextSize(20);
        text93.setTextSize(20);
        text94.setTextSize(20);
        text95.setTextSize(20);
        text96.setTextSize(20);
        text97.setTextSize(20);
        text98.setTextSize(20);
        text99.setTextSize(20);
        text100.setTextSize(20);
        text101.setTextSize(20);
        text102.setTextSize(20);
        text103.setTextSize(20);
        text104.setTextSize(20);
        text105.setTextSize(20);
        text106.setTextSize(20);
        text107.setTextSize(20);
        text108.setTextSize(20);
        text109.setTextSize(20);*/
        // text110.setTextSize(20);

        String nodatafound="&#8226;";

        webViewSKA=(WebView)view.findViewById(R.id.webViewKKKNK);
        // bgcolor="#90caf9"
        text = "<html><body>";
        text+= "<table border=\"1px solid black\" cellpadding=\"5\" cellspacing=\"0\">";

        text+= "<tr height =10><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>"+to_be_used1[1]+"("+Html.fromHtml(tickhtml) +")"+"</h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4>" + to_be_used1[2] +"("+Html.fromHtml(crosshtml) +")"+"</h4></td></tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[3]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[4]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[5]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[6]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[7]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[8]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[9]+"</h4>";
        text+="</td>";
        text+= "</tr>";
        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[10]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[11]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[12]+"</font></h4>";
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
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[25]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[26]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[27]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[28]+"</font></h4>";
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

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[35]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[36]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[37]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[38]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[39]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[40]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[41]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[42]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[43]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[44]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[45]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[46]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[47]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[48]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[49]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[50]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[51]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[52]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[53]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[54]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[55]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[56]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[57]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[58]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[59]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[60]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[61]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[62]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[63]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[64]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[65]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[66]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[67]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[68]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[69]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[70]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[71]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[72]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[73]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[74]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[75]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[76]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[77]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[78]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[79]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[80]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[81]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[82]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[83]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[84]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[85]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[86]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[87]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[88]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[89]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[90]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[91]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[92]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[93]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[94]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[95]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[96]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4><font color=\"black\">"+ Html.fromHtml(nodatafound)+" "+to_be_used1[97]+"</font></h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[98]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[99]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[100]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[101]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[102]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[103]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[104]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[105]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[106]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[107]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[108]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[109]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[110]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[111]+"</h4>";
        text+="</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webViewSKA.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);

        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
