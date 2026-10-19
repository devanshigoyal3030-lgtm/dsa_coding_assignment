import java.util.*;

public class Q26_BinarySearch {
    static int binarySearch(int arr[], int low, int high, int x) {
        if (low > high) return -1;

        int mid = low + (high - low) / 2;

        if (arr[mid] == x) {
            int earlier = binarySearch(arr, low, mid - 1, x);

            if (earlier != -1) return earlier;

            return mid;
        }

        if (x < arr[mid]) {
            return binarySearch(arr, low, mid - 1, x);
        }

        return binarySearch(arr, mid + 1, high, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(arr, 0, n - 1, x));
    }
}
