package com.battybuilds;

import java.math.BigDecimal;

public class RpnCalculator {
    private OperandStack operandStack = new OperandStack();

    public BigDecimal getAccumulator() {
        return operandStack.getAccumulator();
    }

    public BigDecimal setAccumulator(BigDecimal number) {
        return operandStack.setAccumulator(number);
    }

    public void drop() {
        operandStack.drop();
    }
}
