package com.kata.gbsuftblai.services

class NoConverter : IPartConverter {
    override fun convertPart(number: Int, alreadyConverted: String): String {
        return if (alreadyConverted != "") alreadyConverted else number.toString();
    }


}