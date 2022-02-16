package com.kata.gbsuftblai.services


class DivisionConverter(nextConverter: IPartConverter) : BasePartConverter(nextConverter) {
    var divisors = arrayOf(3, 5)
    var canApply = { x: Int, d: Int -> x % d == 0 }

    override fun convertPart(number: Int, alreadyConverted: String): String {
        var result = divisors.filter { divisor ->
            canApply(number, divisor)
        }
            .map { divisor -> convertionMap[divisor] }
            .joinToString("")
        return callNext(number, alreadyConverted, result)
    }


}