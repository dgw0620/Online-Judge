class Solution {
    public int solution(int[] num_list) {
        int sum = 0, mul = 1;
        
        for (int n : num_list){
            sum += n;
            mul *= n;
        }
        
        return Math.pow(sum, 2) > mul ? 1 : 0;
    }
}