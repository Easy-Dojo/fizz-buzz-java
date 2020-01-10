package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {
    @Test
    void test_should_return_1_when_return_1() {
        FizzBuzz result = new FizzBuzz(1);

        Assertions.assertEquals("1", result.toString());
    }


    @ParameterizedTest
    @CsvSource({
            "1, 1"
    })
    void test_should_return_result_when_input_number_divisible_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }
}
