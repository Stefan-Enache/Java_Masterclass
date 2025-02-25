package com.udemy.learningjavawithtimbuchalka;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized1 {

    private Utilities util;

    private String input;
    private String output;

    public UtilitiesTestParameterized1(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @Parameterized.Parameters
    public static Collection<Object> testConditions() {
        return Arrays.asList(new Object[][]{
                {"abccddeef", "abcdef"},
                {"ab88ddeef", "ab8def"},
                {"112233", "123"},
                {"A", "A"},
        });
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals(output, util.removePairs(input));
    }
}
