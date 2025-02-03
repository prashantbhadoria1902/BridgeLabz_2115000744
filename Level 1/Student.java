class Student{
    private static String universityName = "GLA University";
    private static int totalStudent=0;
    private final int rollNo;
    private String name;
    private char grade;

    public Student(int rollNo,String name,char grade){
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
        totalStudent++;
    }

    public static void displayTotalStudents(){
        System.out.println("Total Students: "+totalStudent);
    }

    public void displayDetails(){
        System.out.println("Student Rollno: "+rollNo);
        System.out.println("Student Name: "+name);
        System.out.println("Student Grade: "+grade);
    }

    public static void main(String[] args){
        Student s1 = new Student(1,"Prashant Bhadoria",'A');
        Student s2 = new Student(2,"Shivangi Srivastava",'O');
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}