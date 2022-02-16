package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component
import java.util.*

@Component
class GbsuFtbLaiService {

    val keyNumbers = mapOf(3 to "Gbsu", 5 to "Ftb", 7 to "Lai")
    val keyNumbersForDivision = arrayOf(3, 5)
    val keyNumbersForOccurrsence = arrayOf(3, 5, 7)


    fun convertNumber(inputNumber: Int): String {
        var result = ""
        result = result.plus(applyDivisibityConvertion(inputNumber))
        result = result.plus(applyOccurrenceConvertion(inputNumber))
        if(result.isEmpty()){
            return inputNumber.toString()
        }
        return result
    }

    fun applyDivisibityConvertion(number: Int): String {
        var result = ""
        for (keyNumber in keyNumbersForDivision) {
            if (number % keyNumber == 0) {
                result = result.plus(keyNumbers[keyNumber])
            }
        }
        return result
    }

    fun applyOccurrenceConvertion(number: Int): String {
        var result = ""
        for (char in number.toString()) {
            if (Arrays.stream(keyNumbersForOccurrsence).anyMatch { t -> t == char.toString().toInt() }) {
                result = result.plus(keyNumbers[char.toString().toInt()])
            }
        }
        return result
    }

}