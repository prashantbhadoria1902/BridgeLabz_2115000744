import java.util.*;

public class MultiplicationTable{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if(n>=6 && n<=9){
            for(int i=1;i<=10;i++){
                System.out.println(n+" x "+i+" = "+n*i);
            }
        }else{
            System.out.println("Invalid number entered");
        }
    }
}