class Solution {
    public int solution(int n, String control) {
        for (String c : control.split("")) {
            if (c.equals("w")) n++;
            else if (c.equals("s")) n--;
            else if (c.equals("d")) n += 10;
            else if (c.equals("a")) n -= 10;
        }
        return n;
    }
}