package com.battybuilds;

import java.math.BigDecimal;

public class PrimeFactors implements MathOperator {

    private static final BigDecimal TWO = new BigDecimal(2);

    @Override
    public void execute(OperandStack values) {
        BigDecimal value = values.pop();
        BigDecimal divisor = TWO;
        while (value.compareTo(divisor) >= 0) {
            while (value.remainder(divisor).equals(BigDecimal.ZERO)) {
                values.setAccumulator(divisor);
                value = value.divide(divisor);
            }
            divisor = divisor.add(BigDecimal.ONE);
        }
    }
}
