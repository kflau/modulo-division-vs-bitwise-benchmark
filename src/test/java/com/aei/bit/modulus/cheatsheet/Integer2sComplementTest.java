package com.aei.bit.modulus.cheatsheet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Integer2sComplementTest {

    @Test
    public void positiveInteger() {
        String s = Integer.toBinaryString(Integer.MAX_VALUE);
        String r = concat(s);
        assertEquals("positive integer should be 32bit starting with 0's",
                "01111111111111111111111111111111", r);
    }

    @Test
    public void negativeInteger2sComplement() {
        String s = Integer.toBinaryString(-Integer.MAX_VALUE);
        String r = concat(s);
        assertEquals("with 2's complement in JVM, negative integer should be 32bit starting with 1's, ending with 1",
                "10000000000000000000000000000001", r);
    }

    @Test
    public void negativeInteger2sComplementManually() {
        String s = Integer.toBinaryString(~Integer.MAX_VALUE + 1);
        String r = concat(s);
        assertEquals("with 2's complement, negative integer should be 32bit starting with 1's, ending with 1",
                "10000000000000000000000000000001", r);
    }

    @Test
    public void negativeInteger1sComplement() {
        String s = Integer.toBinaryString(~Integer.MAX_VALUE);
        String r = concat(s);
        assertEquals("with 1's complement, negative integer should be 32bit starting with 1's, ending with 0",
                "10000000000000000000000000000000", r);
    }

    private static String concat(String s) {
        int n = 32 - s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        return sb + s;
    }
}
