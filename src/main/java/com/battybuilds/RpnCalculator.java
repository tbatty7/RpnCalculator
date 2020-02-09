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

    public void execute(String operatorName) {
        MathOperator operator = findOperatorNamed(operatorName);
        operator.execute(operandStack);
    }

    private MathOperator findOperatorNamed(String operatorName) {
        MathOperator operator;
        if ("+".equals(operatorName))
            operator = new Add();
        else if ("-".equals(operatorName))
            operator = new Subtract();
        else if ("!".equals(operatorName))
            operator = new Factorial();
        else if ("*".equals(operatorName))
            operator = new Multiply();
        else if ("/".equals(operatorName))
            operator = new Divide();
        else
            throw new NoSuchOperator();
        return operator;
    }
}
