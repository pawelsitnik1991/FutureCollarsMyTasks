package Lesson2.WeryfikacjaWieku;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AgeVeryficationTest {
    private AgeVeryfication ageVeryfication;

    public AgeVeryficationTest(){
        ageVeryfication = new AgeVeryfication();
    }

    @Test
    public void checkOutYouAreHaveMoreOrEqual18(){
        int moreThen18age = 19;
        int equal18age = 18;
        int lessThen18age = 17;

        Assertions.assertTrue(ageVeryfication.verficationAge(moreThen18age));
        Assertions.assertTrue(ageVeryfication.verficationAge(equal18age));
        Assertions.assertFalse(ageVeryfication.verficationAge(lessThen18age));



    }

}
