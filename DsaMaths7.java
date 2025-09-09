import java.util.*;

public class DsaMaths7 {

    static boolean checkPrime(int n) {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt = cnt + 1;
                if (n / i != i) {
                    cnt = cnt + 1;
                }
            }
        }
        return cnt == 2;
    }

    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
