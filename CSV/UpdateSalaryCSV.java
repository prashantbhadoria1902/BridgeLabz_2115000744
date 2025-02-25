package BridgeLabz_2115000744;

import java.io.*;
import java.util.*;

public class UpdateSalaryCSV {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = br.readLine();
            records.add(line.split(",")); // Adding header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[2].equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(data[3]) * 1.1;
                    data[3] = String.format("%.2f", salary);
                }
                records.add(data);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            for (String[] record : records) {
                bw.write(String.join(",", record) + "\n");
            }
            System.out.println("Updated salaries saved to: " + outputFile);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
