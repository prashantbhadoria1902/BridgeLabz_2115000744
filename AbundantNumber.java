import java.util.*;

public class AbundantNumber {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum>n){
            System.out.println("Abundant Number");
        }else{
            System.out.println("Not a Abundant Number");
        }
    }
}