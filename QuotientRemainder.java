import java.util.*;

public class QuotientRemainder {
    public static int[] quoRem(int n,int div){
        int result[] = new int[2];

        int num = n/div;
        int r = n%div;

        result[0] = num;
        result[1] = r;
        return result;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        int div = cin.nextInt();

        int result[] = quoRem(n,div);
        System.out.println("Quotient : "+result[0]);
        System.out.println("Remaider : "+result[1]);
    }
}
