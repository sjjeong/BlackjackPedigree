package com.dino.blackjacktraining.di

import com.dino.blackjacktraining.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vieWModelModule = module {
    viewModel { MainViewModel() }
}