public class Array9 {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0, maxLen = 0;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 2, 1, 1};
        int k = 5;

        int result = longestSubarrayWithSumK(arr, k);
        System.out.println("Longest Subarray Length = " + result);
    }
}
