package Handson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;

import java.io.File;
import java.util.Set;

public class ValidateJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonData = objectMapper.readTree(new File("src/main/resources/user.json"));
        JsonSchemaFactory factory = JsonSchemaFactory.getInstance();
        JsonSchema schema = factory.getSchema(new File("src/main/resources/schema.json"));

        Set<ValidationMessage> errors = schema.validate(jsonData);
        if (errors.isEmpty()) {
            System.out.println("JSON is valid!");
        } else {
            errors.forEach(System.out::println);
        }
    }
}
