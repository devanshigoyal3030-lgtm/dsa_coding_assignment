import java.util.*;

public class Q16_LCM {
    static long gcd(long a, long b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 0 || b == 0) {
            System.out.println(0);
        } else {
            long lcm = (a / gcd(a, b)) * b;
            System.out.println(Math.abs(lcm));
        }
    }
}
