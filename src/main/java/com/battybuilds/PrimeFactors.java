package com.battybuilds;

import java.math.BigDecimal;

public class PrimeFactors implements MathOperator {

    private static final BigDecimal TWO = new BigDecimal(2);

    @Override
    public void execute(OperandStack values) {
        BigDecimal value = values.pop();
        if (value.compareTo(TWO) >= 0) {
            while (value.remainder(TWO).equals(BigDecimal.ZERO)) {
                values.setAccumulator(TWO);
                value = value.divide(TWO);
            }
        }
        if (value.compareTo(TWO) >= 0) {
            values.setAccumulator(value);
        }
    }
}
