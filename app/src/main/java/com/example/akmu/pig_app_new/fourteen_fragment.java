package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

/**
 * Created by akmu on 12/20/2017.
 */

public class fourteen_fragment extends Fragment {


    public fourteen_fragment(){
    }
    public String [] tobeused={
            " शूकर पालन एप्प",
            "भारतीय कृषि अनुसंधान परिषद (भा.कृ.अनु.प.) ",//1
            "भारतीय पशुचिकित्सा अनुसंधान संस्थान (भा.प.चि.अ.सं.) ",
            "भारतीय कृषि सांख्यिकी अनुसंधान संस्थान (भा.कृ.सां.अनु.सं.) ",
            "ध्यान दें |",
            "इंटरनेट कनेक्शन की उपलब्धता ज्ञात कीजिये |",
            "ओके",
            "वेबसाइट लिंक्स"
    };






    WebView webViewrelatedlinks;
    Button tvHeading1;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:{
                    webViewGoBack();
                }break;
            }
        }
    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fourteen_fragment_layout, container, false);


        getActivity().setTitle(tobeused[0]);


        tvHeading1=(Button) view.findViewById(R.id.TextWAWHdng);
        tvHeading1.setText(tobeused[7]);

        webViewrelatedlinks = (WebView)view.findViewById(R.id.webViewrelatedlinks);

        String text;
        text = "<html><body >";
        text += "<table border=\"0px solid black\">";
        text += "<tr height =10>";
        text += "<td align=\"left\" valign=\"middle\">";
        text += "<ul>";
        text += "<li><h4><a href='http://www.icar.org.in/'>" + tobeused[1] + "</a></h4></li>";
        text += "<li><h4><a href='http://www.ivri.nic.in/'>" +tobeused[2] + "</a></h4></li>";
        text += "<li><h4><a href='http://iasri.res.in/'>" +tobeused[3] + "</a></h4></li>";
        text += "</ul>";
        text += "</td>";
        text += "</tr>";
        text += "</table>";
        text += "</body></html>";

        webViewrelatedlinks.loadData(text, "text/html; charset=utf-8", null);
        webViewrelatedlinks.setWebViewClient(new myWebClient());
        webViewrelatedlinks.getSettings().setJavaScriptEnabled(true);
        webViewrelatedlinks.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);


      // webViewrelatedlinks.
        webViewrelatedlinks.setOnKeyListener(new View.OnKeyListener(){

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && webViewrelatedlinks.canGoBack()) {
                    handler.sendEmptyMessage(1);
                    return true;
                }

                return false;
            }

        });





        return view;
    }

    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

                if (url.endsWith("org.in"))
                    view.loadUrl("http://www.icar.org.in/");
                else if (url.endsWith("nic.in"))
                    view.loadUrl("http://www.ivri.nic.in/");
                else if (url.endsWith("res.in"))
                    view.loadUrl("http://iasri.res.in/");


            return false;
        }
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
    private void webViewGoBack(){
        webViewrelatedlinks.goBack();
    }

   /*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webViewrelatedlinks.canGoBack()) {
                        webViewrelatedlinks.goBack();
                    } else {
                       // super.onBackPressed();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        if (webViewrelatedlinks.canGoBack() == true) {
            webViewrelatedlinks.goBack();
        } else {
           // super.onBackPressed();
        }


    }
    */


}



