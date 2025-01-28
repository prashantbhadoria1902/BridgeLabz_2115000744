import java.util.*;

public class Chocalates {
    public static int[] distributed(int chocalates,int children){
        int result[] = new int[2];

        int dis = chocalates/children;
        int rem = chocalates%children;

        result[0]=dis;
        result[1] = rem;
        return result;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int numberOfchocolates = cin.nextInt();
        int numberOfChildren = cin.nextInt();

        int result[] = distributed(numberOfchocolates,numberOfChildren);

        System.out.println("The number of chocolates each child gets : "+result[0]);
        System.out.println("number of remaining chocolates : "+result[1]);
    }
}
