package com.thoughtworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void test_should_return_1_when_return_1() {
        FizzBuzz result = new FizzBuzz(1);

        Assertions.assertEquals("1", result.toString());
    }
}
