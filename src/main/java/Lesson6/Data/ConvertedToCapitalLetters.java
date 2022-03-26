package Lesson6.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertedToCapitalLetters extends Data {
    private String path = "/Users/past/Desktop/Projekcik/NowaEra/src/main/java/Lesson6/Data/toUpperCaseWordFromFile.txt";

    public void returnFileWithConvertedToCapitalLetters() throws IOException {
        StringBuilder stringBuilder = new StringBuilder(readFromFile());
        String toUpperCaseWordFromFile = stringBuilder.toString().toUpperCase();
        System.out.println(toUpperCaseWordFromFile);
        File file = new File(path);
        file.createNewFile();
        Files.writeString(Paths.get(path), toUpperCaseWordFromFile);
    }
}
