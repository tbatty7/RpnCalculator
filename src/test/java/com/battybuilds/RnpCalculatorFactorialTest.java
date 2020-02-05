package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RnpCalculatorFactorialTest {

    RpnCalculator rpnCalculator;

    @Before
    public void setUp() {
        rpnCalculator = new RpnCalculator();
    }

    @Test
    public void returnsFactorialOfOneForZero() {
        rpnCalculator.factorial();
        assertEquals(BigDecimal.ONE, rpnCalculator.getAccumulator());
    }

    @Test
    public void returnsFactorialOf120For5() {
        rpnCalculator.setAccumulator(new BigDecimal(5));
        rpnCalculator.factorial();
        assertEquals(new BigDecimal(120), rpnCalculator.getAccumulator());
    }

    @Test
    public void name() {
        BigDecimal ten = BigDecimal.TEN;
        int greaterThan = ten.compareTo(new BigDecimal(5));
        assertEquals(1, greaterThan);
        int equalTo = ten.compareTo(BigDecimal.TEN);
        assertEquals(0, equalTo);
        int lessThan = ten.compareTo(new BigDecimal(15));
        assertEquals(-1, lessThan);
    }
}
