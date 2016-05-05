package com.goit.gojavaonline.practice.practicum2;

public class CountBits {
    public int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
//      return Integer.bitCount(num);
    }
}
