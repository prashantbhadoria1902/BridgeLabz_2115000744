import java.util.Scanner;

public class ConsonantVowel {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        countVowelsAndConsonants(str);
    }
}
