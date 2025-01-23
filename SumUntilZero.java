import java.util.*;

public class SumUntilZero{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int sum=0;
        int n = cin.nextInt();
        while(n!=0){
            sum+=n;
            n = cin.nextInt();
        }
        System.out.println("The sum is "+sum);
    }
}