import java.util.Random;

public class OTPGenerator {

    public static int generateOTP() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); // Ensures a 6-digit number
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        
        System.out.println("Generated OTPs:");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println(otps[i]);
        }
        
        if (validateUniqueOTPs(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found!");
        }
    }
}
