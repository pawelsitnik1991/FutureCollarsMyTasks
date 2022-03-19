package Lesson4.GemometricFigures;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void circleGetAreaTest() {
        Circle circle = new Circle(2,4,2);
        Assert.assertEquals(12,circle.getArea());
    }
    @Test
    public void circleGetPerimeterTest(){
        Circle circle = new Circle(1,3,4);
        Assert.assertEquals(50,circle.getPerimeter());
    }
}
