package com.battybuilds;

public class Add extends BinaryOperator {
    public void execute(OperandStack operandStack) {
        getNumbers(operandStack);
        operandStack.setAccumulator(firstNumber.add(secondNumber));
    }
}
