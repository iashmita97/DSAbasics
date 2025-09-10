public class DSARecursion1 {
    static int cnt = 0;

    static void print() {
        if (cnt == 7) return;
        System.out.println(cnt);
        cnt = cnt + 1;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}
