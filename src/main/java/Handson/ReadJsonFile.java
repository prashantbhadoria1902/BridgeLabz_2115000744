package Handson;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;

public class ReadJsonFile {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        InputStream inputStream = ReadJsonFile.class.getClassLoader().getResourceAsStream("data.json");
        JsonNode rootNode = objectMapper.readTree(inputStream);

        System.out.println(rootNode.toPrettyString());
    }
}
