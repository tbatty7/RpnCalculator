package com.battybuilds;

import java.math.BigDecimal;

public class RpnCalculator {
    private OperandStack operandStack;

    private final OperatorFactory operatorFactory;

    public RpnCalculator() {
        this(new OperatorFactory(), new OperandStack());
    }

    public RpnCalculator(OperatorFactory operatorFactory, OperandStack operandStack) {
        this.operatorFactory = operatorFactory;
        this.operandStack = operandStack;
    }

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
        return operatorFactory.findOperatorNamed(operatorName);
    }
}
