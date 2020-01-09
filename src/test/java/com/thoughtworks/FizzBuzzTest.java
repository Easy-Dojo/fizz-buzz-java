package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;

    @Test
    public void should_return_1_when_input_1() {
        String expected = "1";
        String actual = fizzBuzz(1);

        assertEquals(expected, actual);
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        String actual = fizzBuzz(3);

        assertEquals(FIZZ_STRING, actual);
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        String actual = fizzBuzz(5);

        assertEquals(BUZZ_STRING, actual);
    }

    private String fizzBuzz(int number) {
        if (number % FIZZ_NUMBER == 0) {
            return FIZZ_STRING;
        }
        if (number % BUZZ_NUMBER == 0) {
            return BUZZ_STRING;
        }
        return String.valueOf(number);
    }
}
