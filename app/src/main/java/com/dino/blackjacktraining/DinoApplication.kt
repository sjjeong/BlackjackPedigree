package com.dino.blackjacktraining

import android.app.Application
import com.dino.blackjacktraining.di.vieWModelModule
import com.dino.library.ext.setupKoin
import com.google.android.gms.ads.MobileAds

class DinoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        MobileAds.initialize(this)
        setupKoin(this, vieWModelModule)
    }
}