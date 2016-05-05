package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.FindMaxNumber;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxNumberTest {
    FindMaxNumber findMaxNumber = new FindMaxNumber();

    @Test
    public void testMaxInFourElementsArray() throws Exception {
        int[] input = {1, 5, 8, 0};
        int expected = 8;

        int actual = findMaxNumber.max(input);
        assertEquals("Is not a max from four elements", expected, actual);
    }

    @Test
    public void testMaxForTwoZeroElementsInArray() throws Exception {
        int[] input = {0, 0};
        int expected = 0;

        int actual = findMaxNumber.max(input);
        assertEquals("Is not a max from two zero", expected, actual);
    }

    @Test
    public void testMaxInArrayWithNegativeElements() throws Exception {
        int[] input = {-2, -4, -25, -186, -5000};
        int expected = -2;

        int actual = findMaxNumber.max(input);
        assertEquals("Is not a max from two zero", expected, actual);
    }
}