public class FibonacciComparison {
    public static void main(String[] args) {
        int[] testCases = {10, 30, 50};

        for (int n : testCases) {
            System.out.println("Fibonacci (" + n + ")");

            // Recursive approach
            long startTime = System.nanoTime();
            System.out.println("Recursive: " + fibonacciRecursive(n));
            long endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) / 1000000 + "ms");

            // Iterative approach
            startTime = System.nanoTime();
            System.out.println("Iterative: " + fibonacciIterative(n));
            endTime = System.nanoTime();
            System.out.println("Time: " + (endTime - startTime) / 1000000 + "ms");

            System.out.println();
        }
    }

    // Recursive Fibonacci
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Iterative Fibonacci
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
