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

    public void add() {
        BigDecimal secondNumber = getAccumulator();
        drop();
        BigDecimal firstNumber = getAccumulator();
        drop();
        setAccumulator(firstNumber.add(secondNumber));
    }

    public void subtract() {
        BigDecimal secondNumber = getAccumulator();
        drop();
        BigDecimal firstNumber = getAccumulator();
        drop();
        setAccumulator(firstNumber.subtract(secondNumber));
    }

    public void factorial() {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal operand = getAccumulator();
        while (operand.compareTo(BigDecimal.ONE) > 0) {
            System.out.println(operand.compareTo(result));
            result = result.multiply(operand);
            operand = operand.subtract(BigDecimal.ONE);
        }
        setAccumulator(result);
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
