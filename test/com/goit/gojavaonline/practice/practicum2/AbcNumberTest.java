package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbcNumberTest {
    AbcNumber abcNumber = new AbcNumber();

    @Test
    public void testFor123() throws Exception {
        String num = "bcd";
        int expected = 123;

        int actual = abcNumber.convert(num);
        assertEquals("bcd didn`t converted in 123", expected, actual);
    }

    @Test
    public void testFor987() throws Exception {
        String num = "jih";
        int expected = 987;

        int actual = abcNumber.convert(num);
        assertEquals("jih didn`t converted in 987", expected, actual);
        System.out.println();
    }

    @Test
    public void testFor159() throws Exception {
        String num = "bfj";
        int expected = 159;

        int actual = abcNumber.convert(num);
        assertEquals("bfj didn`t converted in 159", expected, actual);
        System.out.println();
    }
}