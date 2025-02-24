import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class AccessControl {
    private String userRole;

    public AccessControl(String role) {
        this.userRole = role;
    }

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed successfully.");
    }

    public void executeTask(String methodName) throws Exception {
        Method method = this.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            if (!roleAllowed.value().equals(userRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }
        method.invoke(this);
    }
}

class RoleAccessTest {
    public static void main(String[] args) throws Exception {
        AccessControl user = new AccessControl("USER");
        user.executeTask("adminTask");

        AccessControl admin = new AccessControl("ADMIN");
        admin.executeTask("adminTask");
    }
}

