package com.battybuilds;

import java.math.BigDecimal;

public class Multiply extends BinaryOperator {

    @Override
    protected BigDecimal executeImplementation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.multiply(secondNumber);
    }
}
