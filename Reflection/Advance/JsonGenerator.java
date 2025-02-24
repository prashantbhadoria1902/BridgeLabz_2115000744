import java.lang.reflect.*;
import java.util.*;

class Person {
    public String name = "John";
    public int age = 25;
}

public class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\": \"").append(field.get(obj)).append("\", ");
        }

        if (json.length() > 1) json.setLength(json.length() - 2);
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}
