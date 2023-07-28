import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static Node[] Person;
    public static Node[] Party;
    public static int n;
    public static int m;

    public static class Node {
        public ArrayList<Integer> list = new ArrayList<>();
        public boolean check;
        public boolean visited;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        Person = new Node[n + 1];
        Party = new Node[m + 1];

        for (int i = 1; i <= n; i++) Person[i] = new Node();
        for (int i = 1; i <= m; i++) Party[i] = new Node();

        st = new StringTokenizer(br.readLine());
        int checkTrue = Integer.parseInt(st.nextToken());

        for (int i = 0; i < checkTrue; i++) {
            int temp = Integer.parseInt(st.nextToken());
            Person[temp].check = true;
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            for (int j = 0; j < k ; j++) {
                int temp = Integer.parseInt(st.nextToken());
                Party[i].list.add(temp);
                Person[temp].list.add(i);
            }
        }

        System.out.println(m - BFS());

    }

    public static int BFS() {
        Queue<Node> queue = new LinkedList<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (Person[i].check) {
                Person[i].visited = true;
                for (int j : Person[i].list) {
                    if (!Party[j].visited) {
                        queue.add(Party[j]);
                        Party[j].check = true;
                        Party[j].visited = true;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.check) count++;
            for (int i : currentNode.list) {
                if (!Person[i].visited){
                    Person[i].check = true;
                    Person[i].visited = true;
                    for (int j : Person[i].list) {
                        if (!Party[j].visited) {
                            queue.add(Party[j]);
                            Party[j].check = true;
                            Party[j].visited = true;
                        }

                    }
                }
            }
        }

        return count;
    }
}
