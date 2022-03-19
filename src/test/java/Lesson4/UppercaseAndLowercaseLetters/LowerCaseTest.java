package Lesson4.UppercaseAndLowercaseLetters;

import org.junit.Assert;
import org.junit.Test;

public class LowerCaseTest {

    @Test
    public void lowerCaseTest(){
        LowerCase lowerCase = new LowerCase();
        Assert.assertEquals("krowa",lowerCase.formatText("KrowA"));
    }
}
