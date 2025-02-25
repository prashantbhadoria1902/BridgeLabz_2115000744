package BridgeLabz_2115000744;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) {
        String inputFile = "students.csv";
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        Pattern phonePattern = Pattern.compile("^\\d{10}$");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line = br.readLine();
            System.out.println(line); // Print header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                boolean validEmail = emailPattern.matcher(data[2]).matches();
                boolean validPhone = phonePattern.matcher(data[3]).matches();

                if (!validEmail || !validPhone) {
                    System.out.println("Invalid row: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

