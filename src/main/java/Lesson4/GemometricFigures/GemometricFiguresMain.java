package Lesson4.GemometricFigures;

public class GemometricFiguresMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Square square = new Square(4,4);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Circle circle = new Circle(2,3,4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(3,2,4);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}