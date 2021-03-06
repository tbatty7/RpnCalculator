package com.battybuilds;

import java.math.BigDecimal;

public class Add extends BinaryOperator {

    @Override
    protected BigDecimal executeImplementation(BigDecimal firstNumber, BigDecimal secondNumber) {
        return firstNumber.add(secondNumber);
    }
}
