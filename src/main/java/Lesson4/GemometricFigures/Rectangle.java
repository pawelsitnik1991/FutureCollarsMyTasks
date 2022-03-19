package Lesson4.GemometricFigures;

public class Rectangle extends GemometricFigures {

    public Rectangle(int a, int b) {
        super(a, b);
    }


    @Override
    public int getArea() {
        if (a == b) {
            return a * a;
        }
        return a * b;
    }

    @Override
    public int getPerimeter() {
        if (a == b) {
            return 4 * a;
        }
        return 2 * a + 2 * b;
    }
}
