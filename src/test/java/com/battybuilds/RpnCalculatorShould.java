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
        enterNumber(BigDecimal.TEN);
    }

    @Test
    public void addNumbersToStack() {
        BigDecimal firstNumber = new BigDecimal(42);
        BigDecimal secondNumber = new BigDecimal(2);
        BigDecimal thirdNumber = new BigDecimal(5);
        enterNumber(firstNumber);
        enterNumber(secondNumber);
        enterNumber(thirdNumber);
        dropNumber(secondNumber);
        dropNumber(firstNumber);
        dropNumber(BigDecimal.ZERO);
    }

    private void dropNumber(BigDecimal secondNumber) {
        calculator.drop();
        assertEquals(secondNumber, calculator.getAccumulator());
    }

    private void enterNumber(BigDecimal firstNumber) {
        calculator.setAccumulator(firstNumber);
        assertEquals(firstNumber, calculator.getAccumulator());
    }
}
