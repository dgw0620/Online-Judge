import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            BigInteger bigInteger = new BigInteger("1");

            while (true) {
                if (bigInteger.remainder(BigInteger.valueOf(n)).longValue() == 0) {
                    System.out.println(bigInteger.toString().length());
                    break;
                }
                bigInteger = bigInteger.multiply(BigInteger.valueOf(10));
                bigInteger = bigInteger.add(BigInteger.valueOf(1));
            }

        }
    }
}