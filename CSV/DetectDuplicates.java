package BridgeLabz_2115000744;

import java.io.*;
import java.util.*;

public class DetectDuplicates {
    public static void main(String[] args) {
        String inputFile = "students.csv";
        Set<String> uniqueIds = new HashSet<>();
        List<String> duplicates = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String id = line.split(",")[0];
                if (!uniqueIds.add(id)) {
                    duplicates.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Duplicate Records:");
        duplicates.forEach(System.out::println);
    }
}
