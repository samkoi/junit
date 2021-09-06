package com.junittests.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class to test calculator")
public class CalculatorTest {
    @Test
    @DisplayName("Test method to test add function")
    public void testAdd() {
        Calculator calc = new Calculator();
        double result = calc.add(40, 40);
        assertEquals(80, result, 0);
    }
}
