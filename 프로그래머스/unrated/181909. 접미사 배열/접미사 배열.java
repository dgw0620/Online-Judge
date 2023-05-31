import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String temp = "";
        ArrayList<String> arr = new ArrayList<>();
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            temp = my_string.substring(i);
            arr.add(temp);
        }
        
        String[] answer = arr.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}