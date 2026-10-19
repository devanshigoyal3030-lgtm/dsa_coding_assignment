import java.util.*;

public class Q23_MaxArray {
    static int maximum(int arr[], int i) {
        if (i == arr.length - 1) return arr[i];

        return Math.max(arr[i], maximum(arr, i + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maximum(arr, 0));
    }
}
