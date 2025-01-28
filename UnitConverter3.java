public class UnitConverter3 {
    public static double farhenheit2celsius (double farh) {
        return (farh-32)*5/9;
    }

    public static double celsius2farhenheit (double cel) {
        return (cel * 9 / 5) + 32;
    }

    public static double pounds2kilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double kilograms2pounds(double kg){
        return kg * 2.20462;
    }

    public static double gallons2liters(double gallons){
        return gallons * 3.78541;
    }

    public static double liters2gallons (double liters){
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        System.out.println("10 farhenheit to celsius: " + farhenheit2celsius(10));
        System.out.println("10 celsius to farhenheit: " + celsius2farhenheit(10));
        System.out.println("10 pounds to kg: " + pounds2kilograms(10));
        System.out.println("10 kg to pounds: " + kilograms2pounds(10));
        System.out.println("10 gallons to liters: " + gallons2liters(10));
    }
}
