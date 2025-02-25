package BridgeLabz_2115000744;

import java.io.*;
import java.util.Base64;

public class EncryptCSV {
    public static void main(String[] args) throws IOException {
        String inputFile = "employees.csv";
        String outputFile = "encrypted_employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String header = br.readLine();
            bw.write(header + "\n");

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                data[3] = Base64.getEncoder().encodeToString(data[3].getBytes());
                bw.write(String.join(",", data) + "\n");
            }
        }
        System.out.println("Data encrypted.");
    }
}
