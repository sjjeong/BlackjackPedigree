package com.dino.blackjacktraining.ui.training

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dino.blackjacktraining.model.enums.PlayerActionCategory
import com.dino.blackjacktraining.model.enums.TableCategory
import com.dino.library.ui.DinoViewModel

class TrainingViewModel : DinoViewModel() {

    private val _liveAnswer = MutableLiveData<TableCategory>()
    val liveAnswer: LiveData<TableCategory> = _liveAnswer

    private val _livePlayerCards = MutableLiveData<Pair<String, String>>()
    val livePlayerCards: LiveData<Pair<String, String>> = _livePlayerCards

    private val _liveHistoryItems = MutableLiveData<List<TableCategory>>(mutableListOf())
    val liveHistoryItems: LiveData<List<TableCategory>> = _liveHistoryItems

    init {
        startGame()
    }

    private fun startGame() {
        val answer = TableCategory.values().random()
        _liveAnswer.value = answer
        _livePlayerCards.value = answer.player.getCardValue()
    }

    fun submitAnswer(actionCategory: PlayerActionCategory) {
        val rightAnswer = liveAnswer.value ?: return
        val rightAction = rightAnswer.action
        if (rightAction == actionCategory) {
            showToast("O")
            _liveHistoryItems.value =
                _liveHistoryItems.value?.toMutableList()?.apply { add(0, rightAnswer) }
            startGame()
        } else {
            showToast("X")
        }


    }

}