import java.util.*;

public class Q22_CheckSorted {
    static boolean sorted(int arr[], int i) {
        if (i == arr.length - 1) return true;

        if (arr[i] > arr[i + 1]) return false;

        return sorted(arr, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (sorted(arr, 0))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
