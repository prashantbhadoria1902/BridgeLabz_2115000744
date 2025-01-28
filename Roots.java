import java.util.Scanner;

public class Roots {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            return new double[]{(-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)};
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }
        return new double[]{};
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.printf("Root 1: %.2f, Root 2: %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("Root: %.2f\n", roots[0]);
        } else {
            System.out.println("No real roots");
        }
    }
}
