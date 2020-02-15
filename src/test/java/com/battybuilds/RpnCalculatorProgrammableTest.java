package com.battybuilds;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class RpnCalculatorProgrammableTest {
    @Test
    public void canAddThenMultiply() {
        RpnCalculator calculator = new RpnCalculator();
        calculator.startProgram();
        calculator.addToProgram("+");
        calculator.addToProgram("*");
        calculator.saveProgramAs("AddThenMultiply");

        calculator.setAccumulator(new BigDecimal(5));
        calculator.setAccumulator(new BigDecimal(7));
        calculator.setAccumulator(new BigDecimal(3));
        calculator.execute("AddThenMultiply");

        assertEquals(new BigDecimal(50), calculator.getAccumulator());
    }
}
