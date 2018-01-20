package com.example.akmu.pig_app_new;


import android.Manifest;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        first_fragment ff = new first_fragment();
        fragmentTransaction.replace(R.id.frame_layout, ff);
        fragmentTransaction.commit();

        check_permission();


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        //toggle.setHomeAsUpIndicator(AppCompatResources.getDrawable(this, R.drawable.pic1));
      //  toggle.setHomeAsUpIndicator(R.drawable.pic20);
       // toggle.setDrawerIndicatorEnabled(false);
        drawer.addDrawerListener(toggle);
        toggle.syncState();




        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

       /* if (navigationView != null) {

            View header = null;

            if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.M || Build.VERSION.SDK_INT > Build.VERSION_CODES.M) {
                header = navigationView.inflateHeaderView(R.layout.nav_view);
            } else {
                header = navigationView.getHeaderView(0);
            }
        }
        */
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.first) {


            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            second_fragment sf = new second_fragment();
            fragmentTransaction.replace(R.id.frame_layout, sf);
            fragmentTransaction.commit();

        } else if (id == R.id.second) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            third_fragment tf = new third_fragment();
            fragmentTransaction.replace(R.id.frame_layout, tf);
            fragmentTransaction.commit();

        } else if (id == R.id.three) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            four_fragment ff = new four_fragment();
            fragmentTransaction.replace(R.id.frame_layout, ff);
            fragmentTransaction.commit();

        } else if (id == R.id.four) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            five_fragment fivef = new five_fragment();
            fragmentTransaction.replace(R.id.frame_layout, fivef);
            fragmentTransaction.commit();

        } else if (id == R.id.five) {
          /*  FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            six_fragment sixf = new six_fragment();
            fragmentTransaction.replace(R.id.frame_layout, sixf);
            fragmentTransaction.commit();
            */
            Intent intent = new Intent(MainActivity.this,Main6Activity.class);
            startActivity(intent);

        } else if (id == R.id.second1) {


            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            first_fragment ff = new first_fragment();
            fragmentTransaction.replace(R.id.frame_layout, ff);
            fragmentTransaction.commit();
        } else if (id == R.id.six) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            seven_fragment sevenf = new seven_fragment();
            fragmentTransaction.replace(R.id.frame_layout, sevenf);
            fragmentTransaction.commit();



        } else if (id == R.id.seven) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            eight_fragment eightf = new eight_fragment();
            fragmentTransaction.replace(R.id.frame_layout, eightf);
            fragmentTransaction.commit();

        } else if (id == R.id.eight) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            nine_fragment ninef = new nine_fragment();
            fragmentTransaction.replace(R.id.frame_layout, ninef);
            fragmentTransaction.commit();

        } else if (id == R.id.nine) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            ten_fragment tenf = new ten_fragment();
            fragmentTransaction.replace(R.id.frame_layout, tenf);
            fragmentTransaction.commit();

        } else if (id == R.id.ten) {
            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            eleven_fragment elevenf = new eleven_fragment();
            fragmentTransaction.replace(R.id.frame_layout, elevenf);
            fragmentTransaction.commit();

        } else if (id == R.id.eleven) {

          /*  FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            tweleve_fragment twelevef = new tweleve_fragment();
            fragmentTransaction.replace(R.id.frame_layout, twelevef);
            fragmentTransaction.commit();
            */

          Intent intent = new Intent(MainActivity.this,Main12_activity.class);
          startActivity(intent);

        } else if (id == R.id.tweleve) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            thirteen_fragment thirteenf = new thirteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, thirteenf);
            fragmentTransaction.commit();

        }  else if (id == R.id.point_thirteen) {

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        twenty_fragment point13f = new twenty_fragment();
        fragmentTransaction.replace(R.id.frame_layout,point13f);
        fragmentTransaction.commit();

    }else if (id == R.id.link) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fourteen_fragment fourteenf = new fourteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, fourteenf);
            fragmentTransaction.commit();

        } else if (id == R.id.address) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            fifteen_fragment fifteenf = new fifteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, fifteenf);
            fragmentTransaction.commit();

        } else if (id == R.id.helpline) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            sixteen_fragment sixteenf = new sixteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, sixteenf);
            fragmentTransaction.commit();

        } else if (id == R.id.university) {


            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);

        } else if (id == R.id.eighteen) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            eighteen_fragment eighteenf = new eighteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, eighteenf);
            fragmentTransaction.commit();

        } else if (id == R.id.ninteen) {

            FragmentManager fm = getFragmentManager();
            FragmentTransaction fragmentTransaction = fm.beginTransaction();
            ninteen_fragment nineteenf = new ninteen_fragment();
            fragmentTransaction.replace(R.id.frame_layout, nineteenf);
            fragmentTransaction.commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void check_permission() {
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            System.out.println("6:");


            System.out.println("9:");
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);


            System.out.println("10:");

        }
    }


    @Override
    public void  onBackPressed(){

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

        }



        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);


        alertDialogBuilder.setTitle("Exit dialog ");


        alertDialogBuilder
                .setMessage(" Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton(" yes", new DialogInterface.OnClickListener() {//yes
                    public void onClick(final DialogInterface dialog, int id) {


                        Toast.makeText(MainActivity.this,"Exiting from app", Toast.LENGTH_SHORT).show();


                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent a = new Intent(Intent.ACTION_MAIN);
                                a.addCategory(Intent.CATEGORY_HOME);
                                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(a);
                                System.out.println("inside  run 2 ");
                                dialog.cancel();
                            }
                        }, 1000);

                    }
                })
                .setNegativeButton("no", new DialogInterface.OnClickListener() {//no
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog = alertDialogBuilder.create();


        alertDialog.show();



    }

}
