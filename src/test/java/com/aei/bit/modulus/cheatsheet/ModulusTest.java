package com.aei.bit.modulus.cheatsheet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ModulusTest {

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[15000][0];
    }

    @Test
    public void positiveEvenInteger() {
        int i = 981122778;
        long start = System.nanoTime();
        int r = (i % 2);
        long end = System.nanoTime();
        System.out.println(String.format("positive even integer mod by 2 takes %dns", end - start));
        assertEquals("positive even integer mod by 2 returns 0", 0, r);
    }

    @Test
    public void negativeEvenInteger() {
        int i = ~981122778 + 1;
        long start = System.nanoTime();
        int r = (i % 2);
        long end = System.nanoTime();
        System.out.println(String.format("negative even integer mod by 2 takes %dns", end - start));
        assertEquals("negative even integer mod by 2 returns 0", 0, r);
    }

    @Test
    public void positiveOddInteger() {
        int i = 981122771;
        long start = System.nanoTime();
        int r = (i % 2);
        long end = System.nanoTime();
        System.out.println(String.format("positive odd integer mod by 2 takes %dns", end - start));
        assertEquals("positive odd integer mod by 2 returns 1", 1, r);
    }

    @Test
    public void negativeOddInteger() {
        int i = ~981122771 + 1;
        long start = System.nanoTime();
        int r = (i % 2);
        long end = System.nanoTime();
        System.out.println(String.format("negative odd integer mod by 2 takes %dns", end - start));
        assertEquals("negative odd integer mod by 2 returns -1", -1, r);
    }
}
