import java.util.*;

public class Q19_CharFrequency {
    static int count(String s, char c, int i) {
        if (i == s.length()) return 0;

        int current = (s.charAt(i) == c) ? 1 : 0;

        return current + count(s, c, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(count(s, c, 0));
    }
}
