package com.dino.blackjacktraining

import android.app.Application
import com.dino.blackjacktraining.di.vieWModelModule
import com.dino.library.ext.setupKoin

class DinoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(this, vieWModelModule)
    }
}