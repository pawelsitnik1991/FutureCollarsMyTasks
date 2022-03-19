package Lesson4.GemometricFigures;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void squareGetAreaTest() {
        Rectangle square = new Rectangle(3, 2);
        Assert.assertEquals(6, square.getArea());
    }

    @Test
    public void squareeGetPerimeterTest() {
        Square square = new Square(3, 3);
        Assert.assertEquals(12, square.getPerimeter());
    }
}
