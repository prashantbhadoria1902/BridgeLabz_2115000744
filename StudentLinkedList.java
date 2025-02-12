class Student {
    int rollNumber;
    String name;
    int age;
    String grade;
    Student next;

    Student(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    void addStudent(int rollNumber, String name, int age, String grade) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (head == null) {
            head = newStudent;
            return;
        }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newStudent;
    }

    void deleteStudent(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    Student searchStudent(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    void updateGrade(int rollNumber, String newGrade) {
        Student student = searchStudent(rollNumber);
        if (student != null) student.grade = newGrade;
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addStudent(1, "Alice", 20, "A");
        list.addStudent(2, "Bob", 21, "B");
        list.displayStudents();
        list.updateGrade(1, "A+");
        list.displayStudents();
        list.deleteStudent(2);
        list.displayStudents();
    }
}
