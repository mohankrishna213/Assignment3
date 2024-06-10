package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ArithmeticServiceTest {

    @InjectMocks
    private ArithmeticService arithmeticService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddPositive() {
        // Positive test case
        int result = arithmeticService.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testAddNegative() {
        // Negative test case
        int result = arithmeticService.add(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    void testSubtractPositive() {
        // Positive test case
        int result = arithmeticService.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testSubtractNegative() {
        // Negative test case
        int result = arithmeticService.subtract(-5, -3);
        assertEquals(-2, result);
    }
}
