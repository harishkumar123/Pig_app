package com.example.akmu.pig_app_new;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by akmu on 1/10/2018.
 */

public class application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);

        System.out.println("hello");
        System.out.println("hello 1");
        System.out.println("hello 2");
        System.out.println("hello 3 new ");

        System.out.println("hello 4 new ");
        System.out.println("hello 5 new ");

        System.out.println("hello 6 new ");
        System.out.println("hello 7 new ");
        System.out.println("hello 8 new ");
        System.out.println("hello 9 new ");
        System.out.println("hello 10 new ");
        System.out.println("hello 11 new ");
        System.out.println("hello 12 new ");

    }
}
