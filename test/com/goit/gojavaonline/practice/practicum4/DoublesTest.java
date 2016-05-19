package com.goit.gojavaonline.practice.practicum4;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DoublesTest {
    Doubles doubles = new Doubles();

    @Test
    public void testBasicConditions() throws Exception {
        String input = "-2.e10";
        Double expected = null;

//        System.out.println(BigDecimal.valueOf(Double.MAX_VALUE));
//        System.out.println(Double.MIN_VALUE);

        Double actual = doubles.parse(input);
//        System.out.println(actual/1000000);
        assertEquals(expected, actual);
    }

    @Test
    public void testBasicConditions2() throws Exception {
        String input = "+.3";
        Double expected = null;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testBasicConditions3() throws Exception {
        String input = ".e2";
        Double expected = null;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinusAndZeroBeforePoint() throws Exception {
        String input = "-0.";
        Double expected = 0.0;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinusAndZeroAfterPoint() throws Exception {
        String input = "-.0";
        Double expected = 0.0;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForTwo() throws Exception {
        String input = "2.";
        Double expected = 2.0;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testForMinusAndPoint() throws Exception {
        String input = "-.";
        Double expected = null;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testMinusAndE() throws Exception {
        String input = "2.e2";
        Double expected = 200.0;

        Double actual = doubles.parse(input);
        assertEquals(expected, actual);
    }
}
