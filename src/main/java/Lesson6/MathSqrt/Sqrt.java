package Lesson6.MathSqrt;

public class Sqrt {

    private double number;

    public Sqrt(double number) {
        this.number = number;
    }


    public double sqrtMath() throws IllegalArgumentException {
        return Math.sqrt(number);
    }
}
