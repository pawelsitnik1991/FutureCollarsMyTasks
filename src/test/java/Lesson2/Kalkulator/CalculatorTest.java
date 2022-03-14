package Lesson2.Kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    CalculatorTest() {
        calculator = new Calculator();
    }

    @Test
    void addTest() {
        int a = 10, b = 5;
        int add = calculator.add(a, b);
        Assertions.assertEquals(15, add);
    }

    @Test
    void substractTest() {
        int a = 10, b = 5;
        int substract = calculator.substract(a, b);
        Assertions.assertEquals(5, substract);
    }

    @Test
    void divisionTest() {
        int a = 10, b = 5;
        int division = calculator.division(a, b);
        Assertions.assertEquals(2, division);
    }
    @Test
    void multiplyTest() {
        int a = 10, b = 5;
        int multiply = calculator.multiply(a, b);
        Assertions.assertEquals(50, multiply);
    }
}
