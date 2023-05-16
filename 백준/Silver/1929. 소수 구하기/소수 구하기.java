import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);

        isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++) {
            for (int j = 2 * i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) System.out.println(i);
        }

    }
}