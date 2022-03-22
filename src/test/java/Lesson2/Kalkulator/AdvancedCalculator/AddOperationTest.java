package Lesson2.Kalkulator.AdvancedCalculator;

import org.junit.Assert;
import org.junit.Test;

public class AddOperationTest {

    @Test
    public void addOperationTest() {
        AddOperation addOperation = new AddOperation();
        Assert.assertEquals(4, addOperation.advancedCalculator(2, 2), 0);
    }
}
