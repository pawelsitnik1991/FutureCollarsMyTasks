package Lesson6.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertedToCapitalLetters {

    private static final String PATH = "/Users/past/Desktop/Projekcik/NowaEra/src/main/java/Lesson6/Data/toUpperCaseWordFromFile.txt";

    Data data = new Data();

    public void returnFileWithConvertedToCapitalLetters() throws IOException {
        String toUpperCaseWordFromFile = data.readFromFile().toUpperCase();
        System.out.println(toUpperCaseWordFromFile);
        File file = new File(PATH);
        file.createNewFile();
        Files.writeString(Paths.get(PATH), toUpperCaseWordFromFile);
    }
}
