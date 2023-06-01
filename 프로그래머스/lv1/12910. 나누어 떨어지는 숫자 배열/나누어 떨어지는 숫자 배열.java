import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<>();
        
        for (int i : arr) {
            if (i % divisor == 0)
                temp.add(i);
        }
        if (temp.size() == 0) temp.add(-1);
        
        int[] answer = temp.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}