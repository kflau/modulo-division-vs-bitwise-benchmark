package com.aei.bit.modulus.cheatsheet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class LowestBitModulusTest {

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[15000][0];
    }

    @Test
    public void positiveEvenInteger() {
        int i = 981122778;
        long start = System.nanoTime();
        int r = Integer.lowestOneBit(i);
        long end = System.nanoTime();
        System.out.println(String.format("positive even integer with lowest bit not at 0 takes %dns", end - start));
        assertNotEquals("positive even integer with lowest bit not at 0", 0, r);
    }

    @Test
    public void negativeEvenInteger() {
        int i = ~981122778 + 1;
        long start = System.nanoTime();
        int r = Integer.lowestOneBit(i);
        long end = System.nanoTime();
        System.out.println(String.format("negative even integer with lowest bit not at 0 takes %dns", end - start));
        assertNotEquals("negative even integer with lowest bit not at 0", 0, r);
    }

    @Test
    public void positiveOddInteger() {
        int i = 981122771;
        long start = System.nanoTime();
        int r = Integer.lowestOneBit(i);
        long end = System.nanoTime();
        System.out.println(String.format("positive odd integer with lowest bit at 0 takes %dns", end - start));
        assertEquals("positive odd integer with lowest bit at 0 returns 1", 1, r);
    }

    @Test
    public void negativeOddInteger() {
        int i = ~981122771 + 1;
        long start = System.nanoTime();
        int r = Integer.lowestOneBit(i);
        long end = System.nanoTime();
        System.out.println(String.format("negative odd integer with lowest bit at 0 takes %dns", end - start));
        assertEquals("negative odd integer with lowest bit at 0 returns 1", 1, r);
    }
}
