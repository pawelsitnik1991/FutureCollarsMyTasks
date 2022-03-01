package OOP;

public class Fiat extends Enginee implements Vehicle {
    @Override
    public void stop() {
        System.out.println("I am stop");
    }

    @Override
    public void drive() {
        System.out.println("I have big speed");
    }
}
