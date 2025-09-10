import java.util.*;

public class DSARecursion9 {
    static int[] dp;

    static int fib(int n) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int N = 10; 
        dp = new int[N + 1];
        Arrays.fill(dp, -1);

        System.out.print("Fibonacci Series up to " + N + " terms: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
