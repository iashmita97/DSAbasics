import java.util.HashMap;

public class Array10 {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }

            if (prefixMap.containsKey(sum - k)) {
                int len = i - prefixMap.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        int result = longestSubarrayWithSumK(arr, k);
        System.out.println("Longest Subarray Length = " + result);
    }
}
