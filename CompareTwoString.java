import java.util.Scanner;

public class CompareTwoString {
    public static void compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) < str2.charAt(i) ? str1 + " comes before " + str2 : str2 + " comes before " + str1);
                return;
            }
        }
        if (str1.length() != str2.length()) {
            System.out.println(str1.length() < str2.length() ? str1 + " comes before " + str2 : str2 + " comes before " + str1);
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str1 = cin.nextLine();
        String str2 = cin.nextLine();
        compareStrings(str1,str2);
    }
}
