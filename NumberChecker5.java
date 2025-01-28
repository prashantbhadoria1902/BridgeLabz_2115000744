import java.util.Arrays;

class NumberChecker5 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Exclude the number itself
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum - num == num; // Subtract num itself for proper divisors
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum - num > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors);
        return sum - num < num;
    }

    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            int factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        int num = 6;
        int[] factors = findFactors(num);

        System.out.println("Number: " + num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubeOfFactors(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(num));

        int num2 = 12;
        System.out.println("\nNumber: " + num2);
        System.out.println("Is Abundant Number: " + isAbundantNumber(num2));

        int num3 = 10;
        System.out.println("\nNumber: " + num3);
        System.out.println("Is Deficient Number: " + isDeficientNumber(num3));

        int num4 = 145;
        System.out.println("\nNumber: " + num4);
        System.out.println("Is Strong Number: " + isStrongNumber(num4));
    }
}