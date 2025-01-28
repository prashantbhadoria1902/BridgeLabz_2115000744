import java.util.*;

public class SmallestLargest {
    public static int[] smallestLargest(int n1,int n2,int n3){
        int result[] = new int[2];

        int max = Math.max(n1,Math.max(n2,n3));
        int min = Math.min(n1,Math.min(n2,n3));

        result[0] = min;
        result[1] = max;

        return result;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n1 = cin.nextInt();
        int n2 = cin.nextInt();
        int n3 = cin.nextInt();

        int result[] = smallestLargest(n1,n2,n3);

        System.out.println("Smallest: "+result[0]);
        System.out.println("Largest: "+result[1]);


    }
}
