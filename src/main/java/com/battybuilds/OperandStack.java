package com.battybuilds;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {

    private Stack<BigDecimal> operandStack = new Stack<>();


    public BigDecimal setAccumulator(BigDecimal number) {
        return operandStack.push(number);
    }

    public BigDecimal getAccumulator() {
        if (operandStack.empty()) {
            return BigDecimal.ZERO;
        }
        return operandStack.peek();
    }

    public void drop() {
        if (operandStack.empty()) {
            return;
        }
        operandStack.pop();
    }
}
