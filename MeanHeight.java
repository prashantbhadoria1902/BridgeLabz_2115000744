import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        System.out.println("Mean Height: " + (sum / 11));
    }
}
