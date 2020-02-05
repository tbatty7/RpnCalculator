package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AnRpnCalculatorWithTwoNumbersShould {

    RpnCalculator rpnCalculator;

    @Before
    public void setUp() {
        rpnCalculator = new RpnCalculator();
        rpnCalculator.setAccumulator(BigDecimal.TEN);
        rpnCalculator.setAccumulator(new BigDecimal(5));
    }

    @Test
    public void addThemCorrectly() {
        rpnCalculator.add();
        BigDecimal result = rpnCalculator.getAccumulator();
        assertEquals(new BigDecimal(15), result);
    }
}
