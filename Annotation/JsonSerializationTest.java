import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String toJson() throws Exception {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                json.append("\"" + annotation.name() + "\": \"" + field.get(this) + "\", ");
            }
        }
        json.delete(json.length() - 2, json.length()).append("}");
        return json.toString();
    }
}

class JsonSerializationTest {
    public static void main(String[] args) throws Exception {
        User userObj = new User("JohnDoe");
        System.out.println("JSON Output: " + userObj.toJson());
    }
}
