import java.io.*;

public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; 
        File file = new File(filePath);

        long fileSize = file.length();

        try {
            System.out.println("File Size: " + fileSize + " bytes");

            // FileReader
            long startTime = System.nanoTime();
            FileReader fr = new FileReader(file);
            char[] buffer = new char[1024];
            while (fr.read(buffer) != -1) {
            }
            fr.close();
            long endTime = System.nanoTime();
            System.out.println("FileReader Time: " + (endTime - startTime) / 1000000 + "ms");

            //Input Stream Reader
            startTime = System.nanoTime();
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
            while (isr.read(buffer) != -1) {
            }
            isr.close();
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1000000 + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
