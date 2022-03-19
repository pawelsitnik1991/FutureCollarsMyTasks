package Lesson4.GemometricFigures;

public class Circle extends GemometricFigures{
    private int r;

    public Circle(int a, int b, int r) {
        super(a, b);
        this.r = r;
    }

    @Override
    public int getArea() {
        return (int) (2*Math.PI*r);
    }

    @Override
    public int getPerimeter() {
        return (int) (Math.PI*Math.pow(r,2));
    }
}
