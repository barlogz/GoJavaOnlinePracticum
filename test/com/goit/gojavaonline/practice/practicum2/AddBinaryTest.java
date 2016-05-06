package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBinaryTest {
    private AddBinary addBinary = new AddBinary();

    @Test
    public void testForSumOfTwoStrings() throws Exception {
        String a = "101";
        String b = "100";
        String expected = "1001";

        String actual = addBinary.add(a, b);
        assertEquals("Sum of 101 & 100 isn`t equals 1001", expected, actual);
    }

    @Test
    public void testForSumOfTwoLongStrings() throws Exception {
        String a = "10000000000000000000000000000000";
        String b = "10000000000000000000000000000000";
        String expected = "100000000000000000000000000000000";

        String actual = addBinary.add(a, b);
        assertEquals("Sum of two 10000000000000000000000000000000 isn`t equals " +
                "10000000000000000000000000000000", expected, actual);
    }
}