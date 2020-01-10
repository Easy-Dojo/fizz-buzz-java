package com.thoughtworks;

public class FizzBuzz {

    private final int number;

    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final String WHIZZ_STRING = "Whizz";
    private static final int FIZZ_NUMBER = 3;
    private static final int BUZZ_NUMBER = 5;
    private static final int WHIZZ_NUMBER = 7;

    public FizzBuzz(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String result = "";

        if (isDivisibleByFizzNumber(number)) {
            result += FIZZ_STRING;
        }
        if (isDivisibleByBuzzNumber(number)) {
            result += BUZZ_STRING;
        }
        if (isDivisibleByWhizzNumber(number)) {
            result += WHIZZ_STRING;
        }

        if (isContainsBuzzNumber(number)) {
            return result.replace(FIZZ_STRING, "");
        }

        if (isContainsFizzNumber(number)) {
            return  FIZZ_STRING;
        }

        if (result.isEmpty()) {
            return String.valueOf(number);
        }

        return result;
    }

    private boolean isContainsBuzzNumber(int number) {
        return String.valueOf(number).contains(String.valueOf(BUZZ_NUMBER));
    }

    private boolean isContainsFizzNumber(int number) {
        return String.valueOf(number).contains(String.valueOf(FIZZ_NUMBER));
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
