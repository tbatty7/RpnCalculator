package com.battybuilds;

import java.math.BigDecimal;

public abstract class BinaryOperator implements MathOperator {

    public final void execute(OperandStack operandStack) {
        BigDecimal secondNumber = operandStack.getAccumulator();
        operandStack.drop();
        BigDecimal firstNumber = operandStack.getAccumulator();
        operandStack.drop();
        BigDecimal result = executeImplementation(secondNumber, firstNumber);
        operandStack.setAccumulator(result);
    }

    abstract protected BigDecimal executeImplementation(BigDecimal secondNumber, BigDecimal firstNumber);
}
