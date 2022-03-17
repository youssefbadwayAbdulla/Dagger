package com.example.mydagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "youssef MainActivity";
    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ((MainApplication)getApplication()).getAppComponent();
        CoffeeComponent component=appComponent.getCoffeeComponentBuilder().sugar(4)
                .milk(5).build();
        component.inject(this);

        Log.i(TAG, "onCreate: " +"\ncoffee 1 :"+ coffee
                +"\ncoffee 2:"+coffee2
                + "\nfarm for coffee 1:" + coffee.river +
                "\n farm for coffee 2:" + coffee2.river);


    }
}