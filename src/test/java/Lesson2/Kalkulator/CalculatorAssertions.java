package Lesson2.Kalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorAssertions {

    private Calculator calculator;
    int a = 10;
    int b = 10;

    CalculatorAssertions(){
        calculator = new Calculator();
    }
    @Test
    void shouldAssertTwoNumber(){
        int add = calculator.add(a,b);
        int multiply =calculator.multiply(a,b);
        int substract = calculator.substract(a,b);
        int division = calculator.division(a,b);

        Assertions.assertEquals(1,division);
        Assertions.assertEquals(0,substract);
        Assertions.assertEquals(100,multiply);
        Assertions.assertEquals(20,add);

        Assertions.assertNotEquals(18,add);
    }
}
