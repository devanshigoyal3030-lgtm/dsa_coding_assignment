import java.util.*;

public class Q03_PrintEven {
    static void printEven(int n) {
        if (n < 2) return;

        printEven(n - 2);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) n--;
        printEven(n);
    }
}
