import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        long[] fx = new long[1000001];
        long[] gx = new long[1000001];

        Arrays.fill(fx, 1);

        for (int i = 2; i < fx.length; i++) {
            for (int j = i; j < fx.length; j += i) {
                fx[j] += i;
            }
        }

        for (int i = 1; i < gx.length; i++) {
            gx[i] += gx[i-1] + fx[i];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(gx[n]).append("\n");
        }
        System.out.println(sb);
    }
}