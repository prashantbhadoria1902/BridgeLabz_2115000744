import java.util.*;

public class GreatestFactor{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int greatest = 1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
                greatest = i;
                break;
            }
        }
        System.out.println("Greatest factor of "+n+" is "+greatest);
    }
}