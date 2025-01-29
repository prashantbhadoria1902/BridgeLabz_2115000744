import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("GCD and LCM: Enter two numbers");
        int a = cin.nextInt(), b = cin.nextInt();
        System.out.println("GCD: " + gcd(a, b) + ", LCM: " + lcm(a, b));
    }
}
