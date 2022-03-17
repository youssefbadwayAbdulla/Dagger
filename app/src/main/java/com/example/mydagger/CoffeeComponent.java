package com.example.mydagger;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {
    Coffee getCoffee();
    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        Builder sugar(@sugar int sugar);
        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }

}
