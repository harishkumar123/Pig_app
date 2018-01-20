package com.example.akmu.pig_app_new;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.inqbarna.tablefixheaders.TableFixHeaders;
import com.inqbarna.tablefixheaders.adapters.BaseTableAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akmu on 12/13/2017.
 */



public class third_fragment extends Fragment {

    public third_fragment() {
    }

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

        private Nexus(String name, String company, String version, String api, String ram){ //,String storage, String inches, String inches, String ram) {
            data = new String[]{//"अक्षांश"
                    name,
                    company,
                    version,
                   // pcode,
                    api,
                   // storage,
                  //  inches,
                    ram
            };
        }
    }

    public String [] hindi={
            "शूकर पालन एप्प",
            "शूकर की प्रमुख नस्लें",
            "शूकर नस्लें",
            "भारतवर्ष में पाली जाने वाली प्रमुख शूकर की नस्लें-घुंघरू, अनकामली, लार्ज व्हाइट यार्कशायर , मिडिल व्हाइट यार्कशायर , बर्कशायर, लैंडरेस, डयूरॉक  एवं हैम्पशायर  हैं। उपरोक्त नस्लों में से लार्ज व्हाइट यार्कशायर  एवं मिडिल व्हाइट यार्कशायर  को सम्पूर्ण भारतवर्ष में सुगमता के साथ पाल कर अच्छा लाभ प्राप्त किया जा सकता है,जबकि उत्तर-पूर्वी एवं दक्षिणी भारत में बर्कशायर, लैंडरेस एवं डयूरॉक  काफी लोकप्रिय नस्लें हैं।",
            "इसके अतिरिक्त शूकरों पर भा.कृ.अनु.प.-अखिल भारतीय समन्वित अनुसंधान परियोजना (एआईसीआरपी)एवं मेगा सीड युनिट के अंतर्गत,शूकरों की अनेक क्षेत्र विशेष संकर नस्लों का विकास किया गया है।",
            "शूकर नस्लों को प्राप्त करने हेतु एआईसीआरपी केन्द्र/मेगा युनिट "
    };




    public String [] to_be_used;

    Button text;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;

    BaseTableAdapter baseTableAdapter;
    TableFixHeaders tableFixHeaders;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.third_fragment_layout, container, false);

        to_be_used=hindi.clone();

        getActivity().setTitle(to_be_used[0]);

        text=(Button)view.findViewById(R.id.text1);
        text1=(TextView)view.findViewById(R.id.text2);
        text2=(TextView)view.findViewById(R.id.text3);
        text3=(TextView)view.findViewById(R.id.text4);
        text4=(TextView)view.findViewById(R.id.text5);

        String nodatafound="&#8226;";

        text.setText(to_be_used[1]);
        // text1.setText(to_be_used[2]);
        text1.setText(Html.fromHtml(nodatafound)+" "+to_be_used[2]);
        text2.setText(to_be_used[3]);
        text3.setText(to_be_used[4]);
        text4.setText(Html.fromHtml(nodatafound)+" "+to_be_used[5]);

        text.setTextColor(Color.parseColor("#ffffff"));
        text1.setTextColor(Color.parseColor("#000000"));
        text2.setTextColor(Color.parseColor("#000000"));
        text3.setTextColor(Color.parseColor("#000000"));
        text4.setTextColor(Color.parseColor("#000000"));
        // text5.setTextColor(Color.parseColor("#FF2D2B2C"));
        // text6.setTextColor(Color.parseColor("#FF2D2B2C"));

        text.setTextSize(20);
        text1.setTextSize(20);
        text2.setTextSize(18);
        text3.setTextSize(18);
        text4.setTextSize(20);
        Justification.justify(text);
        Justification.justify(text1);
        Justification.justify(text2);
        Justification.justify(text3);
        Justification.justify(text4);
        // text5.setTextSize(20);
        // text6.setTextSize(20);

        tableFixHeaders = (TableFixHeaders) view.findViewById(R.id.table);
        //second_fragment sf=new second_fragment();
        baseTableAdapter = new FamilyNexusAdapter(getActivity());
        tableFixHeaders.setAdapter(baseTableAdapter);

        return view;
    }

    public class FamilyNexusAdapter extends BaseTableAdapter {

        private final NexusTypes familys[];
        private final String headers[] = {
                "क्र0 सं0",
                "विश्वविद्यालय/संस्थान",
                "पता",
                //"पिन कोड",
                "वेबसाइट",
               // "अंक्षाश रेखाएं",
                //"देशान्तर रेखाएं",
                "शूकर की उपलब्ध नस्ल"
        };

        private final int[] widths = {
                70,
                160,
                200,
               // 70,
                140,
               // 100,
               // 120,
                250
        };

        private String[] hindi1={
                // "1",
                "असम कृषि विश्वविद्यालय",
                "सीलांग रोड जया नगर, खानापारा, गुवाहाटी, असम 781022",
                "",
                "www.aau.ac.in",
               "",
                "",
                "75% हैम्पशायर",

                //  "2",
                "बिरसा कृषि विश्वविद्यालय",
                "कांके, रांची झारखण्ड 834006",
                "",
                "www.bauranchi.org",
                "",
                "",
                " टैमवर्थ X देशी, 75% हैम्पशायर",

                //  "3",
                "केरल पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय",
                "मन्नुथी, लक्कीडी पुकोड, केरल 673576",
                "",
                "www.kvrsu.in",
                "",
                "",
                "  75%  लाॅर्ज व्हाइट याॅर्कशायर,(देशी X लाॅर्ज व्हाइट याॅर्कशायर) X ड्यूराॅक, लैन्डरेस, लाॅर्ज व्हाइट याॅर्कशायर",

                //  "4",
                "केरल पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय",
                "पुकोड, लक्कीडी पुकोड, केरल 673576",
                "",
                "www.kvrsu.in",
                "",
                "",
                "75% लार्ज व्हाइट योर्कशायर",

                //"5",
                "श्री वेंकेटेश्वर पशु-चिकित्सा विज्ञान विश्वविद्यालय",
                "तिरूपति सिद्धारामपुरम दंतदुवरिपल, आंध्र प्रदेश 515701",
                " ",
                "www.svvu.edu.in",
               "",
                "",
                " 75% लार्ज व्हाइट योर्कशायर",

                // "6",
                "तमिलनाडु पशु-चिकित्सा एवं पशु विज्ञान विश्वविद्यालय",
                "कट्टुपक्कम माधवराम मिल्क कोलोनी रोड माधवपुरम, चेन्नई, तमिलनाडु 600005",
                " ",
                "www.tanuvas.tn.nic.in",
               "",
               "",
                "  75% लार्ज व्हाइट योर्कशायर, 75% लार्ज व्हाइट योर्कशायर X ड्यूराॅक ",

                //   "7",
                "भारतीय पशु-चिकित्सा अनुसंधान संस्थान",
                "इज्जतनगर, बरेली(उ0 प्र0) 243122",
                "",
                "www.ivri.nic.in",
                "",
                "",
                "75% लैन्डरेस, लैन्डरेस ",

                //  "8",
                "भाकृअनुप-केन्द्रीय तटीय कृषि अनुसंधान संस्थान",
                "एलिया विल्हा गोवा, पुराना गोवा 403402",
                " ",
                "www.ccari.res.in",
                "",
               "",
                "  एगोन्डा गोन, लाॅर्ज व्हाइट योर्कशायर, 75% लाॅर्ज व्हाइट योर्कशायर",

                // "9",
                "पशु-चिकित्सा विज्ञान एवं पशु पालन कालेज, केन्द्रीय कृषि विश्वविद्यालय",
                "जुंगफई सेलिसिह आईजोल, मिजोरम 796014",
                " ",
                "www.cvsccauaizawal.edu.in",
                "",
                "",
                " 75% लार्ज व्हाइट योर्कशायर ",

                // "10",
                "कृषि विज्ञान केन्द्र, शूकर पर राष्ट्रीय अनुसंधान केन्द्र",
                "दूधनोई, गोलपारा, राणी गुवाहाटी, असम 781131",
                "",
                "www.nrcp.in",
                "",
                "",
                "डूम",

                // "11",
                "बकेेन्द्रीय कृषि अनुसंधान संस्थान, गाराचराम, पोर्ट ब्लेयर ",
                "अंडमान निकोबार द्वीप समूह 744101",
                "",
                "www.icar.org.in",
                "",
                "",
                " निकोबारी ",

                //"12",
                "केन्द्रीय कृषि विश्वविद्यालय",
                "लोरिसेम्बा इमफाल, मणिपुर 795004",
                "",
                "www.cau.ac.in",
                "",
                "",
                "  हैम्पशायर, घूंघरू संकर",

                // "13",
                "भारतीय पशु-चिकित्सा अनुसंधान संस्थान पूर्वी क्षेत्रीय स्टेशन ",
                "बेल्गाची रोड एलआईजी हाउस  एमआईजी हाउस ताला कोलकाता, पश्चिम बंगाल 700037",
                "",
                "www.ivri.nic.in ",
                "",
                "",
                "घूंघरू",

                //  "14",
                "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र ",
                "त्रिपुरा केन्द्र, अगरतला लेम्बुचेरा त्रिपुरा 799210",
                " ",
                "tripuraicar.nic.in",
                "",
                "",
                " हैम्पशायर X घूंघरू, माली नस्ल",

                //  "15",
                "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र",
                "बारहपानी,उमरोई रोड उमियम, मेद्यालय 793103",
                "",
                "www.icarneh.ernet.in",
                "",
                "",
                " 75% हैम्पशायर ",

                // "16",
                "भाकृअनुप-अनुसंधान परिसर उत्तर पूर्वी पर्वतीय क्षेत्र ",
                "नागालैन्ड केन्द्र, झरनापानी मेडिजिपेमा,नागालैन्ड 797106",
                "",
                "icarnagaland.nic.in",
                "",
                "",
                "घूंघरू X हैम्पशायर ",


                //  "17",
                "राज्य पशु-चिकित्सा विभाग ",
                "जुंगफई सेलिसिह आईजोल, मिजोरम 796014",
                "",
                "www.cvsccauaizawal.edu.in",
                "",
                "",
                " लाॅर्ज व्हाइट योर्कशायर",

                // "18",
                "पशु-चिकित्सा विज्ञान कालेज ",
                "जशिवनदह नदी के निकट अनजोरा गांव दुर्ग छत्तीसगढ 491001",
                "",
                "www.cgkv.ac.in",
                "",
                "",
                " टैमबर्थ X देशी ",
                ""
        };
        private final float density;
        private String[] to_be_used1;

        public FamilyNexusAdapter(Context context) {
            familys = new NexusTypes[] {
                    new NexusTypes("")
            };

            density = context.getResources().getDisplayMetrics().density;

            to_be_used1=hindi1.clone();

            familys[0].list.add(new Nexus("1",to_be_used1[0], to_be_used1[1], to_be_used1[3], to_be_used1[6]));
            familys[0].list.add(new Nexus("2",to_be_used1[7], to_be_used1[8], to_be_used1[10], to_be_used1[13]));
            familys[0].list.add(new Nexus("3",to_be_used1[14], to_be_used1[15], to_be_used1[17], to_be_used1[20]));
            familys[0].list.add(new Nexus("4",to_be_used1[21], to_be_used1[22], to_be_used1[24], to_be_used1[27]));
            familys[0].list.add(new Nexus("5",to_be_used1[28], to_be_used1[29], to_be_used1[31], to_be_used1[34]));
            familys[0].list.add(new Nexus("6",to_be_used1[35], to_be_used1[36], to_be_used1[38], to_be_used1[41]));
            familys[0].list.add(new Nexus("7",to_be_used1[42], to_be_used1[43], to_be_used1[45], to_be_used1[48]));
            familys[0].list.add(new Nexus("8",to_be_used1[49], to_be_used1[50], to_be_used1[52], to_be_used1[55] ));
            familys[0].list.add(new Nexus("9",to_be_used1[56], to_be_used1[57], to_be_used1[59], to_be_used1[62] ));
            familys[0].list.add(new Nexus("10",to_be_used1[63], to_be_used1[64], to_be_used1[66], to_be_used1[69] ));
            familys[0].list.add(new Nexus("11",to_be_used1[70], to_be_used1[71], to_be_used1[73], to_be_used1[76]));
            familys[0].list.add(new Nexus("12",to_be_used1[77], to_be_used1[78], to_be_used1[80], to_be_used1[83] ));
            familys[0].list.add(new Nexus("13",to_be_used1[84], to_be_used1[85], to_be_used1[87], to_be_used1[90]));
            familys[0].list.add(new Nexus("14",to_be_used1[91], to_be_used1[92], to_be_used1[94], to_be_used1[97]));
            familys[0].list.add(new Nexus("15",to_be_used1[98], to_be_used1[99], to_be_used1[101], to_be_used1[104]));
            familys[0].list.add(new Nexus("16",to_be_used1[105], to_be_used1[106], to_be_used1[108], to_be_used1[111]));
            familys[0].list.add(new Nexus("17",to_be_used1[112], to_be_used1[113], to_be_used1[115],to_be_used1[118]));
            familys[0].list.add(new Nexus("18",to_be_used1[119], to_be_used1[120], to_be_used1[122], to_be_used1[125]));

        }

        @Override
        public int getRowCount() {
            return 19;
        }

        @Override
        public int getColumnCount() {
            return 4;
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
                    throw new RuntimeException("wtf?");
            }
            return view;
        }

        private View getFirstHeader(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_table_header_first, parent, false);
            }
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(headers[0]);
            return convertView;
        }

        private View getHeader(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_table_header, parent, false);
            }
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(headers[column + 1]);
            return convertView;
        }

        private View getFirstBody(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_table_first, parent, false);
            }
            convertView.setBackgroundResource(row % 2 == 0 ? R.drawable.bg_table_color1 : R.drawable.bg_table_color2);
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(getDevice(row).data[column + 1]);
            return convertView;
        }

        private View getBody(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_table, parent, false);
            }
            convertView.setBackgroundResource(row % 2 == 0 ? R.drawable.bg_table_color1 : R.drawable.bg_table_color2);
            ((TextView) convertView.findViewById(android.R.id.text1)).setText(getDevice(row).data[column + 1]);
            return convertView;
        }

        private View getFamilyView(int row, int column, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.item_table_family, parent, false);
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
                height = 65;
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
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

}

