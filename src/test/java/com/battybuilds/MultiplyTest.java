package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    @Test
    public void canMultiplyTwoNumbers() {
        OperandStack operandStack = new OperandStack();
        operandStack.setAccumulator(new BigDecimal(6));
        operandStack.setAccumulator(new BigDecimal(4));
        Multiply multiply = new Multiply();
        multiply.execute(operandStack);
        BigDecimal result = operandStack.getAccumulator();
        assertEquals(new BigDecimal(24), result);
    }
}
