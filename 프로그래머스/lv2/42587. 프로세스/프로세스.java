import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> priList = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            priList.add(priorities[i]);
            queue.add(new int[] {i, priorities[i]});
        }
        
        int answer = 0;
        
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            
            if (now[1] == Collections.max(priList)) {
                answer++;
                priList.remove(Integer.valueOf(now[1]));
                if (now[0] == location) return answer;
            } else {
                queue.add(now);
            }
        }
        
        return answer;
    }
}