package com.example.mydagger;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {

    private static final String TAG = "youssef Coffee";

    River river;
    @Inject
    Farm farm;
    int sugar;
    int milk;

    @Inject
    public Coffee(River river, @sugar int sugar, @Milk int milk) {
        this.river=river;
        this.sugar=sugar;
        this.milk=milk;
    }
    @Inject
    public void connectElectric(){
        Log.i(TAG, "youssef connectElectric: connecting........");
    }

    public String getCoffeeCub() {
        return farm.getFarm() + "+" +river.getRiver()+ " "+ "sugar: "+sugar+" "+"milk :"+milk;
    }
}
