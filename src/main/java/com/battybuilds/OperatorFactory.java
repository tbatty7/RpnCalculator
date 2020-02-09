package com.battybuilds;

public class OperatorFactory {
    public MathOperator findOperatorNamed(String operatorName) {
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
