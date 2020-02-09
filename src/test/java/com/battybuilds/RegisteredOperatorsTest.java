package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

public class RegisteredOperatorsTest {
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

    @Test(expected = NoSuchOperator.class)
    public void throwsExceptionForInvalidOperator() {
        operatorFactory.findOperatorNamed("bogus operator ___");
    }
}
