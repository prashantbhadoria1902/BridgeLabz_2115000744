package Handson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class FilterJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("src/main/resources/users.json"));

        for (JsonNode user : rootNode) {
            if (user.get("age").asInt() > 25) {
                System.out.println(user.toPrettyString());
            }
        }
    }
}
