import java.util.Scanner;

public class Q04_PrintOdd {
    static void printOdd(int i, int n) {
        if (i > n) return;

        System.out.print(i + " ");
        printOdd(i + 2, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printOdd(1, n);
    }

    
}
