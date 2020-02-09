package com.battybuilds;

import java.math.BigDecimal;

public class Multiply extends BinaryOperator {

    @Override
    protected BigDecimal executeImplementation(BigDecimal secondNumber, BigDecimal firstNumber) {
        return firstNumber.multiply(secondNumber);
    }
}
