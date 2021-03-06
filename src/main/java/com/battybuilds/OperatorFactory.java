package com.battybuilds;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OperatorFactory {

    Map<String, MathOperator> operators;

    public OperatorFactory(Map<String, MathOperator> operators) {
        this.operators = operators;
        insertOperators();
    }

    public OperatorFactory() {
        this(new ConcurrentHashMap<>());
    }

    private void insertOperators() {
        operators.put("+", new Add());
        operators.put("-", new Subtract());
        operators.put("!", new Factorial());
        operators.put("*", new Multiply());
        operators.put("/", new Divide());
        operators.put("sum", new Sum());
        operators.put("primeFactors", new PrimeFactors());
    }

    public MathOperator findOperatorNamed(String operatorName) {
        MathOperator operator = operators.get(operatorName);
        if (operator == null)
            throw new NoSuchOperator();
        return operator;
    }

    public void addOperatorNamed(String operatorName, MathOperator operator) {
        if (operators.containsKey(operatorName)) {
            throw new OperatorNameAlreadyExists();
        }
        operators.put(operatorName, operator);
    }
}
