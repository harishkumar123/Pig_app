package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Main_sixth_fragment extends AppCompatActivity {



    public String [] hindi={
            "शूकर पालन एप्प",
            "शूकर प्रजनन" ,
            "(i) मादा - नर चुनाव " ,
            "अच्छे नस्ल के मादा शूकर के गुण  " ,
            "1. चर्बी रहित आयताकार सिर " ,
            "2. गर्दन छोटी एवं मोटी तथा मजबूत कंधा  " ,
            "3. लम्बी तथा माँस से भरी पीठ " ,
            "4. लम्बा, चौड़ा तथा गोलाकार पुट्ठा   " ,
            "5. मांसपेशियों सहित गहरा शरीर" ,
            "6. मजबूत पिछले पैर ",
            "7. 12-14 विकसित थन" ,
            "अच्छे नस्ल के नर शूकर के गुण  " ,
            "1. अच्छा नस्ल एवं वंश " ,
            "2. खुली एवं चमकदार आँखें " ,
            "3. आयताकार साफ बिना चर्बीयुक्त सिर " ,
            "4. गर्दन छोटी एवं मोटी तथा मजबूत कंधा " ,
            "5. लम्बी तथा माँस से भरी पीठ " ,
            "6. लम्बा, चैड़ा तथा गोलाकार पुट्ठा " ,
            "7. शरीर गहरा तथा माँसपेशियों सहित " ,
            "8. बड़ा, बराबर तथा मुलायम अण्डकोष  " ,
            "9. मजबूत पिछले पैर ",
            "(ii) प्रजनन " ,
            "प्रजनन समय : सामान्यत  प्रथम बार मादा शूकरी गर्मी/हीट में 8-10 माह की आयु में आती है जो कि 2 से 3 दिन तक रहती है। ब्याई हुई शूकरी बच्चों को अलग करने के एक सप्ताह बाद पुनः गर्मी/हीट में आती है। मादाओं में गर्मी का पता लगाने के लिए टीजर शूकर को उपयोग में लाना चाहिए। " ,
            "शूकरी में गर्म (हीट) होने के लक्षण " ,
            "1. जननांगों में सूजन एवं लालिमा आना और सफेद स्राव निकलना " ,
            "2. जल्दी-जल्दी मूत्र त्यागना  " ,
            "3. भूख में कमी आना " ,
            "4. अन्य शूकरों पर चढ़ने का प्रयास करना तथा अन्य शूकरों के उन पर चढ़ने पर स्थिर रहना" ,
            "5. बेचैनी " ,
            "6. शूकरी के पिछले भाग पर दबाव डालने पर उसका खड़ा रहना या स्थिर होना " ,
            "प्रजनन विधि " ,
            "प्रजनन हेतु मादा शूकरी को नर बाड़े में ले जाना अधिक उचित है क्योंकि नर शूकर अपने बाड़े में सुचारू रूप से प्रजनन कर सकता है तथा यह अधिक आसान भी है। लगातार 3 दिनों तक प्रजनन कराने के लिए मादा शूकरी को नर बाड़े में छोड़ सकते हैं या हर दिन प्रजनन के बाद पुन: अपने बाड़े में ले जाया जाता है क्योंकि गर्मी/हीट में शूकरी के गर्भाशय में लगातार 3 दिनों तक अंडे उत्सर्जित होते हैं। "


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

    LinearLayout layout1;
    LinearLayout layout2;
    LinearLayout layout3;
    LinearLayout layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sixth_fragment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        to_be_used=hindi.clone();
        setTitle(to_be_used[0]);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Intent intent = getIntent();
        Bundle data = intent.getExtras();

        String number_get= (String) data.get("number");
        System.out.println("number is:"+number_get);

        layout1=(LinearLayout)findViewById(R.id.layout1);
        layout2=(LinearLayout)findViewById(R.id.layout2);
        layout3=(LinearLayout)findViewById(R.id.layout3);
        layout4=(LinearLayout)findViewById(R.id.layout4);



        if(number_get.equals("1")){
            layout2.setVisibility(View.GONE);
            layout3.setVisibility(View.GONE);
            layout4.setVisibility(View.GONE);
        }
        if(number_get.equals("2")){

            layout1.setVisibility(View.GONE);
            layout3.setVisibility(View.GONE);
            layout4.setVisibility(View.GONE);
        }
        if(number_get.equals("3")){
            layout1.setVisibility(View.GONE);
            layout2.setVisibility(View.GONE);
            layout4.setVisibility(View.GONE);

        }
        if(number_get.equals("4")){
            layout1.setVisibility(View.GONE);
            layout2.setVisibility(View.GONE);
            layout3.setVisibility(View.GONE);

        }

        text1=(Button)findViewById(R.id.text1);
        text2=(TextView)findViewById(R.id.text2);
        text3=(TextView)findViewById(R.id.text3);
        text4=(TextView)findViewById(R.id.text4);
        text5=(TextView)findViewById(R.id.text5);
        text6=(TextView)findViewById(R.id.text6);
        text7=(TextView)findViewById(R.id.text7);
        text8=(TextView)findViewById(R.id.text8);
        text9=(TextView)findViewById(R.id.text9);
        text10=(TextView)findViewById(R.id.text10);
        text11=(TextView)findViewById(R.id.text11);
        text12=(TextView)findViewById(R.id.text12);
        text13=(TextView)findViewById(R.id.text13);
        text14=(TextView)findViewById(R.id.text14);
        text15=(TextView)findViewById(R.id.text15);
        text16=(TextView)findViewById(R.id.text16);
        text17=(TextView)findViewById(R.id.text17);
        text18=(TextView)findViewById(R.id.text18);
        text19=(TextView)findViewById(R.id.text19);
        text20=(TextView)findViewById(R.id.text20);
        text21=(TextView)findViewById(R.id.text21);
        text22=(TextView)findViewById(R.id.text22);
        text23=(TextView)findViewById(R.id.text23);
        text24=(TextView)findViewById(R.id.text24);
        text25=(TextView)findViewById(R.id.text25);
        text26=(TextView)findViewById(R.id.text26);
        text27=(TextView)findViewById(R.id.text27);
        text28=(TextView)findViewById(R.id.text28);
        text29=(TextView)findViewById(R.id.text29);
        text30=(TextView)findViewById(R.id.text30);
        text31=(TextView)findViewById(R.id.text31);

        String nodatafound="&#8226;";


        text1.setText(to_be_used[1]);

        text2.setText(to_be_used[2]);
        text3.setText(Html.fromHtml(nodatafound)+" "+to_be_used[3]);
        text4.setText(to_be_used[4]);
        text5.setText(to_be_used[5]);
        text6.setText(to_be_used[6]);
        text7.setText(to_be_used[7]);
        text8.setText(to_be_used[8]);
        text9.setText(to_be_used[9]);
        text10.setText(to_be_used[10]);
        text11.setText(Html.fromHtml(nodatafound)+" "+to_be_used[11]);
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
        text22.setText(Html.fromHtml(nodatafound)+" "+to_be_used[22]);
        text23.setText(Html.fromHtml(nodatafound)+" "+to_be_used[23]);
        text24.setText(to_be_used[24]);
        text25.setText(to_be_used[25]);
        text26.setText(to_be_used[26]);
        text27.setText(to_be_used[27]);
        text28.setText(to_be_used[28]);
        text29.setText(to_be_used[29]);
        text30.setText(Html.fromHtml(nodatafound)+" "+to_be_used[30]);
        text31.setText(to_be_used[31]);



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
        text31.setTextColor(Color.parseColor("#FF2D2B2C"));


        text1.setTextSize(20);
        text2.setTextSize(20);
        text3.setTextSize(20);
        text4.setTextSize(18);
        text5.setTextSize(18);
        text6.setTextSize(18);
        text7.setTextSize(18);
        text8.setTextSize(18);
        text9.setTextSize(18);
        text10.setTextSize(18);
        text11.setTextSize(20);
        text12.setTextSize(18);
        text13.setTextSize(18);
        text14.setTextSize(18);
        text15.setTextSize(18);
        text16.setTextSize(18);
        text17.setTextSize(18);
        text18.setTextSize(18);
        text19.setTextSize(18);
        text20.setTextSize(18);
        text21.setTextSize(20);
        text22.setTextSize(18);
        text23.setTextSize(20);
        text24.setTextSize(18);
        text25.setTextSize(18);
        text26.setTextSize(18);
        text27.setTextSize(18);
        text28.setTextSize(18);
        text29.setTextSize(18);
        text30.setTextSize(20);
        text31.setTextSize(18);

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





    }


}
