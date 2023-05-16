import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arr.add(sc.nextInt());
        }

        ArrayList<Integer> temp = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                temp = new ArrayList<>();
                temp.addAll(arr);
                temp.remove(arr.get(i));
                temp.remove(arr.get(j));
                sum = temp.stream().mapToInt(Integer::intValue).sum();
                if (sum == 100) {
                    temp.sort(Comparator.naturalOrder());
                    for (int t : temp) System.out.println(t);
                    System.exit(0);
                }
                sum = 0;
            }
        }

    }
}