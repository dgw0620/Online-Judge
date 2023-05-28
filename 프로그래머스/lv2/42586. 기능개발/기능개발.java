import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        
        while (i < progresses.length) {
            int count = 0;
            for (int j = i; j < progresses.length; j++) {
                progresses[j] += speeds[j];
            }
            
            while (i < progresses.length && progresses[i] >= 100) {
                i++;
                count++;
            }
            
            if (count > 0) arr.add(count);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}