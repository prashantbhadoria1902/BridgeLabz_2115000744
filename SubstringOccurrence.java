import java.util.Scanner;

public class SubstringOccurrence {
    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str = cin.nextLine();
        String subStr = cin.nextLine();
        System.out.println(countSubstringOccurrences(str,subStr));
    }
}
