import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n + 1];
        int[] p = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = n - 1; i > -1; i--) {
            if (n < i + t[i]) dp[i] = dp[i + 1];
            else dp[i] = Math.max(dp[i + 1], p[i] + dp[i + t[i]]);
        }

        System.out.println(dp[0]);
    }
}