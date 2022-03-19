package Lesson5.Text;

import org.junit.Assert;
import org.junit.Test;

public class TextTest {

    @Test
    public void isEmptyString() {
        Text text = new Text("");
        Assert.assertTrue(text.isCharactersInTheText());
    }

    @Test
    public void isNotEmptyString() {
        Text text = new Text("kajak");
        Assert.assertFalse(text.isCharactersInTheText());
    }

    @Test
    public void isPalindrome() {
        Text text = new Text("kajak");
        Assert.assertTrue(text.isPalindrome());
    }

    @Test
    public void isNotPalindrome() {
        Text text = new Text("karczma");
        Assert.assertFalse(text.isPalindrome());
    }

    @Test
    public void textIsFiveCharsLenght() {
        Text text = new Text("kajak");
        Assert.assertEquals(5, text.textLenght());
    }
}
