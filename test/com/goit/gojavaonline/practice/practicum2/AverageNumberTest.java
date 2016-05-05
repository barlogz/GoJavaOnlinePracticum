package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageNumberTest {
    private AverageNumber averageNumber = new AverageNumber();

    @Test
    public void testForTwoAndFour() throws Exception {
        int a = 4;
        int b = 2;
        int expected = 3;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of 2 and 4 is not 3",expected,actualResult);
    }

    @Test
    public void testForFourAndSix() throws Exception {
        int a = 4;
        int b = 6;
        int expected = 5;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of 4 and 6 is not 5",expected,actualResult);
    }

    @Test
    public void testForNegativeFourAndSeven() throws Exception {
        int a = -4;
        int b = 7;
        int expected = 1;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of -4 and 7 is not 1",expected,actualResult);
    }

    @Test
    public void testForNegativeFourAndNegativeSeven() throws Exception {
        int a = -4;
        int b = -7;
        int expected = -5;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of -4 and -7 is not -5",expected,actualResult);
    }

    @Test
    public void testForIntegerMAX_VALUE() throws Exception {
        int a = 2147483647;
        int b = 2147483647;
        int expected = 2147483647;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of two 2147483647 is not 2147483647",expected,actualResult);
    }

    @Test
    public void testForIntegerMAX_VALUEDevidedOnTwo() throws Exception {
        int a = 1073741824;
        int b = 1073741824;
        int expected = 1073741824;

        int actualResult = averageNumber.average(a,b);
        assertEquals("Average of two 1073741824 is not 1073741824",expected,actualResult);
    }

}