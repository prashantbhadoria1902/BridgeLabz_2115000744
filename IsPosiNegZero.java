import java.util.*;

public class IsPosiNegZero{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n>0){
            System.out.println("The number "+n+" is Positive");
        }else if(n<0){
            System.out.println("The number "+n+" is Negative");
        }else{
            System.out.println("The number "+n+" is Zero");
        }
    }
}