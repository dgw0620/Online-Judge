import java.util.Scanner;

public class Main {
    public static int calcGCD(int m, int n) {
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;

            int lcm = m * n / calcGCD(m, n);

            int answer = -1;

            for (int i = x; i <= lcm; i += m) {
                if (i % n == y) {
                    answer = i + 1;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}