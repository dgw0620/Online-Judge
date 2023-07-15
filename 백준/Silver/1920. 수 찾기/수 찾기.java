import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numList = new int[n];

        for (int i = 0; i < n; i++) {
            numList[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Arrays.sort(numList);

        for (int i = 0; i < m; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = numList.length - 1;

            while (start <= end) {
                int mid_index = (start + end) / 2;
                int mid_value = numList[mid_index];
                if (mid_value > target) {
                    end = mid_index - 1;
                } else if (mid_value < target) {
                    start = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }

            System.out.println(find ? 1 : 0);
        }
    }
}
