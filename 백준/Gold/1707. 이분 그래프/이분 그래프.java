import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>[] adj;
    static int[] check;
    static boolean[] visited;
    static boolean IsEven;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            adj = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;

            for (int j = 1; j <= V; j++) {
                adj[j] = new ArrayList<>();
            }

            for (int j = 0; j < E; j++) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                adj[s].add(e);
                adj[e].add(s);
            }

            for (int j = 1; j <= V; j++) {
                if (IsEven) {
                    DFS(j);
                } else {
                    break;
                }
            }

            System.out.println(IsEven ? "YES" : "NO");
        }
    }

    private static void DFS(int start) {
        visited[start] = true;

        for (int i : adj[start]) {
            if (!visited[i]) {
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            } else if (check[start] == check[i]) {
                    IsEven = false;
            }
        }
    }
}
