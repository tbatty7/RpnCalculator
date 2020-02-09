package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RegisteredOperatorsTest {
    RpnCalculator rpnCalculator;

    @Before
    public void setUp() {
        rpnCalculator = new RpnCalculator();
        rpnCalculator.setAccumulator(new BigDecimal(5));
        rpnCalculator.setAccumulator(BigDecimal.TEN);
    }

    @Test
    public void canAdd() {
        rpnCalculator.execute("+");
        assertEquals(new BigDecimal(15), rpnCalculator.getAccumulator());
    }

    @Test
    public void canSubtract() {
        rpnCalculator.execute("-");
        assertEquals(new BigDecimal(-5), rpnCalculator.getAccumulator());
    }

    @Test
    public void canCalculateFactorial() {
        rpnCalculator.execute("!");
        assertEquals(new BigDecimal(3628800), rpnCalculator.getAccumulator());
    }

    @Test
    public void canMultiply() {
        rpnCalculator.execute("*");
        assertEquals(new BigDecimal(50), rpnCalculator.getAccumulator());
    }

    @Test
    public void canDivide() {
        rpnCalculator.execute("/");
    }

    @Test(expected = NoSuchOperator.class)
    public void throwsExceptionForInvalidOperator() {
        rpnCalculator.execute("bogus operator ___");
    }
}
