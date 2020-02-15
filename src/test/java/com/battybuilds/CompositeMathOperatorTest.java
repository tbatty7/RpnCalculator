package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CompositeMathOperatorTest {
    @Test
    public void itCanAddAndMultiply() {
        OperandStack stack = new OperandStack();
        stack.setAccumulator(new BigDecimal(5));
        stack.setAccumulator(new BigDecimal(7));
        stack.setAccumulator(new BigDecimal(3));
        CompositeMathOperator compositeMathOperator = new CompositeMathOperator();
        compositeMathOperator.append(new Add());
        compositeMathOperator.append(new Multiply());

        compositeMathOperator.execute(stack);

        assertEquals(new BigDecimal(50), stack.getAccumulator());
    }
}
