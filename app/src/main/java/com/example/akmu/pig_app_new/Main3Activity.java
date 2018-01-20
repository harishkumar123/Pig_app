package com.example.akmu.pig_app_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main3Activity extends AppCompatActivity {


    Button button1,button2,button3,button4,button5;
    Button button6,button7,button8,button9,button10;
    Button button11,button12,button13,button14,button15;

    CardView card_view1,card_view2,card_view3,card_view4,card_view5;
    CardView card_view6,card_view7,card_view8,card_view9,card_view10;
    CardView card_view11,card_view12,card_view13,card_view14,card_view15;

    View view1,view2,view3,view4,view5;
    View view6,view7,view8,view9,view10;
    View view11,view12,view13,view14;


    public String[] to_be_used = {
            " शूकर पालन एप्प",
            "शूकर रोग",
            " स्वाइन फीवर/शूकर ज्वर/हॉग  कालरा",
        "शूकर चेचक/स्वाइन पॉक्स  ",
        "  शूकर प्लेग/गलघोंटू रोग ",
        "  खुरपका - मुँहपका रोग ",
        "  पोरसाइन रेस्पिरेटरी रिप्रोडक्टिव सिंड्रोम (पी.आर.आर.एस.)",
        "  संक्रामक  गर्भपात ",
        "  शूकर पैराटाईफाइड   ",
        "  एरिसिपेलस रोग/डायमण्ड त्वचा रोग",
        "  स्वाइन वेसिकुलर इक्जैंथिमा ",
        " अंत:परजीवी ",
        "   बाह्य परजीवी ",
        "  एनीमिया (खून की कमी)",
        "   पैराकेराटोसिस  ",
        "  विटामिन-ए की अल्पता  ",
        "    हाइपोग्लाइसीमिया  "

    };

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle(to_be_used[0]);
        Intent intent = getIntent();
        Bundle data = intent.getExtras();

        String number_get= (String) data.get("number");
        System.out.println("number is getting :"+number_get);

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        textView=(TextView)findViewById(R.id.textView1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);
        button14=(Button)findViewById(R.id.button14);
        button15=(Button)findViewById(R.id.button15);

        card_view1=(CardView)findViewById(R.id.card_view1);
        card_view2=(CardView)findViewById(R.id.card_view2);
        card_view3=(CardView)findViewById(R.id.card_view3);
        card_view4=(CardView)findViewById(R.id.card_view4);
        card_view5=(CardView)findViewById(R.id.card_view5);
        card_view6=(CardView)findViewById(R.id.card_view6);
        card_view7=(CardView)findViewById(R.id.card_view7);
        card_view8=(CardView)findViewById(R.id.card_view8);
        card_view9=(CardView)findViewById(R.id.card_view9);
        card_view10=(CardView)findViewById(R.id.card_view10);
        card_view11=(CardView)findViewById(R.id.card_view11);
        card_view12=(CardView)findViewById(R.id.card_view12);
        card_view13=(CardView)findViewById(R.id.card_view13);
        card_view14=(CardView)findViewById(R.id.card_view14);
        card_view15=(CardView)findViewById(R.id.card_view15);

        view1=(View)findViewById(R.id.view1);
        view2=(View)findViewById(R.id.view2);
        view3=(View)findViewById(R.id.view3);
        view4=(View)findViewById(R.id.view4);
        view5=(View)findViewById(R.id.view5);
        view6=(View)findViewById(R.id.view6);
        view7=(View)findViewById(R.id.view7);
        view8=(View)findViewById(R.id.view8);
        view9=(View)findViewById(R.id.view9);
        view10=(View)findViewById(R.id.view10);
        view11=(View)findViewById(R.id.view11);
        view12=(View)findViewById(R.id.view12);
        view13=(View)findViewById(R.id.view13);
        view14=(View)findViewById(R.id.view14);




        textView.setText(to_be_used[1]);
        button1.setText(to_be_used[2]);
        button2.setText(to_be_used[3]);
        button3.setText(to_be_used[4]);
        button4.setText(to_be_used[5]);
        button5.setText(to_be_used[6]);
        button6.setText(to_be_used[7]);
        button7.setText(to_be_used[8]);
        button8.setText(to_be_used[9]);
        button9.setText(to_be_used[10]);
        button10.setText(to_be_used[11]);
        button11.setText(to_be_used[12]);
        button12.setText(to_be_used[13]);
        button13.setText(to_be_used[14]);
        button14.setText(to_be_used[15]);
        button15.setText(to_be_used[16]);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","1");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","2");
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","3");
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","4");
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","5");
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","6");
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","7");
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","8");
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","9");
                startActivity(intent);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","10");
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","11");
                startActivity(intent);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","12");
                startActivity(intent);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","13");
                startActivity(intent);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","14");
                startActivity(intent);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Disease_activity.class);
                intent.putExtra("number","15");
                startActivity(intent);
            }
        });

        if(number_get.equals("1")){

          /*  button10.setVisibility(View.GONE);
            button11.setVisibility(View.GONE);
            button12.setVisibility(View.GONE);
            button13.setVisibility(View.GONE);
            button14.setVisibility(View.GONE);
            button15.setVisibility(View.GONE);
            */
            card_view10.setVisibility(View.GONE);
            card_view11.setVisibility(View.GONE);
            card_view12.setVisibility(View.GONE);
            card_view13.setVisibility(View.GONE);
            card_view14.setVisibility(View.GONE);
            card_view15.setVisibility(View.GONE);

            view10.setVisibility(View.GONE);
            view11.setVisibility(View.GONE);
            view12.setVisibility(View.GONE);
            view13.setVisibility(View.GONE);
            view14.setVisibility(View.GONE);

        }
        if(number_get.equals("2")){

           /* button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
            button3.setVisibility(View.GONE);
            button4.setVisibility(View.GONE);
            button5.setVisibility(View.GONE);
            button6.setVisibility(View.GONE);
            button7.setVisibility(View.GONE);
            button8.setVisibility(View.GONE);
            button9.setVisibility(View.GONE);
            button12.setVisibility(View.GONE);
            button13.setVisibility(View.GONE);
            button14.setVisibility(View.GONE);
            button15.setVisibility(View.GONE);
            */


            card_view1.setVisibility(View.GONE);
            card_view2.setVisibility(View.GONE);
            card_view3.setVisibility(View.GONE);
            card_view4.setVisibility(View.GONE);
            card_view5.setVisibility(View.GONE);
            card_view6.setVisibility(View.GONE);
            card_view7.setVisibility(View.GONE);
            card_view8.setVisibility(View.GONE);
            card_view9.setVisibility(View.GONE);
            card_view12.setVisibility(View.GONE);
            card_view13.setVisibility(View.GONE);
            card_view14.setVisibility(View.GONE);
            card_view15.setVisibility(View.GONE);


            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.GONE);
            view5.setVisibility(View.GONE);
            view6.setVisibility(View.GONE);
            view7.setVisibility(View.GONE);
            view8.setVisibility(View.GONE);
            view9.setVisibility(View.GONE);
            view12.setVisibility(View.GONE);
            view13.setVisibility(View.GONE);
            view14.setVisibility(View.GONE);


        }
        if(number_get.equals("3")){

            card_view1.setVisibility(View.GONE);
            card_view2.setVisibility(View.GONE);
            card_view3.setVisibility(View.GONE);
            card_view4.setVisibility(View.GONE);
            card_view5.setVisibility(View.GONE);
            card_view6.setVisibility(View.GONE);
            card_view7.setVisibility(View.GONE);
            card_view8.setVisibility(View.GONE);
            card_view9.setVisibility(View.GONE);
            card_view10.setVisibility(View.GONE);
            card_view11.setVisibility(View.GONE);

            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.GONE);
            view5.setVisibility(View.GONE);
            view6.setVisibility(View.GONE);
            view7.setVisibility(View.GONE);
            view8.setVisibility(View.GONE);
            view9.setVisibility(View.GONE);
            view10.setVisibility(View.GONE);
            view11.setVisibility(View.GONE);


          /*  button1.setVisibility(View.GONE);
            button2.setVisibility(View.GONE);
            button3.setVisibility(View.GONE);
            button4.setVisibility(View.GONE);
            button5.setVisibility(View.GONE);
            button6.setVisibility(View.GONE);
            button7.setVisibility(View.GONE);
            button8.setVisibility(View.GONE);
            button9.setVisibility(View.GONE);
            button10.setVisibility(View.GONE);
            button11.setVisibility(View.GONE);
            */

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
