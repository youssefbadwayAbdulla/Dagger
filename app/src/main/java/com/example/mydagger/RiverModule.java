package com.example.mydagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class RiverModule {
    @Singleton
    @Provides
    River providesRiver(){
        return new River();
    }

}
