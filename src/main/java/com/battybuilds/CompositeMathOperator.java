package com.battybuilds;

import java.util.LinkedList;
import java.util.List;

public class CompositeMathOperator implements MathOperator {

    List<MathOperator> operators = new LinkedList<>();

    @Override
    public void execute(OperandStack operandStack) {
        for (MathOperator current : operators) {
            current.execute(operandStack);
        }
    }

    public void append(MathOperator operator) {
        operators.add(operator);
    }
}
