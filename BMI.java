import java.util.*;
public class BMI {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double weight = cin.nextDouble();
        double height = cin.nextDouble();
        double heightM = height/100;

        double BMI = weight/(heightM*heightM);

        if(BMI>=40.0){
            System.out.println("Obese");
        }else if(BMI>=25.0){
            System.out.println("Overweight");
        }else if(BMI>=18.5){
            System.out.println("Normal");
        }else{
            System.out.println("Underweight");
        }
    }
}
