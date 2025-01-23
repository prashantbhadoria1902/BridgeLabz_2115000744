import java.util.*;

public class HarshadNumber {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = n;
        int sum=0;
        while(n>0){
            int last = n%10;
            sum+=last;
            n/=10;
        }
        if(m%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}