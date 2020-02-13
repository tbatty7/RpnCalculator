package com.battybuilds;

import org.junit.Test;

public class RpnCalculatorExceptionsTest {
    private static class OperatorFactorySaboteur extends OperatorFactory {
        @Override
        public MathOperator findOperatorNamed(String operatorName) {
            throw new NoSuchOperator();
        }
    }

    @Test(expected = NoSuchOperator.class)
    public void shouldBubbleUpExceptionsForInvalidOperator() {
        RpnCalculator rpnCalculator = new RpnCalculator(new OperatorFactorySaboteur(), new OperandStack());
        rpnCalculator.execute("+");
    }
}
