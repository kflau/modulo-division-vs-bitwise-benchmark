package com.aei.bit.modulus.cheatsheet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BitwiseModulusTest {

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[100][0];
    }

    @Test
    public void positiveEvenInteger() {
        int i = 981122778;
        long start = System.nanoTime();
        int r = (i & 0x1);
        long end = System.nanoTime();
        System.out.println(String.format("positive even integer masked by 0x1 takes %dns", end - start));
        assertEquals("positive even integer masked by 0x1 returns 0", 0, r);
    }

    @Test
    public void negativeEvenInteger() {
        int i = ~981122778 + 1;
        long start = System.nanoTime();
        int r = (i & 0x1);
        long end = System.nanoTime();
        System.out.println(String.format("negative even integer masked by 0x1 takes %dns", end - start));
        assertEquals("negative even integer masked by 0x1 returns 0", 0, r);
    }

    @Test
    public void positiveOddInteger() {
        int i = 981122771;
        long start = System.nanoTime();
        int r = (i & 0x1);
        long end = System.nanoTime();
        System.out.println(String.format("positive odd integer masked by 0x1 takes %dns", end - start));
        assertEquals("positive odd integer masked by 0x1 returns 1", 1, r);
    }

    @Test
    public void negativeOddInteger() {
        int i = ~981122771 + 1;
        long start = System.nanoTime();
        int r = (i & 0x1);
        long end = System.nanoTime();
        System.out.println(String.format("negative odd integer masked by 0x1 takes %dns", end - start));
        assertEquals("negative odd integer masked by 0x1 returns 1", 1, r);
    }
}
