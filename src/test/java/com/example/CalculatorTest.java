package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  void testAddTwo() {
    Calculator calculator = new Calculator();
    int expected = 2;
    int actual = calculator.add(1, 1);
    assertEquals(expected, actual);
  }

  @Test
  void testDivideZeroException() {
    Calculator calculator = new Calculator();
    Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
    assertEquals("/ by zero", exception.getMessage());
  }
}
