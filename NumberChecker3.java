import java.util.Arrays;

class NumberChecker3 {

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

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = storeDigits(num);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int num) {
        int[] digits = storeDigits(num);
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Number: " + num);
        System.out.println("Digit Count: " + countDigits(num));

        int[] digits = storeDigits(num);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseDigits(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome: " + isPalindrome(num));
        System.out.println("Is Duck Number: " + isDuckNumber(num));

        int num2 = 1020;
        System.out.println("\nNumber: " + num2);
        System.out.println("Is Duck Number: " + isDuckNumber(num2));


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {3, 2, 1};
        System.out.println("\nArray Comparison:");
        System.out.println("arr1 and arr2 are equal: " + compareArrays(arr1, arr2));
        System.out.println("arr1 and arr3 are equal: " + compareArrays(arr1, arr3));
    }
}