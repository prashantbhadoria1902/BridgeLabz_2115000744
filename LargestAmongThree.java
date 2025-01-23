import java.util.*;
public class LargestAmongThree {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();
        int n3 = cin.nextInt();

        System.out.println("Is the first number the largest? "+ (n1>n2 && n1>n3));
        System.out.println("Is the second number the largest? "+ (n2>n1 && n2>n3));
        System.out.println("Is the third number the largest? "+ (n3>n1 && n3>n2));
    }
}
