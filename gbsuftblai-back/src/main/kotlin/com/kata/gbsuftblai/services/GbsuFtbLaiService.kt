package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var keyNumbers = mapOf(3 to "Gbsu",5 to "Ftb")
        var result = ""

        for(keyNumber in keyNumbers.keys){
            if(inputNumber % keyNumber == 0){
                result = result.plus(keyNumbers[keyNumber])
            }
        }
        for (char in inputNumber.toString()) {
            if(keyNumbers.containsKey(char.toString().toInt()) ){
                result = result.plus(keyNumbers[char.toString().toInt()])
            }
        }
        return result
    }



}