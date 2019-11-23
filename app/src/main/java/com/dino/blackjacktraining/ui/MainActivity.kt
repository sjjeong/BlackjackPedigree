package com.dino.blackjacktraining.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.dino.blackjacktraining.BuildConfig
import com.dino.blackjacktraining.R
import com.dino.blackjacktraining.databinding.ActivityMainBinding
import com.dino.library.ui.DinoActivity
import com.google.android.gms.ads.AdRequest

class MainActivity : DinoActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class.java
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding {
            if (!BuildConfig.DEBUG) {
                adView.loadAd(AdRequest.Builder().build())
            }
        }
    }

    companion object {

        fun start(context: Context?) {
            context?.startActivity(Intent(context, MainActivity::class.java))
        }

    }

}
