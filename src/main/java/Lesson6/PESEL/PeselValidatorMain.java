package Lesson6.PESEL;

public class PeselValidatorMain {
    public static void main(String[] args) {

        PeselValidator peselValidator = new PeselValidator();
        System.out.println(peselValidator.isPeselValid("33328313451"));
    }
}
