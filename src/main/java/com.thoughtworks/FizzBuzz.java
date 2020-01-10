package com.thoughtworks;

public class FizzBuzz {
    private final Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

}
