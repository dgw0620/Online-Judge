class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int c = 0;
        for(long i = x ; c < answer.length; i += x, c++) {
            answer[c] = i;
        }
        
        return answer;
    }
}