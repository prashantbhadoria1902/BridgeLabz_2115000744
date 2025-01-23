import java.util.*;

public class SumFormula{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        if(n>0){
            sum1 = n*(n+1)/2;

            while(n>0){
                sum2+=n;
                n--;
            }
        }

        if(sum2==sum1){
            System.out.println("The results match! Both computations are correct.");
        }else{
            System.out.println("The results match! Both computations are incorrect.");
        }
    }
}