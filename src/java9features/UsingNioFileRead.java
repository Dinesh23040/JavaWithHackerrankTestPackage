package java9features;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class UsingNioFileRead {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\gurramku\\Desktop\\ICICI_Call.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            String content = String.join("\n", lines);
            System.out.println("Text read from the file: \n" + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
