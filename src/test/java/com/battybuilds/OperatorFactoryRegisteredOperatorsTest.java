package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class OperatorFactoryRegisteredOperatorsTest {
    OperatorFactory operatorFactory;

    @Before
    public void setUp() {
        operatorFactory = new OperatorFactory();
    }

    @Test
    public void canFindAdd() {
        operatorFactory.findOperatorNamed("+");
    }

    @Test
    public void canFindSubtract() {
        operatorFactory.findOperatorNamed("-");
    }

    @Test
    public void canFindFactorial() {
        operatorFactory.findOperatorNamed("!");
    }

    @Test
    public void canFindMultiply() {
        operatorFactory.findOperatorNamed("*");
    }

    @Test
    public void canFindDivide() {
        operatorFactory.findOperatorNamed("/");
    }

    @Test
    public void canFindSum() {
        operatorFactory.findOperatorNamed("sum");
    }

    @Test
    public void canFindPrimeFactors() {
        operatorFactory.findOperatorNamed("primeFactors");
    }

    @Test
    public void addingDuplicateOperatorFails() {
        operatorFactory.addOperatorNamed("foo", new Add());
        try {
            operatorFactory.addOperatorNamed("foo", new Multiply());
            fail("Should have thrown an exception");
        } catch (OperatorNameAlreadyExists e) {
            // correct behavior
        }
    }

    @Test(expected = NoSuchOperator.class)
    public void throwsExceptionForInvalidOperator() {
        operatorFactory.findOperatorNamed("bogus operator ___");
    }
}
