package BridgeLabz_2115000744;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws IOException {
        Map<String, String[]> studentData = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students1.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                studentData.put(data[0], data);
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader("students2.csv"))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (studentData.containsKey(data[0])) {
                    studentData.get(data[0])[1] += "," + data[1] + "," + data[2];
                }
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("merged_students.csv"))) {
            bw.write("ID,Name,Age,Marks,Grade\n");
            for (String[] record : studentData.values()) {
                bw.write(String.join(",", record) + "\n");
            }
        }
        System.out.println("Merged CSV created.");
    }
}
