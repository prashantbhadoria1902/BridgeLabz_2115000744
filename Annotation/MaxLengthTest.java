import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds maximum length of 10 characters");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class MaxLengthTest {
    public static void main(String[] args) {
        try {
            User user1 = new User("ShortName");
            System.out.println("Valid Username: " + user1.getUsername());
            
            User user2 = new User("VeryLongUsername"); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
