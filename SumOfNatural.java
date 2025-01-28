import java.util.Scanner;

public class SumOfNatural {
    public static int sumRecur(int n){
        if(n==0) return 0;
        return n + sumRecur(n-1);
    }

    public static int sumFor(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        if(sumRecur(n)==sumFor(n)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}