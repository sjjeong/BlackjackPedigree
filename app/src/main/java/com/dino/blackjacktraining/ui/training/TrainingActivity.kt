package com.dino.blackjacktraining.ui.training

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.dino.blackjacktraining.R
import com.dino.blackjacktraining.databinding.ActivityTrainingBinding
import com.dino.library.ui.DinoActivity
import com.google.android.gms.ads.AdRequest
import com.googry.dinolibrary.BuildConfig

class TrainingActivity : DinoActivity<ActivityTrainingBinding, TrainingViewModel>(
    R.layout.activity_training,
    TrainingViewModel::class.java
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
            context?.startActivity(Intent(context, TrainingActivity::class.java))
        }

    }

}
