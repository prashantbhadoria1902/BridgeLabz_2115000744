import java.util.*;
public class LeapYear1{
   public static void main(String[] args){
      Scanner cin = new Scanner(System.in);
      int year = cin.nextInt();
      if((year%4==0 && year%100!=0) || year%400==0 ){
         System.out.println(year+" is a leap year");
      }else{
         System.out.println(year+" is not a leap year");
      }
   }
}
