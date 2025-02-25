package BridgeLabz_2115000744;

import java.io.*;
import java.util.*;

public class SortSalaryCSV {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = br.readLine();
            records.add(line.split(",")); // Adding header

            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        records.remove(0); // Remove header before sorting
        records.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

        System.out.println("Top 5 highest-paid employees:");
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            System.out.printf("ID: %s, Name: %s, Department: %s, Salary: %s%n",
                    records.get(i)[0], records.get(i)[1], records.get(i)[2], records.get(i)[3]);
        }
    }
}
