import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str1 = cin.nextLine();
        String str2 = cin.nextLine();
        System.out.println(areAnagrams(str1,str2));
    }
}
