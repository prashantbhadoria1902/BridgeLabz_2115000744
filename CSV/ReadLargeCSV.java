package BridgeLabz_2115000744;

import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) {
        String inputFile = "large_students.csv";
        int batchSize = 100, count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                count++;
                if (count % batchSize == 0) {
                    System.out.println("Processed " + count + " records");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Total records processed: " + count);
    }
}
