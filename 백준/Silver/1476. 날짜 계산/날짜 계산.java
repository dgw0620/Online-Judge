import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();

        int[] count = new int[3];
        int i = 0;

        while (true) {
            if (Arrays.equals(arr, count)) {
                System.out.println(i);
                break;
            }

            count[0]++;
            count[1]++;
            count[2]++;

            if (count[0] == 16) count[0] = 1;
            if (count[1] == 29) count[1] = 1;
            if (count[2] == 20) count[2] = 1;

            i++;
        }

    }
}