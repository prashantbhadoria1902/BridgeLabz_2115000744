import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = n;
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        n = m;
        int rev=0;
        while(n>0){
            int last = n%10;
            rev = rev+(int)Math.pow(last,count);
            n/=10;
        }

        if(rev==m){
            System.out.println(m+" is a Armstrong Number");
        }else{
            System.out.println(m+" is not a Armstrong Number");
        }
    }
}