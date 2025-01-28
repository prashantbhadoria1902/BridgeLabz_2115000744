import java.util.Scanner;

public class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        return weight / Math.pow(heightCm / 100, 2);
    }

    public static String[] Status(double[] bmi) {
        String[] status = new String[10];
        for (int i = 0; i < bmi.length; i++) {
            status[i] = bmi[i] < 18.5 ? "Underweight" : bmi[i] < 25 ? "Normal weight" : bmi[i] < 30 ? "Overweight" : "Obesity";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double[][] data = new double[10][3];
        double[] bmi = new double[10];

        for (int i = 0; i < 10; i++) {
            data[i][0] = cin.nextDouble();
            data[i][1] = cin.nextDouble();
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            bmi[i] = data[i][2];
        }

        String[] status = Status(bmi);
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - %.2f kg, %.2f cm, BMI: %.2f, %s\n", i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
