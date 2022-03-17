package Lesson3.RectangularTriangle;

import org.junit.Assert;
import org.junit.Test;

public class RectangularTriangleTest {

    @Test
    public void isRectangularTriangleTest() {
        Assert.assertTrue(RectangularTriangle.rectangularTriangle(4, 3, 5));
    }

    @Test
    public void isNotRectangularTriangleTest() {
        Assert.assertFalse(RectangularTriangle.rectangularTriangle(2, 3, 5));
    }
}
