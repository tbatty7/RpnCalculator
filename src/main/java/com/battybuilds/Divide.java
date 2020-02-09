package com.battybuilds;

import java.math.BigDecimal;

public class Divide extends BinaryOperator {
    @Override
    protected BigDecimal executeImplementation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.divide(secondNumber);
    }
}
