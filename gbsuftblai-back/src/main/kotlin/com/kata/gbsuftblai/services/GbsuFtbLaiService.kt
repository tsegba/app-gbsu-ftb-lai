package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var result = ""
        if(inputNumber % 3 == 0)
            result = result.plus("Gbsu")
        if(inputNumber.toString().contains('3'))
            result = result.plus("Gbsu")

        return result
    }

}