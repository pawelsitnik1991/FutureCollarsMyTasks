package Lesson2.WeryfikacjaWieku;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AgeVeryficationTest {
    private AgeVeryfication ageVeryfication;

    public AgeVeryficationTest() {
        ageVeryfication = new AgeVeryfication();
    }

    @Test
    public void shouldRetrunTrueWhenAgeIsMoreThen18() {
        int age = 19;
        Assertions.assertTrue(ageVeryfication.verficationAge(age));
    }

    @Test
    public void shouldRetrunTrueWhenAgeIsEqualTo18() {
        int age = 18;
        Assertions.assertTrue(ageVeryfication.verficationAge(age));
    }

    @Test
    public void shouldRetrunFalseWhenAgeIsLessThen18() {
        int age = 17;
        Assertions.assertFalse(ageVeryfication.verficationAge(age));
    }

}
