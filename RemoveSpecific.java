import java.util.Scanner;

public class RemoveSpecific {
    public static String removeCharacter(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str = cin.nextLine();
        char ch = cin.next().charAt(0);
        System.out.println(removeCharacter(str,ch));
    }
}
