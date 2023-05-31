import java.util.*;
class Solution {
    public long solution(long n) {
        String[] answer = String.valueOf(n).split("");
        Arrays.sort(answer, Comparator.reverseOrder());
        return Long.valueOf(String.join("", answer));
    }
}