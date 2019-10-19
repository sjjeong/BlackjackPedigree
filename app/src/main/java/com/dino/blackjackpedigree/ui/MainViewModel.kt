package com.dino.blackjackpedigree.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dino.blackjackpedigree.model.enums.PlayerActionCategory
import com.dino.blackjackpedigree.model.enums.TableCategory
import com.dino.library.ui.DinoViewModel

class MainViewModel : DinoViewModel() {

    private val _liveAnswer = MutableLiveData<TableCategory>()
    val liveAnswer: LiveData<TableCategory> = _liveAnswer

    private val _livePlayerCards = MutableLiveData<Pair<String, String>>()
    val livePlayerCards: LiveData<Pair<String, String>> = _livePlayerCards

    init {
        startGame()
    }

    private fun startGame() {
        val answer = TableCategory.values().random()
        _liveAnswer.value = answer
        _livePlayerCards.value = answer.player.getCardValue()
    }

    fun submitAnswer(actionCategory: PlayerActionCategory) {
        val rightAction = liveAnswer.value?.action ?: return
        if (rightAction == actionCategory) {
            showToast("정답입니다.")
            startGame()
        } else {
            showToast("오답입니다.")
        }


    }

}