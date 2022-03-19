package Lesson4.GemometricFigures;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void rectangleGetAreaTest() {
        Rectangle rectangle = new Rectangle(3, 2);
        Assert.assertEquals(6, rectangle.getArea());
    }

    @Test
    public void rectangleGetPerimeterTest() {
        Rectangle rectangle = new Rectangle(3, 3);
        Assert.assertEquals(12, rectangle.getPerimeter());
    }
}
