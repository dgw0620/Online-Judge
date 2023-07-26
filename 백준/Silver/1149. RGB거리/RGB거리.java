import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n + 1][3];

        dp[1][0] = sc.nextInt();
        dp[1][1] = sc.nextInt();
        dp[1][2] = sc.nextInt();

        int i = 2;
        for (; i <= n; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + sc.nextInt();
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + sc.nextInt();
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + sc.nextInt();
        }
        i--;
        System.out.println(Math.min(Math.min(dp[i][0], dp[i][1]), dp[i][2]));
    }
}
