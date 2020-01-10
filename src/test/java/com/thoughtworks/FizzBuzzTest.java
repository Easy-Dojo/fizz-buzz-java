package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "Fizz, 3"
    })
    void test_for_input_number_divisible_by_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }
}
