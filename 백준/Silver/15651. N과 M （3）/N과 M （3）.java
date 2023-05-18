import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int n = sc.nextInt();
    static int m = sc.nextInt();

    public static void solution(Stack<Integer> stack) {
        if (stack.size() == m) {
            for (int i : stack)
                sb.append(i + " ");
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            stack.push(i);
            solution(stack);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        solution(stack);
        System.out.println(sb);
    }
}