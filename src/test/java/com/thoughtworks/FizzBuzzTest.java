package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "FizzBuzz, 15",
    })
    void test_for_input_number_divisible_by_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }

    @ParameterizedTest
    @CsvSource({
            "FizzBuzz, 15",
            "FizzWhizz, 21",
            "BuzzWhizz, 35",
    })
    void test_for_input_number_divisible_by_multi_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }
}
