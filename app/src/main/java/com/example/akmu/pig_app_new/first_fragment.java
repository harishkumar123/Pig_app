package com.example.akmu.pig_app_new;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import android.R;


/**
 * Created by akmu on 12/13/2017.
 */

public class first_fragment extends Fragment {

    public first_fragment() {
    }


   public String [] hindi={
           "शूकर पालन एप्प",
           "भाकृअनुप-भारतीय पशु चिकित्सा अनुसंधान संस्थान एवं भारतीय कृषि सांख्यिकीय अनुसंधान संस्थान द्वारा विकसित एवं डिजाइन किया गया",
           "वर्तमान में शूकर पालन पशुधन उद्यमियों के लिए एक उभरता हुआ लाभदायक विकल्प है। व्यावसायिक शूकर पालन को बढ़ावा देने के लिए एवं विद्यार्थियों, पशु-चिकित्सकों, विभिन्न विकास संगठनों और उद्यमियों को वैज्ञानिक ज्ञान एवं कौशल प्रदान करने के लिए ”शूकर पालन एप्प“ डिजाइन एवं विकसित किया गया है। यह एक शैक्षिक एप्प है जो शूकर की नस्लें, उनके आवास, आहार, प्रजनन, रख-रखाव और स्वास्थ्य प्रबन्धन की महत्वपूर्ण जानकारी प्रदान करता है। इसके अतिरिक्त इस एप्प की सहायता से शूकर पालन प्रोजेक्ट के बारे में आर्थिक विश्लेषण एवं मूल्यांकन की जानकारी भी प्राप्त की जा सकती है। ",
           "शूकर पालन का महत्व   ",
           "शूकर की प्रमुख नस्लें" ,
        "शूकर आवास प्रबन्धन" ,
           "शूकर आहार व्यवस्था" ,
        "शूकर प्रजनन" ,
           "शूकरों का रख-रखाव" ,
            "शूकर रोग" ,
            "शूकर फार्म के दैनिक कार्यक्रम" ,
            "फार्म पर समस्यायें, कारण एवं  सुझाव  " ,
            "शूकरों की बिक्री " ,
            "क्या करें, क्या न करें " ,
            "शूकर पालन प्रष्नोत्तरी",
           "शूकर पालन प्रोजेक्ट",
            "प्रोजेक्ट टीम " ,
            "विशेष आभार ",
           "वेबसाइट लिंक" ,
            "पता" ,
            "हेल्पलाइन" ,
            " निकट स्थित राजकीय कृषि एवं पशु चिकित्सा विष्वविद्यालय "
   };


    public String [] to_be_used;

    TextView text,bottom_message;
    TextView main_content;

    TextView button1;
    TextView button2;
    TextView button3;
    TextView button4;
    TextView button5;
    TextView button6;
    TextView button7;
    TextView button8;
    TextView button9;
    TextView button10;

    TextView button11;
    TextView button12;
    TextView button13;
    TextView button14;
    TextView button15;
    TextView button16;
    TextView button17;
    TextView button18;
    TextView button19;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        View view = null;

        to_be_used=hindi.clone();

         getActivity().setTitle(to_be_used[0]);

         if(view ==null) {
             view=inflater.inflate(R.layout.first_fragment_layout, container, false);
             text = (TextView) view.findViewById(R.id.textView3);
             bottom_message = (TextView)view.findViewById(R.id.textView2);

             main_content = (TextView)view.findViewById(R.id.textView4);

             imageView = (ImageView)view.findViewById(R.id.imageView2);
             imageView.setImageResource(R.drawable.first);
             // imageView.setOnTouchListener(new ImageMatrixTouchHandler(view.getContext()));

             button1 = (TextView)view.findViewById(R.id.button1);
             button2 = (TextView)view.findViewById(R.id.button2);
             button3 = (TextView)view.findViewById(R.id.button3);
             button4 = (TextView)view.findViewById(R.id.button4);
             button5 = (TextView)view.findViewById(R.id.button5);

             button6 = (TextView)view.findViewById(R.id.button6);
             button7 = (TextView)view.findViewById(R.id.button7);
             button8 = (TextView)view.findViewById(R.id.button8);
             button9 = (TextView)view.findViewById(R.id.button9);
             button10 = (TextView)view.findViewById(R.id.button10);

             button11 = (TextView)view.findViewById(R.id.button11);
             button12 = (TextView)view.findViewById(R.id.button12);
             button13 = (TextView)view.findViewById(R.id.button13);
             //  button14=(TextView)view.findViewById(R.id.button14);
             //   button15=(TextView)view.findViewById(R.id.button15);

             //  button16=(TextView)view.findViewById(R.id.button16);
             //   button17=(TextView)view.findViewById(R.id.button17);
             //   button18=(TextView)view.findViewById(R.id.button18);
             button19 = (TextView) view.findViewById(R.id.button19);


             button1.setText(to_be_used[3]);
             button2.setText(to_be_used[4]);
             button3.setText(to_be_used[5]);
             button4.setText(to_be_used[6]);
             button5.setText(to_be_used[7]);
             button6.setText(to_be_used[8]);
             button7.setText(to_be_used[9]);
             button8.setText(to_be_used[10]);
             button9.setText(to_be_used[11]);
             button10.setText(to_be_used[12]);
             button11.setText(to_be_used[13]);
             button12.setText(to_be_used[14]);
             button13.setText(to_be_used[15]);
             //   button14.setText(to_be_used[16]);
             //   button15.setText(to_be_used[17]);
             //   button16.setText(to_be_used[18]);
             //   button17.setText(to_be_used[19]);
             //   button18.setText(to_be_used[20]);
             button19.setText(to_be_used[21]);

             button1.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     second_fragment sf = new second_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, sf);
                     fragmentTransaction.commit();
                 }
             });
             button2.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {


                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     third_fragment tf = new third_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, tf);
                     fragmentTransaction.commit();
                 }
             });
             button3.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     four_fragment ff = new four_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, ff);
                     fragmentTransaction.commit();
                 }
             });
             button4.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     five_fragment fivef = new five_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, fivef);
                     fragmentTransaction.commit();
                 }
             });
             button5.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     six_fragment sixf = new six_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, sixf);
                     fragmentTransaction.commit();
                 }
             });
             button6.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     seven_fragment sevenf = new seven_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, sevenf);
                     fragmentTransaction.commit();
                 }
             });
             button7.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     eight_fragment eightf = new eight_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, eightf);
                     fragmentTransaction.commit();
                 }
             });
             button8.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     nine_fragment ninef = new nine_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, ninef);
                     fragmentTransaction.commit();
                 }
             });
             button9.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     ten_fragment tenf = new ten_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, tenf);
                     fragmentTransaction.commit();
                 }
             });
             button10.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     eleven_fragment elevenf = new eleven_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, elevenf);
                     fragmentTransaction.commit();
                 }
             });

             button11.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     tweleve_fragment twelevef = new tweleve_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, twelevef);
                     fragmentTransaction.commit();
                 }
             });
             button12.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     thirteen_fragment thirteenf = new thirteen_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, thirteenf);
                     fragmentTransaction.commit();
                 }
             });
             button13.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     twenty_fragment point13f = new twenty_fragment();
                     fragmentTransaction.replace(R.id.frame_layout, point13f);
                     fragmentTransaction.commit();
                 }
             });

     /*   button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        */

             button19.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     Intent intent = new Intent(getActivity(), MapsActivity.class);
                     startActivity(intent);

                 }
             });

             text.setText(to_be_used[0]);
             bottom_message.setText(to_be_used[1]);
             main_content.setText(to_be_used[2]);
             // text.setTextSize(18);
             main_content.setTextSize(16);
             text.setTextColor(Color.parseColor("#000000"));
             main_content.setTextColor(Color.parseColor("#000000"));
             bottom_message.setTextColor(Color.parseColor("#FFF7F9F6"));
             Justification.justify(main_content);

             // Typeface mtypeFace = Typeface.createFromAsset(getActivity().getAssets(), "Roboto-Black.ttf");

             // main_content.setTypeface(mtypeFace);

             bottom_message.setSelected(true);
             bottom_message.setEllipsize(TextUtils.TruncateAt.MARQUEE);
             bottom_message.setSingleLine(true);
         }

        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
