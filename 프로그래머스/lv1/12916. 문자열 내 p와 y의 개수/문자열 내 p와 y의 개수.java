import java.util.*;
class Solution {
    boolean solution(String s) {
        int p = 0, y = 0;
        
        for (String i: s.toLowerCase().split("")) {
            if (i.equals("p"))
                p++;
            if (i.equals("y"))
                y++;
        }
        
        return p == y;
    }
}