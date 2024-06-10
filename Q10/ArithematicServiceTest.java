package com.example.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArithmeticServiceTest {

    private ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    public void testAddPositive() {
        // Positive test case
        int result = arithmeticService.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testAddNegative() {
        // Negative test case
        int result = arithmeticService.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testSubtractPositive() {
        // Positive test case
        int result = arithmeticService.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testSubtractNegative() {
        // Negative test case
        int result = arithmeticService.subtract(-5, -3);
        assertEquals(-2, result);
    }
}
