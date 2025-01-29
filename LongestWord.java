import java.util.Scanner;

public class LongestWord {
    public static String longestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str = cin.nextLine();
        System.out.println(longestWord(str));
    }
}
