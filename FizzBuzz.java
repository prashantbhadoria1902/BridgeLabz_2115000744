import java.util.*;
public class FizzBuzz {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n>0){
            for(int i=0;i<=n;i++){
                System.out.print(i+" ");
                if(i%3==0 && i%5==0){
                    System.out.print("FizzBuzz");
                }else if(i%5==0){
                    System.out.print("Buzz");
                }else if(i%3==0){
                    System.out.print("Fizz");
                }
                System.out.println();
            }
        }else{
            System.out.println("Negative number");
        }
    }
}
