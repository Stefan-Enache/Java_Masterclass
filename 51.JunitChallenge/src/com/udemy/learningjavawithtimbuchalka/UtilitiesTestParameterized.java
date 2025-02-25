package com.udemy.learningjavawithtimbuchalka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {

    private String input;
    private String output;

    public UtilitiesTestParameterized(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"abccddeef", "abcdef"},
                {"ab88ddeef", "ab8def"},
                {"112233", "123"},
                {"A", "A"},
        });
    }

    @Test
    public void removePairs() {
        Utilities util = new Utilities();
        assertEquals(output, util.removePairs(input));
    }
}