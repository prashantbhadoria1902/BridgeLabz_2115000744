import java.util.Scanner;

public class LeapYear {
    public static void leapYear(int n){
        if(n<1582){
            System.out.println("Not a leap year");
            return;
        }

        if((n%4==0 && n%100!=0) || n%400==0){
            System.out.println(n+" is a Leap Year");
        }else{
            System.out.println(n+" is not a Leap Year");
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        leapYear(n);
    }

}