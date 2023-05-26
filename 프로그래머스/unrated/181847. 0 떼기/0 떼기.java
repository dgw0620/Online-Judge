class Solution {
    public String solution(String n_str) {
        int i = 0;
        for (char c : n_str.toCharArray()) {
            if(c == '0')
                i++;
            else
                break;
        }
        return n_str.substring(i);
    }
}