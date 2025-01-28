import java.util.Random;
import java.util.Scanner;

public class Marks {

    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + random.nextInt(90);
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4];
        for (int i = 0; i < numStudents; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int math = scores[i][2];
            int total = physics + chemistry + math;
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            double roundedAverage = Math.round(average * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = roundedAverage;
            results[i][2] = percentage;
            results[i][3] = average;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        int numStudents = scores.length;
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d\t%-10d\t%-10d\t%-10d\t%-10d\t%-10.2f\t%-10.2f\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    (int) results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
        input.close();
    }
}