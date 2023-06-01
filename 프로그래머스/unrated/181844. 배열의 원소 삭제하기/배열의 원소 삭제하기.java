import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> temp = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        
        for (Integer i : delete_list) {
            if (temp.contains(i))
                temp.remove(i);
        }
        
        
        return temp.stream().mapToInt(Integer::intValue).toArray();
    }
}