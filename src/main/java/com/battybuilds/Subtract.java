package com.battybuilds;

import java.math.BigDecimal;

public class Subtract implements MathOperator {
    public void execute(OperandStack operandStack) {
        BigDecimal secondNumber = operandStack.getAccumulator();
        operandStack.drop();
        BigDecimal firstNumber = operandStack.getAccumulator();
        operandStack.drop();
        operandStack.setAccumulator(firstNumber.subtract(secondNumber));
    }
}
