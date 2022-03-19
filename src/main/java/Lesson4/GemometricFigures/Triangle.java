package Lesson4.GemometricFigures;

public class Triangle extends GemometricFigures {
    private int h;

    public Triangle(int a, int b) {
        super(a, b);
    }

    public Triangle(int a, int b, int h) {
        super(a, b);
        this.h = h;
    }

    @Override
    public int getArea() {
        return (a * b) / 2;
    }

    @Override
    public int getPerimeter() {
        return a + b + h;
    }
}
