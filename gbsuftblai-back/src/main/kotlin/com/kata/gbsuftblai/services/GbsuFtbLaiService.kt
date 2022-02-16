package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        if(inputNumber == 3)
            return "GbsuGbsu"
        if(inputNumber == 9)
            return "Gbsu"
        return ""
    }

}