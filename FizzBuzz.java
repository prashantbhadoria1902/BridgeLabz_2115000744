import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Invalid Input");
            return;
        }
        String[] results = new String[number + 1];
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) results[i] = "FizzBuzz";
            else if (i % 3 == 0) results[i] = "Fizz";
            else if (i % 5 == 0) results[i] = "Buzz";
            else results[i] = String.valueOf(i);
        }
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
