package Lesson6.Data;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class NumberOfCharactersInTheText extends Data {

    public int readTheNumberOfCharactersInTheText() throws IOException {
        Reader file = new FileReader(getPath());
        char[] chars = new char[readFromFile().length()];
        return file.read(chars);
    }
}
