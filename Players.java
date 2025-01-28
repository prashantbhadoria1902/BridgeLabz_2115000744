import java.util.Random;
import java.util.Scanner;

public class Players {
    public static int sum(int height[]){
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=height[i];
        }
        return sum;
    }

    public static double mean(int height[]){
        return sum(height)/(double)11;
    }

    public static int shortest(int height[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<height.length;i++){
            min = Math.min(min,height[i]);
        }

        return min;
    }

    public static int tallest(int height[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            max = Math.max(max,height[i]);
        }

        return max;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        int height[] = new int[11];
        Random rand = new Random();

        for(int i=0;i<height.length;i++){
            height[i] = 150+rand.nextInt(101);
        }

        for(int i=0;i<height.length;i++){
            System.out.println(height[i]);
        }

        System.out.println("Sum of heights: " + sum(height) + " cm");
        System.out.println("Mean height: " + mean(height) + " cm");
        System.out.println("Shortest height: " + shortest(height) + " cm");
        System.out.println("Tallest height: " + tallest(height) + " cm");
    }
}
