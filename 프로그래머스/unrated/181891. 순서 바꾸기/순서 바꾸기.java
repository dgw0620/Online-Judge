class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for (int i = n, k = 0; k < num_list.length; i++, k++) {
            if(i >= num_list.length) i = 0; 
            answer[k] = num_list[i];
        }
        
        return answer;
    }
}