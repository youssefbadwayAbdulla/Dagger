package com.example.mydagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@ActivityScope
public class Farm {
    private static final String TAG = "youssef Farm";
    @Inject
    public Farm() {
        Log.i(TAG, "youssef Farm: ");
    }
    public String getFarm(){
       return "Beans";
    }
}
