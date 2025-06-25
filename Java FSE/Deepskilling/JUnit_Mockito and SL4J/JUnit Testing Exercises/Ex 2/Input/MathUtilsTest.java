package com.example.basic_junit_test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils math = new MathUtils();

    @Test
    public void testAdd() {
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, math.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(6, 3));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            math.divide(6, 0);
        });
        assertEquals("Divider cannot be zero", exception.getMessage());
    }
}
