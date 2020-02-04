package com.battybuilds;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

    private Stack<BigDecimal> operandStack = new Stack<>();


    public void setAccumulator(BigDecimal number) {
        operandStack.push(number);
    }

    public BigDecimal getAccumulator() {
        if (operandStack.empty()) {
            return BigDecimal.ZERO;
        }
        return operandStack.peek();
    }

    public void drop() {
        operandStack.pop();
    }
}
