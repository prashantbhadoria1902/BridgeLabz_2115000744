import java.util.*;

public class CountDown{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        while(n>0){
            System.out.println(n);
            n--;
        }
    }
}