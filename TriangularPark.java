import java.util.Scanner;
public class TriangularPark {
    public static int rounds(int a,int b,int c){
        int perimeter = a+b+c;

        int round = (5*1000)/perimeter;
        return round;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        System.out.println("the number of rounds user needs to do to complete 5km run is "+rounds(a,b,c));
    }
}