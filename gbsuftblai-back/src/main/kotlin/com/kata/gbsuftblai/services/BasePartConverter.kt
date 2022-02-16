package com.kata.gbsuftblai.services

abstract class BasePartConverter : IPartConverter {
    protected val nextConverter: IPartConverter
    protected var convertionMap = mapOf(3 to "Gbsu", 5 to "Ftb", 7 to "Lai")

    constructor(nextConverter: IPartConverter) {
        this.nextConverter = nextConverter
    }

    fun callNext(number: Int, alreadyConverted: String, converted: String?): String {
        if (this.nextConverter == null) {
            return alreadyConverted
        }
        return this.nextConverter.convertPart(number, alreadyConverted.plus(converted))
    }

}