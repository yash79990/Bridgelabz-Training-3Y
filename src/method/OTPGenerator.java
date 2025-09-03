package method;

import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int otp;
            do { otp = generateOTP(); } while (unique.contains(otp));
            otps[i] = otp;
            unique.add(otp);
        }
        for (int otp : otps) System.out.println("OTP: " + otp);
    }

    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
}
