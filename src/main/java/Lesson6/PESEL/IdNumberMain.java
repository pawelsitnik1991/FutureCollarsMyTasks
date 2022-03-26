package Lesson6.PESEL;

public class IdNumberMain {
    public static void main(String[] args) throws WrongTypeOfDataException, IllegalLengthException {

        IdNumber idNumber = new IdNumber();
        System.out.println(idNumber.returnIdNumber("32183123451"));
    }
}
