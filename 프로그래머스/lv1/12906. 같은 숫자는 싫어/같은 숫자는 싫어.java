import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        list.add(arr[0]);
        for (int a : arr) {
            if(a != list.get(i)) {
                list.add(a);
                i++;
            }
        }
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}