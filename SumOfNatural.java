import java.util.*;
public class SumOfNatural {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum=0;
        if(n>0){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println("The sum of "+n+" natural numbers is "+sum);
        }else{
            System.out.println("The number "+n+" is not a natural number");
        }
    }
}
