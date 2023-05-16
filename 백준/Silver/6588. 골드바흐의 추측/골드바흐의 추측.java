import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[1000001];
        Arrays.fill(isPrime, true);

        for (int i = 2; i < isPrime.length; i++) {
            for (int j = 2 * i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }

        while (n != 0) {
            boolean check = false;

            for (int i = 3; i < n / 2 + 2; i += 2) {
                if (isPrime[i] && isPrime[n - i]){
                    sb.append(n + " = " + i + " + " + (n - i) + "\n");
                    check = true;
                    break;
                }
            }
            if (!check) sb.append("Goldbach's conjecture is wrong.");

            n = Integer.parseInt(br.readLine());
        }

        System.out.println(sb);
    }
}