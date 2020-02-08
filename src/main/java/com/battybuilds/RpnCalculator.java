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

    private void add() {
        new Add().execute(operandStack);
    }

    private void subtract() {
        new Subtract().execute(operandStack);
    }

    private void factorial() {
        new Factorial().execute(operandStack);
    }

    public void execute(String operator) {
        if ("+".equals(operator))
            add();
        else if ("-".equals(operator))
            subtract();
        else if ("!".equals(operator))
            factorial();
        else
            throw new NoSuchOperator();
    }
}
