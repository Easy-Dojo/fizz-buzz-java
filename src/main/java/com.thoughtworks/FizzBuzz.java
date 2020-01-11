package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> ruleResults = getRuleResults();

        return ruleResults.stream()
                .distinct()
                .reduce(String::concat).orElse(number.toString());
    }

    private List<String> getRuleResults() {
        List<String> result = new ArrayList<>();
        result.add(getFizzRuleResult());
        result.add(getBuzzRuleResult());
        result.add(getWhizzRuleResult());

        if (contains(number, BUZZ_NUMBER)) {
            result = removeFizzRuleResult(result);
        }
        if (contains(number, FIZZ_NUMBER) && !contains(number, BUZZ_NUMBER)) {
            result.add(0, FIZZ_STRING);
            result = removeBuzzRuleResultAndWhizzRuleResult(result);
        }
        return result;
    }

    private List<String> removeFizzRuleResult(List<String> result) {
        return result.stream()
                .filter(ruleResult -> !ruleResult.equals(FIZZ_STRING))
                .collect(Collectors.toList());
    }

    private List<String> removeBuzzRuleResultAndWhizzRuleResult(List<String> result) {
        return result.stream()
                .filter(ruleResult -> ruleResult.equals(FIZZ_STRING))
                .collect(Collectors.toList());
    }

    private boolean contains(Integer number, Integer fizzNumber) {
        return number.toString().contains(fizzNumber.toString());
    }

    private String getFizzRuleResult() {
        return isDivisibleBy(number, FIZZ_NUMBER) ? FIZZ_STRING : BLANK_STRING;
    }

    private String getBuzzRuleResult() {
        return isDivisibleBy(number, BUZZ_NUMBER) ? BUZZ_STRING : BLANK_STRING;
    }

    private String getWhizzRuleResult() {
        return isDivisibleBy(number, WHIZZ_NUMBER) ? WHIZZ_STRING : BLANK_STRING;
    }

    private boolean isDivisibleBy(Integer number, int i) {
        return number % i == 0;
    }

}
