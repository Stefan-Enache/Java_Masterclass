package com.udemy.learningjavawithtimbuchalka;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest1 {

    private Utilities util;

    @Before
    public void setup() {
        util = new Utilities();
    }

    @Test
    public void everyNthChar() {

        char[] output = util.everyNthChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 6);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, output);
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEF"));
        assertNull("Did not get null when null expected", util.removePairs(null));
        assertEquals("", util.removePairs(""));
    }

    @Test
    public void converter() throws Exception {
        assertEquals(300, util.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter_exception() throws Exception {
        util.converter(10, 0);

    }

    @Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}