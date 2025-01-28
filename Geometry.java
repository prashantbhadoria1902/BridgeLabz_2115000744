import java.util.Arrays;
import java.util.Scanner;

public class Geometry {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] equationOfLine(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter coordinates for point 1 (x1 y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter coordinates for point 2 (x2 y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance: " + distance);

        double[] lineEquation = equationOfLine(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double yIntercept = lineEquation[1];

        System.out.printf("Equation of the line: y = %.2fx + %.2f\n", slope, yIntercept);
        input.close();

    }
}