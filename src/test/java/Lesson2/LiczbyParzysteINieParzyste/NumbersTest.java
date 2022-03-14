package Lesson2.LiczbyParzysteINieParzyste;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NumbersTest {
    private Numbers numbers;

    public NumbersTest() {
        numbers = new Numbers();
    }

    @Test
    public void shouldReturnTrueIfIsEvenNumber() {
        int number = 10;
        Assertions.assertTrue(numbers.isEven(number));
    }

    @Test
    public void shouldReturnFalseIfIsNotEvenNumber() {
        int number = 7;
        Assertions.assertFalse(numbers.isEven(number));
    }

}
