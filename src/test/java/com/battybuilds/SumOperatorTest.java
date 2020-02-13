package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SumOperatorTest {
    @Test
    public void canSumUpThreeNumbers() {
        OperandStack operandStack = new OperandStack();
        operandStack.setAccumulator(new BigDecimal(4));
        operandStack.setAccumulator(new BigDecimal(6));
        operandStack.setAccumulator(new BigDecimal(5));
        new Sum().execute(operandStack);
        BigDecimal result = operandStack.getAccumulator();
        assertEquals(new BigDecimal(15), result);
    }
}
