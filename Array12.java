import java.util.*;

public class Array12 {
    public static String twoSum(int n, int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int diff = target - arr[i];
            if (set.contains(diff)) return "YES";
            set.add(arr[i]);
        }
        return "NO";
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }
}
