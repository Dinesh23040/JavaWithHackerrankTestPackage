package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteNIO {

    public static void main(String[] args) {
    	String path=System.getProperty("user.dir");
        Path inputFilePath = Paths.get(path+"//src//files//ReadFile.txt");
        Path outputFilePath = Paths.get(path+"//src//files//WriteFile.txt");
        
        try (BufferedReader br = Files.newBufferedReader(inputFilePath);
             BufferedWriter bw = Files.newBufferedWriter(outputFilePath)) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line).append("\n");
                bw.write(line);
                bw.newLine(); // write a new line separator
                line = br.readLine();
            }

            System.out.println("Text in StringBuilder:\n" + sb.toString());

            System.out.println("Successfully completed writing text to the file: " + outputFilePath.toAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
