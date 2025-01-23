import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for (int i = 100; i >= 1; i--) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}
