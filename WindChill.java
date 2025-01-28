import java.util.*;

public class WindChill {
    public static double windChill(double temp,double windSpeed){
        double cal = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);

        return cal;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        double temp = cin.nextDouble();
        double windSpeed = cin.nextDouble();

        System.out.println("Wind chill : "+windChill(temp,windSpeed));
    }
}