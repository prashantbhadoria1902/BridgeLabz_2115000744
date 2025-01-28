import java.util.Scanner;

public class Factors {
    public static int[] factors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }

        int arr[] = new int[count];
        int idx = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                arr[idx++] = i;
            }
        }

        return arr;
    }

    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static int findSumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = cin.nextInt();

        int[] factors = factors(number);

        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        int sum = findSumOfFactors(factors);
        int product = findProductOfFactors(factors);
        int sumOfSquares = findSumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

    }
}
