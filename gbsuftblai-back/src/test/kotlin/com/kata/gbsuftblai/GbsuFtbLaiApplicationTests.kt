package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

//@SpringBootTest
class GbsuFtbLaiApplicationTests {

    private val gbsuFtbLaiService: GbsuFtbLaiService = GbsuFtbLaiService()

 //   @Test
    fun contextLoads() {
    }

    @Test
    @DisplayName("3 should return GbsuGbsu")
    fun convertNumber_3shouldReturnGbsuGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(3)
        val expected = "GbsuGbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }

    @Test
    @DisplayName("9 should return Gbsu")
    fun convertNumber_9shouldReturnGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(9)
        val expected = "Gbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }


    @Test
    @DisplayName("21 should return Gbsu")
    fun convertNumber_21shouldReturnGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(21)
        val expected = "Gbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }

    @Test
    @DisplayName("13 should return Gbsu")
    fun convertNumber_13shouldReturnGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(13)
        val expected = "Gbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }

    @Test
    @DisplayName("39 should return GbsuGbsu")
    fun convertNumber_39shouldReturnGbsuGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(39)
        val expected = "GbsuGbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }

    @Test
    @DisplayName("should return content with Gbsu When number is devided by 3")
    fun convertNumber_shouldReturnContentWithGbsuWhenIsDevivedBy3() {
        val converted =gbsuFtbLaiService.convertNumber(39)
        val expected = "Gbsu"
        Assertions.assertThat(converted).contains(expected)
    }
    @Test
    @DisplayName("should return content with Gbsu When number contains 3")
    fun convertNumber_shouldReturnContentWithGbsuWhenIsContains3() {
        val converted =gbsuFtbLaiService.convertNumber(39)
        val expected = "Gbsu"
        Assertions.assertThat(converted).contains(expected)
    }

    @Test
    @DisplayName("should return content with GbsuGbsu When is devided by 3 and number contains 3")
    fun convertNumber_shouldReturnContentWithGbsuGbsuWhenIsDevivedBy3AndIsContains3() {
        val converted =gbsuFtbLaiService.convertNumber(39)
        val expected = "GbsuGbsu"
        Assertions.assertThat(converted).contains(expected)
    }

}
