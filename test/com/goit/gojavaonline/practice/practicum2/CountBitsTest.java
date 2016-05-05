package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsTest {
    CountBits countBits = new CountBits();

    @Test
    public void TestFor13BitsCounting() throws Exception {
        int num = 13;
        int expected = 3;

        String binary = "1";
        System.out.println(binary.charAt(0));

        int actual = countBits.count(num);
        assertEquals("bites of " + num + " counted wrong", expected, actual);

        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.bitCount(num));
    }
}