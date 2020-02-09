package com.battybuilds;

import java.math.BigDecimal;

public class Subtract extends BinaryOperator{

    @Override
    protected BigDecimal executeImplementation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.subtract(secondNumber);
    }
}
