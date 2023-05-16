import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n-- > 0) {
            int num = sc.nextInt();
            if (isPrime(num)) count++;
        }
        System.out.println(count);
    }
}