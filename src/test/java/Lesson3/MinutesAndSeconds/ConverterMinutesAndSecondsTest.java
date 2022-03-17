package Lesson3.MinutesAndSeconds;

import org.junit.Assert;
import org.junit.Test;

public class ConverterMinutesAndSecondsTest {

    @Test
    public void converterTwoMinutesToSecondsTest(){
        Assert.assertEquals(120,ConverterMinutesAndSeconds.converterMinutesToSeconds(2));
    }

    @Test
    public void convertZeroMinutesToSecondsTest(){
        Assert.assertEquals(0,ConverterMinutesAndSeconds.converterMinutesToSeconds(0));
    }
}
