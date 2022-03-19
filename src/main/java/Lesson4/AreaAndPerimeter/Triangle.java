package Lesson4.AreaAndPerimeter;

public class Triangle implements AreaAndPerimeter{

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (a*h)/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}
