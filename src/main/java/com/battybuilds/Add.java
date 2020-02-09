package com.battybuilds;

import java.math.BigDecimal;

public class Add extends BinaryOperator {

    @Override
    protected BigDecimal executeImplementation(BigDecimal secondNumber, BigDecimal firstNumber) {
        return firstNumber.add(secondNumber);
    }
}
