package com.battybuilds;

import java.math.BigDecimal;

public class PrimeFactors implements MathOperator {

    @Override
    public void execute(OperandStack values) {
        BigDecimal value = values.drop();
        if (value.compareTo(new BigDecimal(2))== 0) {
            values.setAccumulator(new BigDecimal(2));
        }
    }
}
