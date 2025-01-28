import java.util.Scanner;

public class StudentVoteChecker {
    public static boolean canStudentVote(int age){
        if(age<0){
            System.out.println("Cannot Vote");
            return false;
        }

        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int age[] = new int[10];
        for(int i=0;i<age.length;i++){
            int a = cin.nextInt();
            System.out.println(canStudentVote(a));
        }
    }
}