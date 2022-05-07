package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAddTwo(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.add(1, 1);
        assertEquals(expected, actual);
    }
}
