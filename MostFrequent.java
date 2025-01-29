import java.util.Scanner;

public class MostFrequent {
    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int maxFreq = 0;
        char maxChar = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                maxChar = c;
            }
        }
        return maxChar;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str = cin.nextLine();
        System.out.println(mostFrequentChar(str));
    }
}
