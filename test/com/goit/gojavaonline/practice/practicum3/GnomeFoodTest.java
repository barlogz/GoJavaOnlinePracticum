package com.goit.gojavaonline.practice.practicum3;

import org.junit.Test;

import static org.junit.Assert.*;

public class GnomeFoodTest {
    GnomeFood gnomeFood = new GnomeFood();

    @Test
    public void testBasic() throws Exception {
        int[] gnomes = {5, 7, 6, 9, 4};
        int[] portions = {8, 5, 6, 2, 3};

        int[] expected = {4, 2, 1, 0, 3};
        int[] actual = gnomeFood.find(gnomes, portions);
        assertArrayEquals(expected, actual);
    }
}