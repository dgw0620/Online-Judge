import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int l = sc.nextInt(), c = sc.nextInt();
    static ArrayList<Character> cArr = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    static StringBuilder sb = new StringBuilder();

    public static void solution(ArrayList<Character> arr, Stack<Character> stack, int x) {
        if (stack.size() == l) {
            int countA = 0;
            int countB = 0;
            for (char c : stack) {
                if ((cArr.contains(c))) countA++;
                else countB++;
            }
            if (countA > 0 && countB > 1) {
                for (char c : stack){
                    sb.append(c);
                }
                sb.append("\n");
            }
        } else {
            for (int i = x ; i < arr.size(); i++) {
                stack.push(arr.get(i));
                solution(arr, stack, i + 1);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < c; i++) arr.add(sc.next().charAt(0));

        arr.sort(Comparator.naturalOrder());

        solution(arr, stack, 0);
        System.out.println(sb);
    }
}