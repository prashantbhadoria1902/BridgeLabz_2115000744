import java.util.*;
public class MaxOfThree {
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Maximum of Three Numbers: Enter three numbers");
        System.out.println("Max: " + maxOfThree(cin.nextInt(), cin.nextInt(), cin.nextInt()));

    }
}
