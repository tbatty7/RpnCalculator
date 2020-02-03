package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class RpnCalculatorWithThreeNumbersAddedShould {

    private RpnCalculator calculator;
    private BigDecimal firstNumber;
    private BigDecimal secondNumber;
    private BigDecimal thirdNumber;

    @Before
    public void setUp() {
        calculator = new RpnCalculator();
        firstNumber = new BigDecimal(42);
        secondNumber = new BigDecimal(2);
        thirdNumber = new BigDecimal(5);
        calculator.setAccumulator(firstNumber);
        calculator.setAccumulator(secondNumber);
        calculator.setAccumulator(thirdNumber);
    }


    @Test
    public void lastNumberToBeAddedShouldBeInAccumulator() {
        assertEquals(thirdNumber, calculator.getAccumulator());
    }

    @Test
    public void whenDroppedOnceNextToLastNumberShouldBeInAccumulator() {
        calculator.drop();
        assertEquals(secondNumber, calculator.getAccumulator());
    }

    @Test
    public void whenDroppedTwiceFirstNumberAddedShouldBeInAccumulator() {
        calculator.drop();
        calculator.drop();
        assertEquals(firstNumber, calculator.getAccumulator());
    }

    @Test
    public void whenDroppedThreeTimesShouldReturnZero() {
        calculator.drop();
        calculator.drop();
        calculator.drop();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }
}
