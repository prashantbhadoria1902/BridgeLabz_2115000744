package PracticeProblem;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonObjects {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode json1 = objectMapper.readTree("{\"name\": \"Alice\", \"age\": 30}");
        JsonNode json2 = objectMapper.readTree("{\"email\": \"alice@example.com\", \"city\": \"New York\"}");

        ObjectNode mergedJson = objectMapper.createObjectNode();
        mergedJson.setAll((ObjectNode) json1);
        mergedJson.setAll((ObjectNode) json2);

        System.out.println(objectMapper.writeValueAsString(mergedJson));
    }
}
