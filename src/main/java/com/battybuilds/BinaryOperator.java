package com.battybuilds;

import java.math.BigDecimal;

public abstract class BinaryOperator implements MathOperator {

    protected BigDecimal secondNumber;
    protected BigDecimal firstNumber;

    protected void getNumbers(OperandStack operandStack) {
        secondNumber = operandStack.getAccumulator();
        operandStack.drop();
        firstNumber = operandStack.getAccumulator();
        operandStack.drop();
    }
}
