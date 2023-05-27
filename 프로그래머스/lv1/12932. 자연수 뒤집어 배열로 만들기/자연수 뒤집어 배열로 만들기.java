import java.util.*;
class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arr = new ArrayList<>();
        String[] num = String.valueOf(n).split("");
        
        for (int i = num.length - 1; i >= 0; i--) {
            arr.add(Integer.parseInt(num[i]));
        }
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}