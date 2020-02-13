package com.battybuilds;

public class Sum implements MathOperator{
    @Override
    public void execute(OperandStack operandStack) {
        while (operandStack.size() > 1) {
            new Add().execute(operandStack);
        }
    }
}
