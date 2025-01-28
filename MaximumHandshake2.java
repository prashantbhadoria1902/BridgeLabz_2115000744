import java.util.*;
public class MaximumHandshake2 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int numberOfStudents = cin.nextInt();

        System.out.println("The number of possible handshake : "+(numberOfStudents*(numberOfStudents-1))/2);
    }
}