package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd()
    {
        assertEquals( 30, calculator.add(15,15) );
    }
}
