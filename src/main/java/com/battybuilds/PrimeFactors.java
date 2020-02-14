package com.battybuilds;

import java.math.BigDecimal;

public class PrimeFactors implements MathOperator {

    private static final BigDecimal TWO = new BigDecimal(2);
    private static final BigDecimal THREE = new BigDecimal(3);

    @Override
    public void execute(OperandStack values) {
        BigDecimal value = values.pop();
        if (value.compareTo(TWO)== 0) {
            values.setAccumulator(value);
        } else if (value.compareTo(THREE) == 0) {
            values.setAccumulator(value);
        }
    }
}
