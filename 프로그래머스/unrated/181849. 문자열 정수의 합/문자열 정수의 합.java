class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (char n : num_str.toCharArray()) {
            answer += Character.getNumericValue(n);
        }
        
        return answer;
    }
}