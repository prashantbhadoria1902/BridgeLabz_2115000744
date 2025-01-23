import java.util.*;

public class Factorial{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m =n;
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println("The factorial of "+m+" is "+fact);
    }
}