package Lesson4.GemometricFigures;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void triangleGetAreaTest() {
        Triangle triangle = new Triangle(3, 2);
        Assert.assertEquals(3, triangle.getArea());
    }

    @Test
    public void triangleGetPerimeterTest() {
        Triangle triangle = new Triangle(3, 2, 6);
        Assert.assertEquals(3, triangle.getArea());
    }
}
