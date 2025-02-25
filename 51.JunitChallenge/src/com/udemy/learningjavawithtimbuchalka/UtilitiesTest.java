package com.udemy.learningjavawithtimbuchalka;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() {
        char[] x = null;
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 8));
        assertArrayEquals(null, util.everyNthChar(x, 8));
    }

    @Test
    public void removePairs() {
        assertEquals("abcdef", util.removePairs("abbccdeef"));
        assertNull(util.removePairs(null));
        assertEquals("s", util.removePairs("s"));
        assertEquals("", util.removePairs(""));
    }

    @Test(expected = ArithmeticException.class)
    public void converter() {

        assertEquals(300, util.converter(10, 0));
    }

    @Test
    public void nullIfOddLength() {

        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}