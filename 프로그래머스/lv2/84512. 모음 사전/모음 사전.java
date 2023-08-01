class Solution {
    public char[] charArr = {'A', 'E', 'I', 'O', 'U'};
    public int answer = 0;
    public int solution(String word) {
        recursive("", word);
        return answer;
    }

    public boolean recursive(String comb, String word) {
        if (comb.equals(word)) return true;
        if (comb.length() == 5) return false;
        for (int i = 0; i < charArr.length; i++) {
            comb += charArr[i];
            answer++;
            if(recursive(comb, word)) return true;
            comb = comb.substring(0, comb.length() - 1);
        }
        return false;
    }
}