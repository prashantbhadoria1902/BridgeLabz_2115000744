import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] results = new int[10];
        for (int i = 1; i <= 10; i++) {
            results[i - 1] = number * i;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 1]);
        }
    }
}
