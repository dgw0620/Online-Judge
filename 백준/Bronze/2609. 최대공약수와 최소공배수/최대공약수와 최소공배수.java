import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        int r = a % b;

        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        int result = gcd(a, b);

        System.out.println(result);
        System.out.println(a * b / result);
    }
}