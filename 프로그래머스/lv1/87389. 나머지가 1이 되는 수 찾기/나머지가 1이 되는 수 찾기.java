class Solution {
    public int solution(int n) {
        int i = 1;
        for (; i < n; i++)
            if(n % i == 1)
                return i;
        return i;
    }
}