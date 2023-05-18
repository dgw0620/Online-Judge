import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static int n = sc.nextInt();
    static int m = sc.nextInt();

    public static void solution(Stack<Integer> stack, int[] arr) {
        if (stack.size() == m) {
            for (int i : stack)
                sb.append(i + " ");
            sb.append("\n");
            return;
        }
        for (int i : arr) {
            if (stack.size() == 0 || !stack.contains(i) && stack.peek() < i){
                stack.push(i);
                solution(stack, arr);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        solution(stack, arr);
        System.out.println(sb);
    }
}