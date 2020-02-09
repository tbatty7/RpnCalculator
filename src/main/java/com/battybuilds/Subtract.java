package com.battybuilds;

import java.math.BigDecimal;

public class Subtract extends BinaryOperator{

    @Override
    protected BigDecimal executeImplementation(BigDecimal secondNumber, BigDecimal firstNumber) {
        return firstNumber.subtract(secondNumber);
    }

}
