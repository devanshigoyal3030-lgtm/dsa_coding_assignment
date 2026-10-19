import java.util.*;

public class Q08_Palindrome {
    static boolean palindrome(String s, int start, int end) {
        if (start >= end) return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return palindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (palindrome(s, 0, s.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
