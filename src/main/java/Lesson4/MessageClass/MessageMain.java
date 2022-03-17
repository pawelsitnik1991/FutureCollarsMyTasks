package Lesson4.MessageClass;

public class MessageMain {
    public static void main(String[] args) {
        ConsoleMessage consoleMessage = new ConsoleMessage();
        System.out.println(consoleMessage.getMessage());

        WindowMessage windowMessage = new WindowMessage();
        System.out.println(windowMessage.getMessage());

    }
}
