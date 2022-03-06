package Lesson2.LiczbyParzysteINieParzyste;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class EvenAndOddNumbersTest {
    private EvenAndOddNumbers evenAndOddNumbers;

    public EvenAndOddNumbersTest(){
        evenAndOddNumbers = new EvenAndOddNumbers();
    }

    @Test
    public void checkOutItIsEvenOrOddNumbers(){
        int evenNumber = 10;
        int oddNumber = 7;

        Assertions.assertTrue(evenAndOddNumbers.getEvenAndOddNumbers(evenNumber));
        Assertions.assertFalse(evenAndOddNumbers.getEvenAndOddNumbers(oddNumber));
    }

}
