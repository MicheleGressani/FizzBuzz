package com.mycompany.fizzbuzz;

import org.junit.jupiter.api.Test;

import static com.mycompany.fizzbuzz.Fizzbuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FizzBuzzTests {

    @Test
    public void testFizzBuzz() {
        int fizzBuzzInput = 0;
        String[] words = fizzBuzz(fizzBuzzInput, 10);
        String[] expectedWords = { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};

        assertArrayEquals(expectedWords, words);
    }
}
