package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorShould {

    private final RpnCalculator calculator = new RpnCalculator();

    @Test
    public void returnZeroAtFirst() {
        BigDecimal numberToReturn = calculator.getAccumulator();
        assertEquals(BigDecimal.ZERO, numberToReturn);
    }

    @Test
    public void returnNumberEntered() {
        calculator.setAccumulator(BigDecimal.TEN);
        assertEquals(BigDecimal.TEN, calculator.getAccumulator());
    }

    @Test
    public void notThrowExceptionWhenDropIsCalledAndNoNumbersAreInAccumulator() {
        calculator.drop();
    }
}
