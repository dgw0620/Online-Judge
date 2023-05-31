import java.util.*;
class Solution {
    public long solution(long n) {
        boolean check = false;
        long i = 1;
        for (; i <= n; i++) {
            if (Math.pow(i, 2) == n) {
                check = true;
                break;
            }
        }
        
        if(check)
            return (long) Math.pow(i + 1, 2);
        else
            return -1;
    }
}