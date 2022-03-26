package Lesson6.PESEL;

public class IdNumber {

    public String returnIdNumber (String pesel) throws WrongTypeOfDataException, IllegalLengthException {
        if(!(pesel instanceof String)){
            throw new WrongTypeOfDataException("Invalid Date of structure");
        }
        else if (pesel.length()!=11){
            throw new IllegalLengthException("Invalid lenght of pesel");
        }

        return pesel;

    }
}
