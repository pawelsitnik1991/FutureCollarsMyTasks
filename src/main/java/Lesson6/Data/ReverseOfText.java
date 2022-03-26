package Lesson6.Data;

import java.io.IOException;

public class ReverseOfText extends Data{

    public void reverseOfText() throws IOException {
        StringBuilder stringBuilder = new StringBuilder(readFromFile());
        System.out.println(stringBuilder.reverse());
    }
}
