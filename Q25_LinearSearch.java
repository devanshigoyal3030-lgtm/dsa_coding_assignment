import java.util.*;

public class Q25_LinearSearch {
    static int search(int arr[], int i, int x) {
        if (i == arr.length) return -1;

        if (arr[i] == x) return i;

        return search(arr, i + 1, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(search(arr, 0, x));
    }
}
