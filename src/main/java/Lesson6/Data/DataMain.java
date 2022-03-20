package Lesson6.Data;

import java.io.IOException;

public class DataMain {
    public static void main(String[] args) throws IOException {

        Data data = new Data();
        System.out.println(data.createFile());
        System.out.println(data.writeToFile());
    }
}
