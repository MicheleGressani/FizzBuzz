package com.mycompany.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.mycompany.fizzbuzz.Fizzbuzz.fizzBuzz;
import static com.mycompany.fizzbuzz.Fizzbuzz.fizzBuzzWord;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {

    @Test
    public void testFizzBuzz() {
        int fizzBuzzInput = 0;
        String[] words = fizzBuzz(fizzBuzzInput, 14);
        String[] expectedWords = { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14"};

        assertArrayEquals(expectedWords, words);
    }

    @ParameterizedTest
    @CsvSource({
        "1,1",
        "3,Fizz",
        "5,Buzz",
        "6,Fizz",
        "10,Buzz",
        "13,Fizz",
        "60,FizzBuzz",
        "15,FizzBuzzBuzz",
        "55,BuzzBuzz",
        "53,FizzBuzz",
    })
    void testFizzBuzzWord(int number, String expectedWord) {
        String word = fizzBuzzWord(number);
        assertEquals(expectedWord, word);
    }
}
