package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class ConverterFactory : IConverterFactory {

    override fun createGbsuFtbLaiConverter(): IPartConverter {
        var noConverter = NoConverter()
        var occurrenceConverter = OccurrenceConverter(noConverter)
        var divisionConverter = DivisionConverter(occurrenceConverter)
        return divisionConverter
    }
}