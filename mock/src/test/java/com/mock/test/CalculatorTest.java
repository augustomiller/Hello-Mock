package com.mock.test;

import com.mock.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int sum = calculator.sum("3+3+3");
        assertEquals(9, sum);
    }

    @Test
    public void testSumWithMock(){

        Calculator calculator = mock(Calculator.class);

        when(calculator.sum("1+1")).thenReturn(10);

        int result = calculator.sum("1+1");
        assertEquals(10, result);
    }
}
