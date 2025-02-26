package PracticeProblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ExtractSpecificFields {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(new File("data.json"));
        String name = root.get("name").asText();
        String email = root.get("email").asText();
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

