import java.util.Scanner;

public class PalindromeString {
    public static boolean palindrome(String str){
        int l=0,r=str.length()-1;

        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str = cin.nextLine();
        System.out.println(palindrome(str));
    }
}
