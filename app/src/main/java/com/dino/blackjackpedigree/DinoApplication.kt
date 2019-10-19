package com.dino.blackjackpedigree

import android.app.Application
import com.dino.blackjackpedigree.di.vieWModelModule
import com.dino.library.ext.setupKoin

class DinoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin(this, vieWModelModule)
    }
}