package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.FirstOddNumber;
import org.junit.Assert;
import org.junit.Test;

public class FirstOddNumberTest {
    FirstOddNumber firstOddNumber = new FirstOddNumber();

    @Test
    public void testFindEvenInArrayOfThreeIntegers() throws Exception {
        int[] input = {1, 3, 2};
        int expected = 2;

        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals("Error in FindEvenInArrayOfThreeIntegers", expected, actualResult);
    }

    @Test
    public void testFindEvenInArrayOfOneInteger() throws Exception {
        int[] input = {2};
        int expected = 0;

        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals("Error in FindEvenInArrayOfThreeIntegers", expected, actualResult);
    }

    @Test
    public void testFindEvenInArrayOfOneZero() throws Exception {
        int[] input = {0};
        int expected = 0;

        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals("Error in FindEvenInArrayOfThreeIntegers", expected, actualResult);
    }

    @Test
    public void testFindEvenInArrayOfTenIntegers() throws Exception {
        int[] input = {-1, 1, 3, 5, 7, 9, 2, 4 , 8, 9};
        int expected = 6;

        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals("Error in FindEvenInArrayOfThreeIntegers", expected, actualResult);
    }

    @Test
    public void testFindEvenInArrayOfFiveNegativeIntegers() throws Exception {
        int[] input = {-9, -7, -5, -3, -2};
        int expected = 4;

        int actualResult = firstOddNumber.find(input);
        Assert.assertEquals("Error in FindEvenInArrayOfThreeIntegers", expected, actualResult);
    }
}