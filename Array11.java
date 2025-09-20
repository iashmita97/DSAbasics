import java.util.*;

public class Array11 {

    public static void sortArray(ArrayList<Integer> arr, int n) {
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            switch (arr.get(mid)) {
                case 0:
                    Collections.swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    Collections.swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0, 2, 1, 2, 0, 1));

        sortArray(arr, n);

        System.out.println("After sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
