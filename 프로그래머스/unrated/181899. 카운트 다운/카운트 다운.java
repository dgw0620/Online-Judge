import java.util.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        for (int i = 0; i < answer.length && start >= end; i++)
            answer[i] = start--;
        return answer;
    }
}