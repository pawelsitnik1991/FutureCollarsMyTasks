package Lesson6.Data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ReadFromFileTest {

    @Test
    public void readFromFileTest() throws IOException {
        Data data = new Data();
        Assert.assertEquals(data.getText(),data.readFromFile());
    }
}
