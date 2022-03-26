package Lesson6.Data;

import java.io.IOException;

public class WordSearch extends Data {

    public boolean wordSearch(String word) throws IOException {
        return readFromFile().contains(word);
    }
}
