import java.util.*;

public class CountDown2{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}