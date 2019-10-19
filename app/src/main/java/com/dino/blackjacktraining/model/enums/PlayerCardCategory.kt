package com.dino.blackjacktraining.model.enums

import kotlin.math.min
import kotlin.random.Random

enum class PlayerCardCategory(
    val content: String,
    val isContainA: Boolean,
    val isPair: Boolean
) {
    C_5("5", false, false),
    C_6("6", false, false),
    C_7("7", false, false),
    C_8("8", false, false),
    C_9("9", false, false),
    C_10("10", false, false),
    C_11("11", false, false),
    C_12("12", false, false),
    C_13("13", false, false),
    C_14("14", false, false),
    C_15("15", false, false),
    C_16("16", false, false),
    C_17("17", false, false),
    C_18("18", false, false),
    C_19("19", false, false),
    C_A2("A2", true, false),
    C_A3("A3", true, false),
    C_A4("A4", true, false),
    C_A5("A5", true, false),
    C_A6("A6", true, false),
    C_A7("A7", true, false),
    C_A8("A8", true, false),
    C_A9("A9", true, false),
    C_AA("AA", true, true),
    C_22("22", false, true),
    C_33("33", false, true),
    C_44("44", false, true),
    C_55("55", false, true),
    C_66("66", false, true),
    C_77("77", false, true),
    C_88("88", false, true),
    C_99("99", false, true),
    C_1010("1010", false, true);

    fun getCardValue(): Pair<String, String> {
        return when (this) {
            C_5 -> getNumberValue(5)
            C_6 -> getNumberValue(6)
            C_7 -> getNumberValue(7)
            C_8 -> getNumberValue(8)
            C_9 -> getNumberValue(9)
            C_10 -> getNumberValue(10)
            C_11 -> getNumberValue(11)
            C_12 -> getNumberValue(12)
            C_13 -> getNumberValue(13)
            C_14 -> getNumberValue(14)
            C_15 -> getNumberValue(15)
            C_16 -> getNumberValue(16)
            C_17 -> getNumberValue(17)
            C_18 -> "10" to "8"
            C_19 -> "10" to "9"
            C_A2 -> "A" to "2"
            C_A3 -> "A" to "3"
            C_A4 -> "A" to "4"
            C_A5 -> "A" to "5"
            C_A6 -> "A" to "6"
            C_A7 -> "A" to "7"
            C_A8 -> "A" to "8"
            C_A9 -> "A" to "9"
            C_AA -> "A" to "A"
            C_22 -> "2" to "2"
            C_33 -> "3" to "3"
            C_44 -> "4" to "4"
            C_55 -> "5" to "5"
            C_66 -> "6" to "6"
            C_77 -> "7" to "7"
            C_88 -> "8" to "8"
            C_99 -> "9" to "9"
            C_1010 -> "10" to "10"
        }
    }

    private fun getNumberValue(number: Int): Pair<String, String> {
        val halfNumber = number / 2 + 1
        val firstNumber = Random.Default.nextInt(halfNumber, min(number, 10))
        val secondNumber = number - firstNumber
        return "$firstNumber" to "$secondNumber"
    }

}
