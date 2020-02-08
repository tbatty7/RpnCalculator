package com.battybuilds;

import java.math.BigDecimal;

public class Add {
    public void execute(OperandStack operandStack) {
        BigDecimal secondNumber = operandStack.getAccumulator();
        operandStack.drop();
        BigDecimal firstNumber = operandStack.getAccumulator();
        operandStack.drop();
        operandStack.setAccumulator(firstNumber.add(secondNumber));
    }
}
