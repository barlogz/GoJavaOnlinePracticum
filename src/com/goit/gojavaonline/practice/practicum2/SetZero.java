package com.goit.gojavaonline.practice.practicum2;

public class SetZero {
    public int set(int num, int i) {
        return num & ~(1 << i - 1);
    }
}