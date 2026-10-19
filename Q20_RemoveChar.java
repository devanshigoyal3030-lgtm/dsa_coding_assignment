import java.util.*;

public class Q20_RemoveChar {
    static String remove(String s, char c) {
        if (s.length() == 0) return "";

        char first = s.charAt(0);
        String rest = remove(s.substring(1), c);

        if (first == c) return rest;

        return first + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(remove(s, c));
    }
}
