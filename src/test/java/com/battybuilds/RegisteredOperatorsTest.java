package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class RegisteredOperatorsTest {
    RpnCalculator rpnCalculator;
    OperatorFactory operatorFactory;

    @Before
    public void setUp() {
        operatorFactory = new OperatorFactory();
        rpnCalculator = new RpnCalculator();
        rpnCalculator.setAccumulator(new BigDecimal(5));
        rpnCalculator.setAccumulator(BigDecimal.TEN);
    }

    @Test
    public void canAdd() {
        operatorFactory.findOperatorNamed("+");
    }

    @Test
    public void canSubtract() {
        operatorFactory.findOperatorNamed("-");
    }

    @Test
    public void canCalculateFactorial() {
        operatorFactory.findOperatorNamed("!");
    }

    @Test
    public void canMultiply() {
        operatorFactory.findOperatorNamed("*");
    }

    @Test
    public void canDivide() {
        operatorFactory.findOperatorNamed("/");
    }

    @Test(expected = NoSuchOperator.class)
    public void throwsExceptionForInvalidOperator() {
        operatorFactory.findOperatorNamed("bogus operator ___");
    }
}
