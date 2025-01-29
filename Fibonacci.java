import java.util.*;
public class Fibonacci {
    public static void fibonacci(int n) {
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Fibonacci Sequence: Enter number of terms");
        fibonacci(cin.nextInt());

    }
}
