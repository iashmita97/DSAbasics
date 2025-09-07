import java.util.*;

public class DsaMaths1 {
    static int countDigits(int n) {
        int count = (int) (Math.log10(n) + 1);
        return count;
    }

    public static void main(String[] args) {
        int N = 329823;
        System.out.println("N: " + N);
        int digits = countDigits(N);
        System.out.println("Number of Digits in N: " + digits);
    }
}
