import java.util.*;
public class IsFirstSmallest {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();
        int n3 = cin.nextInt();

        if(n1<n2){
            if(n1<n3){
                System.out.println("Is the first number the smallest? Yes");
            }else{
                System.out.println("Is the first number the smallest? No");
            }
        }else{
            System.out.println("Is the first number the smallest? No");
        }
    }
}
