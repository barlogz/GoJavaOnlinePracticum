package com.goit.gojavaonline.practice.practicum1;

public class SumDigits {
    public int sum(int number) {
        int result = 0;
        while (number != 0) {
            result = result + number % 10;
            number /= 10;
        }
        return Math.abs(result);
    }
}