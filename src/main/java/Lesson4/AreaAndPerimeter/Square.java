package Lesson4.AreaAndPerimeter;

public class Square implements AreaAndPerimeter {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
