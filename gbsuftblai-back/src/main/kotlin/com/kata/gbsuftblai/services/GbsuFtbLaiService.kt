package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if(inputNumber % 3 == 0)
            result = result.plus("Gbsu")

        if(inputNumber % 5 == 0)
            result = result.plus("Ftb")

        for (char in inputNumber.toString()) {
            if(char == '3'){
                result = result.plus("Gbsu")
            }
        }
        for (char in inputNumber.toString()) {
            if(char == '5'){
                result = result.plus("Ftb")
            }
        }
        return result
    }

}