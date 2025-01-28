class NumberChecker4 {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("Number: " + num1);
        System.out.println("Is Prime: " + isPrime(num1));

        int num2 = 9;
        System.out.println("\nNumber: " + num2);
        System.out.println("Is Neon: " + isNeonNumber(num2));

        int num3 = 123;
        System.out.println("\nNumber: " + num3);
        System.out.println("Is Spy: " + isSpyNumber(num3));

        int num4 = 25;
        System.out.println("\nNumber: " + num4);
        System.out.println("Is Automorphic: " + isAutomorphicNumber(num4));

        int num5 = 49;
        System.out.println("\nNumber: " + num5);
        System.out.println("Is Buzz: " + isBuzzNumber(num5));
    }
}