import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int count(int num, int n) {
        return String.valueOf(num).length() + Math.abs(num - n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            arr.add(Character.forDigit(sc.nextInt(), 10));
        }

        int answer = Math.abs(n - 100);
        int p = 999999, q = 1000000;
        int num = -1;
        boolean check;
        int count = 0;

        while (q >= p) {
            count++;
            if (count > 999999) {
                q = p;
                break;
            }
            num++;
            check = false;
            for (char c : String.valueOf(num).toCharArray()) {
                if (arr.contains(c)) {
                    check = true;
                    break;
                }
            }
            if (check) continue;

            q = p;
            p = count(num, n);
        }

        answer = Math.min(answer, q);
        System.out.println(answer);
    }
}