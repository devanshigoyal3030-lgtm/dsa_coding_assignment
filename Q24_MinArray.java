import java.util.*;

public class Q24_MinArray {
    static int minimum(int arr[], int i) {
        if (i == arr.length - 1) return arr[i];

        return Math.min(arr[i], minimum(arr, i + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minimum(arr, 0));
    }
}