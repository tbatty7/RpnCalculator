package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class DivideTest {
    @Test
    public void canDivideTwoNumbers() {
        OperandStack operandStack = new OperandStack();
        operandStack.setAccumulator(new BigDecimal(24));
        operandStack.setAccumulator(new BigDecimal(4));
        Divide divide = new Divide();
        divide.execute(operandStack);
        BigDecimal result = operandStack.getAccumulator();
        assertEquals(new BigDecimal(6), result);
    }
}
