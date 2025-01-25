import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Invalid Input");
            return;
        }
        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) even[evenIndex++] = i;
            else odd[oddIndex++] = i;
        }
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
        System.out.println();
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
    }
}
