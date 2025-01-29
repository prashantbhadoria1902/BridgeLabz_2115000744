import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Palindrome Check: Enter a string");
        System.out.println(isPalindrome(cin.next()) ? "Palindrome" : "Not Palindrome");

    }
}
