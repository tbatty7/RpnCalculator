package com.battybuilds;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OperatorFactory {

    Map<String, MathOperator> operators;

    public OperatorFactory(Map<String, MathOperator> operators) {
        this.operators = operators;
    }
    public OperatorFactory() {
        this(new ConcurrentHashMap<>());
        insertOperators();
    }

    private void insertOperators() {
        operators.put("+", new Add());
        operators.put("-", new Subtract());
        operators.put("!", new Factorial());
        operators.put("*", new Multiply());
        operators.put("/", new Divide());
    }

    public MathOperator findOperatorNamed(String operatorName) {
        MathOperator operator = operators.get(operatorName);
        if (operator == null)
            throw new NoSuchOperator();
        return operator;
    }
}
