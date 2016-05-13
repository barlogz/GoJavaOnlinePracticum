package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestStabilityPeriodTest {
    LongestStabilityPeriod longestStabilityPeriod = new LongestStabilityPeriod();


    @Test
    public void testCount() throws Exception {
        int[] input = {901, 901, 901, 902, 902, 903, 903, 902, 902, 901};
        int expected = 6;

        int actual = longestStabilityPeriod.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWithOneMonth() throws Exception {
        int[] input = {1000};
        int expected = 1;

        int actual = longestStabilityPeriod.count(input);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCountWithThreeMonths() throws Exception {
        int[] input = {900, 901, 902};
        int expected = 2;

        int actual = longestStabilityPeriod.count(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWithEightMonths() throws Exception {
        int[] input = {900, 900, 900, 901, 902, 902, 903, 903};
        int expected = 4;

        int actual = longestStabilityPeriod.count(input);
        assertEquals(expected, actual);
    }
}