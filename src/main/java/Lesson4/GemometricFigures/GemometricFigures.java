package Lesson4.GemometricFigures;

public abstract class GemometricFigures {
    int a;
    int b;

    public GemometricFigures(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int getArea();
    public abstract int getPerimeter();
}
