package com.example.calculator_app;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup done");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleanup done");
    }

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(5, result, "Addition should return 5");
    }

    @Test
    public void testSubtraction() {
        int a = 5;
        int b = 2;
        int result = calculator.subtract(a, b);
        assertEquals(3, result, "Subtraction should return 3");
    }
}
