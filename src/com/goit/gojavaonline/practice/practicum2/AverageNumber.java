package com.goit.gojavaonline.practice.practicum2;

public class AverageNumber {
    public int average(int a, int b) {
        if (a == Integer.MAX_VALUE && b == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (a > Integer.MAX_VALUE / 2 && b > Integer.MAX_VALUE / 2) {
            return a/2 + b/2;
        } else if (a < Integer.MIN_VALUE / 2 || b < Integer.MIN_VALUE / 2) {
            return a/2 + b/2;
        } else return (a + b) / 2;
    }
}
