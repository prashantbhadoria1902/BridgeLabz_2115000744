import java.util.Arrays;

class NumberChecker2{

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int num, int[] digits) {
        int sumOfDigits = sumOfDigits(digits);
        return num % sumOfDigits == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void displayFrequency(int[][] frequency) {
        for (int[] row : frequency) {
            System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
        }
    }



    public static void main(String[] args) {
        int num = 12345;

        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = storeDigits(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(num, digits));

        int[][] frequency = digitFrequency(num);
        System.out.println("Digit Frequencies:");
        displayFrequency(frequency);


        int num2 = 21;
        int[] digits2 = storeDigits(num2);
        System.out.println("\nNumber: " + num2);
        System.out.println("Is Harshad Number: " + isHarshadNumber(num2, digits2));

    }
}