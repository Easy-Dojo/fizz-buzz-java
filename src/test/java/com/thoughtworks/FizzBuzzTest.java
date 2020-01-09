package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ_STRING = "Fizz";

    @Test
    public void should_return_1_when_input_1() {
        String expected = "1";
        String actual = fizzBuzz(1);

        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        String expected = "Fizz";
        String actual = fizzBuzz(3);

        assertEquals(expected, actual);
    }

    private String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return FIZZ_STRING;
        }
        return String.valueOf(number);
    }
}
