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

    public BigDecimal pop() {
        if (operandStack.empty()) {
            return null;
        }
        return operandStack.pop();
    }

    public int size() {
        return operandStack.size();
    }
}
