package BridgeLabz_2115000744;

import java.io.*;

public class CountCSVRows {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        int rowCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                rowCount++;
            }
            System.out.println("Total records (excluding header): " + rowCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
