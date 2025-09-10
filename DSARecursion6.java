import java.util.*;

public class DSARecursion6 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " (Iterative): " + factorialIterative(n));
        System.out.println("Factorial of " + n + " (Recursive): " + factorialRecursive(n));
    }

    public static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}
