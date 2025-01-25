import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] results = new int[10]; // Array to store multiplication results

        for (int i = 6; i <= 9; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= 10; j++) {
                results[j - 1] = i * j; // Store multiplication result
            }
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + results[j - 1]);
            }
        }
    }
}
