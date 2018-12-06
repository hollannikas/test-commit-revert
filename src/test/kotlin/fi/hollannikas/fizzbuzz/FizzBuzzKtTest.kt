package fi.hollannikas.fizzbuzz

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("A FizzBuzzer")
internal class FizzBuzzKtTest {
    @DisplayName("should fizz")
    @Test 
    fun shouldFizz() {
        val original = (1..16).map { it }
        val expected = "1,2,FIZZ,4,BUZZ,FIZZ,7,8,FIZZ,BUZZ,11,FIZZ,13,14,FIZZBUZZ,16"
        val result = fizzBuzz(original)
        assertEquals(expected, result)
    }
}
