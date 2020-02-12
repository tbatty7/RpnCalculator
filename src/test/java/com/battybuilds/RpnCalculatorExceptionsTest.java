package com.battybuilds;

import org.junit.Test;

public class RpnCalculatorExceptionsTest {
    private static class OperatorFactorySabateur extends OperatorFactory {
        @Override
        public MathOperator findOperatorNamed(String operatorName) {
            throw new NoSuchOperator();
        }
    }

    @Test(expected = NoSuchOperator.class)
    public void shouldBubbleUpExceptionsForInvalidOperator() {
        RpnCalculator rpnCalculator = new RpnCalculator(new OperatorFactorySabateur(), new OperandStack());
        rpnCalculator.execute("+");
    }
}
