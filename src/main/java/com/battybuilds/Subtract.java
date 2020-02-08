package com.battybuilds;

public class Subtract extends BinaryOperator{

    public void execute(OperandStack operandStack) {
        getNumbers(operandStack);
        operandStack.setAccumulator(firstNumber.subtract(secondNumber));
    }

}
