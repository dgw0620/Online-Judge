import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        
        for (String s : my_string.split(" ")) {
            if (!s.equals(""))
                arr.add(s);
        }
        
        return arr.toArray(new String[0]);
    }
}