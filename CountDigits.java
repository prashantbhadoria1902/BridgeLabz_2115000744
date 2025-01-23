import java.util.*;

public class CountDigits {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println("Number of digits in "+m+" : "+count);
    }
}