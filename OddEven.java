import java.util.*;

public class OddEven{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
         int n = cin.nextInt();

         if(n>0){
             for(int i=1;i<=n;i++){
                 if(i%2==0){
                     System.out.println(i+" : Even");
                 }else{
                     System.out.println(i+" : Odd");
                 }
             }
         }else{
             System.out.println("Invalid Number");
         }
    }
}