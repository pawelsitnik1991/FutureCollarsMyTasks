package Lesson6.Data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WordSearchTest {

    @Test
    public void isWordSearchInFileTest() throws IOException {
        WordSearch wordSearchClass = new WordSearch();
        Assert.assertTrue(wordSearchClass.wordSearch("Java"));
    }
}
