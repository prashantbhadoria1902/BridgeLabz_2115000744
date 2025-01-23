import java.util.*;

public class PowerNumber{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int num = cin.nextInt();
        int power = cin.nextInt();
        int pow = 1;
        for(int i=1;i<=power;i++){
            pow*=num;
        }
        System.out.println("Result: "+pow);
    }
}