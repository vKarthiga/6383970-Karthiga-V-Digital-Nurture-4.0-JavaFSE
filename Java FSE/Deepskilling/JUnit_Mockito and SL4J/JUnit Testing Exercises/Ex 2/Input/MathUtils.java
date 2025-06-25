package com.example.basic_junit_test;

public class MathUtils {
	public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divider cannot be zero");
        return a / b;
    }
}
