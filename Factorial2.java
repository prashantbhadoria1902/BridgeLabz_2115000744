import java.util.*;

public class Factorial2{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m =n;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}