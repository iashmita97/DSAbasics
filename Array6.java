import java.util.*;

class Array6 {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateToLeft(int[] arr, int n, int k) {
        if (n == 0) return;
        k = k % n;
        if (k == 0) return;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int n = 7;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotateToLeft(arr, n, k);

        System.out.println("After Rotating the elements to left:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
