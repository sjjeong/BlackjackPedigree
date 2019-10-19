package com.dino.blackjackpedigree.di

import com.dino.blackjackpedigree.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vieWModelModule = module {
    viewModel { MainViewModel() }
}