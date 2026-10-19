import java.util.*;

public class Q21_ReplaceChar {
    static String replace(String s, char c1, char c2) {
        if (s.length() == 0) return "";

        char first = s.charAt(0);
        String rest = replace(s.substring(1), c1, c2);

        if (first == c1) first = c2;

        return first + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(replace(s, c1, c2));
    }
}
