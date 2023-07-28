import java.util.*;

class Solution {
    int[] parent;
    public int solution(int n, int[][] computers) {
        parent = new int[n];
        
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(computers[i][j] == 1) {
                    UNION(i, j);
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (parent[i] == i) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public void UNION(int a, int b) {
        a = FIND(a);
        b = FIND(b);
        if (a != b) parent[b] = a;
    }
    
    public int FIND(int a) {
        if (a == parent[a]) return a;
        else return parent[a] = FIND(parent[a]);
    }
}