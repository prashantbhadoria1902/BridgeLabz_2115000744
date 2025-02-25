package BridgeLabz_2115000744;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void main(String[] args) {
        String filePath = "employees.csv";
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.append("ID,Name,Department,Salary\n");
            writer.append("201,John Doe,Engineering,75000\n");
            writer.append("202,Jane Smith,Marketing,68000\n");
            writer.append("203,Michael Brown,HR,62000\n");
            writer.append("204,Emily Davis,Finance,71000\n");
            writer.append("205,David Wilson,IT,78000\n");
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
