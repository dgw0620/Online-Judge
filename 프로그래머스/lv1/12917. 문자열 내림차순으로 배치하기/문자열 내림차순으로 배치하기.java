import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        
        ArrayList<Character> smallList = new ArrayList<>();
        ArrayList<Character> bigList = new ArrayList<>();
        
        for (char c : cArr) {
            if (c >= 'A' && c <= 'Z') bigList.add(c);
            else smallList.add(c);
        }
        
        for (int i = smallList.size() - 1; i >= 0; i--) {
            answer += smallList.get(i);
        }
        
        for (int i = bigList.size() - 1; i >= 0; i--) {
            answer += bigList.get(i);
        }
        
        return answer;
    }
}