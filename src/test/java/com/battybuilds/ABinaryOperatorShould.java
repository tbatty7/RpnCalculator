package com.battybuilds;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;

public class ABinaryOperatorShould {

    private  BinaryOperator mockOperator;

    private  OperandStack mockOperandStack;

    @Before
    public void setUp() {
        mockOperator = Mockito.mock(BinaryOperator.class);
        mockOperandStack = Mockito.mock(OperandStack.class);
    }

    @Test
    public void acquireTwoParametersFromStack() {
        mockOperator.execute(mockOperandStack);
        verify(mockOperandStack, times(2)).getAccumulator();
        verify(mockOperandStack, times(2)).drop();
    }

    @Test
    public void executeExtensionPoint() {
        BigDecimal firstNumber = new BigDecimal(4);
        BigDecimal secondNumber = new BigDecimal(5);
        when(mockOperandStack.getAccumulator()).thenReturn(firstNumber).thenReturn(secondNumber);
        mockOperator.execute(mockOperandStack);
        verify(mockOperator).executeImplementation(firstNumber, secondNumber);
    }

    @Test
    public void storeResultsOnStack() {
        when(mockOperator.executeImplementation(any(BigDecimal.class), any(BigDecimal.class))).thenReturn(BigDecimal.TEN);
        mockOperator.execute(mockOperandStack);
        verify(mockOperandStack).setAccumulator(BigDecimal.TEN);
    }
}