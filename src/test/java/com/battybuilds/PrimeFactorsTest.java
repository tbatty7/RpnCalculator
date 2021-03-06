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

    @Test
    public void primeFactorsOfFourShouldBeTwoAndTwo() {
        givenAValueOf(4);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(2);
        and(2);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfFiveShouldBeFive() {
        givenAValueOf(5);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(5);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfSixShouldBeThreeAndTwo() {
        givenAValueOf(6);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(3);
        and(2);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfEightShouldBeTwoandTwoAndTwo() {
        givenAValueOf(8);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOfNineShouldBeThreeAndThree() {
        givenAValueOf(9);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(3);
        thenResultShouldBe(3);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOf1024shouldBeTen2s() {
        givenAValueOf(1024);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenResultShouldBe(2);
        thenTheResultShouldBeEmpty();
    }

    @Test
    public void primeFactorsOf15ShouldBeFiveAndThree() {
        givenAValueOf(15);
        whenCalculatingItsPrimeFactors();
        thenResultShouldBe(5);
        thenResultShouldBe(3);
        thenTheResultShouldBeEmpty();
    }

    private void and(int expected) {
        thenResultShouldBe(expected);
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
