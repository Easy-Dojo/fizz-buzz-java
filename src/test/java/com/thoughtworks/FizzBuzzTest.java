package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final String WHIZZ_STRING = "Whizz";

    @Test
    public void should_return_1_when_input_1() {
        String expected = "1";
        FizzBuzz actual = new FizzBuzz(1);

        assertEquals(expected, actual.toString());
    }

    @Test
    public void should_return_Fizz_when_input_3() {
        FizzBuzz actual = new FizzBuzz(3);

        assertEquals(FIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_Buzz_when_input_5() {
        FizzBuzz actual = new FizzBuzz(5);

        assertEquals(BUZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_Whizz_when_input_7() {
        FizzBuzz actual = new FizzBuzz(7);

        assertEquals(WHIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_FizzBuzz_when_input_15() {
        FizzBuzz actual = new FizzBuzz(15);

        assertEquals(BUZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_FizzWhizz_when_input_21() {
        FizzBuzz actual = new FizzBuzz(21);

        assertEquals(FIZZ_STRING + WHIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_BuzzWhizz_when_input_35() {
        FizzBuzz actual = new FizzBuzz(35);

        assertEquals(BUZZ_STRING + WHIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_input_105() {
        FizzBuzz actual = new FizzBuzz(105);

        assertEquals(BUZZ_STRING + WHIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_Fizz_when_input_13() {
        FizzBuzz actual = new FizzBuzz(13);

        assertEquals(FIZZ_STRING, actual.toString());
    }

    @Test
    public void should_return_Fizz_when_input_75() {
        FizzBuzz actual = new FizzBuzz(75);

        assertEquals(FIZZ_STRING, actual.toString());
    }

}
