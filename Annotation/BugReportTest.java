import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class IssueTracker {
    @BugReport(description = "Null pointer exception occurs in edge cases")
    @BugReport(description = "Performance issue when handling large inputs")
    public void processTask() {
        System.out.println("Processing task...");
    }
}

public class BugReportTest {
    public static void main(String[] args) throws Exception {
        Method method = IssueTracker.class.getMethod("processTask");
        BugReports bugReports = method.getAnnotation(BugReports.class);
        
        if (bugReports != null) {
            for (BugReport report : bugReports.value()) {
                System.out.println("Bug: " + report.description());
            }
        }
    }
}
