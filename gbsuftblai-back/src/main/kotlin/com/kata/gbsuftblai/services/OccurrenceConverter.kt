package com.kata.gbsuftblai.services

class OccurrenceConverter(nextConverter: IPartConverter) : BasePartConverter(nextConverter) {
    var keyNumbers = arrayOf(3, 5, 7)
    var canApply = { a: Int, b: Char -> a.toString() == b.toString() }

    override fun convertPart(number: Int, alreadyConverted: String): String {

        var result = number.toString()
            .map { character -> keyNumbers.filter { keyNumber -> canApply(keyNumber, character) } }
            .flatMap { t -> t }
            .map { keyNumber -> convertionMap[keyNumber] }
            .joinToString("")
        return callNext(number, alreadyConverted, result)
    }


}