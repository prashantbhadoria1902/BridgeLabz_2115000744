import java.util.*;

public class Zara{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        double salary = cin.nextDouble();
        System.out.print("Enter year of experience: ");
        int year = cin.nextInt();

        if(year>5){
            double bonus = salary*0.05;
            System.out.println("The bonus is : "+bonus);
        }else{
            System.out.println("No bonus");
        }
    }
}