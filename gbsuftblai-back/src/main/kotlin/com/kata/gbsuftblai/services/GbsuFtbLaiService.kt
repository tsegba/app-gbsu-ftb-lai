package com.kata.gbsuftblai.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {
    var converterChain: IPartConverter

    @Autowired
    constructor(factory: IConverterFactory) {
        this.converterChain = factory.createGbsuFtbLaiConverter()
    }

    fun convertNumber(inputNumber: Int): String {
        return converterChain.convertPart(inputNumber, "")
    }

}
