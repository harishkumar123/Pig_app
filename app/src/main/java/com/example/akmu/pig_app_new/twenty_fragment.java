package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link twenty_fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link twenty_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class twenty_fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button btnParikalpane, btnTaknikimanak, btnAarthikManak;
    private Button btnP1, btnP2, btnP3, btnP4;
    String text, text11;

    private WebView webView1,webView2;

    private OnFragmentInteractionListener mListener;

    public String [] tobeused={
            "शूकर पालन एप्प",
            "1.	फार्म पर हमेशा प्रजनन योग्य शूकरियां ही रहेगीं, जिनका 100% प्रजनन कराया जाएगा। इन शूकरियों को 9 ब्यांत के बाद बेचा जाएगा और नयी मादाओं का क्रय किया जायेगा।",
            "2.	यह प्रोजेक्ट 5 वर्ष के लिए है, जिसमें 9 ब्यांत से प्राप्त शावकों को बेचा जायेगा। शावकों को 2 महीने की उम्र में माँ से अलग किया जायेगा और उनमें सेे आधे शावकों को बेचा जायेगा तथा आधे शावकों को 8 माह के बाद बेचा जायेगा।",
            "3.	प्रजनक शूकर की मृत्यु के कारण से हुआ नुकसान उस की बीमा राशि के मुआवजों से पूरा किया जायेगा।",
            "4.	निवेश में बढ़ती हुई कीमत को माँस/शावकों की कीमत वृद्धि से निष्प्रभावी किया जायेगा।",
            "5.	अच्छी नस्ल के स्वस्थ्य प्रजनक शूकर जिनका माँस उत्तम, वृद्धि दर तेज तथा प्रजनन क्षमता अधिक हो, को अच्छे ब्रीडर्स या सरकारी संस्था से खरीदने होंगे।",
            "6.	पशुओं की खरीद के लिए फरवरी-मार्च एवं अक्टूबर-नवम्बर के महीने अनुकूल है।",
            "7.	फार्म में लाने से कम से कम एक सप्ताह पहले शूकरों को प्रमुख रोगों (शूकर ज्वर, खुरपका-मुँहपका) के टीके लगाये जायेंगे।",

            "1",//8
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "",
            "",
            "",
            "",
            "",
            "",
            "10",
            "",
            "",
            "",
            "",
            "11",
            "12",

            "प्रजनक शूकरों की उम्र (माह)",//30
            "बैचों की संख्या (प्रजनक शूकर)",
            "दो बैचों में अन्तराल (माह)",
            "प्रति वर्ष ब्यातों की संख्या",
            "शावकों की संख्या/ब्यांत/शूकरी",
            "शावकों (2 माह तक) में मृत्युदर (%)",
            "फैटनर्स में मृत्युदर (%)",
            "दूध छुड़ाने की अवधि (माह)",
            "स्थान की आवश्यकता (वर्ग फिट/शूकर)",
            "प्रजनक नर शूकर",
            "दूध पिलाती शूकरी बच्चों के साथ",
            "शूकरी बिना बच्चों के साथ (शुष्क शूकरी)",
            "फैटनर्स (3-5 माह की आयु)",
            "फैटनर्स (6-8 माह की आयु)",
            "स्टोर रूम (वर्ग फिट)",
            "दाने की आवश्यकता (किग्रा/दिन)",
            "प्रजनक शूकर",
            "शावक (< 2 माह आयु)",
            "फैटनर्स (3-5 माह आयु)",
            "फैटनर्स (6-8 माह आयु)",
            "हरा चारा (किग्रा/दिन/वयस्क)",
            "फैटनर का औसत वजन (किग्रा)",

            "6-7",//52
            "2",
            "3",
            "2",
            "10",
            "10",
            "5",
            "2",
            "",
            "65",
            "80",
            "20",
            "10",
            "15",
            "100",
            "",
            "2.5",
            "0.3",
            "1.5",
            "2.0",
            "2.0",
            "90",

            "1",//74
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "",
            "",
            "",
            "",
            "11",
            "12",
            "13",
            "14",
            "",
            "",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",//99

            "प्रति नर प्रजनक शूकर की कीमत (रू)",//100
            "प्रति प्रजनक शूकरी की कीमत (रू)",
            "बाड़े के निर्माण की लागत (रू/वर्ग फिट)",
            "स्टोर रूम के निर्माण की लागत (रू/वर्ग फिट)",
            "दाने की कीमत (रू/किग्रा)",
            "हरा चारा की कीमत (रू/किग्रा)",
            "बीमा (%)",
            "औषधियों की कीमत (रू/शूकर)",
            "अन्य लागत-बिजली, पानी आदि (रू/शूकर)",
            "कार्य संविदा की लागत - रू/मजदूर/माह (अपेक्षित मजदूरों की संख्या)",
            "10 मादा + 2 नर",
            "20 मादा + 2 नर",
            "50 मादा + 2 नर",
            "100 मादा + 2 नर",
            "शावकों (वीनर) का बिक्री मूल्य (रू/शावक)",
            "फैटनर / प्रजनक शूकरों की कीमत (रू/किग्रा)",
            "अन्त में प्रजनक शूकर-शूकरियों की कीमत",
            "खाद द्वारा आय",
            "शावक (वीनर) या फैटनर (रू/माह)",
            "वयस्क शूकर (रू./माह)",
            "बोरों का बिक्री मूल्य (रू./बोरा)",
            "बाडों पर अवमूल्यन (%)",
            "सीमान्त/मार्जिन धन (%)",
            "श्रृण दर (%)",
            "श्रृण की अवधि (वर्ष)",
            "रियायत अवधि (वर्ष)",

            "8000",//126
            "6000",
            "300",
            "400",
            "18",
            "1.0",
            "4",
            "125",
            "100",
            "",
            "4000(1)",
            "4000(2)",
            "10000(2)",
            "10000(3)",
            "3000",
            "120",
            "मूल कीमत का 150%",
            "",
            "30",
            "60",
            "2",
            "5",
            "15",
            "12",
            "5",
            "1",

            "प्रोजेक्ट"

};

    public String [] tobeused1={
      "क्र.सं.",
      "विवरण"
    };
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;

    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;

    public static int clicktext=0;

    public twenty_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment twenty_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static twenty_fragment newInstance(String param1, String param2) {
        twenty_fragment fragment = new twenty_fragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_twenty_layout, container, false);

        getActivity().setTitle(tobeused[0]);

        layout1=(LinearLayout)view.findViewById(R.id.layout1);
        layout2=(LinearLayout)view.findViewById(R.id.layout2);
        layout3=(LinearLayout)view.findViewById(R.id.layout3);

        layout1.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);
        layout3.setVisibility(View.GONE);

        text1=(TextView)view.findViewById(R.id.text21);
        text2=(TextView)view.findViewById(R.id.text22);
        text3=(TextView)view.findViewById(R.id.text23);
        text4=(TextView)view.findViewById(R.id.text24);
        text5=(TextView)view.findViewById(R.id.text25);
        text6=(TextView)view.findViewById(R.id.text26);
        text7=(TextView)view.findViewById(R.id.text27);
        text8=(TextView)view.findViewById(R.id.text28);

        String nodatafound="&#8226;";

        text1.setText(Html.fromHtml(nodatafound)+" "+tobeused[1]);
        text2.setText(Html.fromHtml(nodatafound)+" "+tobeused[2]);
        text3.setText(Html.fromHtml(nodatafound)+" "+tobeused[3]);
        text4.setText(Html.fromHtml(nodatafound)+" "+tobeused[4]);
        text5.setText(Html.fromHtml(nodatafound)+" "+tobeused[5]);
        text6.setText(Html.fromHtml(nodatafound)+" "+tobeused[6]);
        text7.setText(Html.fromHtml(nodatafound)+" "+tobeused[7]);
        text8.setText(tobeused[152]);

        text1.setTextColor(Color.parseColor("#000000"));
        text2.setTextColor(Color.parseColor("#FF2D2B2C"));
        text3.setTextColor(Color.parseColor("#FF2D2B2C"));
        text4.setTextColor(Color.parseColor("#FF2D2B2C"));
        text5.setTextColor(Color.parseColor("#FF2D2B2C"));
        text6.setTextColor(Color.parseColor("#FF2D2B2C"));
        text7.setTextColor(Color.parseColor("#FF2D2B2C"));
        text8.setTextColor(Color.parseColor("#000000"));

        text1.setTextSize(20);
        text2.setTextSize(20);
        text3.setTextSize(20);
        text4.setTextSize(20);
        text5.setTextSize(20);
        text6.setTextSize(20);
        text7.setTextSize(20);
        text8.setTextSize(20);

        btnParikalpane=(Button)view.findViewById(R.id.parikalpana_text);
        btnParikalpane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   if(layout1.getVisibility()==View.GONE){
                    layout1.setVisibility(View.VISIBLE);
                }else{
                    layout1.setVisibility(View.GONE);
                }*/
                clicktext=21;
                Intent pi=new Intent(getActivity(),ProjectTwoActivity.class);
                startActivity(pi);
            }
        });

        btnTaknikimanak=(Button)view.findViewById(R.id.taknikimanak_text);
        btnTaknikimanak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  if(layout2.getVisibility()==View.GONE){
                    layout2.setVisibility(View.VISIBLE);
                }else{
                    layout2.setVisibility(View.GONE);
                }*/
              clicktext=22;
              Intent tmi=new Intent(getActivity(),ProjectTwoActivity.class);
              startActivity(tmi);
            }
        });

        btnAarthikManak=(Button)view.findViewById(R.id.aarthikmanak_text);
        btnAarthikManak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   if(layout3.getVisibility()==View.GONE){
                    layout3.setVisibility(View.VISIBLE);
                }else{
                    layout3.setVisibility(View.GONE);
                }*/
             clicktext=23;
             Intent ami=new Intent(getActivity(),ProjectTwoActivity.class);
             startActivity(ami);
            }
        });

        btnP1=(Button)view.findViewById(R.id.project_1_text);
        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicktext=30;
                Intent P1=new Intent(getActivity(), ProjectOneActivity.class);
                startActivity(P1);
            }
        });
        btnP2=(Button)view.findViewById(R.id.project_2_text);
        btnP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicktext=31;
                Intent P2=new Intent(getActivity(), ProjectOneActivity.class);
                startActivity(P2);
            }
        });
        btnP3=(Button)view.findViewById(R.id.project_3_text);
        btnP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicktext=32;
                Intent P3=new Intent(getActivity(), ProjectOneActivity.class);
                startActivity(P3);
            }
        });
        btnP4=(Button)view.findViewById(R.id.project_4_text);
        btnP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               clicktext=33;
               Intent P4=new Intent(getActivity(), ProjectOneActivity.class);
               startActivity(P4);
            }
        });

        webView1=(WebView)view.findViewById(R.id.webView1);

        text = "<html><body bgcolor=\"#90caf9\">";
        text+= "<table  border=\"1px solid black\" cellpadding=\"5\" cellspacing=\"0\">";

        text+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"blue\">"+tobeused1[0]+"</font></h4></td><td colspan=\"6\" align=\"center\" valign=\"middle\"><h4><font color=\"blue\">" + tobeused1[1] + "</font></h4></td></tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[8]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[30]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[52]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[9]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[31]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[53]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[10]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[32]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[54]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[11]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[33]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[55]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[12]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[34]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[56]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[13]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[35]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[57]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[14]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[36]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[58]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[15]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[37]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[59]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[16]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[38]+"</h4>";
        text+="</td>";
       // text+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
       // text+="<h4>"+tobeused[60]+"</h4>";
        //text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[17]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[38]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[61]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[18]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[39]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[62]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[19]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[40]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[63]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[20]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[41]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[64]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[21]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[42]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[65]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[22]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[43]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[66]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[23]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[44]+"</h4>";
        text+="</td>";
        // text+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
        // text+="<h4>"+tobeused[67]+"</h4>";
        //text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[24]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[45]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[68]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[25]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[46]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[69]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[26]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[47]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[70]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[27]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[48]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[71]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[28]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[49]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[72]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "<tr height =10>";
        text+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[29]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text+="<h4>"+tobeused[50]+"</h4>";
        text+="</td>";
        text+= "<td colspan=\"2\" align=\"center\" valign=\"middle\">";
        text+="<h4>"+tobeused[73]+"</h4>";
        text+= "</td>";
        text+= "</tr>";

        text+= "</table>";
        text+= "</body></html>";

        webView1.loadDataWithBaseURL("file:///android_asset/img/", text, "text/html", "utf-8", null);

        webView2=(WebView)view.findViewById(R.id.webView2);

        text11 = "<html><body bgcolor=\"#90caf9\">";
        text11+= "<table  border=\"1px solid black\" cellpadding=\"5\" cellspacing=\"0\">";

        text11+= "<tr height =10><td colspan=\"1\" align=\"center\" valign=\"middle\"><h4><font color=\"blue\">"+tobeused1[0]+"</font></h4></td><td colspan=\"5\" align=\"center\" valign=\"middle\"><h4><font color=\"blue\">" + tobeused1[1] + "</font></h4></td></tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[74]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[100]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[126]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[75]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[101]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[127]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[76]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[102]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[128]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[77]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[103]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[129]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[78]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[104]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[130]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[79]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[105]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[131]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[80]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[106]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[132]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[81]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[107]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[133]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[82]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[108]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[134]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[83]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[109]+"</h4>";
        text11+="</td>";
      /*  text11+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[135]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";*/

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[84]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[110]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[136]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[85]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[111]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[137]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[86]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[112]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[138]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[87]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[113]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[139]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[88]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[114]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[140]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[89]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[115]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[141]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[90]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[116]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[142]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[91]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"5\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[117]+"</h4>";
        text11+="</td>";
      /*  text11+= "<td colspan=\"\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[143]+"</h4>";
        text11+= "</td>";*/
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[92]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[118]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[144]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[93]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[119]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[145]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[94]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[120]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[146]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[95]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[121]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[147]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";


        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[96]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[122]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[148]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[97]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[123]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[149]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[98]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[124]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[150]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "<tr height =10>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[99]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"4\" align=\"justify\" valign=\"middle\">";
        text11+="<h4>"+tobeused[125]+"</h4>";
        text11+="</td>";
        text11+= "<td colspan=\"1\" align=\"center\" valign=\"middle\">";
        text11+="<h4>"+tobeused[151]+"</h4>";
        text11+= "</td>";
        text11+= "</tr>";

        text11+= "</table>";
        text11+= "</body></html>";

        webView2.loadDataWithBaseURL("file:///android_asset/img/", text11, "text/html", "utf-8", null);
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
