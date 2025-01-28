public class NumberChecker {

    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits){
            sum += Math.pow(digit, power);
        }
        int number = 0;
        for (int digit : digits) number = number * 10 + digit;
        return sum == number;
    }

    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        int number = 1530;

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digits) System.out.print(digit + " ");
        System.out.println();

        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is " + number + " a duck number? " + isDuck);

        boolean isArmstrong = isArmstrongNumber(digits);
        System.out.println("Is " + number + " an Armstrong number? " + isArmstrong);

        findLargestAndSecondLargest(digits);

        findSmallestAndSecondSmallest(digits);
    }
}