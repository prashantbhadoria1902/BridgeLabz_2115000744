class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 3, 300.0);
        Course course2 = new Course("Python", 6, 500.0);
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        Course.updateInstituteName("GLA University");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
