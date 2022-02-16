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

    @Test
    @DisplayName("33 should return GbsuGbsuGbsu")
    fun convertNumber_33shouldReturnGbsuGbsuGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(33)
        val expected = "GbsuGbsuGbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }

    @Test
    @DisplayName("333 should return GbsuGbsuGbsuGbsu")
    fun convertNumber_333shouldReturnGbsuGbsuGbsuGbsu() {
        val converted =gbsuFtbLaiService.convertNumber(333)
        val expected = "GbsuGbsuGbsuGbsu"
        Assertions.assertThat(converted).isEqualTo(expected)
    }


    @Test
    @DisplayName("should return content with Ftb When number is devided by 5")
    fun convertNumber_shouldReturnContentWithFtbWhenIsDevivedBy5() {
        val converted =gbsuFtbLaiService.convertNumber(5)
        val expected = "Ftb"
        Assertions.assertThat(converted).contains(expected)
    }

    @Test
    @DisplayName("should return content with Ftb When number contains 5")
    fun convertNumber_shouldReturnContentWithFtbWhenIsContains5() {
        val converted =gbsuFtbLaiService.convertNumber(57)
        val expected = "Ftb"
        Assertions.assertThat(converted).contains(expected)
    }

    @Test
    @DisplayName("should return content with FtbFtb When is devided by 5 and number contains 5")
    fun convertNumber_shouldReturnContentWithFtbFtbWhenIsDevivedBy5AndIsContains5() {
        val converted =gbsuFtbLaiService.convertNumber(55)
        val expected = "FtbFtb"
        Assertions.assertThat(converted).contains(expected)
    }
    @Test
    @DisplayName("5 should return FtbFtb")
    fun convertNumber_5shouldReturnFtbFtb() {
        val expected = "FtbFtb"
        Assertions.assertThat(gbsuFtbLaiService.convertNumber(5)).isEqualTo(expected)
    }

    @Test
    @DisplayName("51 should return GbsuFtb")
    fun convertNumber_51shouldReturnGbsuFtb() {
        val expected = "GbsuFtb"
        Assertions.assertThat(gbsuFtbLaiService.convertNumber(51)).isEqualTo(expected)
    }

    @Test
    @DisplayName("53 should return FtbGbsu")
    fun convertNumber_53shouldReturnFtbGbsu() {
        val expected = "FtbGbsu"
        Assertions.assertThat(gbsuFtbLaiService.convertNumber(53)).isEqualTo(expected)
    }

    @Test
    @DisplayName("15 should return GbsuFtbFtb")
    fun convertNumber_15shouldReturnGbsuFtbFtb() {
        val expected = "GbsuFtbFtb"
        Assertions.assertThat(gbsuFtbLaiService.convertNumber(15)).isEqualTo(expected)
    }

}
