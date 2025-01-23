import java.util.*;

public class isPrime{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}