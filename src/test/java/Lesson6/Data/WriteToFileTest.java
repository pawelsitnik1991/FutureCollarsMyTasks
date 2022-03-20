package Lesson6.Data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WriteToFileTest {

    @Test
    public void writeToFilesTest() throws IOException {
        Data data = new Data();
        Assert.assertTrue(data.writeToFile());
    }
}
