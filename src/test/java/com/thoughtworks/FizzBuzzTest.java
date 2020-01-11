package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "Fizz, 6",
            "Buzz, 10",
            "Whizz, 14",
    })
    void should_return_special_string_given_number_is_divisible_by_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }

    @ParameterizedTest
    @CsvSource({
            "FizzBuzz, 60",
            "FizzWhizz, 21",
            "BuzzWhizz, 140",
            "FizzBuzzWhizz, 210",
    })
    void should_return_multiple_special_string_given_number_is_divisible_by_multiple_special_number(String expected, Integer number) {
        FizzBuzz result = new FizzBuzz(number);

        Assertions.assertEquals(expected, result.toString());
    }
}
