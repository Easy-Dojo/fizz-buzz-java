package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final String WHIZZ_STRING = "Whizz";
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private static final int WHIZZ_NUMBER = 7;

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

    @Test
    public void should_return_Whizz_when_input_7() {
        String actual = fizzBuzz(7);

        assertEquals(WHIZZ_STRING, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        String actual = fizzBuzz(15);

        assertEquals(FIZZ_STRING + BUZZ_STRING, actual);
    }

    @Test
    public void should_return_FizzWhizz_when_input_21() {
        String actual = fizzBuzz(21);

        assertEquals(FIZZ_STRING + WHIZZ_STRING, actual);
    }

    @Test
    public void should_return_BuzzWhizz_when_input_35() {
        String actual = fizzBuzz(35);

        assertEquals(BUZZ_STRING + WHIZZ_STRING, actual);
    }

    private String fizzBuzz(int number) {
        if (isDivisibleByFizzNumber(number) && isDivisibleByBuzzNumber(number)) {
            return FIZZ_STRING + BUZZ_STRING;
        }

        if (isDivisibleByFizzNumber(number) && isDivisibleByWhizzNumber(number)) {
            return FIZZ_STRING + WHIZZ_STRING;
        }

        if (isDivisibleByBuzzNumber(number) && isDivisibleByWhizzNumber(number)) {
            return BUZZ_STRING + WHIZZ_STRING;
        }

        if (isDivisibleByFizzNumber(number)) {
            return FIZZ_STRING;
        }
        if (isDivisibleByBuzzNumber(number)) {
            return BUZZ_STRING;
        }
        if (isDivisibleByWhizzNumber(number)) {
            return WHIZZ_STRING;
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleByFizzNumber(int number) {
        return number % FIZZ_NUMBER == 0;
    }

    private boolean isDivisibleByBuzzNumber(int number) {
        return number % BUZZ_NUMBER == 0;
    }

    private boolean isDivisibleByWhizzNumber(int number) {
        return number % WHIZZ_NUMBER == 0;
    }
}
