package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.inqbarna.tablefixheaders.adapters.BaseTableAdapter;

import java.util.ArrayList;
import java.util.List;

public class Disease_activity extends AppCompatActivity {

    public String [] hindi1={
            "रोग का नाम",//1
            "आयु",
            "मात्रा",
            "अवधि",

            "शूकर ज्वर",//4
            "3 माह पर/वीनिंग के बाद",
            "1 मिली माँस/त्वचा में ",
            "1 वर्ष",

            "खुरपका-मुँहपका",
            "वीनिंग के बाद दूसरा प्रथम के 21 दिन बाद",
            "5-10 मिली त्वचा के नीचे",
            "6 माह"
    };

    public String[] to_be_used = {
            " शूकर पालन एप्प",
            "शूकर रोग",
            " जीवाणु एवं विषाणु जनित रोग " ,
            " स्वाइन फीवर/शूकर ज्वर/हॉग  कालरा " ,
            " क्या एवं कैसे " ,
            "यह एक संक्रामक रोग है और तीव्र गति से फैलता है। वृद्ध शूकरों की अपेक्षा कम आयु के शूकरों में इस रोग की संभावना अधिक होती है यह एक विषाणु द्वारा होता है, यह बीमारी प्रायः शूकरों के गंदगी में घूमने, बिना उबाले रसोई का बचा हुआ खाना या वधशाला का मांस, आहार के रूप में देने से होता है। " ,
            " लक्षण " ,
            "भूख न लगना, उदासी, तेज बुखार, कमजोरी, लड़खड़ाना एवं पलकों का चिपक जाना । शुरूआत में कब्ज, दस्त, त्वचा पर विशेष तरह की विकृति का पाया जाना जिसमें बाल गिरना, चकत्ता बनना और शरीर की त्वचा का गहरा नीला पड़ना प्रमुख हैं।" ,
            " रोकथाम " ,
            "शूकर बाड़ों की सफाई पर विशेष ध्यान रखना चाहिए। बाड़ों व बर्तनो को संक्रमण-रहित करने की व्यवस्था होनी चाहिए। इस बीमारी से बचने के लिए शूकरों का टीकाकरण ही एकमात्र उपाय है। शूकर बाड़े में 5% क्रीसोल या 3% सोडियम हाइड्रोक्साइड का छिड़काव करना चाहिए।",
            "शूकर चेचक/स्वाइन पॉक्स  " ,
            " क्या एवं कैसे " ,
            "तेजी से संक्रमित होने वाला यह रोग विषाणुओं (स्वाइन पाक्स) के द्वारा होता है। " ,
            " लक्षण  " ,
            "पशु को हल्का बुखार रहता है। एक-दो दिन में शरीर के निचले भाग, पैर के ऊपरी भाग, चेहरे पर तथा पीठ के पिछले भाग पर छोटे-छोटे दाने निकल आते हैं और वे 1-2 दिन बाद बड़े हो जाते हैं जिनमें 3-4 दिन में मवाद भर जाता है और जल्द ही पपड़ी बन जाती है। " ,
            " उपचार एवं रोकथाम " ,
            "रोग-ग्रस्त समूह को अलग रखकर उन्हे हल्का भोजन प्रदान करना चाहिए । शूकर में परजीवी जैसे जूँ और किलनियों पर नियन्त्रण रखने के लिए समय-समय पर उपचार होना चाहिए तथा बाड़ों की सफाई पर विशेष ध्यान देना चाहिए । चेचक के दानों में हुए घावों पर नीली दवा लगाना चाहिए और बी-कॉम्प्लेक्स  का इंजेक्शन देना चाहिए।",
            " शूकर प्लेग/गलघोंटू रोग  " ,
            " क्या एवं कैसे " ,
            "यह रोग पास्चुरेला मल्टोसिडा नामक जीवाणु से फैलता है। न्यूमोनिक पास्चुरेलोसिस जो फेफड़ों में निमोनिया रोग फैलाता है। सेप्टिसिमिक पास्चुरेलोसिस, जो अधिकतर बच्चो मे होता है और अत्यन्त खतरनाक होता है।" ,
                    " लक्षण " ,
            "तेज बुखार, भूख न लगना, लड़खड़ाना, साँस लेने में तकलीफ, गले में सूजन एवं दस्त। " ,
            " उपचार एवं रोकथाम" ,
            "रोग-ग्रस्त पशुओं को अलग रखना चाहिए, बाड़े की सफाई करनी चाहिए, मरे हुए पशुओं को जला देना चाहिए या जमीन में दबा देना चाहिए एवं चूने का भी उपयोग करना आवश्यक है। एच. एस. ऑयल  एडजूवेन्ट या एच. एस. ब्रॉथ  वैक्सीन का टीकाकरण करना चाहिए। आक्सीटेट्रासाईक्लिन के साथ डेक्सोना का इंजेक्शन देना लाभदायक होता है। " ,
            "खुरपका - मुँहपका रोग  " ,
            " क्या एवं कैसे " ,
            "यह विषाणु-जनित एक भयानक संक्रामक रोग है।  " ,
            " लक्षण  " ,
            "तेज बुखार, मुँह, जीभ तथा खुरों के आस-पास छाले बन जाते हैं। पशु खाना नहीं खाता और उसे बहुत प्यास लगती है। दर्द के कारण वह चलने में असमर्थ हो जाता है। " ,
            " उपचार एवं रोकथाम " ,
            " रोग-ग्रसित पशु को अलग रखना चाहिए, स्वच्छता पर पूरा ध्यान देना चाहिए, रोगी पशु के मुँह को दोनों समय फिटकिरी या पोटैशियम परमैंगनेट के घोल से धोना चाहिए एवं बोरो-ग्लिसरीन लगाना चाहिए। रोगी पशु के खुरों के उपचार हेतु पानी में 2% फिटकरी या पोटेशियम परमैंग्नेट का घोल लगाकर पट्टी बाँधना चाहिए। पॉलीवेलेन्ट  एफ.एम.डी. वैक्सीन का पहला टीका माँ  से अलग करने के बाद (वीनिंग) लगा देना चाहिए । शूकर बाड़े को 1-2% सोडियम हाइड्राक्साइड अथवा फार्मिलिन/4% सोडियम कार्बोनेट से साफ करना चाहिए तथा रोग ग्रस्त पशु का बिछावन एवं उनके उत्पाद को अवश्य जला देना चाहिए।" ,
            "पोरसाइन रेस्पिरेटरी रिप्रोडक्टिव सिंड्रोम (पी.आर.आर.एस.) " ,
            " क्या एवं कैसे " ,
            "यह रोग आर्टेरि विषाणु द्वारा होता है।" ,
            " लक्षण " ,
            "इस बीमारी से ग्रस्त होने पर मादा प्रायः मरे हुए (ममीफाईड) बच्चे देती है। यदि मादा जीवित बच्चे देती भी है तो शावको के शरीर पर बाल नहीं होते है तथा बच्चे अपंग पैदा होते हैं।" ,
            " उपचार एवं रोकथाम " ,
            "इसका कोई भी आसान उपचार उपलब्ध नहीं है, परन्तु विभिन्न दवाईयों द्वारा जिनमें कि रेस्टोबॉल , मिन्ट्रस आदि प्रमुख हैं, मादा के शरीर में रोग प्रतिरोधक क्षमता उत्पन्न की जा सकती है तथा इस रोग से होने वाली हानि को रोका जा सकता है। " ,
            " संक्रामक  गर्भपात ",
            " क्या एवं कैसे ",
            "यह ब्रूसेला स्विस, लेप्टोस्पायरा और ट्रायकोमोनास नामक जीवाणु के द्वारा होता है। " ,
            " लक्षण  " ,
            "शूकरियों में बाँझपन, गर्भपात, जोड़ों का रोग, दुर्बल शावकों  का जन्म होना, नर शूकरों में वृषणशोथ इत्यादि। " ,
            "रोकथाम " ,
            "रोगी पशु को अलग कर उसका वध कर देना चाहिये। गर्भपात के दौरान मृत जन्मे बच्चों को जमीन के अन्दर दबा देना चाहिए। दूसरे  बाड़े  से लाए गए शूकरों को अलग रखकर ब्रूसेलौसिस की जाँच कर लेनी चाहिए एवं बाडे़ को साफ रखना चाहिए। इस बीमारी का उपचार उपलब्ध नहीं है।" ,
            " शूकर  पैराटाईफाइड  " ,
            " क्या एवं कैसे" ,
            "यह एक जीवाणु-जनित रोग है। यह तीव्र व चिरकालिक दोनों प्रकार का होता है। " ,
            " लक्षण  " ,
            "बुखार, भूख न लगना एवं शरीर के कई हिस्सों में लाल या बैंगनी रंग के चकत्ते बनना । " ,
            " रोकथाम " ,
            "शूकर बाड़ों की सफाई पर विशेष ध्यान रखना चाहिए। बाड़ों व बर्तनो को संक्रमण-रहित करने की व्यवस्था होनी चाहिए। " ,
            " एरिसिपेलस रोग/डायमण्ड त्वचा रोग " ,
            " क्या एवं कैसे " ,
            "यह रोग एरिसिपेलोथ्रिक्स रूजियोपैथी नामक जीवाणु से होता है जो कि सामान्य ताप पर कई महीनों तक इन्कुबेशन अवस्था में जीवित रह सकता है। " ,
            " लक्षण  " ,
            "शरीर के जोड़ सूज जाते हैं और पशु लंगड़ा हो जाता है। पशु चलने की इच्छा नहीं रखता है। तेज बुखार के साथ शरीर पर छोटे गुलाबी या हल्के पीले रंग के चकत्ते दिखना है। " ,
            " उपचार एवं रोकथाम " ,
            "रोगग्रस्त समूह को स्वस्थ समूह से अलग रखना तथा उन्हे संतुलित आहार देना । इस रोग का इलाज पेनिसिलीन तथा एंटी-एरिसिपेलस सीरम द्वारा किया जा सकता है। यह इंजेक्शन रोगग्रस्त शूकरों के कान के पीछे लगाना चाहिए। अप्रैल व मई के महीनों में टीकाकरण करना चाहिए। " ,
            " स्वाइन वेसिकुलर इक्जैंथिमा " ,
                    " क्या एवं कैसे " ,
                    "यह कैलिसी वायरस विषाणु द्वारा होता है और आमतौर से बड़े पशुओं में दिखता है। यह कूड़ा-करकट खाने से होता है। " ,
                    " लक्षण " ,
            "मुँह और पैरों पर छाले बनना। " ,
                    " रोकथाम " ,
            "शूकर बाड़ों की सफाई पर विशेष ध्यान रखना चाहिए। बाहर से आने वाले पशुओं की अच्छी प्रकार से जाँच-पड़ताल करके ही उन्हें बाड़े में शामिल करना चाहिए। 2% सोडियम हाइड्रोक्साइड से शूकर बाड़े व बर्तनों को पूर्णतया साफ करना चाहिए। ",
            "  परजीवी रोग " ,
            " अंत:परजीवी  " ,
            " क्या एवं कैसे  " ,
            " अंत:परजीवी जैसे गोलकृमि एवं फीताकृमि इत्यादि हैं।  " ,
            " लक्षण " ,
            "इनकी संख्या ज्यादा होने पर शूकरों में दस्त, रक्ताल्पता, भूख न लगना तथा कमजोरी भी आ जाती है। कई बार ये परजीवी संक्रमण शूकरों के मौत का कारण भी बन जाते हैं। मल परीक्षण करके इन अंत:परजीवी रोगों की जाँच की जा सकती है। " ,
            " उपचार एवं रोकथाम  " ,
            "एलबेन्डाजोल (5-10 मिग्रा/किग्रा शरीर भार), फेन्बेन्डाजोल (5 मिग्रा/किग्रा शरीर भार), पाइपराजीन(110 मिग्रा/किग्रा शरीर भार) एवं आइवरमेक्टिन (0.3 मिग्रा/किग्रा शरीर भार)में से किसी एक औषधि का प्रयोग कर सकते हैं। इन औषधियों द्वारा हर 4 महीनों पर अंतःपरजीवियों की रोकथाम करना अति आवश्यक है। " ,
            "बाह्य परजीवी " ,
            " क्या एवं कैसे " ,
            "बाह्य परजीवी में माइट, जूँ, मक्खी, पिस्सू, चमोकन आदि प्रमुख हैं।  " ,
            " लक्षण " ,
            "इनके कारण खुजली होती है और शूकर दीवार से अपने शरीर को रगड़ते हैं जिससे उनका शरीर लाल पड़ जाता है तथा त्वचा में घाव बन जाता है। कभी-कभी उपचार न होने से घाव में कीड़े भी पड़ जाते हैं। इनके कारण पशु परेशान होते हैं, खाना-पीना कम कर देते हैं और उनका वजन घट जाता है। " ,
            " उपचार एवं रोकथाम  " ,
            "आइवरमेक्टिन इंजेक्शन 0.3 मिग्रा/किग्रा शरीर भार माँसपेशियों में देना चाहिए। ब्यूटॉक्स  (डेल्टामेथ्रीन), एक्टोमिन, एस्केबियाल(अमिटराज)-एक लीटर पानी में 2 मिली दवाई के घोल का पूरे शरीर पर छिड़काव करना चाहिए, और इसे 15 दिन बाद दोहराने से बाह्य परजीवियों से छुटकारा मिल जाता है। दवाई का छिड़काव करने से पूर्व यह सुनिश्चित कर लेना चाहिए कि पशु पर्याप्त पानी पी चुके हों ताकि वें दवा को न चाट सकें । दवाई-छिड़काव का कार्य धूप में करना चाहिए ।",
            "  खनिज लवण व विटामिनों की कमी से होने वाले रोग " ,
            "हरे चारे के न मिलने के फलस्वरूप उनमें खनिज लवण एवं विटामिनों की कमी होने की संभावना बनी रहती है। इनकी कमी के कारण शूकरों की वृद्धिदर घटती है। " ,
            "एनीमिया (खून की कमी) " ,
            " क्या एवं कैसे " ,
            "यह आयरन, कॉपर , कोबाल्ट व विटामिन-बी की कमी से होता है। इससे शूकरों के खून में हिमोग्लोबीन की मात्रा काफी कम हो जाती है। " ,
            " लक्षण  " ,
            "भूख न लगना, दुर्बलता, साँस लेने में तकलीफ, सिर व कंधों में सूजन एवं अन्त में मृत्यु। दूध पीते बच्चो में इसकी ज्यादा संभावना होती है। वे पत्थर या मिट्टी चाटते हैं।" ,
            " उपचार एवं रोकथाम " ,
            "1. 450 ग्राम फेरस सल्फेट + 75 ग्राम कॉपर  सल्फेट + 450 ग्राम शुगर + 2 ली पानीके मिश्रण को मादा के थन पर लगाना चाहिए। " ,
            "2. खुले बाड़े में शूकर शिशुओं को मिट्टी की उपलब्धता मिलने पर इसकी रोकथाम संभव है। " ,
            "3. 2 मिली आयरन डेक्स्ट्रान इंजेक्शन तीन दिन एवं तीन सप्ताह की आयु पर देना चाहिए। " ,
            " पैराकेराटोसिस " ,
            " क्या एवं कैसे " ,
            "जिंक अल्पता पैराकेराटोसिस नाम से जानी जाती है।  " ,
            " लक्षण " ,
            "त्वचा सामान्य से अधिक मोटी और खुरदरी हो जाती है। त्वचा के प्रभावित हिस्सों से बाल गिरने लगते हैं। कभी-कभी संपूर्ण शरीर के बाल गिर जाते हैं। शूकर के शरीर भार में कमी होने लगती है। जिंक की कमी से उत्पन्न त्वचा रोग के लक्षण स्केबीज और मैंज से मिलते-जुलते हैं। " ,
            " उपचार एवं रोकथाम " ,
            "खनिज लवण मिश्रण पर्याप्त मात्रा में राशन में मिलाकर देना चाहिए। " ,
            "विटामिन-ए की अल्पता " ,
            " क्या एवं कैसे " ,
            "विटामिन-ए की अल्पता या तो राशन में इसकी कमी के कारण होती है अथवा पूर्णरूप से आँतों द्वारा अवशोषण न होने के कारण होती है।" ,
            " लक्षण " ,
            "शिशुओं में दिमाग का ठीक विकास नहीं होता और व्यस्क में रतौंधी नामक रोग हो जाता है। इसके अतिरिक्त त्वचा खुरदरी हो जाती है, आँखों की पुतली में श्वेतपन आ जाता है, शरीर भार में कमी हो जाती है तथा बच्चा पैदा करने में असमर्थता उत्पन्न हो जाती है। विटामिन-ए की कमी को शीघ्रता से ठीक करना चाहिए अन्यथा जो कुछ भी लक्षण दिखाई देते हैं, वे स्थाई हो जाते हैं। " ,
            " उपचार एवं रोकथाम " ,
            "1. विटामिन-ए की कमी होने पर 440 आई.यू. विटामिन-ए/किग्रा शरीर भार इंजेक्शन के रूप में दे सकते हैं। तुरन्त फायदे के लिए पानी-निर्मित इंजेक्शन का प्रयोग करते हैं तथा लम्बे समय तक के फायदे के लिए तैलीय पदार्थ में निर्मित विटामिन-ए को आहार मे मिश्रित करके भी दिया जा सकता है। विटामिन-ए की न्यूनतम प्रतिदिन की आवश्यकता 40 आई.यू./किग्रा शरीर भार की होती है।  " ,
            "2. विटामिन-ए की कमी से बचने के लिए पहले से आहार में रेटिनॉल  0.3 माइक्रोग्राम या बीटा-कैरोटीन या5-8 माइक्रोग्राम/किग्रा शरीर भार की दर से प्रतिदिन दे सकते हैं। अथवा 50-60 दिनों के अंतराल पर 3000-6000 आई.यू./किग्रा शरीर भार की दर से भी विटामिन-ए राशन में मिलाकर खिलाते हैं। " ,
            " हाइपोग्लाइसीमिया " ,
            " क्या एवं कैसे " ,
            "रक्त में शुगर की मात्रा कम होना इस रोग का प्रमुख कारक है। " ,
            " लक्षण " ,
            "कंपकंपी, कमजोरी, दूध पिलाने में अस्मर्थता, बालों का सूखा व खड़ा हो जाना । 24 घंण्टे के अन्दर बच्चों का मरना । " ,
            " उपचार एवं रोकथाम " ,
            "1. डेक्सट्रोज का इंजेक्शन या ग्लूकोज पाउडर को पानी में देना चाहिए। " ,
            "2. नियमित रूप से खनिज लवण एवं विटामिन-पूरक शूकरों के राशन में 3% प्रयुक्त करना चाहिए। " ,
            "3. दिन के समय धूप पहुँचने की व्यवस्था सुनिश्चित करनी चाहिए।",
            "  टीकाकरण  " ,
            " शूकर ज्वर वैक्सीन राज्यों के पशु स्वास्थ्य एवं पशु जैविक उत्पाद संस्थान(चंडीगढ़, लखनऊ, कोलकाता, गौहाटी, बेंगलुरू, चेन्नई, थिरूअनन्तपुरमआदि) से प्राप्त की जा सकती है " ,
            " खुरपका मुँहपका वैक्सीन राज्यों के सभी सरकारी पशु-चिकित्सालयों से प्राप्त की जा सकती है। " ,
            " टीके को बाजार से क्रय करने के बाद बर्फ के साथ थर्मोकोल डिब्बे में रख लेना चाहिए।  " ,
            " टीकाकरण का कार्य दो महीने से कम उम्र के बच्चों को छोड़कर समस्त शूकरों में एक साथ करना चाहिए।  " ,
            " टीकाकरण का कार्य बरसात प्रारम्भ होने से पहले पूरा कर लेना चाहिए।  " ,
            " टीकाकरण से 15-30 दिन पहले सभी पशुओं में पेट के कीड़ों को मारने वाली दवाई पिलाना अत्यधिक आवश्यक है।  " ,
            "  फार्म में उपयोग होने वाले कीटाणुनाषक " ,
            "फार्म में बीमारियों को रोकने के लिए बाड़ों के अंदर साफ-सफाई की आवश्यकता पड़ती है। बाड़ों को नीचे दिये गये विभिन्न कीटाणुनाशक से सही मात्रा में सही समय पर एवं सही तरीके से पानी के साथ धुलाई करने से बीमारियों को रोका जा सकता है। ",
            "रोग का नाम ",
            "आयु ",
            "मात्रा",
            "अवधि " ,
            "शूकर ज्वर",
            "3 माह पर/वीनिंग के बाद ",
            "1 मिली माँस त्वचा में " ,
            " 1 वर्ष " ,
            "खुरपका - मुँहपका ",
            "वीनिंग के बाद दूसरा प्रथम के 21 दिन बाद ",
            "5-10 मिली त्वचा के नीचे ",
            "6 माह",

            "नाम",
            "मात्रा " ,
            " उपयोग की विधि",
            "उपयोग की जगह",
            "टिप्पणी",

            "धुलाई का सोडा (सोडियम  कोर्बोनेट)",
            "उबलते पानी में 3% मिलायें",
            "छिड़काव",
            "फर्श, बर्तन ",
            "प्रभावी कीटाणुनाशक " ,

            "चूना",
            "0.5 किलो चूना़ + 5 लीटर पानी ",
            "चूने के पाउडर एवं  घोल का छिड़काव ",
            "फर्श, दीवार,  मैदान",
            "आवश्यकतानुसार ताजा घोल तैयार करें " ,

            "पोटेशियम परमैंगनेट (लाल दवा)",
            "1:10000 घोल पानी में",
            "छिड़काव",
            "फर्श, गडढा,  बर्तन ",
            "कीटाणुनाशक कार्य आक्सीडेशन के माध्यम से " ,

            "फिनाॅयल (कारवोलिक ऐसिड)",
            "2-5% घोल पानी में",
            "छिड़काव",
            "धातू, वस्तु,  कपडे़",
            "अच्छा कीटाणुनाशक" ,

            "फौैरमेलिन (40 प्रतिशत फौरमलडिहाइड)",
            "15 मिली फौरमेलिन + 15 ग्राम पोटेशियम परमैंगनेट प्रति 15 वर्ग मीटर जगह के लिए",
            "फ्युमिगेशन",
            "बाड़ा ",
            "शूकर को बाड़े में बंद करने से पहले दरवाजे व खिड़की खोलना जरूरी है " ,

            "कापर सल्फेट (नीली दवा)",
            "1 ग्राम + 1000 लीटर पानी ",
            "छिड़काव",
            "पानी का गड्डा ",
            "फॅगस तथा एल्गी की वृद्धि रोकता है " ,

            "सोडियम हाइड्राक्साइड",
            "सामान्य उपयोग के लिए 2% तथा जीवाणुओं को  मारने के लिए 5%",
            "छिड़काव",
            "फर्श, गटर, उपकरण",
            "धातु संक्षारक, सस्ती, अच्छी कीटाणुनाशक" ,

            "ब्लीचिंग पाउडर (कैल्शियम हाइपोक्लोराइट)",
            "30% उपलब्ध क्लोरीन",
            "छिड़काव",
            "फर्श, गटर",
            "सूर्य की रोशनी से बचाना चाहिए " ,

            "क्वाटरनरी अमोनियम लवण",
            "1% घोल",
            "पोछा/ धोना",
            "थन, हाथ",
            "ग्राम पोजिटिव एवं निगेटिव बैक्टीरिया के खिलाफ अधिक प्रभावी जीवाणुनाशक" ,

            "बोरिक अम्ल ",
            "5 से 6% घोल",
            "छिड़काव",
            "त्वचा, फर्श,  दीवार, उपकरण" ,
            "-",

            "सोडियम हाइपोक्लोराइट ",
            "200 पी.पी.एम. उपलब्ध क्लोरीन",
            "पोछा ",
            "बर्तन, थन ",
            "गर्म घोल का प्रयोग नही करना चाहिये"


    };

    public String[] to_be_used1;


    //WebView webViewSKA;

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
    TextView text110;
    TextView text111;
    TextView text112;
    TextView text113;
    TextView text114;
    TextView text115;
    TextView text116;
    TextView text117;
    TextView text118;
    TextView text119;
    TextView text120;
    TextView text121;
    TextView text122;
    TextView text123;
    TextView text124;

    Button heading1;
    Button heading2;
    Button heading3;
    Button heading4;
    Button heading5;
    Button heading6;
    Button heading7;
    Button heading8;
    Button heading9;
    Button heading10;
    Button heading11;

    Button heading12;
    Button heading13;
    Button heading14;
    Button heading15;
    Button heading16;
    Button heading17;


   LinearLayout new_layout1;
   LinearLayout new_layout2;
    LinearLayout new_layout3;
    LinearLayout new_layout4;
    LinearLayout new_layout5;
    LinearLayout new_layout6;
    LinearLayout new_layout7;
    LinearLayout new_layout8;
    LinearLayout new_layout9;
    LinearLayout new_layout10;
    LinearLayout new_layout11;
    LinearLayout new_layout12;
    LinearLayout new_layout13;
    LinearLayout new_layout14;
    LinearLayout new_layout15;
    LinearLayout new_layout16;
    LinearLayout new_layout17;

    public String[] to_be_used2;

    private WebView webViewSKA, webViewFDK;
    String text, tex1t;

    BaseTableAdapter baseTableAdapter;
    TableFixHeaders tableFixHeaders;



    public String [] hindi2={
            //   "1",//6
            "धुलाई का सोडा (सोडियम  कोर्बोनेट)",
            "उबलते पानी में 3% मिलायें",
            "छिड़काव",
            "फर्श, बर्तन",
            "प्रभावी कीटाणुनाशक",

            //    "2",
            "चूना",
            "0.5 किलो चूना़ + 5 लीटर पानी",
            "चूने के पाउडर एवं घोल का छिड़काव",
            "फर्श, दीवार,  मैदान",
            "आवश्यकतानुसार ताजा घोल तैयार करें",

            //    "3",
            "पोटेशियम परमैंगनेट (लाल दवा)",
            "1:10000 घोल पानी में",
            "छिड़काव",
            "फर्श, गडढा,  बर्तन",
            "कीटाणुनाशक कार्य आक्सीडेशन के माध्यम से" ,

            //     "4",
            "फिनॉयल (कारवोलिक  ऐसिड)",
            "2 - 5% घोल पानी में",
            "छिड़काव",
            "धातू, वस्तु,  कपडे़",
            "अच्छा कीटाणुनाशक",

            //   "5",
            "फौरमेलिन (40 प्रतिशत फौरमलडिहाइड)",
            "15 मिली फौरमेलिन + 15 ग्राम पोटेशियम परमैंगनेट प्रति 15 वर्ग मीटर जगह के लिए",
            "फ्युमिगेशन",
            "बाड़ा",
            "शूकर को बाड़े में बंद करने से पहले दरवाजे व खिड़की खोलना जरूरी है",

            //    "6",
            "कापर सल्फेट (नीली दवा)",
            "1 ग्राम + 1000 लीटर पानी",
            "छिड़काव",
            "पानी का गड्डा",
            "फॅगस तथा एल्गी की वृद्धि रोकता है",

            //     "7",
            "सोडियम हाइड्राक्साइड",
            "सामान्य उपयोग के लिए 2% तथा जीवाणुओं को  मारने के लिए 5%",
            "छिड़काव",
            "फर्श, गटर, उपकरण",
            "धातु संक्षारक, सस्ती, अच्छी कीटाणुनाशक",

            //   "8",
            "ब्लीचिंग पाउडर (कैल्शियम हाइपोक्लोराइट)",
            "30% उपलब्ध क्लोरीन",
            "छिड़काव",
            "फर्श, गटर",
            "सूर्य की रोशनी से बचाना चाहिए",

            //  "9",
            "क्वाटरनरी अमोनियम लवण",
            "1% घोल",
            "पोछा/ धोना",
            "थन, हाथ",
            "ग्राम पोजिटिव एवं निगेटिव बैक्टीरिया के खिलाफ अधिक प्रभावी जीवाणुनाशक",

            //  "10",
            "बोरिक अम्ल",
            "5 से 6% घोल",
            "छिड़काव",
            "त्वचा, फर्श,  दीवार, उपकरण",
            "--",

            // "11",
            "सोडियम हाइपोक्लोराइट",
            "200 पी.पी.एम. उपलब्ध क्लोरीन",
            "पोछा",
            "बर्तन, थन",
            "गर्म घोल का प्रयोग नही करना चाहिये"
    };

    private class NexusTypes {
        private final String name;
        private final List<Nexus> list;

        NexusTypes(String name) {
            this.name = name;
            list = new ArrayList<Nexus>();
        }

        public int size() {
            return list.size();
        }

        public Nexus get(int i) {
            return list.get(i);
        }
    }

    public class Nexus {
        private final String[] data;

        private Nexus(String name, String company, String version,String pcode, String api, String storage){ //, String inches, String ram) {
            data = new String[]{//"अक्षांश"
                    name,
                    company,
                    version,
                    pcode,
                    api,
                    storage,
                  /*  inches,
                    ram*/
            };
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle(to_be_used[0]);

        to_be_used1=hindi1.clone();
        to_be_used2=hindi2.clone();


        Intent intent = getIntent();
        Bundle data = intent.getExtras();

        String number_get= (String) data.get("number");
        System.out.println("number is:"+number_get);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        heading1=(Button)findViewById(R.id.heading1);
        heading2=(Button)findViewById(R.id.heading2);
        heading3=(Button)findViewById(R.id.heading3);
        heading4=(Button)findViewById(R.id.heading4);
        heading5=(Button)findViewById(R.id.heading5);
        heading6=(Button)findViewById(R.id.heading6);
        heading7=(Button)findViewById(R.id.heading7);
        heading8=(Button)findViewById(R.id.heading8);
        heading9=(Button)findViewById(R.id.heading9);
        heading10=(Button)findViewById(R.id.heading10);
        heading11=(Button)findViewById(R.id.heading11);
        heading12=(Button)findViewById(R.id.heading12);
        heading13=(Button)findViewById(R.id.heading13);
        heading14=(Button)findViewById(R.id.heading14);
        heading15=(Button)findViewById(R.id.heading15);
        heading16=(Button)findViewById(R.id.heading16);
        heading17=(Button)findViewById(R.id.heading17);

        heading1.setText(to_be_used[3]);
        heading2.setText(to_be_used[10]);
        heading3.setText(to_be_used[17]);
        heading4.setText(to_be_used[24]);
        heading5.setText(to_be_used[31]);
        heading6.setText(to_be_used[38]);
        heading7.setText(to_be_used[45]);
        heading8.setText(to_be_used[52]);
        heading9.setText(to_be_used[59]);
        heading10.setText(to_be_used[67]);
        heading11.setText(to_be_used[74]);
        heading12.setText(to_be_used[83]);
        heading13.setText(to_be_used[92]);
        heading14.setText(to_be_used[99]);
        heading15.setText(to_be_used[107]);
        heading16.setText(to_be_used[116]);
        heading17.setText(to_be_used[123]);



        text1 = (TextView) findViewById(R.id.text1);
      //  text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text7 = (TextView) findViewById(R.id.text7);
        text8 = (TextView) findViewById(R.id.text8);
        text9 = (TextView) findViewById(R.id.text9);
        text10 = (TextView) findViewById(R.id.text10);
        text11 = (TextView) findViewById(R.id.text11);
        text12 = (TextView) findViewById(R.id.text12);
        text13 = (TextView) findViewById(R.id.text13);
        text14 = (TextView) findViewById(R.id.text14);
        text15 = (TextView) findViewById(R.id.text15);
        text16=(TextView)findViewById(R.id.text16);
        text17 = (TextView) findViewById(R.id.text17);
        text18 = (TextView) findViewById(R.id.text18);
        text19 = (TextView) findViewById(R.id.text19);
        text20 = (TextView) findViewById(R.id.text20);

        text21 = (TextView)findViewById(R.id.text21);
        text22 = (TextView) findViewById(R.id.text22);
        text23 = (TextView)findViewById(R.id.text23);
        text24 = (TextView) findViewById(R.id.text24);
        text25 = (TextView) findViewById(R.id.text25);
        text26 = (TextView)findViewById(R.id.text26);
        text27 = (TextView) findViewById(R.id.text27);
        text28 = (TextView)findViewById(R.id.text28);
        text29 = (TextView)findViewById(R.id.text29);
        text30 = (TextView)findViewById(R.id.text30);
        text31 = (TextView) findViewById(R.id.text31);
        text32 = (TextView)findViewById(R.id.text32);
        text33 = (TextView)findViewById(R.id.text33);
        text34 = (TextView)findViewById(R.id.text34);
        text35 = (TextView)findViewById(R.id.text35);
        text36=(TextView)findViewById(R.id.text36);
        text37 = (TextView) findViewById(R.id.text37);
        text38 = (TextView)findViewById(R.id.text38);
        text39 = (TextView) findViewById(R.id.text39);
        text40 = (TextView)findViewById(R.id.text40);

        text41 = (TextView) findViewById(R.id.text41);
        text42 = (TextView)findViewById(R.id.text42);
        text43 = (TextView) findViewById(R.id.text43);
        text44 = (TextView)findViewById(R.id.text44);
        text45 = (TextView) findViewById(R.id.text45);
        text46 = (TextView) findViewById(R.id.text46);
        text47 = (TextView)findViewById(R.id.text47);
        text48 = (TextView) findViewById(R.id.text48);
        text49 = (TextView) findViewById(R.id.text49);
        text50 = (TextView)findViewById(R.id.text50);
        text51 = (TextView) findViewById(R.id.text51);
        text52 = (TextView) findViewById(R.id.text52);
        text53 = (TextView) findViewById(R.id.text53);
        text54 = (TextView) findViewById(R.id.text54);
        text55 = (TextView) findViewById(R.id.text55);
        text56=  (TextView) findViewById(R.id.text56);
        text57 = (TextView) findViewById(R.id.text57);
        text58 = (TextView) findViewById(R.id.text58);
        text59 = (TextView) findViewById(R.id.text59);
        text60 = (TextView) findViewById(R.id.text60);

        text61 = (TextView) findViewById(R.id.text61);
        text62 = (TextView) findViewById(R.id.text62);
        text63 = (TextView) findViewById(R.id.text63);
        text64 = (TextView) findViewById(R.id.text64);
        text65 = (TextView)findViewById(R.id.text65);
        text66 = (TextView) findViewById(R.id.text66);
        text67 = (TextView)findViewById(R.id.text67);
        text68 = (TextView) findViewById(R.id.text68);
        text69 = (TextView)findViewById(R.id.text69);
        text70 = (TextView) findViewById(R.id.text70);
        text71 = (TextView)findViewById(R.id.text71);
        text72 = (TextView) findViewById(R.id.text72);
        text73 = (TextView) findViewById(R.id.text73);
        text74 = (TextView) findViewById(R.id.text74);
        text75 = (TextView) findViewById(R.id.text75);
        text76=(TextView)findViewById(R.id.text76);
        text77 = (TextView)findViewById(R.id.text77);
        text78 = (TextView)findViewById(R.id.text78);
        text79 = (TextView) findViewById(R.id.text79);
        text80 = (TextView) findViewById(R.id.text80);

        text81 = (TextView) findViewById(R.id.text81);
        text82 = (TextView)findViewById(R.id.text82);
        text83 = (TextView) findViewById(R.id.text83);
        text84 = (TextView)findViewById(R.id.text84);
        text85 = (TextView) findViewById(R.id.text85);
        text86 = (TextView) findViewById(R.id.text86);
        text87 = (TextView)findViewById(R.id.text87);
        text88 = (TextView) findViewById(R.id.text88);
        text89 = (TextView) findViewById(R.id.text89);
        text90 = (TextView)findViewById(R.id.text90);
        text91 = (TextView) findViewById(R.id.text91);
        text92 = (TextView) findViewById(R.id.text92);
        text93 = (TextView)findViewById(R.id.text93);
        text94 = (TextView)findViewById(R.id.text94);
        text95 = (TextView) findViewById(R.id.text95);
        text96=(TextView)findViewById(R.id.text96);
        text97 = (TextView) findViewById(R.id.text97);
        text98 = (TextView)findViewById(R.id.text98);
        text99 = (TextView) findViewById(R.id.text99);
        text100 = (TextView)findViewById(R.id.text100);

        text101 = (TextView)findViewById(R.id.text101);
        text102 = (TextView) findViewById(R.id.text102);
        text103 = (TextView)findViewById(R.id.text103);
        text104 = (TextView)findViewById(R.id.text104);
        text105 = (TextView) findViewById(R.id.text105);
        text106 = (TextView)findViewById(R.id.text106);
        text107 = (TextView) findViewById(R.id.text107);
        text108 = (TextView) findViewById(R.id.text108);
        text109 = (TextView) findViewById(R.id.text109);
        text110 = (TextView)findViewById(R.id.text110);
        text111 = (TextView) findViewById(R.id.text111);
        webViewSKA=(WebView)findViewById(R.id.webViewTK);
        text112 = (TextView)findViewById(R.id.text112);
        text113 = (TextView) findViewById(R.id.text113);
        text114 = (TextView)findViewById(R.id.text114);
        text115 = (TextView) findViewById(R.id.text115);
        text116=(TextView)findViewById(R.id.text116);
        text117 = (TextView) findViewById(R.id.text117);
        text118 = (TextView) findViewById(R.id.text118);
        text119 = (TextView) findViewById(R.id.text119);
        text120= (TextView) findViewById(R.id.text120);
        text121 = (TextView) findViewById(R.id.text121);
        text122 = (TextView) findViewById(R.id.text122);
        text123 = (TextView) findViewById(R.id.text123);
        text124 = (TextView) findViewById(R.id.text124);


        text = "<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" /><script src=\"js/jquery.min.js\"></script><script src=\"js/bootstrap.min.js\"></script></head><body >";
        text+= "<table border=\"1px solid black\" class=\"table table-striped table-bordered table-hover\"\n cellpadding=\"5\" cellspacing=\"0\">";


        text+= "<tr height =10><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">"+to_be_used1[0]+"</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used1[1] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used1[2] + "</font></h4></td><td colspan=\"2\" align=\"center\" valign=\"middle\"><h4><font color=\"black\">" + to_be_used1[3] + "</font></h4></td></tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[4]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[5]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[6]+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[7]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[8]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[9]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[10]+"</h4>";
        text+= "</td>";
        text+= "<td colspan=\"2\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+to_be_used1[11]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webViewSKA.loadDataWithBaseURL("file:///android_asset/", text, "text/html", "utf-8", null);

        tableFixHeaders = (TableFixHeaders) findViewById(R.id.table);

        baseTableAdapter = new FamilyNexusAdapter(Disease_activity.this);
        tableFixHeaders.setAdapter(baseTableAdapter);

        new_layout1=(LinearLayout)findViewById(R.id.new_layout1);
        new_layout1.setVisibility(View.GONE);



        new_layout2=(LinearLayout)findViewById(R.id.new_layout2);
        new_layout2.setVisibility(View.GONE);

        new_layout3=(LinearLayout)findViewById(R.id.new_layout3);
        new_layout3.setVisibility(View.GONE);

         new_layout4=(LinearLayout)findViewById(R.id.new_layout4);
         new_layout4.setVisibility(View.GONE);

       new_layout5=(LinearLayout)findViewById(R.id.new_layout5);
        new_layout5.setVisibility(View.GONE);

        new_layout6=(LinearLayout)findViewById(R.id.new_layout6);
        new_layout6.setVisibility(View.GONE);

       new_layout7=(LinearLayout)findViewById(R.id.new_layout7);
       new_layout7.setVisibility(View.GONE);

          new_layout8=(LinearLayout)findViewById(R.id.new_layout8);
        new_layout8.setVisibility(View.GONE);

       new_layout9=(LinearLayout)findViewById(R.id.new_layout9);
        new_layout9.setVisibility(View.GONE);
        new_layout10=(LinearLayout)findViewById(R.id.new_layout10);
        new_layout10.setVisibility(View.GONE);

        new_layout11=(LinearLayout)findViewById(R.id.new_layout11);
        new_layout11.setVisibility(View.GONE);

       new_layout12=(LinearLayout)findViewById(R.id.new_layout12);
       new_layout12.setVisibility(View.GONE);

       new_layout13=(LinearLayout)findViewById(R.id.new_layout13);
        new_layout13.setVisibility(View.GONE);

        new_layout14=(LinearLayout)findViewById(R.id.new_layout14);
        new_layout14.setVisibility(View.GONE);

        new_layout15=(LinearLayout)findViewById(R.id.new_layout15);
        new_layout15.setVisibility(View.GONE);

        new_layout16=(LinearLayout)findViewById(R.id.new_layout16);
        new_layout16.setVisibility(View.GONE);

        new_layout17=(LinearLayout)findViewById(R.id.new_layout17);
        new_layout17.setVisibility(View.GONE);

        if(number_get.equals("1")){
            new_layout1.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("2")){
            new_layout2.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("3")){
            new_layout3.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("4")){
            new_layout4.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("5")){
            new_layout5.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("6")){
            new_layout6.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("7")){
            new_layout7.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("8")){
            new_layout8.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("9")){
            new_layout9.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("10")){
            new_layout10.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("11")){
            new_layout11.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("12")){
            new_layout12.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("13")){
            new_layout13.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("14")){
            new_layout14.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("15")){
            new_layout15.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("16")){
            new_layout16.setVisibility(View.VISIBLE);
        }
        if(number_get.equals("17")){
            new_layout17.setVisibility(View.VISIBLE);
        }




           //   text2.setVisibility(View.GONE);




        String nodatafound = "&#8226;";


        text1.setText(to_be_used[1]);
      //  text2.setText(to_be_used[2]);
        text3.setText( to_be_used[3]);
        text4.setText(Html.fromHtml(nodatafound) + " " + to_be_used[4]);
        text5.setText( to_be_used[5]);
        text6.setText(Html.fromHtml(nodatafound) + " " + to_be_used[6]);
        text7.setText(to_be_used[7]);
        text8.setText(Html.fromHtml(nodatafound) + " " + to_be_used[8]);
        text9.setText(to_be_used[9]);
        text10.setText(Html.fromHtml(nodatafound) + " " + to_be_used[10]);
        text11.setText(Html.fromHtml(nodatafound) + " " + to_be_used[11]);
        text12.setText(to_be_used[12]);
        text13.setText(Html.fromHtml(nodatafound) + " " + to_be_used[13]);
        text14.setText(to_be_used[14]);
        text15.setText(Html.fromHtml(nodatafound) + " " + to_be_used[15]);
        text16.setText(to_be_used[16]);
        text17.setText(to_be_used[17]);
        text18.setText(Html.fromHtml(nodatafound) + " " + to_be_used[18]);
        text19.setText( to_be_used[19]);
        text20.setText(Html.fromHtml(nodatafound) + " " + to_be_used[20]);


        text21.setText(to_be_used[21]);
        text22.setText(Html.fromHtml(nodatafound) + " " +to_be_used[22]);
        text23.setText( to_be_used[23]);
        text24.setText(to_be_used[24]);
        text25.setText(Html.fromHtml(nodatafound) + " " + to_be_used[25]);
        text26.setText(to_be_used[26]);
        text27.setText(Html.fromHtml(nodatafound) + " " +to_be_used[27]);
        text28.setText(to_be_used[28]);
        text29.setText(Html.fromHtml(nodatafound) + " " + to_be_used[29]);
        text30.setText(to_be_used[30]);
        text31.setText( to_be_used[31]);
        text32.setText(Html.fromHtml(nodatafound) + " " + to_be_used[32]);
        text33.setText(to_be_used[33]);
        text34.setText(Html.fromHtml(nodatafound) + " " +to_be_used[34]);
        text35.setText(to_be_used[35]);
        text36.setText(Html.fromHtml(nodatafound)+" "+to_be_used[36]);
        text37.setText( to_be_used[37]);
        text38.setText( to_be_used[38]);
        text39.setText(Html.fromHtml(nodatafound) + " " + to_be_used[39]);
        text40.setText( to_be_used[40]);


        text41.setText(Html.fromHtml(nodatafound) + " " +to_be_used[41]);
        text42.setText(to_be_used[42]);
        text43.setText(Html.fromHtml(nodatafound) + " " + to_be_used[43]);
        text44.setText( to_be_used[44]);
        text45.setText( to_be_used[45]);
        text46.setText(Html.fromHtml(nodatafound) + " " + to_be_used[46]);
        text47.setText(to_be_used[47]);
        text48.setText(Html.fromHtml(nodatafound) + " " + to_be_used[48]);
        text49.setText(to_be_used[49]);
        text50.setText(Html.fromHtml(nodatafound) + " " + to_be_used[50]);
        text51.setText(to_be_used[51]);
        text52.setText( to_be_used[52]);
        text53.setText(Html.fromHtml(nodatafound) + " " + to_be_used[53]);
        text54.setText(to_be_used[54]);
        text55.setText(Html.fromHtml(nodatafound) + " " + to_be_used[55]);
        text56.setText(to_be_used[56]);
        text57.setText(Html.fromHtml(nodatafound) + " " + to_be_used[57]);
        text58.setText( to_be_used[58]);
        text59.setText( to_be_used[59]);
        text60.setText(Html.fromHtml(nodatafound) + " " + to_be_used[60]);


        text61.setText(to_be_used[61]);
        text62.setText(Html.fromHtml(nodatafound) + " " +to_be_used[62]);
        text63.setText( to_be_used[63]);
        text64.setText(Html.fromHtml(nodatafound) + " " + to_be_used[64]);
        text65.setText(to_be_used[65]);
        text66.setText(to_be_used[66]);
        text67.setText(to_be_used[67]);
        text68.setText(Html.fromHtml(nodatafound) + " " + to_be_used[68]);
        text69.setText(to_be_used[69]);
        text70.setText(Html.fromHtml(nodatafound) + " " + to_be_used[70]);
        text71.setText( to_be_used[71]);
        text72.setText(Html.fromHtml(nodatafound) + " " + to_be_used[72]);
        text73.setText( to_be_used[73]);
        text74.setText(to_be_used[74]);
        text75.setText(Html.fromHtml(nodatafound) + " " + to_be_used[75]);
        text76.setText(to_be_used[76]);
        text77.setText(Html.fromHtml(nodatafound) + " " + to_be_used[77]);
        text78.setText( to_be_used[78]);
        text79.setText(Html.fromHtml(nodatafound) + " " + to_be_used[79]);
        text80.setText(to_be_used[80]);


        text81.setText(to_be_used[81]);
        text82.setText(to_be_used[82]);
        text83.setText(to_be_used[83]);
        text84.setText(Html.fromHtml(nodatafound) + " " + to_be_used[84]);
        text85.setText( to_be_used[85]);
        text86.setText(Html.fromHtml(nodatafound) + " " + to_be_used[86]);
        text87.setText(to_be_used[87]);
        text88.setText(Html.fromHtml(nodatafound) + " " + to_be_used[88]);
        text89.setText( to_be_used[89]);
        text90.setText( to_be_used[90]);
        text91.setText(to_be_used[91]);
        text92.setText(to_be_used[92]);
        text93.setText(Html.fromHtml(nodatafound) + " " + to_be_used[93]);
        text94.setText(to_be_used[94]);
        text95.setText(Html.fromHtml(nodatafound) + " " + to_be_used[95]);
        text96.setText(to_be_used[96]);
        text97.setText(Html.fromHtml(nodatafound) + " " + to_be_used[97]);
        text98.setText(to_be_used[98]);
        text99.setText(to_be_used[99]);
        text100.setText(Html.fromHtml(nodatafound) + " " + to_be_used[100]);


        text101.setText(to_be_used[101]);
        text102.setText(Html.fromHtml(nodatafound) + " " +to_be_used[102]);
        text103.setText( to_be_used[103]);
        text104.setText(Html.fromHtml(nodatafound) + " " + to_be_used[104]);
        text105.setText(to_be_used[105]);
        text106.setText( to_be_used[106]);
        text107.setText(to_be_used[107]);
        text108.setText(Html.fromHtml(nodatafound) + " " + to_be_used[108]);
        text109.setText( to_be_used[109]);
        text110.setText(Html.fromHtml(nodatafound) + " " + to_be_used[110]);
        text111.setText(to_be_used[111]);
        text112.setText(Html.fromHtml(nodatafound) + " " + to_be_used[112]);
        text113.setText(to_be_used[113]);
        text114.setText(to_be_used[114]);
        text115.setText( to_be_used[115]);
        text116.setText(to_be_used[116]);
        text117.setText(Html.fromHtml(nodatafound) + " " + to_be_used[117]);
        text118.setText(Html.fromHtml(nodatafound) + " " + to_be_used[118]);
        text119.setText(Html.fromHtml(nodatafound) + " " + to_be_used[119]);
        text120.setText(Html.fromHtml(nodatafound) + " " + to_be_used[120]);
        text121.setText(Html.fromHtml(nodatafound) + " " + to_be_used[121]);
        text122.setText(Html.fromHtml(nodatafound) + " " + to_be_used[122]);
        text123.setText( to_be_used[123]);
        text124.setText(Html.fromHtml(nodatafound) + " " + to_be_used[124]);

             // text59.setVisibility(View.GONE);


        text1.setTextColor(Color.parseColor("#FF2D2B2C"));
//        text2.setTextColor(Color.parseColor("#FF2D2B2C"));
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
        text110.setTextColor(Color.parseColor("#FF2D2B2C"));
        text111.setTextColor(Color.parseColor("#FF2D2B2C"));
        text112.setTextColor(Color.parseColor("#FF2D2B2C"));
        text113.setTextColor(Color.parseColor("#FF2D2B2C"));
        text114.setTextColor(Color.parseColor("#FF2D2B2C"));
        text115.setTextColor(Color.parseColor("#FF2D2B2C"));
        text116.setTextColor(Color.parseColor("#FF2D2B2C"));
        text117.setTextColor(Color.parseColor("#FF2D2B2C"));
        text118.setTextColor(Color.parseColor("#FF2D2B2C"));
        text119.setTextColor(Color.parseColor("#FF2D2B2C"));
        text120.setTextColor(Color.parseColor("#FF2D2B2C"));
        text121.setTextColor(Color.parseColor("#FF2D2B2C"));
        text122.setTextColor(Color.parseColor("#FF2D2B2C"));
        text123.setTextColor(Color.parseColor("#FF2D2B2C"));
        text124.setTextColor(Color.parseColor("#FF2D2B2C"));




        text1.setTextSize(23);
     //   text2.setTextSize(20);
      /*  text3.setTextSize(20);
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
        text110.setTextSize(20);
        text111.setTextSize(20);
        text112.setTextSize(20);
        text113.setTextSize(20);
        text114.setTextSize(20);
        text115.setTextSize(20);
        text116.setTextSize(20);
        text117.setTextSize(20);
        text118.setTextSize(20);
        text119.setTextSize(20);
        text120.setTextSize(20);
        text121.setTextSize(20);
        text122.setTextSize(20);
        text123.setTextSize(20);
        text124.setTextSize(20);
        */

        Justification.justify(text1);
//        Justification.justify(text2);
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
        Justification.justify(text110);

        Justification.justify(text111);
        Justification.justify(text112);
        Justification.justify(text113);
        Justification.justify(text114);
        Justification.justify(text115);
        Justification.justify(text116);
        Justification.justify(text117);
        Justification.justify(text118);
        Justification.justify(text119);
        Justification.justify(text120);
        Justification.justify(text121);
        Justification.justify(text122);
        Justification.justify(text123);
        Justification.justify(text124);



          text3.setVisibility(View.GONE);
        text10.setVisibility(View.GONE);
        text17.setVisibility(View.GONE);
        text24.setVisibility(View.GONE);
        text31.setVisibility(View.GONE);
        text38.setVisibility(View.GONE);
        text45.setVisibility(View.GONE);
        text52.setVisibility(View.GONE);
        text59.setVisibility(View.GONE);
        text66.setVisibility(View.GONE);
        text67.setVisibility(View.GONE);
        text74.setVisibility(View.GONE);
        text81.setVisibility(View.GONE);
        text82.setVisibility(View.GONE);
        text83.setVisibility(View.GONE);
        text92.setVisibility(View.GONE);
        text99.setVisibility(View.GONE);
        text107.setVisibility(View.GONE);
        text116.setVisibility(View.GONE);
        text123.setVisibility(View.GONE);







    }

    public class FamilyNexusAdapter extends BaseTableAdapter {

        private final NexusTypes familys[];
        private final String headers[] = {
                "क्र0सं0",
                "नाम",
                "मात्रा",
                "उपयोग की विधि",
                "उपयोग की जगह",
                "टिप्पणी",
        };

        private final int[] widths = {
                70,
                160,
                180,
                140,
                140,
                100,
        };
        private final float density;

        public FamilyNexusAdapter(Context context) {

            familys = new NexusTypes[] {
                    new NexusTypes("")
            };

            density = context.getResources().getDisplayMetrics().density;

            familys[0].list.add(new Nexus("1", to_be_used2[0], to_be_used2[1],to_be_used2[2], to_be_used2[3], to_be_used2[4]));
            familys[0].list.add(new Nexus("2", to_be_used2[5], to_be_used2[6],to_be_used2[7], to_be_used2[8], to_be_used2[9]));
            familys[0].list.add(new Nexus("3", to_be_used2[10], to_be_used2[11],to_be_used2[12], to_be_used2[13], to_be_used2[14]));
            familys[0].list.add(new Nexus("4", to_be_used2[15], to_be_used2[16],to_be_used2[17], to_be_used2[18], to_be_used2[19]));
            familys[0].list.add(new Nexus("5", to_be_used2[20], to_be_used2[21],to_be_used2[22], to_be_used2[23], to_be_used2[24] ));
            familys[0].list.add(new Nexus("6",to_be_used2[25], to_be_used2[26],to_be_used2[27], to_be_used2[28], to_be_used2[29]));
            familys[0].list.add(new Nexus("7", to_be_used2[30], to_be_used2[31],to_be_used2[32], to_be_used2[33], to_be_used2[34]));
            familys[0].list.add(new Nexus("8", to_be_used2[35], to_be_used2[36],to_be_used2[37], to_be_used2[38], to_be_used2[39]));
            familys[0].list.add(new Nexus("9", to_be_used2[40], to_be_used2[41],to_be_used2[42], to_be_used2[43], to_be_used2[44]));
            familys[0].list.add(new Nexus("10", to_be_used2[45], to_be_used2[46],to_be_used2[47], to_be_used2[48], to_be_used2[49]));
            familys[0].list.add(new Nexus("11", to_be_used2[50], to_be_used2[51],to_be_used2[52], to_be_used2[53], to_be_used2[54]));

        }

        @Override
        public int getRowCount() {
            return 12;
        }

        @Override
        public int getColumnCount() {
            return 5;
        }

        @Override
        public View getView(int row, int column, View convertView, ViewGroup parent) {
            final View view;
            switch (getItemViewType(row, column)) {
                case 0:
                    view = getFirstHeader(row, column, convertView, parent);
                    break;
                case 1:
                    view = getHeader(row, column, convertView, parent);
                    break;
                case 2:
                    view = getFirstBody(row, column, convertView, parent);
                    break;
                case 3:
                    view = getBody(row, column, convertView, parent);
                    break;
                case 4:
                    view = getFamilyView(row, column, convertView, parent);
                    break;
                default:
                    throw new RuntimeException("error ?");
            }
            return view;
        }

        private View getFirstHeader(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table_header_first, parent, false);
            }
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(headers[0]);
            return convertView;
        }

        private View getHeader(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table_header, parent, false);
            }
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(headers[column + 1]);
            return convertView;
        }

        private View getFirstBody(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table_first, parent, false);
            }
            convertView.setBackgroundResource(row % 2 == 0 ? R.drawable.bg_table_color1 : R.drawable.bg_table_color2);
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(getDevice(row).data[column + 1]);
            return convertView;
        }

        private View getBody(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table, parent, false);
            }
            convertView.setBackgroundResource(row % 2 == 0 ? R.drawable.bg_table_color1 : R.drawable.bg_table_color2);
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(getDevice(row).data[column + 1]);
            return convertView;
        }

        private View getFamilyView(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.item_table_family, parent, false);
            }
            final String string;
            if (column == -1) {
                string = getFamily(row).name;
            } else {
                string = "";
            }
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(string);
            return convertView;
        }

        @Override
        public int getWidth(int column) {
            return Math.round(widths[column+1] * density);
        }

        @Override
        public int getHeight(int row) {
            final int height;
            if (row == -1) {
                height = 35;
            } else if (isFamily(row)) {
                height = 55;
            } else {
                height =65;
            }
            return Math.round(height * density);
        }

        @Override
        public int getItemViewType(int row, int column) {
            final int itemViewType;
            if (row == -1 && column == -1) {
                itemViewType = 0;
            } else if (row == -1) {
                itemViewType = 1;
            } else if (isFamily(row)) {
                itemViewType = 4;
            } else if (column == -1) {
                itemViewType = 2;
            } else {
                itemViewType = 3;
            }
            return itemViewType;
        }

        private boolean isFamily(int row) {
            int family = 0;
            while (row > 0) {
                row -= familys[family].size() + 1;
                family++;
            }
            return row == 0;
        }

        private NexusTypes getFamily(int row) {
            int family = 0;
            while (row >= 0) {
                row -= familys[family].size() + 1;
                family++;
            }
            return familys[family - 1];
        }

        private Nexus getDevice(int row) {
            int family = 0;
            while (row >= 0) {
                row -= familys[family].size() + 1;
                family++;
            }
            family--;
            return familys[family].get(row + familys[family].size());
        }

        @Override
        public int getViewTypeCount() {
            return 5;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tool_bar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.language) {
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
