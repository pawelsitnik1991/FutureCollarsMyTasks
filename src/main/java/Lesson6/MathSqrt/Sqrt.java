package Lesson6.MathSqrt;

public class Sqrt {

    private double number;

    public Sqrt(double number) {
        this.number = number;
    }

    public double sqrtMath()  {
        if(number<0) {
            throw new IllegalArgumentException("You entered a negative number");
        }
        return Math.sqrt(number);
    }
}
