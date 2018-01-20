package com.example.akmu.pig_app_new;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public String [] to_be_used={
            "असम कृषि विश्वविद्यालय  सीलांग रोड जया नगर, खानापारा, गुवाहाटी, असम 781022 www.aau.ac.in" ,
            " बिरसा कृषि विश्वविद्यालय कांके, रांची झारखण्ड 834006 www.bauranchi.org" ,
            "केरल  पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय मन्नुथी,  लक्कीडी पुकोड, केरल 673576 www.kvrsu.in" ,
            "केरल पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय पुकोड, लक्कीडी पुकोड केरल 673576 www.kvrsu.in" ,
            "श्री वेंकेटेश्वर पशु-चिकित्सा विज्ञान विश्वविद्यालय तिरूपति सिद्धारामपुरम दंतदुवरिपल, आंध्र प्रदेश 515701 www.svvu.edu.in" ,
            "तमिलनाडु पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय कट्टुपक्कम माधवराम मिल्क कोलोनी रोड माधवपुरम, चेन्नई, तमिलनाडु www.tanuvas.tn.nic.in" ,
            "भारतीय पशु-चिकित्सा अनुसंधान संस्थान इज्जतनगर बरेली 243122 (उ0 प्र0) www.ivri.nic.in" ,
            "भाकृअनुप-केन्द्रीय तटीय कृषि अनुसंधान संस्थान एलिया विल्हा गोवा, पुराना गोवा 403402 www.ccari.res.in" ,
            "पशु-चिकित्सा विज्ञान एवं पशु पालन कालेज, केन्द्रीय कृषि विश्वविद्यालय जुंगफई सेलिसिह आईजोल, मिजोरम 796014 www.cvsccauaizawal.edu.in" ,
            "कृषि विज्ञान केन्द्र, शूकर पर राष्ट्रीय अनुसंधान केन्द्र दूधनोई, गोलपारा, राणी गुवाहाटी, असम 781131 www.nrcp.in",
            "केंद्रीय कृषि अनुसंधान संस्थान, गाराचराम, पोर्ट ब्लेयर अंडमान निकोबार द्वीप समूह 744101 www.icar.org.in",
            "केन्द्रीय कृषि विश्वविद्यालय लोरिसेम्बा इमफाल, मणिपुर 795004 www.cau.ac.in",
            "भारतीय पशु-चिकित्सा अनुसंधान संस्थान पूर्वी क्षेत्रीय स्टेशन बेल्गाची रोड एलआईजी हाउस  एमआईजी हाउस ताला कोलकाता, पश्चिम बंगाल 700037 www.ivri.nic.in",
            "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र त्रिपुरा केन्द्र, अगरतला लेम्बुचेरा त्रिपुरा 799210 tripuraicar.nic.in",
            "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र बारहपानी,उमरोई रोड उमियम, मेद्यालय 793103 www.icarneh.ernet.in",
            "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र नागालैन्ड केन्द्र, झरनापानी मेडिजिपेमा,नागालैन्ड 797106 icarnagaland.nic.in",
            "राज्य पशु-चिकित्सा विभाग जुंगफई सेलिसिह आईजोल, मिजोरम 796014 www.cvsccauaizawal.edu.in",
            "पशु-चिकित्सा विज्ञान कालेज शिवनदह नदी के निकट अनजोरा गांव दुर्ग छत्तीसगढ 491001 www.cgkv.ac.in",


    };

   public String [] to_be_used345= {
           " पशु-चिकित्सा विज्ञान कालेज शिवनदह नदी के निकट अनजोरा गांव दुर्ग छत्तीसगढ 491001 www.cgkv.ac.in",
           "भारतीय पशु-चिकित्सा अनुसंधान संस्थान पूर्वी क्षेत्रीय स्टेशन बेल्गाची रोड एलआईजी हाउस  एमआईजी हाउस ताला कोलकाता, पश्चिम बंगाल 700037 www.ivri.nic.in",
           "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र त्रिपुरा केन्द्र, अगरतला लेम्बुचेरा त्रिपुरा 799210 tripuraicar.nic.in",
           "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र नागालैन्ड केन्द्र, झरनापानी मेडिजिपेमा,नागालैन्ड 797106 icarnagaland.nic.in",
           "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र बारहपानी,उमरोई रोड उमियम, मेद्यालय 793103 www.icarneh.ernet.in",
           "केन्द्रीय कृषि विश्वविद्यालय लोरिसेम्बा इमफाल, मणिपुर 795004 www.cau.ac.in"

   };


    public Double [] to_be_used_coordinate={
//1
             Double.valueOf(26.724799),
            Double.valueOf(94.195608),
//2
            Double.valueOf(23.416673),
            Double.valueOf(85.316753),
//3
            Double.valueOf(10.52850),
            Double.valueOf(76.26820),
// 4
            Double.valueOf( 11.54120),
            Double.valueOf(76.02180),
//5
            Double.valueOf( 13.62880 ),
            Double.valueOf(79.41920),
//6
            Double.valueOf(13.04140),
            Double.valueOf( 80.12670),
//7
            Double.valueOf( 28.40260),
            Double.valueOf(79.42450),
//8
            Double.valueOf(15.29930 ),
            Double.valueOf( 74.12400),
//9
            Double.valueOf(23.72710),
            Double.valueOf(92.71760),
//10
            Double.valueOf(26.08760),
            Double.valueOf(90.56360),
//11
            Double.valueOf( 11.74010),
            Double.valueOf(92.65860),


//12
            Double.valueOf( 24.81700),
            Double.valueOf(93.93680),
//13
            Double.valueOf( 22.57260 ),
            Double.valueOf( 88.36390),
//14
            Double.valueOf( 23.83150),
            Double.valueOf(91.28680),
//15
            Double.valueOf(25.57880 ),
            Double.valueOf(93.86810),
//16
            Double.valueOf(25.75660 ),
            Double.valueOf( 93.86810),
//17
            Double.valueOf( 23.72710 ),
            Double.valueOf( 92.71760),
//18
            Double.valueOf(21.27870),
            Double.valueOf(81.86610)


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        System.out.println("1");
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        int number=0;
        for(int i=0;i<18;i++){
            LatLng sydney = new LatLng(to_be_used_coordinate[number], to_be_used_coordinate[number+1]);
            number=number+2;
            // mMap.addMarker(new MarkerOptions().position(sydney).title(to_be_used[i]));
            //  mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney)
            Marker melbourne = mMap.addMarker(new MarkerOptions()
                    .position(sydney)
                    .title(to_be_used[i]).snippet(""));

            mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));




        }


       mMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

            @Override
            public View getInfoWindow(Marker arg0) {


                LayoutInflater inflater = (LayoutInflater) getApplicationContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.custom_info_window, null);

                TextView tvInfo = (TextView) layout.findViewById(R.id.tv_info);

                String text1;

                text1 = arg0.getTitle();
                Spanned result = Html.fromHtml(text1);
                tvInfo.setText(result);
                tvInfo.setTextColor(Color.BLACK);
                return layout;
            }

            @Override
            public View getInfoContents(Marker arg0) {

                return null;

            }
        });





    }
}
