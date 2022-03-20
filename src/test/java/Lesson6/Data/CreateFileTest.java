package Lesson6.Data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class CreateFileTest {

    @Test
    public void createFileTest() throws IOException {
        Data data = new Data();
        Assert.assertTrue(data.createFile());
    }
}
