package com.dino.blackjacktraining.ui

import com.dino.blackjacktraining.R
import com.dino.blackjacktraining.databinding.ActivityMainBinding
import com.dino.library.ui.DinoActivity

class MainActivity : DinoActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class.java
)
