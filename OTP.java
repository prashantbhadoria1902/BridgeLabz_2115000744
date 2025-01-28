import java.util.Arrays;

class OTP {

    public static String generateOTP() {
        int num = (int) (Math.random() * 1000000);
        return String.format("%06d", num);
    }

    public static boolean areUnique(String[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i].equals(otps[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];

        System.out.println("Generating 10 OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }

        if (areUnique(otps)) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nOTPs are not unique.");
        }
    }
}