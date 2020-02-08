package com.battybuilds;

import java.math.BigDecimal;

public class Factorial implements MathOperator {


    public void execute(OperandStack operandStack) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal operand = operandStack.getAccumulator();
        while (operand.compareTo(BigDecimal.ONE) > 0) {
            System.out.println(operand.compareTo(result));
            result = result.multiply(operand);
            operand = operand.subtract(BigDecimal.ONE);
        }
        operandStack.setAccumulator(result);
    }
}
