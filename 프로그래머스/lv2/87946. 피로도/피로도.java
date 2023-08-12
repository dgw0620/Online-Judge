import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        DFS(k, dungeons, 0, visited);
        return answer;
    }
    
    public void DFS(int k, int[][] dungeons, int cnt, boolean[] visited) {
        if (answer < cnt) answer = cnt;
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                DFS(k - dungeons[i][1], dungeons, cnt + 1, visited);
                visited[i] = false;
            }
        }
    }
}