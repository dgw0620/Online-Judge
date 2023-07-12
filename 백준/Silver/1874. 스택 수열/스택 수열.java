import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int num = 1;


        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();

            if (num <= temp) {
                while (num <= temp) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int k = stack.pop();
                if (k > temp) {
                    System.out.println("NO");
                    System.exit(0);
                } else {
                    sb.append("-\n");
                }
            }
        }

        System.out.println(sb.toString());
    }
}
