import java.util.Scanner;

public class DsaMaths2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int revNum = 0;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n / 10;
        }
        System.out.println(revNum);
        scanner.close();
    }
}
