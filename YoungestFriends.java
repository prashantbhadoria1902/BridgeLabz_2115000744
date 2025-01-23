import java.util.*;
public class YoungestFriends{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the age and height of Amar: ");
        int amar = cin.nextInt();
        int amarHeight = cin.nextInt();
        System.out.print("Enter the age and height of Akbar: ");
        int akbar = cin.nextInt();
        int akbarHeight = cin.nextInt();
        System.out.print("Enter the age and height of Anthony: ");
        int anthony = cin.nextInt();
        int anthonyHeight = cin.nextInt();

        if(amar<akbar){
            if(amar<anthony){
                System.out.println("Amar is the youngest");
            }else{
                System.out.println("Anthony is the youngest");
            }
        }else{
            if(akbar<anthony){
                System.out.println("Akbar is the youngest");
            }else{
                System.out.println("Anthony is the youngest");
            }
        }

        if(amarHeight>akbarHeight){
            if(amarHeight>anthonyHeight){
                System.out.println("Amar is the tallest");
            }else{
                System.out.println("Anthony is the tallest");
            }
        }else{
            if(akbarHeight>anthonyHeight){
                System.out.println("Akbar is the tallest");
            }else{
                System.out.println("Anthony is the tallest");
            }
        }
    }
}