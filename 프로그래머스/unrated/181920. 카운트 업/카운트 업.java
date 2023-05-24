import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = IntStream.rangeClosed(start, end).toArray();
        return answer;
    }
}