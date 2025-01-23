import java.util.*;

public class CanVote {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int age = cin.nextInt();

        if(age>=18){
            System.out.println("The person's age is "+age+" and can vote.");
        }
    }
}
