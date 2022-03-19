package Lesson4.AreaAndPerimeter;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void triangleGetArea() {
        Triangle triangle = new Triangle(3, 4, 1, 1);
        Assert.assertEquals(1.5, triangle.getArea(), 0);
    }

    @Test
    public void triangleGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 1);
        Assert.assertEquals(8, triangle.getPerimeter(), 0);
    }
}
