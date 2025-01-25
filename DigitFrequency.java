import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = cin.nextInt();

        int[] digitArray = new int[10];
        int[] frequency = new int[10];

        while (number > 0) {
            int digit = number % 10;
            digitArray[digit]++;
            number /= 10;
        }

        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (digitArray[i] > 0) {
                System.out.println(i + ": " + digitArray[i]);
            }
        }
    }
}
