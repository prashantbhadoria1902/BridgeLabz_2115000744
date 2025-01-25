import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = cin.nextInt();

        float[][] marks = new float[numberOfStudents][3];
        float[] percentages = new float[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Mathematics" : "Chemistry";
                while (true) {
                    System.out.print(subject + ": ");
                    marks[i][j] = cin.nextFloat();
                    if (marks[i][j] >= 0 && marks[i][j] <= 100) {
                        break;
                    } else {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                }
            }

            float total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300) * 100;

            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        System.out.println("\nResults:");
        System.out.printf("%-10s%-10s%-10s%-15s%-15s\n", "Physics", "Maths", "Chemistry", "Percentage", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10.2f%-10.2f%-10.2f%-15.2f%-15c\n", marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}
