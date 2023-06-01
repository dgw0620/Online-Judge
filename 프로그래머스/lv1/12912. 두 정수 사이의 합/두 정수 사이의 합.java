class Solution {
    public int swap(int a, int b) {
        return a;
    }
    public long solution(int a, int b) {
        long answer = 0;
        
        if (b < a)
            b = swap(a, a = b);
        
        for (int i = a; i <= b; i++)
            answer += i;
        
        return answer;
    }
}