import java.util.*;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double principal = cin.nextDouble();
        double rate = cin.nextDouble();
        double time = cin.nextDouble();

        double si = (principal*rate*time)/100;

        System.out.println("The Simple Interest is "+si+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
    }
}
