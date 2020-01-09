package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_when_input_1() {
        String expected = "1";
        String actual = fizzBuzz(1);

        assertEquals(expected, actual);
    }

    private String fizzBuzz(int number) {
        return String.valueOf(number);
    }


}
