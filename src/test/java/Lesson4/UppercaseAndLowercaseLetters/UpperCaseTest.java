package Lesson4.UppercaseAndLowercaseLetters;

import org.junit.Assert;
import org.junit.Test;

public class UpperCaseTest {

    @Test
    public void upperCaseTest(){
        UpperCase upperCase = new UpperCase();
        Assert.assertEquals("KROWA",upperCase.formatText("Krowa"));
    }
}
