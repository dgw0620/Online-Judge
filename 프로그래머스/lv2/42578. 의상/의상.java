import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        int answer = 1;
        
        for (String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }
        
        for (int i : map.values()) {
            answer *= i + 1;
        }
        
        return answer - 1;
    }
}