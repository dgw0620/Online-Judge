import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[] now = {0, 0, 1};
        queue.add(now);
        
        maps[now[0]][now[1]] = -1;
        
        while (!queue.isEmpty()) {
            now = queue.poll();

            if (now[0] == n - 1 && now[1] == m - 1) return now[2];
            
            for (int i = 0; i < 4; i++) {
                if (now[0] + dy[i] >= 0 && now[1] + dx[i] >= 0 && now[0] + dy[i] < n && now[1] + dx[i] < m) {
                    if (maps[now[0] + dy[i]][now[1] + dx[i]] == 1) {
                        maps[now[0] + dy[i]][now[1] + dx[i]] = -1;
                        queue.add(new int[]{now[0] + dy[i], now[1] + dx[i], now[2] + 1});
                    }
                }
            }
        }
        
        return -1;
    } 
}