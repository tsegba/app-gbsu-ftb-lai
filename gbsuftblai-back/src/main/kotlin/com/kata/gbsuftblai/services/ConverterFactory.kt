package com.kata.gbsuftblai.services

class ConverterFactory : IConverterFactory {

    override fun createGbsuFtbLaiConverter(): IPartConverter {
        var noConverter = NoConverter()
        var occurrenceConverter = OccurrenceConverter(noConverter)
        var divisionConverter = DivisionConverter(occurrenceConverter)
        return divisionConverter
    }
}