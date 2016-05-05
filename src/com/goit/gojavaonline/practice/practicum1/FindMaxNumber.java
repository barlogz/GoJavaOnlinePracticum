package com.goit.gojavaonline.practice.practicum1;

public class FindMaxNumber {
    public int max(int[] input) {
        int max = Integer.MIN_VALUE;

        for (int i : input) { //int i = 1; i < input.length; i++
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
