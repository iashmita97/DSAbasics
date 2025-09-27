import java.util.*;

public class Array16 {
    public static int[] rearrangeArray(int[] arr, int n) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }

        int[] result = new int[n];
        int i = 0, p = 0, q = 0;
        while (p < pos.size() && q < neg.size()) {
            result[i++] = pos.get(p++);
            result[i++] = neg.get(q++);
        }

        while (p < pos.size()) result[i++] = pos.get(p++);
        while (q < neg.size()) result[i++] = neg.get(q++);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int n = arr.length;

        int[] ans = rearrangeArray(arr, n);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
