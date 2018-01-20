package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;


public class sixteen_fragment extends Fragment {

    private WebView webViewofficephone;

    public String [] tobeused={
            "शूकर पालन एप्प",
            "किसान काल सेन्टर : 18001801551 ",//1
            "आई. वी. आर. आई. हेल्पलाइन : 0581-2311111 ",
            "हेल्पलाइन "
    };


    Button tvHeading1;



    public sixteen_fragment() {

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_sixteen_layout, container, false);

        getActivity().setTitle(tobeused[0]);
        tvHeading1=(Button)view.findViewById(R.id.TextWAWHdng);
        tvHeading1.setText(tobeused[3]);

        webViewofficephone=(WebView)view.findViewById(R.id.webViewofficephone);
         //bgcolor="#90caf9"
        String text;
        text = "<html><body >";
        text+= "<table border=\"0px solid black\">";
        text+= "<tr height =10>";
        text+= "<td align=\"left\" valign=\"middle\" colspan=\"3\">";
        text+= "<ul>";
        text+="<li><font color=\"#2e3237\" size=\"4\">"+tobeused[1]+"</font></li><br/>";
        text+="<li><font color=\"#2e3237\" size=\"4\">"+tobeused[2]+"</font></li><br/>";
        text+= "</ul>";
        text+= "</td>";

        text+= "</tr>";
        text+= "</table>";
        text+= "</body></html>";
        webViewofficephone.loadData(text, "text/html; charset=utf-8", null);
        return view;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }






}
