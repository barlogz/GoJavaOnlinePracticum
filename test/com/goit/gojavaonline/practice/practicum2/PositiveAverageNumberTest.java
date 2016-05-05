package com.goit.gojavaonline.practice.practicum2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PositiveAverageNumberTest {

    @Test
    public void testForTwoAndFour() throws Exception {
        int a = 4;
        int b = 2;
        int expected = 3;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE/2);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE/2);

        int actualResult = PositiveAverageNumber.average(a,b);
        assertEquals("Average of 2 and 4 is not 3",expected,actualResult);
    }

    @Test
    public void testForIntegerMAX_VALUE() throws Exception {
        int a = 2147483647;
        int b = 2147483647;
        int expected = 2147483647;

        int actualResult = PositiveAverageNumber.average(a,b);
        assertEquals("Average of two 2147483647 is not 2147483647",expected,actualResult);
    }

    @Test
    public void testForIntegerMAX_VALUEDevidedOnTwo() throws Exception {
        int a = 1073741824;
        int b = 1073741824;
        int expected = 1073741824;

        int actualResult = PositiveAverageNumber.average(a,b);
        assertEquals("Average of two 1073741824 is not 1073741824",expected,actualResult);
    }

}