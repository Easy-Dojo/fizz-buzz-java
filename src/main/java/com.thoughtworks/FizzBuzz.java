package com.thoughtworks;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;
    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final int BUZZ_NUMBER = 5;
    private static final String WHIZZ_STRING = "Whizz";
    private static final int WHIZZ_NUMBER = 7;
    private static final String BLANK_STRING = "";
    private final Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        List<String> ruleResults = Arrays.asList(getFizzRuleResult(), getBuzzRuleResult(), getWhizzRuleResult());

        return ruleResults.stream()
                .distinct()
                .reduce(String::concat)
                .orElse(number.toString());
    }

    private boolean contains(Integer fizzNumber) {
        return number.toString().contains(fizzNumber.toString());
    }

    private String getFizzRuleResult() {
        return (isDivisibleBy(FIZZ_NUMBER) || contains(FIZZ_NUMBER)) && (!contains(BUZZ_NUMBER) || (contains(BUZZ_NUMBER) && contains(WHIZZ_NUMBER))) ? FIZZ_STRING : BLANK_STRING;
    }

    private String getBuzzRuleResult() {
        return isDivisibleBy(BUZZ_NUMBER) && !contains(WHIZZ_NUMBER) && (contains(BUZZ_NUMBER) || (!contains(BUZZ_NUMBER) && !contains(FIZZ_NUMBER))) ? BUZZ_STRING : BLANK_STRING;
    }

    private String getWhizzRuleResult() {
        return isDivisibleBy(WHIZZ_NUMBER) && (
                (
                        contains(BUZZ_NUMBER) && !contains(WHIZZ_NUMBER)) ||
                        (!contains(BUZZ_NUMBER) && !contains(FIZZ_NUMBER)) ||
                        (contains(BUZZ_NUMBER) && contains(WHIZZ_NUMBER) && !contains(FIZZ_NUMBER))
        ) ? WHIZZ_STRING : BLANK_STRING;
    }

    private boolean isDivisibleBy(int i) {
        return number % i == 0;
    }

}
