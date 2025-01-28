import java.util.*;
public class MaximumHandshake {
    public static int maxHandshake(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        System.out.println(maxHandshake(N));
    }
}
