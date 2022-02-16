package com.kata.gbsuftblai.services

interface IPartConverter {
    fun convertPart(number: Int, alreadyConverted: String): String
}