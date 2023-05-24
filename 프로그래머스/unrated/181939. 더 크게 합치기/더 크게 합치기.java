class Solution {
    public int solution(int a, int b) {
        String temp1 = "" + a + b, temp2 = "" + b + a;
        if(Integer.parseInt(temp1) < Integer.parseInt(temp2))
            return Integer.parseInt(temp2);
        else
            return Integer.parseInt(temp1);
        
    }
}