package com.thoughtworks;

public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;
    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final int BUZZ_NUMBER = 5;
    private final Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if (isDivisibleBy(number, FIZZ_NUMBER)) {
            return FIZZ_STRING;
        }
        if (isDivisibleBy(number, BUZZ_NUMBER)) {
            return BUZZ_STRING;
        }

        return String.valueOf(number);
    }

    private boolean isDivisibleBy(Integer number, int i) {
        return number % i == 0;
    }

}
