import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = new int[words.length];
        
        for (int i = 0; i < words.length; i++) {
            int temp = countSame(begin, words[i]);
            if (temp == begin.length() - 1) {   
                answer[i]++;
                if (words[i].equals(target)) return answer[i];
                queue.add(i);
                visited[i] = true;
            } 
        }
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            String now = words[current];
            int nowCount = answer[current];
            
            for (int i = 0; i < words.length; i++) {
                if (!visited[i]) {
                    int temp = countSame(now, words[i]);
                    if (temp == now.length() - 1) {
                        answer[i] = nowCount + 1;
                        if (words[i].equals(target)) return answer[i];
                        queue.add(i);
                        visited[i] = true;
                    }
                }
            }
        }
        
        return 0;
    }
    
    public static int countSame (String a, String b) {
        int count = 0;
        char[] aArr = a.toCharArray();
        char[] bArr = b.toCharArray();
        
        for (int i = 0; i < aArr.length; i++) {
            if (aArr[i] == bArr[i]) count++;
        }
        
        return count;
    }
}