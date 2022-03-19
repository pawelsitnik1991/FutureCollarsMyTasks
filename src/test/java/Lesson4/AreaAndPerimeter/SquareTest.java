package Lesson4.AreaAndPerimeter;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void squareGetAreaTest(){
        Square square = new Square(4);
        Assert.assertEquals(16,square.getArea(),0);
    }

    @Test
    public void squareGetPerimeterTest(){
        Square square = new Square(4);
        Assert.assertEquals(16,square.getPerimeter(),0);
    }
}
