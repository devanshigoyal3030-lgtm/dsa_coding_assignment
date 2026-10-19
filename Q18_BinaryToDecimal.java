import java.util.*;

public class Q18_BinaryToDecimal {
    static long power(int a, int b) {
        if (b == 0) return 1;

        return a * power(a, b - 1);
    }

    static long decimal(String s, int i) {
        if (i == s.length()) return 0;

        int digit = s.charAt(i) - '0';

        return digit * power(2, s.length() - 1 - i)
                + decimal(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(decimal(s, 0));
    }
}
