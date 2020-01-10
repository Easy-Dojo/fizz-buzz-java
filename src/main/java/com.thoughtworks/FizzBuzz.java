package com.thoughtworks;

public class FizzBuzz {
    private static final int FIZZ_NUMBER = 3;
    private static final String FIZZ_STRING = "Fizz";
    private static final String BUZZ_STRING = "Buzz";
    private static final int BUZZ_NUMBER = 5;
    private static final String WHIZZ_STRING = "Whizz";
    private static final int WHIZZ_NUMBER = 7;
    private static final String BLANKSTRING = "";
    private final Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        String result = getFizzRuleResult(number) + getBuzzRuleResult(number) + getWhizzRuleResult(number);
        return result.isEmpty() ? number.toString() : result;
    }

    private String getFizzRuleResult(Integer number) {
        return isDivisibleBy(number, FIZZ_NUMBER) ? FIZZ_STRING : BLANKSTRING;
    }

    private String getBuzzRuleResult(Integer number) {
        return isDivisibleBy(number, BUZZ_NUMBER) ? BUZZ_STRING : BLANKSTRING;
    }

    private String getWhizzRuleResult(Integer number) {
        return isDivisibleBy(number, WHIZZ_NUMBER) ? WHIZZ_STRING : BLANKSTRING;
    }

    private boolean isDivisibleBy(Integer number, int i) {
        return number % i == 0;
    }

}
