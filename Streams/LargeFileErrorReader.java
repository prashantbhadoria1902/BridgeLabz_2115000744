import java.io.*;

public class LargeFileErrorReader {
    public static void main(String[] args) {
        String filePath = "largefile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
