import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int j = 0;
        
        for (int[] i: commands) {
            int[] temp = Arrays.copyOfRange(array, i[0] - 1, i[1]);
            Arrays.sort(temp);
            answer[j++] = temp[i[2] - 1];
        }
        return answer;
    }
}