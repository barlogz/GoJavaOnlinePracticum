package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleSquareTest {
    RectangleSquare rectangleSquare = new RectangleSquare();

    @Test
    public void testBasic() throws Exception {
        int[] x = {0 ,0};
        int[] h = {20, 10};
        int[] w = {10, 20};

        int expected = 300;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithNonZeroStartPoint() throws Exception {
        int[] x = {0 ,10};
        int[] h = {10, 10};
        int[] w = {10, 10};

        int expected = 200;
        int actual = rectangleSquare.measure(x, h, w);
        assertEquals(expected, actual);
    }

//    @Test
//    public void testTEST() throws Exception {
//        int[] x = {0 ,0};
//        int[] h = {20, 10};
//        int[] w = {10, 20};
//
//        System.out.println(rectangleSquare.measure(x, h, w));
//    }
}