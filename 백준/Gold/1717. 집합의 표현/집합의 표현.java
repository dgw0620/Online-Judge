import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int q = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (q == 0) {
                UNION(a, b);
            } else {
                System.out.println(checkSame(a, b) ? "YES" : "NO");
            }
        }
    }

    private static int FIND(int a) {
        if (a == parent[a]) return a;
        else {
            return parent[a] = FIND(parent[a]);
        }
    }

    private static void UNION(int a, int b) {
        a = FIND(a);
        b = FIND(b);
        if (a != b ) {
            parent[b] = a;
        }
    }

    private static boolean checkSame(int a, int b) {
        a = FIND(a);
        b = FIND(b);
        return a == b;
    }
}
