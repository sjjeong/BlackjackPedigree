package com.dino.blackjackpedigree.ui

import com.dino.blackjackpedigree.R
import com.dino.blackjackpedigree.databinding.ActivityMainBinding
import com.dino.library.ui.DinoActivity

class MainActivity : DinoActivity<ActivityMainBinding, MainViewModel>(
    R.layout.activity_main,
    MainViewModel::class.java
)
