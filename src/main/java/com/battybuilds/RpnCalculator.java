package com.battybuilds;

import java.math.BigDecimal;
import java.util.Stack;

public class RpnCalculator {
    private Stack<BigDecimal> accumulatorStack = new Stack<>();

    public BigDecimal getAccumulator() {
        if (accumulatorStack.empty()) {
            return BigDecimal.ZERO;
        }
        return accumulatorStack.peek();
    }

    public BigDecimal setAccumulator(BigDecimal number) {
        return accumulatorStack.push(number);
    }

    public void drop() {
        accumulatorStack.pop();
    }
}
