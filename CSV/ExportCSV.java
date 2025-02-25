package BridgeLabz_2115000744;

import java.io.*;
import java.sql.*;

public class ExportCSV {
    public static void main(String[] args) {
        String csvFile = "employees_report.csv";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "password");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
             BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {

            bw.write("Employee ID,Name,Department,Salary\n");
            while (rs.next()) {
                bw.write(rs.getInt("id") + "," + rs.getString("name") + "," + rs.getString("department") + "," + rs.getDouble("salary") + "\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("CSV report generated.");
    }
}
