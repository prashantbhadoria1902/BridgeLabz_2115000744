import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Prime Number Check: Enter a number");
        System.out.println(isPrime(cin.nextInt()) ? "Prime" : "Not Prime");

    }
}
