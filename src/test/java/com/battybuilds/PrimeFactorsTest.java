package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private BigDecimal bigDecimal;
    private OperandStack operandStack;

    @Test
    public void primeFactorsOfOneShouldGiveEmptyStack() {
        givenAValueOf(1);
        whenCalculatingItsPrimeFactors();
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfTwoShouldBeTwo() {
        givenAValueOf(2);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(2);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfThreeShouldBeThree() {
        givenAValueOf(3);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(3);
        thenTheResultShouldBeEmpty();
    }

    private void thenResultShouldBe(int expected) {
        assertEquals(new BigDecimal(expected), operandStack.getAccumulator());
        operandStack.pop();
    }

    private void thenTheResultShouldBeEmpty() {
        assertEquals(0, operandStack.size());
    }

    private void whenCalculatingItsPrimeFactors() {
        operandStack = new OperandStack();
        operandStack.setAccumulator(bigDecimal);
        new PrimeFactors().execute(operandStack);
    }

    private void givenAValueOf(int number) {
        bigDecimal = new BigDecimal(number);
    }
}
