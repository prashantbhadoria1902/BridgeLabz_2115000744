import java.util.Scanner;

public class DynamicLargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array, resizing if necessary
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10; // Increase the array size by 10
                int[] temp = new int[maxDigit]; // Create a larger array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy current elements
                digits = temp; // Assign the larger array
            }
            digits[index++] = number % 10;
            number /= 10;
        }

        // Find largest and second largest digits
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output results
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
