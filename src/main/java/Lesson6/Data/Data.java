package Lesson6.Data;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private String path = "/Users/past/Desktop/Projekcik/NowaEra/src/main/java/Lesson6/Data/data.txt";
    private String text = "Kurs\n" + "Java\n" + "Lekcja 6\n" + "Pliki\n" + "Wyjątki\n" + "Pliki\n" + "Koniec pliku";

    public boolean createFile() throws IOException {
        File file = new File(path);
        file.createNewFile();
        return file.exists();
    }

    public boolean writeToFile() throws IOException {
        Files.writeString(Paths.get(path), text);
        return Files.isWritable(Paths.get(path));
    }

    public String readFromFile() throws IOException {
        return Files.readString(Paths.get(path));
    }

    public List readSecondsLineFromFile() throws IOException {
        List listOfReadSecondLine = new ArrayList<>();
        List <String> readAllLines=Files.readAllLines(Paths.get(path));
        for (int i = 0; i < readAllLines.size(); i++) {
            if (i%2==1) {
                listOfReadSecondLine.add(readAllLines.get(i));
            }
        }
        return listOfReadSecondLine;
    }

    public String getText() {
        return text;
    }

    public String getPath() {
        return path;
    }

    private int readHowManyLineInFiles() throws IOException {
        return Files.readAllLines(Paths.get(path)).size();
    }
}
