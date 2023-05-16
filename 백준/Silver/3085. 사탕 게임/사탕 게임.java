import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static char swap(char a, char b) {
        return a;
    }

    public static int count(char[][] map) {
        int count = 0;

        for (int i = 0; i < map.length; i++) {
            int temp = 1;
            for (int j = 0; j < map.length - 1; j++) {
                if (map[i][j] == map[i][j + 1]) temp++;
                else temp = 1;
                count = Math.max(temp, count);
            }
        }

        for (int j = 0; j < map.length; j++) {
            int temp = 1;
            for (int i = 0; i < map.length - 1; i++) {
                if (map[i][j] == map[i + 1][j]) temp++;
                else temp = 1;
                count = Math.max(temp, count);
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 && map[i][j] != map[i][j + 1]) {
                    map[i][j + 1] = swap(map[i][j], map[i][j] = map[i][j + 1]);
                    answer = Math.max(answer, count(map));
                    map[i][j + 1] = swap(map[i][j], map[i][j] = map[i][j + 1]);
                }

                if (i < n - 1 && map[i][j] != map[i +1][j]) {
                    map[i + 1][j] = swap(map[i][j], map[i][j] = map[i + 1][j]);
                    answer = Math.max(answer, count(map));
                    map[i + 1][j] = swap(map[i][j], map[i][j] = map[i + 1][j]);
                }

                if (answer == n) {
                    System.out.println(answer);
                    System.exit(0);
                }
            }
        }

        System.out.println(answer);
    }
}