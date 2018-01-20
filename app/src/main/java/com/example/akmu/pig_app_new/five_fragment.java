package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by akmu on 12/14/2017.
 */

public class five_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public five_fragment() {
        // Required empty public constructor
    }

    public String [] hindi={
            " शूकर पालन एप्प",
            " शूकर आहार व्यवस्था",
            "(i) शूकरों के लिए संतुलित आहार ",
            "खाद्य-पदार्थो के विकल्प",
            "1. मक्का को टूटे चावल, गेंहूँ, बाजरा,जौ, शीरा द्वारा",
            "2. मूँगफली की खली को तिल, नारियल, शीशम अथवा सोयाबीन की खली द्वारा ",
            "3. फिश मील को वसा रहित दूध के पाउडर द्वारा ",
            " विभिन्न अवस्थाओं में शूकरों का दाना",
            "(ii) पानी की आवश्यकता ",
            "आठ से बारह सप्ताह की उम्र के बच्चों को लगभग 4 लीटर पानी प्रतिदिन देना चाहिए। इसी प्रकार 8 से 25 सप्ताह के उम्र तक के शूकरों को 6 से 8 लीटर, गर्भवती शूकरियों को 10 से 20 लीटर, बच्चों को दूध पिलाने वाली शूकरियों को 20 से 30 लीटर एवं नर शूकरों को 20 से 25 लीटर पानी प्रतिदिन देना चाहिए।",
            "(iii) कम लागत में शूकर आहार" ,
            " घरों, होटलों, हाॅस्टलों एवं मेस आदि से बचे भोजन को खिलाने से गुणवत्ता अनुसार 20-45 किग्रा. की वृद्धि प्राप्त की जा सकती है, परन्तु खिलाने से पूर्व हानिकारक वस्तुएँ हटा लें और गर्मी के मौसम में अच्छी प्रकार उबालकर उसे खिलाना चाहिए। ऐसे बचे भोजन में 70% प्रतिशत नमी होती है अतः एक किलो आहार की जगह 3 किलो बचा किचन वेस्ट खिलाना चाहिए। " ,
            " शीरा ऊर्जा का मुख्य स्त्रोत है, परन्तु इसका उपयोग तभी लाभदायक है जब यह सस्ता हो । इसका अधिक उपयोग छोटे शूकरों में दस्त लगा सकता है। वृद्धिशील शूकरों में राशन का 20% तथा बड़े शूकरों में 40% तक शीरा खिलाया जा सकता है।" ,
            " बेकरी का बचा सूखा पदार्थ अनाजों का प्रतिपूरक बन सकता है। बेकरी का बचा पदार्थ देते समय यह ध्यान रखना चाहिए कि यह पुराना होने के कारण पेट की बीमारी उत्पन्न कर सकता है क्योंकि इसमें फफॅूदी आने का डर बना रहता है। ",
            " आलू सस्ता होने पर शूकर आहार में यह प्रयुक्त हो सकता है। जब भी आलू खिलायें उबाल कर खिलायें । तीन भाग आलू एवं एक भाग अनाज मिलाकर शूकर आहार तैयार कर सकते हैं।" ,
            " शकरकन्दी शूकरों का स्वादिष्ट आहार है और ऊर्जा का अच्छा स्रोत है। आहार में अनाज का 35 से 50% शकरकन्दी का आटा दिया जा सकता है। परन्तु इसे छोटे शावकों को नहीं खिलाना चाहिए। " ,
            " सब्जी मण्डी की बची गाजर, चुकन्दर, गोभी आदि को भी शूकर आहार में सम्मिलित किया जा सकता है। " ,
            " चावल की पाॅलिश भी बड़े शूकरों को 50% अनाज के साथ मिलाकर खिला सकते हैें। छोटे शावकों को ये राशन में मिलाकर नहीं देना चाहिए। इससे शावकोें में दस्त लगने का खतरा बना रहता है।" ,
            " गेंहूँ या चावल के टुकड़े यदि पर्याप्त मात्रा में सस्ते उपलब्ध हो तो इनको कुल आहार का 60% तक प्रयोग किया जा सकता है।" ,
            " शूकरों को स्वस्थ एवं कम लागत में पालने के लिए मुलायम चारे जैसे बरसीम, मक्का इत्यादि को 2-3 किग्रा प्रतिदिन खिलाना उत्तम होता है।" ,
            " आमतौर पर उपयुक्त तरह के बचे आहार के साथ बाजार में उपलब्ध खनिज लवण को आहार के साथ 5-10 ग्राम मिलाना चाहिए।" ,
            " केले के पत्ते, सूबबूल के पत्ते व फलियाँ, पपीता, अनन्नास, कद्दू, टमाटर आदि के सस्ते होने पर उन्हें आवश्यकतानुसार शूकर आहार के रूप में 5 से 20% तक दे सकते हैं। ",
            " गुड़ की मैली में पर्याप्त मात्रा में ग्लूकोज होने के कारण यह मक्के की जगह प्रयोग में लाया जा सकता है। इस मैली में फाइबर न होने के कारण 1 किलो चोकर में 1 किग्रा मैली एवं पानी मिलाकर घोल बनाकर खिलाये। एक वयस्क पशु को 3.5 किलो मैली खिलायी जा सकती है यदि इससे अधिक मैली खिलायेंगे तो अधिक रसायन के कारण शूकर का पेट फूलकर मरने का डर रहता है। ",
            "(iv) क्षेत्र विशेष राशन"

    };

    public String [] to_be_used;
    TextView text1;
    Button btn1,btn2,btn3,btn4;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment five_fragment_one.
     */
    // TODO: Rename and change types and number of parameters
    public static five_fragment newInstance(String param1, String param2) {
        five_fragment fragment = new five_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.five_fragment_layout, container, false);
        to_be_used=hindi.clone();
        getActivity().setTitle(to_be_used[0]);

        text1=(TextView) view.findViewById(R.id.text1);
        text1.setText(to_be_used[1]);
        text1.setTextSize(23);
        text1.setTextColor(Color.parseColor("#000000"));

        btn1=(Button) view.findViewById(R.id.butn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getActivity(),SantulitAahaar.class);
                startActivity(a);
            }
        });
        btn2=(Button) view.findViewById(R.id.butn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getActivity(),PaniAvshykta.class);
                startActivity(a);
            }
        });
        btn3=(Button)view.findViewById(R.id.butn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(getActivity(),KamLagatShukarAaahar.class);
                startActivity(a);
            }
        });
        btn4=(Button)view.findViewById(R.id.butn4);
        // Inflate the layout for this fragment
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
      /*  if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }*/
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}

/*public class five_fragment extends Fragment {

    public five_fragment(){
    }

    */
  /*  public String [] hindi={
            " शूकर पालन एप्प",
            " शूकर आहार व्यवस्था",
            "(i) शूकरों के लिए संतुलित आहार ",
            "खाद्य-पदार्थो के विकल्प",
                    "1. मक्का को टूटे चावल, गेंहूँ, बाजरा,जौ, शीरा द्वारा",
                    "2. मूँगफली की खली को तिल, नारियल, शीशम अथवा सोयाबीन की खली द्वारा ",
                    "3.फिश मील को वसारहित दूध के पाउडर द्वारा ",
                    " विभिन्न अवस्थाओं में शूकरों का दाना",

            "(ii) पानी की आवश्यकता ",
                    "आठ से बारह सप्ताह की उम्र के बच्चों को लगभग 4 लीटर पानी प्रतिदिन देना चाहिए। इसी प्रकार 8 से 25 सप्ताह के उम्र तक के शूकरों को 6 से 8 लीटर, गर्भवती शूकरियों को 10 से 20 लीटर, बच्चों कोदूध पिलाने वाली शूकरियों को 20 से 30 लीटर एवं नर शूकरों को 20 से 25 लीटर पानी प्रतिदिन देना चाहिए।",
            "(iii) कम लागत में शूकर आहार" ,
                    " घरों, होटलों, हाॅस्टलों एवं मेस आदि से बचे भोजन को खिलाने से गुणवत्ता अनुसार 20-45 किग्रा. की वृद्धि प्राप्त की जा सकती है, परन्तु खिलाने से पूर्व हानिकारक वस्तुएँ हटा लें और गर्मी के मौसम में अच्छी प्रकार उबालकर उसे खिलाना चाहिए। ऐसे बचे भोजन में 70ः प्रतिशत नमी होती है अतः एक किलो आहार की जगह 3 किलो बचा किचन वेस्ट खिलाना चाहिए। " ,
                    " शीराऊर्जा का मुख्य स्त्रोत है, परन्तु इसका उपयोग तभी लाभदायक है जब यह सस्ता हो । इसका अधिक उपयोग छोटे शूकरों में दस्त लगा सकता है। वृद्धिशील शूकरों में राशन का 20ःतथा बड़े शूकरों  में 40ः तक शीरा खिलाया जा सकता है।" ,
                    " बेकरी का बचासूखा पदार्थ अनाजों का प्रतिपूरक बन सकता है। बेकरी का बचा पदार्थ देते समय यह ध्यान रखना चाहिए कि यह पुराना होने के कारण पेट की बीमारी उत्पन्न कर सकता है क्योंकि इसमें फफॅूदी आने का डर बना रहता है। ",
                    " आलूसस्ता होने पर शूकर आहार में यह प्रयुक्त हो सकता है। जब भी आलू खिलायें उबाल कर खिलायंे। तीन भाग आलू एवं एक भाग अनाज मिलाकर शूकर आहार तैयार कर सकते हैं।" ,
                    " शकरकन्दी शूकरों का स्वादिष्ट आहार है और ऊर्जा का अच्छा स्रोत है। आहार में अनाज का 35 से 50ः शकरकन्दी का आटा दिया जा सकता है। परन्तु इसे छोटे शावकों को नहीं खिलाना चाहिए। " ,
                    " सब्जी मण्डी की बची गाजर, चुकन्दर, गोभी आदि को भी शूकर आहार में सम्मिलित किया जा सकता है। " ,
                    " चावल की पाॅलिश भी बड़े शूकरों को 50ः अनाज के साथ मिलाकर खिला सकते हैें। छोटे शावकों को ये राशन में मिलाकर नहीं देना चाहिए। इससे शावकोें में दस्त लगने का खतरा बना रहता है।" ,
                    " गेंहंूँ या चावल के टुकड़े यदि पर्याप्त मात्रा में सस्ते उपलब्ध हो तो इनको कुल आहार का 60ःतक प्रयोग किया जा सकता है।" ,
                    " शूकरों को स्वस्थ एवं कम लागत में पालने के लिए मुलायम चारे जैसे बरसीम, मक्का इत्यादि को 2-3 किग्रा प्रतिदिन खिलाना उत्तम होता है।" ,
                    " आमतौर पर उपयुक्त तरह के बचे आहार के साथ बाजार में उपलब्ध खनिज लवण को आहार के साथ 5-10 ग्राम मिलाना चाहिए।" ,
                    " केले के पत्ते, सूबबूल के पत्ते व फलियाँ, पपीता, अनन्नास, कद्दू, टमाटर आदि के सस्ते होने पर उन्हें आवश्यकतानुसार शूकर आहार के रूप में 5 से 20ः तक दे सकते हैं। ",
                    " गुड़ की मैली में पर्याप्त मात्रा में ग्लूकोज होने के कारण यह मक्के की जगह प्रयोग में लाया जा सकता है। इस मैली में फाइबर न होने के कारण 1किलो चोकर में 1 किग्रा मैली एवं पानी मिलाकर घोल बनाकर खिलाये। एक वयस्क पशु को 3.5 किलो मैली खिलायी जा सकती है यदि इससे अधिक मैली खिलायंेगे तो अधिक रसायन के कारण शूकर का पेट फूलकर मरने का डर रहता है। ",
            "(iv) क्षेत्र विषेष राषन",

            "खाद्य पदार्थ(%)",
            " वीनिंग शूकर (5-15 किग्रा)वीनर राशन ",
            "वृद्धिशील शूकर (15-50 किग्रा) ग्रोवर राशन ",
            "व्यस्क शूकर (50-90 किग्रा) फिनिशर राशन ",
            "गाभिनशूकरी ",
            "दूध पिलाने वाली शूकरी ",
            "नर शूकर",

            "मक्का  " ,
            "55 ","50 ","45 " ,"50 ","55 ","60 " ,
                    "मूँगफली की खली  " ,
            "20 ","20 ","20","18","15","20 " ,
                    "गेंहॅू का चोकर  " ,
            "13 ","18","25 ","20 ","18 ","13" ,
                    "शीरा  " ,
            "5 ","5","5 ","5","5 ","-" ,
                    "फिश मील " ,
            "5 ","5","3","5","5","5 " ,
                    "लवण मिश्रण  " ,
            "1.5","1.5","1.5 ","1.5","1.5","1.5" ,
                    "नमक ",
            "0.5","0.5","0.5","0.5","0.5","0.5",


            "श्रेणी ",
            "वजन (किग्रा) ",
            "दाना प्रतिदिन (किग्रा)",

            "वृद्धि शील शूकर",
            "25 ",
            "1.0" ,

            "वृद्धि शील शूकर",
                    "25-45",
            "2.0 " ,

            "वृद्धि शील शूकर",
                    "45-100 ",
            "2.0-3.0 " ,

            "वृद्धि शील शूकर",
                    "100 से ऊपर",
            "3.0-4.0",

            "गर्भवती शूकरी " ,
            "150 ",
            "3.5 " ,
                    "दूध पिलाने वाली शूकरी  " ,
            "150",
            "5.0" ,
                    "नर शूकर  " ,
            "150 ",
            "3.5" ,
                    "शूकरी  " ,
            "150-225 ",
            "4.5 "






    };

    */

   /* public String [] hindi={
            " शूकर पालन एप्प",
            " शूकर आहार व्यवस्था",
            "(i) शूकरों के लिए संतुलित आहार ",
            "खाद्य-पदार्थो के विकल्प",
            "1. मक्का को टूटे चावल, गेंहूँ, बाजरा,जौ, शीरा द्वारा",
            "2. मूँगफली की खली को तिल, नारियल, शीशम अथवा सोयाबीन की खली द्वारा ",
            "3. फिश मील को वसा रहित दूध के पाउडर द्वारा ",
            " विभिन्न अवस्थाओं में शूकरों का दाना",
            "(ii) पानी की आवश्यकता ",
            "आठ से बारह सप्ताह की उम्र के बच्चों को लगभग 4 लीटर पानी प्रतिदिन देना चाहिए। इसी प्रकार 8 से 25 सप्ताह के उम्र तक के शूकरों को 6 से 8 लीटर, गर्भवती शूकरियों को 10 से 20 लीटर, बच्चों को दूध पिलाने वाली शूकरियों को 20 से 30 लीटर एवं नर शूकरों को 20 से 25 लीटर पानी प्रतिदिन देना चाहिए।",
            "(iii) कम लागत में शूकर आहार" ,
            " घरों, होटलों, हाॅस्टलों एवं मेस आदि से बचे भोजन को खिलाने से गुणवत्ता अनुसार 20-45 किग्रा. की वृद्धि प्राप्त की जा सकती है, परन्तु खिलाने से पूर्व हानिकारक वस्तुएँ हटा लें और गर्मी के मौसम में अच्छी प्रकार उबालकर उसे खिलाना चाहिए। ऐसे बचे भोजन में 70% प्रतिशत नमी होती है अतः एक किलो आहार की जगह 3 किलो बचा किचन वेस्ट खिलाना चाहिए। " ,
            " शीरा ऊर्जा का मुख्य स्त्रोत है, परन्तु इसका उपयोग तभी लाभदायक है जब यह सस्ता हो । इसका अधिक उपयोग छोटे शूकरों में दस्त लगा सकता है। वृद्धिशील शूकरों में राशन का 20% तथा बड़े शूकरों में 40% तक शीरा खिलाया जा सकता है।" ,
            " बेकरी का बचा सूखा पदार्थ अनाजों का प्रतिपूरक बन सकता है। बेकरी का बचा पदार्थ देते समय यह ध्यान रखना चाहिए कि यह पुराना होने के कारण पेट की बीमारी उत्पन्न कर सकता है क्योंकि इसमें फफॅूदी आने का डर बना रहता है। ",
            " आलू सस्ता होने पर शूकर आहार में यह प्रयुक्त हो सकता है। जब भी आलू खिलायें उबाल कर खिलायें । तीन भाग आलू एवं एक भाग अनाज मिलाकर शूकर आहार तैयार कर सकते हैं।" ,
            " शकरकन्दी शूकरों का स्वादिष्ट आहार है और ऊर्जा का अच्छा स्रोत है। आहार में अनाज का 35 से 50% शकरकन्दी का आटा दिया जा सकता है। परन्तु इसे छोटे शावकों को नहीं खिलाना चाहिए। " ,
            " सब्जी मण्डी की बची गाजर, चुकन्दर, गोभी आदि को भी शूकर आहार में सम्मिलित किया जा सकता है। " ,
            " चावल की पाॅलिश भी बड़े शूकरों को 50% अनाज के साथ मिलाकर खिला सकते हैें। छोटे शावकों को ये राशन में मिलाकर नहीं देना चाहिए। इससे शावकोें में दस्त लगने का खतरा बना रहता है।" ,
            " गेंहूँ या चावल के टुकड़े यदि पर्याप्त मात्रा में सस्ते उपलब्ध हो तो इनको कुल आहार का 60% तक प्रयोग किया जा सकता है।" ,
            " शूकरों को स्वस्थ एवं कम लागत में पालने के लिए मुलायम चारे जैसे बरसीम, मक्का इत्यादि को 2-3 किग्रा प्रतिदिन खिलाना उत्तम होता है।" ,
            " आमतौर पर उपयुक्त तरह के बचे आहार के साथ बाजार में उपलब्ध खनिज लवण को आहार के साथ 5-10 ग्राम मिलाना चाहिए।" ,
            " केले के पत्ते, सूबबूल के पत्ते व फलियाँ, पपीता, अनन्नास, कद्दू, टमाटर आदि के सस्ते होने पर उन्हें आवश्यकतानुसार शूकर आहार के रूप में 5 से 20% तक दे सकते हैं। ",
            " गुड़ की मैली में पर्याप्त मात्रा में ग्लूकोज होने के कारण यह मक्के की जगह प्रयोग में लाया जा सकता है। इस मैली में फाइबर न होने के कारण 1 किलो चोकर में 1 किग्रा मैली एवं पानी मिलाकर घोल बनाकर खिलाये। एक वयस्क पशु को 3.5 किलो मैली खिलायी जा सकती है यदि इससे अधिक मैली खिलायेंगे तो अधिक रसायन के कारण शूकर का पेट फूलकर मरने का डर रहता है। ",
            "(iv) क्षेत्र विशेष राशन",

            "खाद्य पदार्थ(%)",
            " वीनिंग शूकर (5-15 किग्रा)वीनर राशन ",
            "वृद्धिशील शूकर (15-50 किग्रा) ग्रोवर राशन ",
            "व्यस्क शूकर (50-90 किग्रा) फिनिशर राशन ",
            "गाभिनशूकरी ",
            "दूध पिलाने वाली शूकरी ",
            "नर शूकर",

            "मक्का  " ,
            "55 ","50 ","45 " ,"50 ","55 ","60 " ,
            "मूँगफली की खली  " ,
            "20 ","20 ","20","18","15","20 " ,
            "गेंहॅू का चोकर  " ,
            "13 ","18","25 ","20 ","18 ","13" ,
            "शीरा  " ,
            "5 ","5","5 ","5","5 ","-" ,
            "फिश मील " ,
            "5 ","5","3","5","5","5 " ,
            "लवण मिश्रण  " ,
            "1.5","1.5","1.5 ","1.5","1.5","1.5" ,
            "नमक ",
            "0.5","0.5","0.5","0.5","0.5","0.5",


            "श्रेणी ",
            "वजन (किग्रा) ",
            "दाना प्रतिदिन (किग्रा)",

            "वृद्धि शील शूकर",
            "25 ",
            "1.0" ,

            "वृद्धि शील शूकर",
            "25-45",
            "2.0 " ,

            "वृद्धि शील शूकर",
            "45-100 ",
            "2.0-3.0 " ,

            "वृद्धि शील शूकर",
            "100 से ऊपर",
            "3.0-4.0",

            "गर्भवती शूकरी " ,
            "150 ",
            "3.5 " ,
            "दूध पिलाने वाली शूकरी  " ,
            "150",
            "5.0" ,
            "नर शूकर  " ,
            "150 ",
            "3.5" ,
            "शूकरी  " ,
            "150-225 ",
            "4.5 "



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
    LinearLayout layout;
    LinearLayout layout1;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.five_fragment_layout, container, false);

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
        layout=(LinearLayout)view.findViewById(R.id.layout);
        layout1=(LinearLayout)view.findViewById(R.id.layout1);

        String nodatafound="&#8226;";


        text1.setText(to_be_used[1]);
        text2.setText(to_be_used[2]);
        text3.setText(Html.fromHtml(nodatafound)+" "+to_be_used[3]);
        text4.setText(to_be_used[4]);
        text5.setText(to_be_used[5]);
        text6.setText(to_be_used[6]);
        text7.setText(Html.fromHtml(nodatafound)+" "+to_be_used[7]);
        text8.setText(to_be_used[8]);
        text9.setText(to_be_used[9]);
        text10.setText(to_be_used[10]);
        text11.setText(Html.fromHtml(nodatafound)+" "+to_be_used[11]);
        text12.setText(Html.fromHtml(nodatafound)+" "+to_be_used[12]);
        text13.setText(Html.fromHtml(nodatafound)+" "+to_be_used[13]);
        text14.setText(Html.fromHtml(nodatafound)+" "+to_be_used[14]);
        text15.setText(Html.fromHtml(nodatafound)+" "+to_be_used[15]);
        text16.setText(Html.fromHtml(nodatafound)+" "+to_be_used[16]);
        text17.setText(Html.fromHtml(nodatafound)+" "+to_be_used[17]);
        text18.setText(Html.fromHtml(nodatafound)+" "+to_be_used[18]);
        text19.setText(Html.fromHtml(nodatafound)+" "+to_be_used[19]);
        text20.setText(Html.fromHtml(nodatafound)+" "+to_be_used[20]);
        text21.setText(Html.fromHtml(nodatafound)+" "+to_be_used[21]);
        text22.setText(Html.fromHtml(nodatafound)+" "+to_be_used[22]);
        text23.setText(to_be_used[23]);



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

        */


