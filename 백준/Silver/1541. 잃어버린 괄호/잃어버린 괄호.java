import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        String[] arr = sc.nextLine().split("-");
        for (int i = 0; i < arr.length; i++) {
            int temp = mySum(arr[i]);

            if (i == 0) answer += temp;
            else answer -= temp;
        }

        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String[] arr = s.split("[+]");

        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        return sum;
    }
}
