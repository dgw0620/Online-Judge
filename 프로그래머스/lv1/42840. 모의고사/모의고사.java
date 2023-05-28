import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] count = {0, 0, 0};
        int[] aa = {1, 2, 3, 4, 5};
        int[] bb = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] cc = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == aa[i % 5]) count[0]++;
            if (answers[i] == bb[i % 8]) count[1]++;
            if (answers[i] == cc[i % 10]) count[2]++;
        }
        
        int max = 0;
        for (int i = 0; i < 3; i++) {
            if(max < count[i]) max = count[i];
        }
        
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if(max == count[i])
                arr.add(i + 1);
        }
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}