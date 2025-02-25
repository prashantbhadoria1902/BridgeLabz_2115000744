package BridgeLabz_2115000744;

import java.io.*;
import org.json.*;

public class JSONToCSV {
    public static void main(String[] args) throws Exception {
        String jsonFile = "students.json";
        String csvFile = "students.csv";

        JSONArray jsonArray = new JSONArray(new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(jsonFile))));
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("ID,Name,Age\n");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                bw.write(obj.getString("id") + "," + obj.getString("name") + "," + obj.getInt("age") + "\n");
            }
        }
        System.out.println("Converted JSON to CSV.");
    }
}
