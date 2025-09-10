import java.util.*;

public class DSARecursion5 {
    public static void main(String[] args) {
        solve(5);
        solve(6);
    }

    public static void solve(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}
