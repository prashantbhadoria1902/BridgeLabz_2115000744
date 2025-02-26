package PracticeProblem;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilterJsonRecords {
    public static void main(String[] args) throws Exception {
        String jsonArray = "[{\"name\": \"Alice\", \"age\": 25}, {\"name\": \"Bob\", \"age\": 30}]";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(jsonArray);

        List<JsonNode> filteredList = new ArrayList<>();
        for (JsonNode node : root) {
            if (node.get("age").asInt() > 25) {
                filteredList.add(node);
            }
        }

        System.out.println(objectMapper.writeValueAsString(filteredList));
    }
}

