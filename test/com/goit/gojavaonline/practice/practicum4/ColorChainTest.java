package com.goit.gojavaonline.practice.practicum4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ColorChainTest {
    ColorChain colorChain = new ColorChain();

    @Test
    public void testFor1() throws Exception {
        int rest = 1;
        int expected = 1;

        int actual = colorChain.count(rest);
        assertEquals(expected, actual);
    }

    @Test
    public void testFor2() throws Exception {
        int rest = 2;
        int expected = 2;

        int actual = colorChain.count(rest);
        assertEquals(expected, actual);
    }

    @Test
    public void testFor4() throws Exception {
        int rest = 4;
        int expected = 7    ;

        int actual = colorChain.count(rest);
        assertEquals(expected, actual);
    }
}