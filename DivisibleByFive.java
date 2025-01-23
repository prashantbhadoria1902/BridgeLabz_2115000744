import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        if(n%5==0){
            System.out.println("Is the number "+n+" divisible by 5?: Yes");
        }else{
            System.out.println("Is the number "+n+" divisible by 5?: No");
        }
    }
}
