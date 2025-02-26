package Handson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseToJson {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);

        String query = "SELECT name, age, email FROM users";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        List<Map<String, Object>> records = new ArrayList<>();
        while (resultSet.next()) {
            Map<String, Object> row = new HashMap<>();
            row.put("name", resultSet.getString("name"));
            row.put("age", resultSet.getInt("age"));
            row.put("email", resultSet.getString("email"));
            records.add(row);
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonReport = objectMapper.writeValueAsString(records);
        System.out.println(jsonReport);

        conn.close();
    }
}
