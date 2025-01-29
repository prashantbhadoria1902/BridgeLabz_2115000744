import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Factorial: Enter a number");
        System.out.println("Factorial: " + factorial(cin.nextInt()));
    }
}
