import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int n = sc.nextInt();
    static int m = sc.nextInt();

    public static void solution(boolean[] arr, ArrayList<Integer> result, int count) {
        if (count == m) {
            System.out.println(result.toString().replaceAll("[^0-9 ]",""));
            return;
        }
        count++;
        for (int i = 1; i <= n; i++) {
            if (!arr[i]) {
                arr[i] = true;
                result.add(i);
                solution(arr, result, count);
                result.remove((Integer) i);
                arr[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        boolean[] arr = new boolean[n + 1];
        ArrayList<Integer> result = new ArrayList<>();
        solution(arr, result, 0);
    }
}