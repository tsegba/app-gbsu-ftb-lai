package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        if(inputNumber % 3 == 0 && inputNumber.toString().contains('3'))
            return "GbsuGbsu"
        if(inputNumber % 3 == 0)
            return "Gbsu"
        if(inputNumber.toString().contains('3'))
            return "Gbsu"

        return ""
    }

}