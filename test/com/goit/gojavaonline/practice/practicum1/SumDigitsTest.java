package com.goit.gojavaonline.practice.practicum1;

import com.goit.gojavaonline.practice.practicum1.SumDigits;
import org.junit.Assert;
import org.junit.Test;

public class SumDigitsTest {
    SumDigits sumDigits = new SumDigits();

    @Test
    public void testThreeDigitsSum() throws Exception {
        int number = 123;
        int expected = 6;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for three integers",expected,actualResult);
    }

    @Test
    public void testOneDigitSum() throws Exception {
        int number = 7;
        int expected = 7;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for one integer",expected,actualResult);
    }

    @Test
    public void testTenDigitsSum() throws Exception {
        int number = 1234567891;
        int expected = 46;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for three inegers",expected,actualResult);
    }

    @Test
    public void testOneZeroIntegerSum() throws Exception {
        int number = 0;
        int expected = 0;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for three inegers",expected,actualResult);
    }

    @Test
    public void testFourZeroIntegersSum() throws Exception {
        int number = 0000;
        int expected = 0;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for three inegers",expected,actualResult);
    }

    @Test
    public void testNegativeIntegerDigitsSum() throws Exception {
        int number = -256;
        int expected = 13;

        int actualResult = sumDigits.sum(number);
        Assert.assertEquals("Characters should be summed correctly for three inegers",expected,actualResult);

//        Input: -256,
//        Expected: 13,
//                Actual: -13
    }
}