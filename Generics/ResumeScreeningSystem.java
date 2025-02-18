import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String roleName;
    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() {
        return roleName;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    public T getJobRole() {
        return jobRole;
    }
}

class ResumeScreeningSystem {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            System.out.println("Processing resume for: " + resume.getRoleName());
        }
    }
    public static void main(String[] args) {
        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer());
        resumes.add(new DataScientist());
        resumes.add(new ProductManager());

        processResumes(resumes);
    }
}
