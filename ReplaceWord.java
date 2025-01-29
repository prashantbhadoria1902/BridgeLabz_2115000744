import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String sent = cin.nextLine();
        String word = cin.nextLine();
        String newWord = cin.nextLine();
        System.out.println(replaceWord(sent,word,newWord));
    }
}
