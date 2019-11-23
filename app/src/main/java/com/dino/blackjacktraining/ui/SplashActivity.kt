package com.dino.blackjacktraining.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dino.blackjacktraining.BuildConfig
import com.dino.blackjacktraining.R
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!BuildConfig.DEBUG) {
            setupInterstitialAd()
        } else {
            startMainActivity()
        }
    }

    private fun setupInterstitialAd() {
        with(InterstitialAd(this)) {
            adUnitId = getString(R.string.ad_interstitial_start_key)
            loadAd(AdRequest.Builder().build())
            adListener = object : AdListener() {

                override fun onAdFailedToLoad(p0: Int) {
                    super.onAdFailedToLoad(p0)
                    startMainActivity()
                }

                override fun onAdClosed() {
                    super.onAdClosed()
                    startMainActivity()
                }

                override fun onAdLoaded() {
                    super.onAdLoaded()
                    show()
                }
            }
        }
    }

    override fun onBackPressed() {
        // no-op
    }

    private fun startMainActivity() {
        MainActivity.start(this@SplashActivity)
        finish()
    }
}