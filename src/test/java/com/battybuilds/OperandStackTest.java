package com.battybuilds;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OperandStackTest {

    OperandStack operandStack;

    @Before
    public void setUp() throws Exception {
        operandStack = new OperandStack();
    }

    @Test
    public void getsZeroIfNothingAdded() {
        BigDecimal accumulator = operandStack.getAccumulator();
        assertEquals(BigDecimal.ZERO, accumulator);
    }

    @Test
    public void addsNumbersToStack() {
        operandStack.setAccumulator(BigDecimal.TEN);
        assertEquals(BigDecimal.TEN, operandStack.getAccumulator());
    }

    @Test
    public void dropsNumbersOffStack() {
        operandStack.setAccumulator(BigDecimal.ONE);
        operandStack.drop();
        assertEquals(BigDecimal.ZERO, operandStack.getAccumulator());
    }
}
