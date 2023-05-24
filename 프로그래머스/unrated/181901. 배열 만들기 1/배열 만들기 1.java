import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i <= n; i += k) {
            if (i != 0)
                arr.add(i);
        }
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
}